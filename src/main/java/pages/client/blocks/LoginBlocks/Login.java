package pages.client.blocks.LoginBlocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("авторизация по постоянному паролю")
public class Login extends AkitaPage{

    final public static String regularPassAuthOverlayID = "modal_login";

    @FindBy(id = "login") // на button
    @Name("вход")
    public SelenideElement enterButton;

    @FindBy(id = "registration") // на button
    @Name("регистрация")
    public SelenideElement registrationButton;

    @FindBy(xpath = "//i[@id = 'cross']")
    @Name("x")
    public SelenideElement closeButton;

    @FindBy(id = "phone") // на input
    @Name("телефон")
    public SelenideElement telephoneField;

    @FindBy(id = "phone_cross")
    @Optional
    @Name("x телефон")
    public SelenideElement clearTelephoneField;

    @FindBy(id = "phone_error") // на скрине
    @Optional
    @Name("ошибка телефона")
    public SelenideElement phoneErrorField;

    @FindBy(id = "password") // на input
    @Name("пароль")
    public SelenideElement passwordField;

    @FindBy(id = "password_cross")
    @Optional
    @Name("x пароль")
    public SelenideElement clearPasswordField;

    @FindBy(id = "password_error") // на скрине
    @Optional
    @Name("ошибка пароля")
    public SelenideElement passwordErrorField;

    @FindBy(id = "authorize") // на button
    @Name("войти")
    public SelenideElement loginButton;

    @FindBy(id = "login_pass")
    @Name("войти по единовременному паролю")
    public SelenideElement enterOneTimePasswordLink;

}
