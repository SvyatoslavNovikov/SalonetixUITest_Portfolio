package pages.admin.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

public class Paginate extends AkitaPage {

    // Предполагается, что эти локаторы будут на всех пагинаторах в экстранете

    final public static String paginateXpath = ""; //Поставить id на class="Pending__pagination"

    // Data-id на список страниц на a, кнопки << и >> так же входят в этот список

    @FindBy(xpath = "//*[data-id = '']")
    @Name("страниц")
    public List<SelenideElement> pageListButtons;

    // class=SelectSimple__value

    @FindBy(xpath = "//*[data-id = '']")
    @Name("селектор")
    public SelenideElement countItemButton;

    // в этом списке уже есть все необходимое

    @FindBy(xpath = "//*[contains(@id, 'undefined')]")
    @Name("количества страниц")
    public List<SelenideElement> countItemsList;

}
