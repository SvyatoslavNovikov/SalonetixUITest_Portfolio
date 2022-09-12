package pages.client;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import pages.client.blocks.Footer;
import pages.client.blocks.Header;
import pages.client.blocks.LoginBlocks.Confirm;
import pages.client.blocks.LoginBlocks.Login;
import pages.client.blocks.LoginBlocks.QuickLogin;
import pages.client.blocks.LoginBlocks.Registration;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("карта салонов")
public class pageMap extends AkitaPage {

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

    // Фильтры

    static class Filters extends AkitaPage {

        @FindBy(id = "filter_search")
        @Name("введите услугу, салон или имя мастера")
        public SelenideElement servicesField;

        // Кнопка появляется, когда введен текст в поле. Тут можно ничего не ставить, оттолкнусь от servicesField

        @FindBy(id = "filter_search_cross")
        @Optional
        @Name("сброс поиска по названию")
        public SelenideElement clearServicesFieldButton;

        @FindBy(id = "filter_search__submit")
        @Name("найти")
        public SelenideElement findButton;

        @FindBy(id = "select_service")
        @Name("выберите услугу")
        public SelenideElement chooseServicesButton;

        // Это список услуг в бабле появляющемся при клике на "выберете услугу". Нужно поставить одинаковый data-id на
        // услуги второго уровня.

        @FindBy(xpath="//*[@data-id = 'handle_service_level2']")
        @Optional
        @Name("услуги 2 уровня")
        public List<SelenideElement> secondLvServicesList;

        @FindBy(id = "specify_services")
        @Optional
        @Name("уточните услугу")
        public SelenideElement checkServicesButton;

        // Это список услуг в бабле появляющемся при клике на "уточните услугу". Нужно поставить одинаковый data-id на
        // label услуг третьего уровня.

        @FindBy(xpath="//*[@data-id = 'specify_list_item']")
        @Optional
        @Name("услуги 3 уровня")
        public List<SelenideElement> thirdLvLservicesList;

        @FindBy(id = "specify_accept")
        @Optional
        @Name("применить")
        public SelenideElement applyButton;

        // Кнопка появляется, когда в фильтрах выбрана какая-нибудь услуга

        @FindBy(id = "selected_reset")
        @Optional
        @Name("очистить фильтр услуг")
        public SelenideElement clearServicesButton;

        @FindBy(id = "filter_nearby")
        @Name("рядом")
        public SelenideElement nearField;

        // Появляется в поле рядом, когда в поле что то введено. Можно ничего не ставить, оттолкнусь от nearField

        @FindBy(id = "filter_nearby_cross")
        @Optional
        @Name("очистить поле рядом")
        public SelenideElement clearNearField;

        @FindBy(id="filter_geolocation")
        @Name("рядом со мной")
        public SelenideElement nearButton;

        // Тут id нужно поставить там где тайтл

        @FindBy(id = "filter_comfort_coffee")
        @Name("кафе")
        public SelenideElement cafeButton;

        @FindBy(id = "filter_comfort_wifi")
        @Name("WiFi")
        public SelenideElement wifeButton;

        @FindBy(id = "filter_comfort_cards")
        @Name("оплата картой")
        public SelenideElement cardButton;

        @FindBy(id = "filter_comfort_car")
        @Name("парковка")
        public SelenideElement parkButton;

        @FindBy(id = "filter_schedule_start")
        @Name("график работы от")
        public SelenideElement workFromButton;

        @FindBy(id = "filter_schedule_end")
        @Name("график работы до")
        public SelenideElement workToButton;

        // Тут нужно поставить id на дропдаун, который появляется при клике на "график работы от" и "график работы до"
        // Так как дропдауны не отображаются на странице одновременно, id может быть одинаковый.
        // Как альтернативный вариант, можно поставить одинаковые data-id на все значения в списке

        @FindBy(xpath = "//*[contains(@data-id, 'filter_schedule')]")
        @Optional
        @Name("времени")
        public List<SelenideElement> timeList;

    }

    // Тут отдельный id на весь блок фильтров, чтобы все выше описанные элементы были потомками filtersBlock

    @FindBy(id = "filter_top")
    @Name("фильтров")
    public Filters filtersBlock;


    @FindBy(id = "result_name")
    @Name("заголовок")
    public SelenideElement h1Field;

    // То, что под заголовком. Появляется когда, например, выбрана услуга в фильтрах
    @FindBy(id = "result_custom")
    @Name("лид")
    public SelenideElement leedField;

    @FindBy(id = "result_objects")
    @Optional
    @Name("найдено объектов")
    public SelenideElement findField;

    @FindBy(id = "filter_all")
    @Name("все")
    public SelenideElement allButton;

    @FindBy(id = "filter_salon")
    @Name("салоны")
    public SelenideElement salonsButton;

    @FindBy(id = "filter_craftsman")
    @Name("частные мастера")
    public SelenideElement mastersButton;

    @FindBy(id = "toggle_map")
    @Name("карта")
    public SelenideElement mapButton;

    @FindBy(id = "toggle_list")
    @Name("список")
    public SelenideElement listButton;

    // Сортировка

    @FindBy(id = "sort_price")
    @Optional
    @Name("сортировка по цене")
    public SelenideElement priceButton;

    @FindBy(id = "sort_rating")
    @Name("сортировка по рейтингу")
    public SelenideElement rateButton;

    @FindBy(id = "sort_recommended")
    @Name("сортировка по рекомендуемым")
    public SelenideElement recomendButton;

    // Список салонов

    static class SalonCard extends AkitaPage {

        // В элементы внутри карточек добавляем одинаковые data-id

        @FindBy(xpath = ".//*[@data-id = 'near_metro']")
        @Optional
        @Name("ближайшее метро")
        public SelenideElement metroStation;

        @FindBy(xpath = ".//*[@data-id = 'salons_name']")
        @Name("название салона")
        public SelenideElement salonName;

        @FindBy(xpath = ".//*[@data-id = 'toggle_favorite']")
        @Name("добавить/удалить в избранное")
        public SelenideElement ddOrRemoveFavoriteButton;

        @FindBy(xpath = ".//*[@data-id = 'salons_recommended']")
        @Optional
        @Name("рекомендованный")
        public SelenideElement recommendElement;

        @FindBy(xpath = ".//*[@data-id = 'salons_services__name']")
        @Optional
        @Name("услуга")
        public SelenideElement serviceElement;

        @FindBy(xpath = ".//*[@data-id = 'salons_services__price']")
        @Optional
        @Name("цена")
        public SelenideElement priceElement;

        // Появляется, когда у салона есть несколько услуг, которые выбраны в фильтрах

        @FindBy(xpath = ".//*[@data-id = 'salons_services__yet']")
        @Optional
        @Name("выбранных услуг")
        public SelenideElement countChosenServicesElement;

        @FindBy(xpath = ".//*[@data-id = 'salons_images']")
        @Name("картинка")
        public SelenideElement pictureElement;

        // Длительность только на числа, отдельно от слова "минуты"

        @FindBy(xpath = ".//*[@data-id = 'salons_duration']")
        @Optional
        @Name("длительность")
        public SelenideElement timeElement;

        // id поставить туда, где title

        @FindBy(xpath = ".//*[@data-id = 'salons_rating']")
        @Optional
        @Name("рейтинг")
        public SelenideElement rateElement;

    }

    // тут добавляем data-id на карточку, так чтобы он был предком всех описанных выше элементов. data-id одинаковые

    @FindBy(xpath = "//*[@data-id = 'salons_card']")
    @Optional
    @Name("карточек")
    public List<SalonCard> salonCardList;

    // кнопка внизу списка

    @FindBy(id="salons_more")
    @Optional
    @Name("загрузить еще")
    public SelenideElement loadMoreButton;

}