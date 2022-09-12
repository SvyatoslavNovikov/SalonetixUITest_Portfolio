package pages.client.blocks.LoginBlocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("авторизация")
public class QuickLogin extends AkitaPage {

    final public static String quickLoginOverlayID = "modal_sms";

    @FindBy(id = "login") // на button
    @Name("вход")
    public SelenideElement enterButton;

    @FindBy(id = "registration") // на button
    @Name("регистрация")
    public SelenideElement registrationButton;

    @FindBy(xpath = "//i[@id = 'cross']")
    @Name("Х")
    public SelenideElement closeButton;

    @FindBy(id = "phone") // на input
    @Name("телефон")
    public SelenideElement telephoneField;

    @FindBy(id = "phone_error") // на скрине
    @Optional
    @Name("ошибка телефона")
    public SelenideElement phoneErrorField;

    @FindBy(id = "get_pass") // на button
    @Name("получить пароль")
    public SelenideElement getPasswordButton;

    @FindBy(id = "enter_pass")
    @Name("ввести постоянный пароль")
    public SelenideElement enterRegularPasswordLink;

}
