package pages.client.blocks.LoginBlocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

public class Confirm extends AkitaPage {

    final public static String confirmOverlayId = "modal_registration";
    final public static String confirmOverlayXpath = "//*[contains(@id, 'modal_registration')]";

    @FindBy(id = "login") // на button
    @Name("вход")
    public SelenideElement enterButton;

    @FindBy(id = "registration") // на button
    @Name("регистрация")
    public SelenideElement registrationButton;

    @FindBy(id = "cross")
    @Name("Х")
    public SelenideElement closeButton;

    @FindBy(id = "full_name") // на спан без переноса на стройчку с телефоном
    @Name("обращение")
    public SelenideElement textField;

    @FindBy(id = "phone") // после бр без ссылки
    @Name("телефон")
    public SelenideElement phoneField;

    @FindBy(id = "change_number") // внутри а
    @Name("изменить номер")
    public SelenideElement changeNumberField;

    @FindBy(id = "confirmation") // input
    @Name("введите код подтверждения")
    public SelenideElement pinField;

    @FindBy(id = "confirmation_error")
    @Optional
    @Name("ошибка кода подтверждения")
    public SelenideElement pinErrorField;

    @FindBy(id = "name") // input
    @Name("имя")
    public SelenideElement nameField;

    @FindBy(id = "name_error")
    @Optional
    @Name("ошибка имени")
    public SelenideElement nameErrorField;

    @FindBy(id = "agreement_check") // внутри label на i где class="checkbox-чегототам"
    @Name("чекбокс")
    public SelenideElement confirmCheckbox;

    @FindBy(id = "agreement_error")
    @Optional
    @Name("ошибка чекбокса")
    public SelenideElement checkboxErrorField;

    @FindBy(xpath = "//*[contains(text(), 'Пользовательского соглашения')]")
    @Optional
    @Name("пользовательского соглашения")
    public SelenideElement userAgreementLink;

    @FindBy(id = "sign_up") // button
    @Optional
    @Name("зарегистрироваться")
    public SelenideElement registerButton;

    @FindBy(id = "sign_up") // button
    @Optional
    @Name("войти")
    public SelenideElement signUpButton;

    @FindBy(id = "send_again") // button
    @Optional
    @Name("отправить еще раз")
    public SelenideElement sendAgainLink;

    @FindBy(id = "code_again") // на всю строчку, с таймером
    @Optional
    @Name("таймер")
    public SelenideElement timerLink;

}
