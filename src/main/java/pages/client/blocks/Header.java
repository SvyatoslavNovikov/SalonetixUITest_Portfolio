package pages.client.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

public class Header extends AkitaPage {

    final public static String headerId = "header";

    @FindBy(id = "city") // вместе с текущим городом
    @Name("ваш город")
    public SelenideElement yourCityLink;

    // следующие два элемента в выпадашке выбора города

    @FindBy(id = "your_city")
    @Optional
    @Name("введите название своего города")
    public SelenideElement cityFilterLink;

    @FindBy(id = "city_list") // список городов, на всех городах должен быть одинаковый data-id
    @Optional
    @Name("городов")
    public List<SelenideElement> citiesList;

    @FindBy(id = "all")
    @Name("все услуги и салоны")
    public SelenideElement allServicesAndSalonsLink;

    @FindBy(id = "login")
    @Optional
    @Name("войти")
    public SelenideElement enterButton;

    @FindBy(id = "logout")
    @Optional
    @Name("выйти")
    public SelenideElement exitButton;

    @FindBy(id = "username")
    @Optional
    @Name("имя пользователя")
    public SelenideElement usernameButton;

    @FindBy(id = "render_logo")
    @Optional
    @Name("логотип")
    public SelenideElement logoLink;

}
