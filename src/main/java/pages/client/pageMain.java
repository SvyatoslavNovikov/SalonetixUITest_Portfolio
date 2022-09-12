package pages.client;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import pages.client.blocks.LoginBlocks.Confirm;
import pages.client.blocks.LoginBlocks.Login;
import pages.client.blocks.LoginBlocks.QuickLogin;
import pages.client.blocks.Footer;
import pages.client.blocks.Header;
import pages.client.blocks.LoginBlocks.Registration;
import pages.client.blocks.Notice;
import pages.client.blocks.СontactService;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("главная страница пользовательской части")
public class pageMain extends AkitaPage {

    @FindBy(id = Header.headerId)
    @Name("шапка")
    public Header header;

    @FindBy(id = Footer.footerId)
    @Name("подвал")
    public Footer footer;

    // блоки авторизации

    @FindBy(id = QuickLogin.quickLoginOverlayID)
    @Optional
    @Name("авторизация")
    public QuickLogin quickLogin;

    @FindBy(id = Login.regularPassAuthOverlayID)
    @Optional
    @Name("авторизация по постоянному паролю")
    public Login regularLogin;

    @FindBy(id = Registration.registrationOverlayID)
    @Optional
    @Name("регистрация")
    public Registration registration;

    @FindBy(xpath = Confirm.confirmOverlayXpath)
    @Optional
    @Name("ввода смс")
    public Confirm confirm;

    @FindBy(xpath = "//*[contains(@class, 'notice')]")
    @Optional
    @Name("нотификация")
    public Notice noticeBlock;




    @FindBy(xpath = "//input[@name='complex']")
    @Name("строка поиска")
    public SelenideElement searchField;

//    @FindBy(id = "")
//    @Name("Х")
//    public SelenideElement clearSearchField;

    @FindBy(xpath = "//button[contains(text(), 'Найти')]")
    @Name("найти")
    public SelenideElement clearButton;

    @FindBy(xpath = "//button[contains(text(), 'Все салоны')]")
    @Name("все салоны")
    public SelenideElement allSalonsButton;

//    @FindBy()
//    @Optional
//    @Name("услуг 1 уровня")
//    public List<SelenideElement> servicesFirstLevelList;

//    @FindBy()
//    @Optional
//    @Name("услуг 2 уровня")
//    public List<SelenideElement> servicesSecondLevelList;

}
