package pages.admin;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

public class Login extends AkitaPage {

    @FindBy(id = "email")
    @Name("контактный e-mail")
    public SelenideElement emailField;

    @FindBy(id = "password")
    @Name("пароль")
    public SelenideElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Войти')]")
    @Name("войти")
    public SelenideElement enterButton;

}
