package pages.extra.blocks.addService;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

public class addServiceModal extends AkitaPage {

    @FindBy(id="add_services__close")
    @Name("х")
    public SelenideElement closeButton;

    @FindBy(xpath = ".//*[@data-id = 'add_service__name-1lvl']") // Тут это заголовок, например Ногти
    @Name("услуга первого уровня")
    public SelenideElement firstLevelButton;

    static class SecondLvlService {

        @FindBy(xpath = ".//*[@data-id = 'add_service__name-2lvl']") // Тут это заголовок, например маникюр
        @Name("услуга второго уровня")
        public SelenideElement firstLevelButton;

        @FindBy(xpath = ".//*[@data-id = 'add_service__adding-2lvl']") // Тут это + рядом с названием второго уровня
        @Name("добавить кастомную услугу третьего уровня")
        public SelenideElement addCustomServiceSecondLevelButton;

        static class ThirdLevelService {

            @FindBy(xpath = ".//*[@data-id = 'add_service__name-3lvl']") // Тут это название услуги, например СНЯТИЕ+МАНИКЮР+ПОКРЫТИЕ SHELLAC
            @Name("услуга третьего уровня")
            public SelenideElement firstLevelButton;

            @FindBy(xpath = ".//*[@data-id = 'add_service__adding-3lvl']") // Тут это + рядом с названием третьего уровня
            @Name("добавить кастомную услугу четвертого уровня")
            public SelenideElement addCustomServiceThirdLevelButton;

            @FindBy(xpath = ".//*[@data-id = 'add_service__edit-3lvl']") // Карандаш, есть только у кастомных услуг
            @Optional
            @Name("карандаш")
            public SelenideElement penForServiceThirdLevelButton;

            @FindBy(xpath = ".//*[@data-id = 'add_service__delete-3lvl']") // X, есть только у кастомных услуг
            @Optional
            @Name("X")
            public SelenideElement deleteServiceThirdLevelButton;

            static class FourLevelService extends AkitaPage {

                @FindBy(xpath = ".//*[@data-id = 'add_service__name-4lvl']")
                @Name("услуга четвертого уровня")
                public SelenideElement fourLevelField;

                @FindBy(xpath = ".//*[@data-id = 'add_service__adding-4lvl']") // Тут это + рядом с названием четвертого уровня
                @Name("добавить кастомную услугу пятого уровня")
                public SelenideElement addCustomServiceFourLevelButton;

                @FindBy(xpath = ".//*[@data-id = 'add_service__edit-4lvl']") // Карандаш, есть только у кастомных услуг
                @Optional
                @Name("карандаш")
                public SelenideElement penForServiceFourLevelButton;

                @FindBy(xpath = ".//*[@data-id = 'add_service__delete-4lvl']") // X, есть только у кастомных услуг
                @Optional
                @Name("X")
                public SelenideElement deleteServiceFourLevelButton;

                static class FiveLevelService extends AkitaPage {

                    @FindBy(xpath = ".//*[@data-id = 'add_service__name-5lvl']")
                    @Name("услуга пятого уровня")
                    public SelenideElement fiveLevelButton;

                    @FindBy(xpath = ".//*[@data-id = 'add_service__edit-5lvl']") // Карандаш, есть только у кастомных услуг
                    @Optional
                    @Name("карандаш")
                    public SelenideElement penForServiceFiveLevelButton;

                    @FindBy(xpath = ".//*[@data-id = 'add_service__delete-5lvl']") // X, есть только у кастомных услуг
                    @Optional
                    @Name("X")
                    public SelenideElement deleteServiceFiveLevelButton;

                }
                // Далее добавляем data-id на блоки услуг

                @FindBy(xpath = ".//*[@data-id = 'add_service__item-5lvl']")
                @Optional
                @Name("услуги пятого уровня")
                public List<FiveLevelService> fourLevelServiceList;

            }

            @FindBy(xpath = ".//*[@data-id = 'add_service__item-4lvl']")
            @Name("услуги четвертого уровня")
            public List<FourLevelService> fourLevelServiceList;

        }

        @FindBy(xpath = ".//*[@data-id = 'add_service__item-3lvl']") // Блоки, например СНЯТИЕ+МАНИКЮР+ПОКРЫТИЕ SHELLAC Идут списком
        @Name("услуги третьего уровня")
        public List<ThirdLevelService> thirdLevelServiceList;

    }

    @FindBy(xpath = ".//*[@data-id = 'add_service__item-2lvl']") // Блоки, например маникюр, педикюр и т.д. Идут списком
    @Name("услуги второго уровня")
    public List<SecondLvlService> secondLevelServiceList;

    @FindBy(id = "add_selected__services")
    @Name("добавить выбранные услуги")
    public SelenideElement addChosenServicesButton;

    @FindBy(id="cancel_selected__services")
    @Name("отменить")
    public SelenideElement cancelButton;

}
