package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.Тогда;
import lombok.extern.slf4j.Slf4j;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Slf4j
public class AtributeSteps extends AkitaPage {
    AkitaScenario akitaScenario = AkitaScenario.getInstance();

    /**
     * Проверка, что у элемента есть атрибут с ожидаемым значением (в приоритете: из property, из переменной сценария, значение аргумента)
     */
    @Тогда("^элемент \"([^\"]*)\" содержит атрибут \"([^\"]*)\" без значения$")
    public void checkElemInBlockContainsAtrWithOutValue(String elementName, String attribute) {
        SelenideElement currentElement = akitaScenario.getCurrentPage().getElement(elementName);
        String currentAtrValue = currentElement.attr(attribute);
        boolean empty = false;
        if (currentAtrValue.isEmpty()) {
            empty = true;
        }
        assertThat(empty, equalTo(true));
    }
}
