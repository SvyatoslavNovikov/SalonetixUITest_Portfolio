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

@Name("страница салона или частного мастера")
public class pageSalon extends AkitaPage {

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

    //Заголовок

    @FindBy(id = "salon-name")
    @Name("название салона")
    private SelenideElement salonNameField;

    @FindBy(id = "salon-back")
    @Name("вернуться к выбору салона")
    private SelenideElement backToMapField;

    @FindBy(id = "salon-favorite-add")
    @Optional
    @Name("добавить в избранное")
    private SelenideElement addFavoritesButton;

    @FindBy(id = "salon-favorite-remove")
    @Optional
    @Name("удалить из избранного")
    private SelenideElement removeFavoritesButton;

    @FindBy(id = "salon-rating")
    @Name("рейтинг салона")
    private SelenideElement rateField;

    @FindBy(id = "salon-menu-about")
    @Optional
    @Name("о салоне")
    private SelenideElement aboutSalonLink;

    @FindBy(id = "salon-menu-about")
    @Optional
    @Name("о мастере")
    private SelenideElement aboutMasterLink;

    @FindBy(id = "salon-menu-services")
    @Name("услуги")
    private SelenideElement servicesLink;

    @FindBy(id = "salon-menu-masters")
    @Optional
    @Name("мастера")
    private SelenideElement mastersLink;

    @FindBy(id = "salon-menu-reviews")
    @Name("отзывы")
    private SelenideElement reviewsLink;

    @FindBy(id = "salon_images") // на class="slider"
    @Name("фото")
    private SelenideElement imageField;

    // Далее кнопки, отображаются только если добавлено более одной фотографии

    @FindBy(id = "") // можно поставить id на class='slick-dots' или data-id на li внутри
    @Optional
    @Name("кнопок фото")
    private SelenideElement imageButtonList;

    @FindBy(id = "salon_map") // нужно поставить на map-wrapper
    @Name("карта")
    private SelenideElement mapField;

    // О салоне/мастере

    static class About extends AkitaPage {

        @FindBy(id = "salon-description")
        @Name("описание")
        private SelenideElement descriptionField;

        @FindBy(id = "appointment")
        @Name("записаться сейчас")
        private SelenideElement appointmentButton;

        @FindBy()
        @Name("оставить отзыв")
        private SelenideElement reviewsButton;

        @FindBy(id = "salon-work-time")
        @Name("график")
        private SelenideElement workTimeField;

        @FindBy(id = "salon-address")
        @Name("адрес")
        private SelenideElement addressField;

        @FindBy(xpath = ".//*[@data-id = 'salon_station']")
        @Optional
        @Name("станций метро")
        private List<SelenideElement> metroStationList;

        @FindBy(id = "salon-comfort-wifi")
        @Optional
        @Name("WiFi")
        private SelenideElement wifiField;

        @FindBy(id = "salon-comfort-cards")
        @Name("оплата картой")
        private SelenideElement cardField;

        @FindBy(id = "salon-comfort-car")
        @Name("парковка")
        private SelenideElement parkField;

        @FindBy(id = "salon-comfort-coffee")
        @Name("кафе")
        private SelenideElement cafeField;

    }

    @FindBy(id = "salon_about") // Id на блок about, так чтобы все элементы описанные в классе About были его потомками
    @Name("about")
    private About aboutBlock;

    // Услуги ToDo Многоуровневая структура услуг

//    static class Services extends AkitaPage {
//
//        @FindBy()
//        @Name("список услуг 1 уровня")
//        private List<SelenideElement> title0lvlButtonList;
//
//        static class Lvl1 extends AkitaPage {
//
//            @FindBy()
//            @Name("название услуги 2 уровня")
//            private SelenideElement title1lvlField;
//
//            static class Lvl2 extends AkitaPage {
//
//                @FindBy()
//                @Optional
//                @Name("название услуги 3 уровня")
//                private SelenideElement title2lvlField;
//
//                @FindBy()
//                @Optional
//                @Name("название услуги 3 уровня")
//                private SelenideElement info2lvlField;
//
//                @FindBy()
//                @Optional
//                @Name("длительность 3 уровня")
//                private SelenideElement duration2lvlField;
//
//                @FindBy()
//                @Optional
//                @Name("цена 3 уровня")
//                private SelenideElement price2lvlField;
//
//                @FindBy()
//                @Optional
//                @Name("записаться 3 уровня")
//                private SelenideElement booking2lvlButton;
//
//                static class Lvl3 extends AkitaPage {
//
//                    @FindBy()
//                    @Optional
//                    @Name("название услуги 4 уровня")
//                    private SelenideElement title3lvlField;
//
//                    @FindBy()
//                    @Optional
//                    @Name("название услуги 4 уровня")
//                    private SelenideElement info3lvlField;
//
//                    @FindBy()
//                    @Optional
//                    @Name("длительность 4 уровня")
//                    private SelenideElement duration3lvlField;
//
//                    @FindBy()
//                    @Optional
//                    @Name("цена 4 уровня")
//                    private SelenideElement price3lvlField;
//
//                    @FindBy()
//                    @Optional
//                    @Name("записаться 4 уровня")
//                    private SelenideElement booking3lvlButton;
//
//                    static class Lvl4 extends AkitaPage {
//
//                        @FindBy()
//                        @Optional
//                        @Name("название услуги 5 уровня")
//                        private SelenideElement title3lvlField;
//
//                        @FindBy()
//                        @Optional
//                        @Name("название услуги 5 уровня")
//                        private SelenideElement info3lvlField;
//
//                        @FindBy()
//                        @Optional
//                        @Name("длительность 5 уровня")
//                        private SelenideElement duration3lvlField;
//
//                        @FindBy()
//                        @Optional
//                        @Name("цена 5 уровня")
//                        private SelenideElement price3lvlField;
//
//                        @FindBy()
//                        @Optional
//                        @Name("записаться 5 уровня")
//                        private SelenideElement booking3lvlButton;
//
//                    }
//
//                    @FindBy()
//                    @Optional
//                    @Name("список услуг 5 уровня")
//                    private List<Lvl4> lvl4BlockList;
//
//                }
//
//                @FindBy()
//                @Optional
//                @Name("список услуг 4 уровня")
//                private List<Lvl3> lvl3BlockList;
//
//            }
//
//            @FindBy()
//            @Optional
//            @Name("список услуг 3 уровня")
//            private List<Lvl2> lvl2BlockList;
//
//        }
//
//        @FindBy()
//        @Optional
//        @Name("список услуг 2 уровня")
//        private List<Lvl1> lvl1BlockList;
//
//    }
//
//    @FindBy()
//    @Optional
//    @Name("услуги")
//    private Services servicesBlock;


    // Мастера салона
    // Тут почти все есть, нужно просто немного добавить

    static class Masters extends AkitaPage {

        static class Master extends AkitaPage {

            // Сюда

            @FindBy(xpath = "//*[@data-id = 'master-avatar']")
            @Name("аватар")
            private SelenideElement avatarField;

            @FindBy(xpath = "//*[@data-id = 'master-name']")
            @Name("имя")
            private SelenideElement masterName;

            @FindBy(xpath = "//*[@data-id = 'master-rating']")
            @Name("рейтинг мастера")
            private SelenideElement masterRate;

            // На следующие две кнопки хорошо бы добавить стейт или разные data-id

            @FindBy(xpath = "//*[@data-id = 'master-appointment']")
            @Optional
            @Name("записаться к мастеру")
            private SelenideElement appointmentButton;

            @FindBy(xpath = "//*[@data-id = 'master-appointment-no']")
            @Optional
            @Name("свободной записи нет")
            private SelenideElement noAppointmentButton;

            @FindBy(xpath = "//*[@data-id = 'master-specialization']")
            @Name("специализация")
            private SelenideElement specializationField;

        }

        // Тут на весь блок мастера, так чтобы все элементы в классе Master были его потомками

        @FindBy(xpath = "//*[@data-id = 'master-item']")
        @Name("мастеров")
        private List<Master> masterBlockList;

        @FindBy(id = "salon-masters-more")
        @Optional
        @Name("показать еще мастеров")
        private SelenideElement moreMastersButton;

    }

    @FindBy(id = "salon-masters")
    @Name("мастера салона")
    private Masters mastersBlock;

    //Отзывы

    static class Reviews extends AkitaPage {

        @FindBy(id = "salon-reviews-tabs-all")
        @Optional
        @Name("все")
        private SelenideElement allButton;

        @FindBy(id = "salon-reviews-tabs-salon")
        @Optional
        @Name("только о салоне")
        private SelenideElement onlySalonsButton;

        @FindBy(id = "salon-reviews-tabs-master")
        @Optional
        @Name("только о мастерах")
        private SelenideElement onlyMastersButton;

        @FindBy(id = "")
        @Optional
        @Name("оставить отзыв")
        private SelenideElement doReviewButton;

        static class Review extends AkitaPage {

            @FindBy(xpath = "//*[@data-id = 'review-date']")
            @Name("дата")
            private SelenideElement reviewDate;

            @FindBy(xpath = "//*[@data-id = 'review-author']")
            @Name("автор")
            private SelenideElement authorField;

            @FindBy(xpath = "//*[@data-id = 'review-type-positive']")
            @Optional
            @Name("положительная оценка")
            private SelenideElement reviewPositiveField;

            @FindBy(xpath = "//*[@data-id = 'review-type-negative']")
            @Optional
            @Name("отрицательная оценка")
            private SelenideElement reviewNegativeField;

            @FindBy(xpath = "//*[@data-id = 'review-master']")
            @Optional
            @Name("мастер")
            private SelenideElement masterField;

            @FindBy(xpath = "//*[@data-id = 'review-message']")
            @Name("текст")
            private SelenideElement reviewText;

            @FindBy(xpath = "//*[@data-id = 'review__collapsed']")
            @Optional
            @Name("читать полностью")
            private SelenideElement undefinedCollapsedButton;

            @FindBy(xpath = "//*[@data-id = 'review__active']")
            @Optional
            @Name("свернуть")
            private SelenideElement undefinedActiveButton;

        }

        // Тут на весь блок мастера, так чтобы все элементы в классе Review были его потомками

        @FindBy(xpath = "//*[@data-id = 'review-item']")
        @Optional
        @Name("отзывов")
        private Reviews reviewBlock;

        @FindBy(id = "salon-reviews-more")
        @Optional
        @Name("показать еще отзывов")
        private List<SelenideElement> moreReviewsButton;

    }

    @FindBy(id = "salon-reviews")
    @Name("отзывы")
    private Reviews reviewBlock;

}
