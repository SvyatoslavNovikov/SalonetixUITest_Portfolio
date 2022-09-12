package pages.client.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

public class Footer extends AkitaPage {

    final public static String footerId = "footer";

    // на всех ссылках на статические страницы должны быть одинаковые data-id, там где есть href
    // по возможности на Связаться с сервисом тоже тот же data-id

    @FindBy(xpath = "//*[@data-id = 'footer_link']")
    @Name("статических страниц")
    public List<SelenideElement> staticPagesList;

//    @FindBy(id = "facebook")
//    @Name("f")
//    public SelenideElement facebookButton;

//    @FindBy(id = "vkontakte")
//    @Name("vk")
//    public SelenideElement vkButton;

//    @FindBy(id = "instagram")
//    @Name("instagram")
//    public SelenideElement instagramButton;

    @FindBy(id = "techranch")
    @Name("techranch")
    public SelenideElement techranchButton;

}
