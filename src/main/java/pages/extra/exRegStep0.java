package pages.extra;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("0 шаг регистрации")
public class exRegStep0 extends AkitaPage {

    // ToDo тесты на валидацию

    @FindBy(xpath = "//input[@id = 'reg_salon']/following-sibling::*")
    @Name("салон")
    public SelenideElement salonButton;

    @FindBy(xpath = "//input[@id = 'reg_master']/following-sibling::*")
    @Name("мастер")
    public SelenideElement masterButton;

    @FindBy(id = "reg_name")
    @Name("ваше имя")
    public SelenideElement nameField;

    @FindBy(xpath = "//*[@id = 'reg_name']//ancestor::label//following-sibling::div/div")
    @Optional
    @Name("ошибка ввода имени")
    public SelenideElement nameMessage;

    @FindBy(id = "reg_post")
    @Name("ваша должность")
    public SelenideElement positionField;

    @FindBy(xpath = "//*[@id = 'reg_post']//following-sibling::div/*[@class = 'Select__item']")
    @Optional
    @Name("должностей")
    public List<SelenideElement> positionList;

//            @FindBy(css = "div.Select__input div.InputText > input.InputText__input")
//            @Optional
//            @Name("Ввод должности")
//            public SelenideElement enterpositionField;

//            @FindBy(css = "div.RegisterStep0Fields div.RegisterStep0Fields__item.RegisterStep0Fields__item_position:nth-child(3) div.FieldError:nth-child(2) > div.FieldForm__item")
//            @Optional
//            @Name("Ошибка ввода должности")
//            public SelenideElement positionerrorMassege;

    @FindBy(id = "reg_phone")
    @Name("контактный телефон")
    public SelenideElement phoneField;

    @FindBy(xpath = "//*[@id = 'reg_phone']//ancestor::label//following-sibling::div/div")
    @Optional
    @Name("ошибка ввода телефона")
    public SelenideElement phoneErrorMassage;

    @FindBy(id = "reg_mail")
    @Name("контактный email")
    public SelenideElement emailField;

    @FindBy(xpath = "//*[@id = 'reg_mail']//ancestor::label//following-sibling::div/div")
    @Optional
    @Name("ошибка ввода email")
    public SelenideElement emailErrorMessage;

    @FindBy(id = "reg_password1")
    @Name("пароль")
    public SelenideElement passwordField;

    @FindBy(xpath = "//*[@id = 'reg_password1']//ancestor::label//following-sibling::div/div")
    @Optional
    @Name("ошибка ввода пароля")
    public SelenideElement errorPasswordField;

    @FindBy(id = "reg_password2")
    @Name("повторите пароль")
    public SelenideElement confirmPasswordField;

    @FindBy(xpath = "//*[@id = 'reg_password2']//ancestor::label//following-sibling::div/div")
    @Optional
    @Name("ошибка подтверждения пароля")
    public SelenideElement errorConfirmPasswordField;

    @FindBy(xpath = "//input[@id = 'reg_agreement']/following-sibling::*")
    @Name("чекбокс")
    public SelenideElement confirmContractCheckbox;

    @FindBy(xpath = "//*[@id = 'reg_agreement']//ancestor::label//following-sibling::div/div")
    @Optional
    @Name("ошибка чекбокса")
    public SelenideElement confirmContractMessage;

    @FindBy(xpath = "//a[contains(text(), 'Пользовательского соглашения')]")
    @Name("пользовательское соглашение")
    public SelenideElement contractLink;

    @FindBy(id = "reg_submit")
    @Name("зарегистрироваться")
    public SelenideElement registrationButton;

}
