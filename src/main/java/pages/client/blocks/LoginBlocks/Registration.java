package pages.client.blocks.LoginBlocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

public class Registration extends AkitaPage {

    final public static String registrationOverlayID = "modal_registration";

    @FindBy(id = "login") // на button
    @Name("вход")
    public SelenideElement enterButton;

    @FindBy(id = "registration") // на button
    @Name("регистрация")
    public SelenideElement registrationButton;

    @FindBy(id = "cross")
    @Name("Х")
    public SelenideElement closeButton;

    @FindBy(id = "name") // на input
    @Name("имя")
    public SelenideElement nameField;

    @FindBy(xpath = "//input[@id = 'name']/following-sibling::i") // на input
    @Optional
    @Name("Х имя")
    public SelenideElement xNameField;

    @FindBy(id = "name_error")
    @Optional
    @Name("ошибка имени")
    public SelenideElement nameErrorField;

    @FindBy(id = "phone") // на input
    @Name("телефон")
    public SelenideElement phoneField;

    @FindBy(xpath = "//input[@id = 'phone']/following-sibling::i") // на input
    @Optional
    @Name("Х телефон")
    public SelenideElement xPhoneField;

    @FindBy(id = "phone_error")
    @Optional
    @Name("ошибка телефона")
    public SelenideElement phoneErrorField;

    @FindBy(id = "get_pass") // на button
    @Name("получить пароль")
    public SelenideElement getPasswordField;

}
