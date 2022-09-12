package pages.client;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import pages.client.blocks.*;
import pages.client.blocks.LoginBlocks.Confirm;
import pages.client.blocks.LoginBlocks.Login;
import pages.client.blocks.LoginBlocks.QuickLogin;
import pages.client.blocks.LoginBlocks.Registration;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("отзывы")
public class pageUserReview extends AkitaPage {

    @FindBy(id = Header.headerId)
    @Name("шапка")
    public Header header;

    @FindBy(id = Footer.footerId)
    @Name("подвал")
    public Footer footer;

    // блоки авторизации

    @FindBy(id = QuickLogin.quickLoginOverlayID)
    @Optional
    @Name("авторизация")
    public QuickLogin quickLogin;

    @FindBy(id = Login.regularPassAuthOverlayID)
    @Optional
    @Name("авторизация по постоянному паролю")
    public Login regularLogin;

    @FindBy(id = Registration.registrationOverlayID)
    @Optional
    @Name("регистрация")
    public Registration registration;

    @FindBy(xpath = Confirm.confirmOverlayXpath)
    @Optional
    @Name("ввода смс")
    public Confirm confirm;

    // Menu

    @FindBy(id = Menu.menuBlockId)
    @Name("меню")
    public Menu menuBlock;

    // Body

    @FindBy(id = "full_name") // тут имеется в виду заголовок
    @Name("заголовок")
    public SelenideElement titleField;

    @FindBy(id = "reviews_all")
    @Optional
    @Name("все отзывы")
    public SelenideElement reviewsAllButton;

    @FindBy(id = "reviews_salon")
    @Optional
    @Name("только о салонах")
    public SelenideElement reviewsSalonButton;

    @FindBy(id = "reviews_master")
    @Optional
    @Name("только о мастерах")
    public SelenideElement reviewsMasterButton;

    @FindBy(id = "reviews_search")
    @Optional
    @Name("строка поиска отзывов")
    public SelenideElement reviewsSearchField;

    // дальше идут одинаковые data-id

    static class MyReview extends AkitaPage {

        @FindBy(xpath = ".//*[@data-id = 'reviews_date']")
        @Name("дата")
        public SelenideElement dataField;

        @FindBy(xpath = ".//*[@data-id = 'reviews_date']")
        @Name("время")
        public SelenideElement timeField;

        @FindBy(xpath = ".//*[@data-id = 'reviews_salon']")
        @Name("салон")
        public SelenideElement salonField;

        // поле мастер появляется под названием салона, когда отзыв оставляется о его мастере

        @FindBy(xpath = ".//*[@data-id = 'reviews_master']")
        @Optional
        @Name("мастер")
        public SelenideElement masterField;

        // data-id не должен меняться в зависимости от значения оценки

        @FindBy(xpath = ".//*[@data-id = 'reviews_grade']")
        @Name("оценка")
        public SelenideElement ratingField;

        @FindBy(xpath = ".//*[@data-id = 'reviews_text']")
        @Name("текст отзыва")
        public SelenideElement textField;

        // Кнопки появляются когда в тексте отзыва более трех строк
        // Можно поставить один data-id на оба стейта

        @FindBy(xpath = ".//*[@data-id = 'reviews_text__collapsed']")
        @Optional
        @Name("читать полностью")
        public SelenideElement readFullLink;

        @FindBy(xpath = ".//*[@data-id = 'reviews_text__active']")
        @Optional
        @Name("свернуть")
        public SelenideElement readPartButton;

        @FindBy(xpath = ".//*[@data-id = 'reviews_status']")
        @Name("статус")
        public SelenideElement statusField;

    }

    // одинаковые data-id на блок отзыва целиком, так чтобы все элементы в классе MyReview были его потомками

    @FindBy(xpath = "//*[@data-id = 'reviews_item']")
    @Optional
    @Name("отзывы")
    public List<MyReview> reviewsBlocks;

}
