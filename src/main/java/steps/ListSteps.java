package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.Тогда;
import ru.alfabank.steps.BaseMethods;

import java.util.List;

public class ListSteps extends BaseMethods {

    @Тогда("^в списке \"([^\"]*)\" введено значение \"([^\"]*)\" в (\\d+) по счету поле$")
    public void inputInCountElementInList (String listName, String value, int countElement) {
        List<SelenideElement> listOfElementsFromPage = akitaScenario.getCurrentPage().getElementsList(listName);
        listOfElementsFromPage.get(countElement - 1).clear();
        listOfElementsFromPage.get(countElement - 1).setValue(value);
        akitaScenario.write(String.format("В [%s] по счету поле в списке [%s] введено значение [%s]."
                , countElement, listName, value));
    }

}
