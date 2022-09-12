package pages.extra.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

public class exFooter extends AkitaPage {

    final public static String footer = "//*[@class = 'Footer']";

    @FindBy(id = "entrance_salons")
    @Name("вход для салонов")
    public SelenideElement enterForSalonsLink;

    @FindBy(id = "contact_service")
    @Name("связаться с сервисом")
    public SelenideElement contactWithServiceLink;

    @FindBy(id = "user_agreement")
    @Name("пользовательское соглашение")
    public SelenideElement agreementLink;

    @FindBy(xpath = "//*[@class = 'Socials grid']/*[1]")
    @Name("f")
    public SelenideElement facebookButton;

    @FindBy(xpath = "//*[@class = 'Socials grid']/*[2]")
    @Name("vk")
    public SelenideElement vkButton;

    @FindBy(xpath = "//*[@class = 'Socials grid']/*[3]")
    @Name("instagram")
    public SelenideElement instagramButton;

    @FindBy(xpath = "//*[@class = 'techranch']")
    @Name("techranch")
    public SelenideElement techranchButton;

}
