/**
 * Copyright 2017 Alfa Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package steps.blocks;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import entities.Repositories;
import helpers.GitHubSearchPageHelper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import ru.alfabank.steps.BaseMethods;

import java.util.List;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.WebDriverRunner.isIE;
import static java.lang.String.format;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class BlockSteps extends BaseMethods{
    AkitaScenario akitaScenario = AkitaScenario.getInstance();

    /**
     * Устанавливается значение (в приоритете: из property, из переменной сценария, значение аргумента) в заданное поле
     * в заданном блоке.
     * Перед использованием поле нужно очистить
     */
    @Когда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" введено значение \"(.*)\"$")
    public void setFieldValueInBlock(String elementName, String blockName, String value) {
        value = getPropertyOrStringVariableOrValue(value);
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlock(blockName).getElement(elementName);
        cleanFieldInBlock(elementName, blockName);
        valueInput.setValue(value);
    }

    @Когда("^поле \"([^\"]*)\" в блоке \"([^\"]*)\" очищено$")
    public void cleanFieldInBlock(String nameOfField, String nameOfBlock) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlock(nameOfBlock).getElement(nameOfField);
        Keys removeKey = isIE() ? Keys.BACK_SPACE : Keys.DELETE;
        do {
            valueInput.doubleClick().sendKeys(removeKey);
        } while (valueInput.getValue().length() != 0);
    }

    /**
     * Проверка того, что элемент не отображается на странице в блоке
     */
    @Тогда("^(?:поле|выпадающий список|элемент) \"([^\"]*)\" не отображается в блоке \"([^\"]*)\"$")
    public void elementIsNotVisibleInBlock(String elementName, String blockName) {
        akitaScenario.getCurrentPage().getBlock(blockName).waitElementsUntil(
                not(Condition.appear), DEFAULT_TIMEOUT, akitaScenario.getCurrentPage().getBlockElement(blockName, elementName)
        );
    }

    /**
     * Проверка того, что элемент отображается на странице в блоке
     */
    @Тогда("^(?:поле|выпадающий список|элемент) \"([^\"]*)\" отображается в блоке \"([^\"]*)\"$")
    public void elementIsVisibleInBlock(String elementName, String blockName) {
        akitaScenario.getCurrentPage().getBlock(blockName).waitElementsUntil(
                Condition.appear, DEFAULT_TIMEOUT, akitaScenario.getCurrentPage().getBlockElement(blockName, elementName)
        );
    }

    /**
     * Проверка, что значение в поле содержит текст, указанный в шаге
     * (в приоритете: из property, из переменной сценария, значение аргумента).
     * Используется метод innerText(), который получает как видимый, так и скрытый текст из элемента,
     * обрезая перенос строк и пробелы в конце и начале строчки.
     * Не чувствителен к регистру
     */
    @Тогда("^(?:поле|элемент) \"([^\"]*)\" в блоке \"([^\"]*)\" содержит внутренний текст \"(.*)\"$")
    public void testFieldInBlockContainsInnerText(String fieldName, String blockName, String expectedText) {
        expectedText = getPropertyOrStringVariableOrValue(expectedText);
        String field = akitaScenario.getCurrentPage().getBlock(blockName).getElement(fieldName).innerText().trim().toLowerCase();
        assertThat(String.format("Поле [%s] не содержит текст [%s]", fieldName, expectedText), field, containsString(expectedText.toLowerCase()));
    }

    /**
     * Проверка, что у элемента есть атрибут с ожидаемым значением (в приоритете: из property, из переменной сценария, значение аргумента)
     */
    @Тогда("^элемент \"([^\"]*)\" в блоке \"([^\"]*)\" содержит атрибут \"([^\"]*)\" со значением \"(.*)\"$")
    public void checkElemInBlockContainsAtrWithValue(String elementName, String blockName, String attribute, String expectedAttributeValue) {
        expectedAttributeValue = getPropertyOrStringVariableOrValue(expectedAttributeValue);
        SelenideElement currentElement = akitaScenario.getCurrentPage().getBlockElement(blockName, elementName);
        String currentAtrValue = currentElement.attr(attribute);
        assertThat(String.format("Элемент [%s] не содержит атрибут [%s] со значением [%s]", elementName, attribute, expectedAttributeValue)
                , currentAtrValue, equalToIgnoringCase(expectedAttributeValue));
    }

    /**
     * Проверка, что у элемента есть атрибут с ожидаемым значением (в приоритете: из property, из переменной сценария, значение аргумента)
     */
    @Тогда("^элемент \"([^\"]*)\" в блоке \"([^\"]*)\" содержит атрибут \"([^\"]*)\" без значения$")
    public void checkElemInBlockContainsAtrWithOutValue(String elementName, String blockName, String attribute) {
        SelenideElement currentElement = akitaScenario.getCurrentPage().getBlockElement(blockName, elementName);
        String currentAtrValue = currentElement.attr(attribute);
        boolean empty = false;
        if (currentAtrValue.isEmpty()) {
            empty = true;
        }
        assertThat(empty, equalTo(true));
    }

    /**
     * Ввод в поле случайной последовательности латинских или кириллических букв задаваемой длины
     */
    @Когда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" введено (\\d+) случайных символов на (кириллице|латинице)$")
    public void setRandomCharSequenceInFieldInBlock(String elementName, String blockName, int seqLength, String lang) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlock(blockName).getElement(elementName);
        cleanFieldInBlock(elementName, blockName);

        if (lang.equals("кириллице")) lang = "ru";
        else lang = "en";
        String charSeq = getRandCharSequence(seqLength, lang);
        valueInput.setValue(charSeq);
        akitaScenario.write("Строка случайных символов равна :" + charSeq);
    }

    /**
     * Ввод в поле случайной последовательности латинских или кириллических букв задаваемой длины
     */
    @Когда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" введено (\\d+) случайных символов на (кириллице|латинице) и сохранено в переменную \"([^\"]*)\"$")
    public void inputAndSetRandomCharSequenceInFieldInBlock(String elementName, String blockName, int seqLength, String lang, String varName) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlock(blockName).getElement(elementName);
        cleanFieldInBlock(elementName, blockName);

        if (lang.equals("кириллице")) lang = "ru";
        else lang = "en";
        String charSeq = getRandCharSequence(seqLength, lang);
        valueInput.setValue(charSeq);
        akitaScenario.setVar(varName, charSeq);
        akitaScenario.write(String.format("Строка случайных символов равна [%s] и сохранена в переменную [%s]", charSeq, varName));
    }

    /**
     * Ввод в поле случайной последовательности цифр задаваемой длины
     */
    @Когда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" введено случайное число из (\\d+) (?:цифр|цифры)$")
    public void inputRandomNumSequenceInFieldInBlock(String elementName, String blockName, int seqLength) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlock(blockName).getElement(elementName);
        cleanFieldInBlock(elementName, blockName);
        String numSeq = RandomStringUtils.randomNumeric(seqLength);
        valueInput.setValue(numSeq);
        akitaScenario.write(String.format("В поле [%s] введено значение [%s]", elementName, numSeq));
    }

    /**
     * Ввод в поле случайной последовательности цифр задаваемой длины начиная с определенного числа
     */
    @Когда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" введено случайное число из (\\d+) (?:цифр|цифры) начиная с (\\d+)$")
    public void inputRandomNumSequenceInFieldInBlockFrom(String elementName, String blockName, int seqLength, int firstInt) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlock(blockName).getElement(elementName);
        cleanFieldInBlock(elementName, blockName);
        String numSeq = String.valueOf(firstInt).concat(RandomStringUtils.randomNumeric(seqLength - 1));
        valueInput.setValue(numSeq);
        akitaScenario.write(String.format("В поле [%s] введено значение [%s]", elementName, numSeq));
    }

    /**
     * Ввод в поле случайной последовательности цифр задаваемой длины начиная с определенного числа
     */
    @Когда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" введено случайное число из (\\d+) (?:цифр|цифры) начиная с (\\d+) и сохранено в переменную \"([^\"]*)\"$")
    public void inputAndSetRandomNumSequenceInFieldInBlockFrom(String elementName, String blockName, int seqLength, int firstInt, String varName) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlock(blockName).getElement(elementName);
        cleanFieldInBlock(elementName, blockName);
        String numSeq = String.valueOf(firstInt).concat(RandomStringUtils.randomNumeric(seqLength - 1));
        valueInput.setValue(numSeq);
        akitaScenario.setVar(varName, numSeq);
        akitaScenario.write(String.format("В поле [%s] введено значение [%s] и сохранено в переменную [%s]",
                elementName, numSeq, varName));
    }

    /**
     * Ввод в поле случайной последовательности цифр задаваемой длины и сохранение этого значения в переменную
     */
    @Когда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" введено случайное число из (\\d+) (?:цифр|цифры) и сохранено в переменную \"([^\"]*)\"$")
    public void inputAndSetRandomNumSequenceInFieldInBlock(String elementName, String blockName, int seqLength, String varName) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlock(blockName).getElement(elementName);
        cleanFieldInBlock(elementName, blockName);
        String numSeq = RandomStringUtils.randomNumeric(seqLength);
        valueInput.setValue(numSeq);
        akitaScenario.setVar(varName, numSeq);
        akitaScenario.write(String.format("В поле [%s] введено значение [%s] и сохранено в переменную [%s]",
                elementName, numSeq, varName));
    }

    /**
     * Производится проверка количества символов в поле со значением, указанным в шаге
     */
    @Тогда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" содержится (\\d+) символов$")
    public void checkFieldSymbolsCountInFieldInBlock(String element, int num) {
        int length = akitaScenario.getCurrentPage().getAnyElementText(element).length();
        assertEquals(num, length, String.format("Неверное количество символов. Ожидаемый результат: %s, текущий результат: %s", num, length));
    }

    /**
     * Проверка появления списка на странице в течение DEFAULT_TIMEOUT.
     * В случае, если свойство "waitingCustomElementsTimeout" в application.properties не задано,
     * таймаут равен 10 секундам
     */
    @Тогда("^список \"([^\"]*)\" отображается в блоке \"([^\"]*)\"$")
    public void listIsPresentedOnPage(String elementName,  String blockName) {
        akitaScenario.getCurrentPage().getBlock(blockName).waitElementsUntil(
                Condition.appear, DEFAULT_TIMEOUT, akitaScenario.getCurrentPage().getBlock(blockName).getElementsList(elementName)
        );
    }

}
