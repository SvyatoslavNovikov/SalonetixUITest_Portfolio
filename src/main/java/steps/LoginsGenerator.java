package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.Тогда;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import ru.alfabank.alfatest.cucumber.api.AkitaScenario;
import ru.alfabank.steps.BaseMethods;
import steps.blocks.BlockSteps;

public class LoginsGenerator extends BaseMethods {
    AkitaScenario akitaScenario = AkitaScenario.getInstance();
    BlockSteps blocks = new BlockSteps();

    @Тогда("^в поле \"([^\"]*)\" введен тестовый номер телефона$")
    public void setFieldPhone(String elementName) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getElement(elementName);
        cleanField(elementName);
        String numSeq = RandomStringUtils.randomNumeric(7);
        valueInput.setValue("7".concat("555").concat(numSeq));
        akitaScenario.write(String.format("В поле [%s] введено значение [%s]", elementName, numSeq));
    }

    @Тогда("^в поле \"([^\"]*)\" введен тестовый номер телефона и сохранен в переменную \"([^\"]*)\"$")
    public void inputAndSetFieldPhone (String elementName, String varName) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getElement(elementName);
        cleanField(elementName);
        String numSeq = RandomStringUtils.randomNumeric(7);
        String number = "7".concat("555").concat(numSeq);
        valueInput.setValue(number);
        akitaScenario.setVar(varName, number);
        akitaScenario.write(String.format("В поле [%s] введено значение [%s]", elementName, number));
    }

    @Тогда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" введен тестовый номер телефона$")
    public void setFieldPhoneInBlock (String elementName, String blockName) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlockElement(blockName, elementName);
        blocks.cleanFieldInBlock(elementName, blockName);
        String numSeq = RandomStringUtils.randomNumeric(7);
        valueInput.setValue("7".concat("555").concat(numSeq));
        akitaScenario.write(String.format("В поле [%s] блока [%s] введено значение [%s]", elementName, blockName, numSeq));
    }

    @Тогда("^в поле \"([^\"]*)\" в блоке \"([^\"]*)\" введен тестовый номер телефона и сохранен в переменную \"([^\"]*)\"$")
    public void inputAndSetFieldPhoneInBlock (String elementName, String blockName, String varName) {
        SelenideElement valueInput = akitaScenario.getCurrentPage().getBlockElement(blockName, elementName);
        blocks.cleanFieldInBlock(elementName, blockName);
        String numSeq = RandomStringUtils.randomNumeric(7);
        String number = "7".concat("555").concat(numSeq);
        valueInput.setValue(number);
        akitaScenario.setVar(varName, number);
        akitaScenario.write(String.format("В поле [%s] блока [%s] введено значение [%s]", elementName, blockName, number));
    }

    @Тогда("^в поле \"([^\"]*)\" введен случайный email$")
    public void inputRandomEmail (String elementName) {
        String number = RandomStringUtils.randomNumeric(6);
        String email = "test+".concat(number)
                              .concat("@")
                              .concat(getPropertyOrStringVariableOrValue("developersDomain"));
        cleanField(elementName);
        akitaScenario.getCurrentPage().getElement(elementName).setValue(email);
        akitaScenario.setVar("number", number);
        akitaScenario.write(String.format("В поле [%s] введено значение [%s]. В переменную number сохранено [%s]"
                                          , elementName, email, number));
    }

    @Тогда("^в поле \"([^\"]*)\" введен случайный email и сохранен в переменную \"([^\"]*)\"$")
    public void inputAndSetRandomEmail (String elementName, String varName) {
        String number = RandomStringUtils.randomNumeric(6);
        String email = "test+".concat(number)
                              .concat("@")
                              .concat(getPropertyOrStringVariableOrValue("developersDomain"));
        cleanField(elementName);
        akitaScenario.getCurrentPage().getElement(elementName).setValue(email);
        akitaScenario.setVar("number", number);
        akitaScenario.setVar(varName, email);
        akitaScenario.write(String.format("В поле [%s] введено значение [%s]. В переменную number сохранено [%s]"
                , elementName, email, number));
        akitaScenario.write(String.format("В переменную [%s] сохранено значение [%s].", varName, email));

    }

    /**
     * Генерирует случайное название салона или мастера. Если перед этим степом создавался email то номер салону
     * или мастеру присваивается тот же что и в email. Если нет то генерируется новый случайный.
     * @param elementName
     * @param type
     */
    @Тогда("^в поле \"([^\"]*)\" введено случайное название (салона|мастера)")
    public void inputSalonOrMasterName (String elementName, String type) {
        if (type.equals("салона")) {type = "салон";}
        if (type.equals("мастера")) {type = "мастер";}
        String number = null;
        if (StringUtils.isNumeric(getPropertyOrStringVariableOrValue("number"))) {
            number = getPropertyOrStringVariableOrValue("number");
        } else {
            number = RandomStringUtils.randomNumeric(6);
        }
        String name = "Автотест ".concat(type).concat(" ").concat(number);
        akitaScenario.getCurrentPage().getElement(elementName).setValue(name);
        akitaScenario.write(String.format("В поле [%s] введено значение [%s]", elementName, name));
    }

    @Тогда("^в поле \"([^\"]*)\" введено случайное название (салона|мастера) и сохранено в переменную \"([^\"]*)\"")
    public void inputAndSetSalonOrMasterName (String elementName, String type, String varName) {
        if (type.equals("салона")) {type = "салон";}
        if (type.equals("мастера")) {type = "мастер";}
        String number = null;
        if (StringUtils.isNumeric(getPropertyOrStringVariableOrValue("number"))) {
            number = getPropertyOrStringVariableOrValue("number");
        } else {
            number = RandomStringUtils.randomNumeric(6);
        }
        String name = "Автотест ".concat(type).concat(" ").concat(number);
        akitaScenario.setVar(varName, name);
        akitaScenario.getCurrentPage().getElement(elementName).setValue(name);
        akitaScenario.write(String.format("В поле [%s] введено значение [%s] и сохранено в переменную [%s]"
                                          , elementName, name, varName));
    }

}
