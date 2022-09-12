package pages.admin.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

public class Header extends AkitaPage {

    final public static String headerXpath = "//header";

    // ставить на а c href

    @FindBy(id = "")
    @Name("seo")
    public SelenideElement seoButton;

    @FindBy(id = "")
    @Name("отзывы")
    public SelenideElement reviewButton;

    @FindBy(id = "")
    @Name("записи")
    public SelenideElement booksButton;

    @FindBy(id = "")
    @Name("салоны")
    public SelenideElement salonsButton;

    @FindBy(id = "")
    @Name("сервисы")
    public SelenideElement servicesButton;

    @FindBy(id = "")
    @Name("выход")
    public SelenideElement exitButton;

    // выпадающий список при клике на кнопку салоны
    // можно поставить один id на dropdown, чтобы а были потомками

    @FindBy(xpath = "//*[data-id = '']")
    @Name("выпадающий список")
    public List<SelenideElement> listButtons;

}
