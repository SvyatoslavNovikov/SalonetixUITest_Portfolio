package pages.extra.blocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

public class exMaster extends AkitaPage {

    // Сначала общие элементы, отображаются при регистрации салона на третьем шаге и и в разделе мастера

    @FindBy(xpath = ".//*[@id = 'master_person__imageWrapper']") // div над input
    @Name("аватар")
    public SelenideElement avatarField;

    @FindBy(xpath = ".//*[@id = 'master_person__avatar']") // на input
    @Name("добавить аватар")
    public SelenideElement addAvatarField;

    @FindBy(xpath = ".//*[@id = 'master_person__deleteAvatar']")
    @Name("х аватар")
    public SelenideElement clearAvatarField;

    @FindBy(xpath = ".//*[@id = 'master_person__name']")
    @Name("фио")
    public SelenideElement nameField;

    @FindBy(xpath = ".//*[@id = 'master_person__specialization']")
    @Name("специализация")
    public SelenideElement spezialisationField;

    // Список специализаций, появляется при клике на поле специализация
    @FindBy(xpath = ".//*[@id = 'master_person__specialization-list']")
    @Optional
    @Name("специализация")
    public List<SelenideElement> spezialisationsList;

    // блок первого уровня
    static class FirstLvlService extends AkitaPage{

        @FindBy(xpath = ".//*[@data-id = 'salon_service__name-1lvl']")
        @Name("заголовок")
        public SelenideElement titleFirstLvlField;

        @FindBy(xpath = ".//*[@data-id = 'add_new_servises']")
        @Optional
        @Name("добавить услугу")
        public SelenideElement addServiceButton;

        // Второй уровень это маникюр педикюр и т.д.

        // блок второго уровня
        static class SecondLevelService extends AkitaPage {

            @FindBy(xpath = ".//*[@data-id = 'salon_service__name-2lvl']")
            @Name("заголовок")
            public SelenideElement titleSecondLvlField;

            @FindBy(xpath = ".//*[@data-id = 'salon_service_remove-2lvl']")
            @Optional
            @Name("х")
            public SelenideElement deleteServiceButton;

            // блок третьего уровня
            static class ThirdLevelService extends AkitaPage {

                @FindBy(xpath = ".//*[@data-id = 'salon_service__name-3lvl']")
                @Name("заголовок")
                public SelenideElement titleThirdLvlField;

                @FindBy(xpath = ".//*[@data-id = 'salon_service_remove-3lvl']")
                @Name("х")
                public SelenideElement deleteServiceButton;

                // блок четвертого уровня
                static class FourLevelService extends AkitaPage {

                    @FindBy(xpath = ".//*[@data-id = 'salon_service__name-4lvl']")
                    @Name("заголовок")
                    public SelenideElement titleFourLvlField;

                    @FindBy(xpath = ".//*[@data-id = 'salon_service_remove-4lvl']")
                    @Name("х")
                    public SelenideElement deleteFourLvlButton;

                    // блок пятого уровня
                    static class FiveLevelService extends AkitaPage {

                        @FindBy(xpath = ".//*[@data-id = 'salon_service__name-5lvl']")
                        @Name("заголовок")
                        public SelenideElement titleFiveLvlField;

                        @FindBy(xpath = ".//*[@data-id = 'salon_service_remove-5lvl']")
                        @Name("х")
                        public SelenideElement deleteFiveLvlButton;

                    }

                    // Далее локаторы на блоки услуг целиком

                    // блок пятого уровня
                    @FindBy(xpath = ".//*[@data-id = 'salon_service__item-5lvl']")
                    @Optional
                    @Name("услуги пятого уровня")
                    public List<FiveLevelService> fiveLvlServiceList;

                }

                // блок четвертого уровня
                @FindBy(xpath = ".//*[@data-id = 'salon_service__item-4lv']")
                @Optional
                @Name("услуги четвертого уровня")
                public List<FourLevelService> fourLvlServiceList;

            }

            // блок третьего уровня
            @FindBy(xpath = ".//*[@data-id = 'salon_service__item-3lvl']")
            @Optional
            @Name("услуги третьего уровня")
            public List<ThirdLevelService> thirdLvlServiceList;

        }

        // блок второго уровня
        @FindBy(xpath = ".//*[@data-id = 'salon_service__item-2lvl']")
        @Optional
        @Name("услуги второго уровня")
        public List<SecondLevelService> secondLvlServiceList;

    }

    // блок первого уровня
    @FindBy(xpath = "//*[@data-id = 'salon_service__item-1lvl']") // class = "ServicesList__item"
    @Name("услуги первого уровня")
    public List<FirstLvlService> firstLvlServiceList;

    @FindBy(xpath = "//*[@data-id = 'remove_masters']")
    @Name("удалить мастера")
    public SelenideElement deleteMasterButton;

    // Далее элементы которые отображаются только в разделе мастера

    @FindBy(id = "select_value")
    @Optional
    @Name("записи мастера могут быть созданы на ближайшие")
    public SelenideElement customPlanedField;

    @FindBy(xpath = ".//div[@id = 'select_list']/div")
    @Optional
    @Name("значений")
    public List<SelenideElement> customPlanedList;

    @FindBy(xpath = "//button[contains(text(), 'Подробная информация')]")
    @Optional
    @Name("подробная информация")
    public SelenideElement detailedButton;

    @FindBy(xpath = "//button[contains(text(), 'Свернуть')]")
    @Optional
    @Name("свернуть")
    public SelenideElement spoiledButton;


}
