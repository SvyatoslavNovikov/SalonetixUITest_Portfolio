package pages.client.blocks.LoginBlocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("окно смены пароля")
public class ChangePhone extends AkitaPage {

    @FindBy(xpath = ".//*[@id = 'cross']")
    @Optional
    @Name("X")
    public SelenideElement closeButton;

    @FindBy(id = "get_code") // имеется в виду фраза "мы отправили код подтверждения на номер" с именем и телефоном
    @Name("обращение")
    public SelenideElement helloField;

    @FindBy(id = "verify_code")
    @Name("введите код подтверждения")
    public SelenideElement codeField;

    @FindBy(id = "verify_code_cross")
    @Optional
    @Name("x код подтверждения")
    public SelenideElement xCodeButton;

    @FindBy(id = "verify_code__error")
    @Optional
    @Name("ошибка кода подтверждения")
    public SelenideElement errorCodeButton;

    @FindBy(id = "verify_code__repeat")
    @Optional
    @Name("повторно получить код можно через")
    public SelenideElement timer;

    @FindBy(id = "verify_code__again")
    @Optional
    @Name("отправить еще раз")
    public SelenideElement sendAgainLink;

    @FindBy(id = "verify_submit")
    @Name("подтвердить")
    public SelenideElement confirmButton;

}
