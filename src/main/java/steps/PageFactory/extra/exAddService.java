package steps.PageFactory.extra;

import cucumber.api.java.ru.Тогда;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;
import ru.alfabank.steps.BaseMethods;

import java.util.List;

public class exAddService extends BaseMethods {

    @Тогда("^выполнено нажатие на кнопку добавить услугу в блоке (ногти|прическа|лицо|тело|улыбка)$")
    public void openWindowAddServices (String firstLevelService) {
        if (firstLevelService.equals("ногти")) { firstLevelService = "Ногти"; }
        if (firstLevelService.equals("прическа")) { firstLevelService = "Прическа"; }
        if (firstLevelService.equals("лицо")) { firstLevelService = "Лицо"; }
        if (firstLevelService.equals("тело")) { firstLevelService = "Тело"; }
        if (firstLevelService.equals("улыбка")) { firstLevelService = "Улыбка (стоматологические услуги)"; }

        List<AkitaPage> blocks = akitaScenario.getCurrentPage().getBlocksList("услуги первого уровня");
        for (AkitaPage block : blocks) {
            if (block.getElement("заголовок").getText().equals(firstLevelService)) {
                block.getElement("добавить услугу").click();
                akitaScenario.write(String.format("Выполнено нажатие на кнопку добавить услугу в блоке [%s]", firstLevelService));
            }
        }
    }
}
