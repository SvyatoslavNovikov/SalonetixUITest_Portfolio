package pages.client;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import pages.client.blocks.*;
import pages.client.blocks.LoginBlocks.*;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("личные данные")
public class pageUserPersonalData extends AkitaPage {

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

    // Menu

    @FindBy(id = Menu.menuBlockId)
    @Name("меню")
    public Menu menuBlock;

    // Тут многое описано, поэтому нужно добавить недостающее, при желание заменить xpath на id

    @FindBy(id = "full_name") // тут имеется в виду заголовок
    @Name("заголовок")
    public SelenideElement titleField;

    @FindBy(id = "profile_name")
    @Name("имя")
    public SelenideElement profileNameField;

    @FindBy(id = "profile_name_cross")
    @Optional
    @Name("Х имя")
    public SelenideElement clearNameField;

    @FindBy(id = "profile_name__error")
    @Optional
    @Name("ошибка имени")
    public SelenideElement profileNameErrorField;

    @FindBy(id = "profile_phone")
    @Name("телефон")
    public SelenideElement profilePhoneField;

    @FindBy(id = "profile_phone_cross")
    @Optional
    @Name("Х телефон")
    public SelenideElement clearPhoneField;

    @FindBy(id = "profile_phone__error")
    @Optional
    @Name("ошибка телефона")
    public SelenideElement profilePhoneErrorField;

    @FindBy(id = "profile_email")
    @Name("email")
    public SelenideElement emailPhoneField;

    @FindBy(id = "profile_email_cross")
    @Optional
    @Name("X email")
    public SelenideElement clearEmailField;

    @FindBy(id = "profile_city")
    @Name("город")
    public SelenideElement profileCityField;

    @FindBy(id = "profile_city_cross")
    @Optional
    @Name("X город")
    public SelenideElement clearCityField;

    @FindBy(id = "profile_submit")
    @Name("сохранить изменения")
    public SelenideElement submitButton;


    @FindBy(id = "password_password")
    @Name("пароль")
    public SelenideElement passwordPasswordField;

    @FindBy(xpath = "//*[@id = 'password_password']/parent::div/following-sibling::div")
    @Optional
    @Name("ошибка пароля")
    public SelenideElement passwordErrorField;

    @FindBy(id = "password_password_cross")
    @Optional
    @Name("X пароль")
    public SelenideElement clearPasswordField;

    @FindBy(id = "password_confirm")
    @Name("подтверждение пароля")
    public SelenideElement passwordConfirmField;

    @FindBy(xpath = "//*[@id = 'password_confirm']/parent::div/following-sibling::div")
    @Optional
    @Name("ошибка подтверждения")
    public SelenideElement passwordConfirmErrorField;

    @FindBy(id = "password_confirm_cross")
    @Optional
    @Name("X подтверждение пароля")
    public SelenideElement clearConfirmPasswordField;

    @FindBy(id = "password_save")
    @Name("сохранить пароль")
    public SelenideElement passwordSaveButton;

    @FindBy(xpath = "//*[contains(text(), 'У вас еще нет постоянного пароля для входа в систему')]")
    @Optional
    @Name("текст о пароле")
    public SelenideElement passwordTextField;

    @FindBy(id = "add_email")
    @Optional
    @Name("текст о email")
    public SelenideElement emailTextField;

    @FindBy(id = "add_city")
    @Optional
    @Name("текст о городе")
    public SelenideElement cityTextField;

    @FindBy(xpath = "//*[@data-id = 'subscribed_item']")
    @Name("сообщать о скидках")
    public SelenideElement subscribedCheckbox;

    // это id на всю модалку, так чтобы все элементы описанные в классе ChangePhone были его потомками

    @FindBy(id = "sms_verify")
    @Optional
    @Name("окно смены пароля")
    public ChangePhone changePhoneBlock;

}
