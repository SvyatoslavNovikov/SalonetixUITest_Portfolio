package pages.client;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import pages.client.blocks.*;
import pages.client.blocks.LoginBlocks.Confirm;
import pages.client.blocks.LoginBlocks.Login;
import pages.client.blocks.LoginBlocks.QuickLogin;
import pages.client.blocks.LoginBlocks.Registration;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("салоны")
public class pageUserSalons extends AkitaPage {

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

    // Menu

    @FindBy(id = Menu.menuBlockId)
    @Name("меню")
    public Menu menuBlock;

    // Body ToDo добавлена задача 5714

    @FindBy(id = "") // тут имеется в виду заголовок
    @Name("заголовок")
    public SelenideElement titleField;

    @FindBy(id = "salons_all")
    @Optional
    @Name("все")
    public SelenideElement allButton;

    @FindBy(id = "salons_salons")
    @Optional
    @Name("салоны")
    public SelenideElement salonsNewButton;

    @FindBy(id = "salons_masters")
    @Optional
    @Name("мастера")
    public SelenideElement mastersButton;

    // Дальше идут списки, data-id одинаковые

    static class FavoriteSalon {

        @FindBy(xpath = "//a[@data-id = 'писать сюда']")
        @Optional
        @Name("названия избранных салонов")
        public List<SelenideElement> favoritesSalonNamesList;

        // Появляется, когда есть запись

        @FindBy(xpath = "//div[@data-id = 'писать сюда']")
        @Optional
        @Name("информация о записи")
        public List<SelenideElement> appoinmentInfoList;

        // Отсутствует, когда есть запись

        @FindBy(xpath = "//i[@data-id = 'писать сюда']")
        @Optional
        @Name("удалить из избранного")
        public List<SelenideElement> deleteFromFavoritesList;

    }

    @FindBy(xpath = "//div[@data-id = 'писать сюда']")
    @Optional
    @Name("мастера")
    public List<FavoriteSalon> salonBlock;

}
