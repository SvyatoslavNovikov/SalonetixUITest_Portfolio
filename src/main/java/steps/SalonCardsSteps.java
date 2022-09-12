package steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.ru.Тогда;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.alfabank.steps.BaseMethods;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalonCardsSteps extends BaseMethods {

    @Тогда("^выполнен клик на заголовок в карточке салона \"([^\"]*)\"$")
    public void clickToBlockTitleInBlockList(String salonName) {
        final String value = getPropertyOrStringVariableOrValue(salonName);
        List<AkitaPage> blocks = akitaScenario.getCurrentPage().getBlocksList("карточек");
        Boolean findTitle = false;
        for (AkitaPage block: blocks) {
            SelenideElement title = block.getElement("название салона");
            if (title.getText().equals(value)) {
                findTitle = true;
                title.click();
                break;
            }
        }
        assertEquals(true, findTitle);
    }
}
