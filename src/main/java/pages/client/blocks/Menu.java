package pages.client.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

public class Menu extends AkitaPage {

    public final static String menuBlockId = "menu_links";

    // Локаторы на ссылки, ставить в <a>

    @FindBy(id = "menu_link_appointments")
    @Name("мои записи")
    public SelenideElement appoinmentLink;

    @FindBy(xpath = "//*[@id = 'menu_link_appointments']/span")
    @Optional
    @Name("количество записей")
    public SelenideElement appointmentsSum;

    @FindBy(id = "menu_link_favorites")
    @Name("мои салоны")
    public SelenideElement favoritesLink;

    @FindBy(xpath = "//*[@id = 'menu_link_favorites']/span")
    @Optional
    @Name("количество салонов")
    public SelenideElement favoritesSum;

    @FindBy(id = "menu_link_bonuses")
    @Name("мои бонусы")
    public SelenideElement bonusesLink;

    @FindBy(id = "menu_link_reviews")
    @Name("мои отзывы")
    public SelenideElement reviewsLink;

    @FindBy(xpath = "//*[@id = 'menu_link_reviews']/span")
    @Optional
    @Name("количество отзывов")
    public SelenideElement reviewsSum;

    @FindBy(id = "menu_link_profile")
    @Name("личные данные")
    public SelenideElement profileLink;

}
