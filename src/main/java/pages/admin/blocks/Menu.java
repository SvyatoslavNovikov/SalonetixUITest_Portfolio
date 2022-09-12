package pages.admin.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

public class Menu extends AkitaPage {

    final public static String menuId = ""; // поставить id на class="Pending__heading"

    // добавить id на h1

    @FindBy(id = "")
    @Name("заголовок")
    public SelenideElement titleField;

    // список появляется в разделах сео и сервисы
    // тут можно просто поставить id на Pending__menu

    @FindBy(xpath = "//*[data-id = '']")
    @Optional
    @Name("разделов")
    public List<SelenideElement> Buttons;

}
