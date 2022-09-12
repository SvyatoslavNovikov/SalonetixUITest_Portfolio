package pages.client.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

public class СontactService extends AkitaPage {

    final public static String overlayContactService = "modal_support";

    @FindBy(id ="cross")
    @Name("х")
    public SelenideElement crossButton;

    @FindBy(id ="suggestion")
    @Name("есть идея")
    public SelenideElement ideaButton;

    @FindBy(id ="problem")
    @Name("есть проблема")
    public SelenideElement problemButton;

    @FindBy(id ="name")
    @Name("имя")
    public SelenideElement nameField;

    @FindBy(id ="name_error")
    @Name("ошибка имени")
    @Optional
    public SelenideElement nameError;

    @FindBy(id ="email")
    @Name("ваш e-mail")
    public SelenideElement emailField;

    @FindBy(id ="email_error")
    @Name("ошибка e-mail")
    @Optional
    public SelenideElement emailError;

    @FindBy(id ="owner_check") // на <i class="checkbox-16P3E"> и если возможно поставить локатор на стейт
    @Name("я владелец салона или частный мастер")
    public SelenideElement salonOrMasterCheckbox;

    @FindBy(id="message_textarea")
    @Name("cообщение")
    public SelenideElement messageField;

    @FindBy(id="message_error")
    @Name("ошибка cообщения")
    @Optional
    public SelenideElement messageError;

    @FindBy(id="send")
    @Name("отправить")
    public SelenideElement sentButton;

}
