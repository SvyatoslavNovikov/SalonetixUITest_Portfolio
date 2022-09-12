package pages.client.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("нотификация")
public class Notice extends AkitaPage {

    @FindBy(xpath = ".//li")
    @Name("текст")
    // ToDO в будущем переделать в список
    public SelenideElement textField;

}
