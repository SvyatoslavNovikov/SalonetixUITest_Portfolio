package pages.extra;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import pages.extra.blocks.exFooter;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("главная страница экстранета")
public class exMainPage extends AkitaPage {

    @FindBy(xpath = exFooter.footer)
    @Name("футтер")
    public exFooter footer;

    // Авторизация и регистрация

    @FindBy(id = "register")
    @Name("зарегистрироваться")
    public SelenideElement registrationButton;

    @FindBy(id = "email")
    @Name("контактный email")
    public SelenideElement loginForm;

    @FindBy(id = "password")
    @Name("пароль")
    public SelenideElement passwordForm;

    @FindBy(id = "submit")
    @Name("войти")
    public SelenideElement enterButton;

    @FindBy(id = "password_recovery")
    @Name("забыли пароль")
    public SelenideElement forgotPasswordLink;

    // Рекламный блок

    @FindBy(id = "begin_work")
    @Name("начать работу")
    public SelenideElement beginworkButton;

    // Функционал

    @FindBy(xpath = "//*[@class = 'Functional']")
    @Name("функционал")
    public List<SelenideElement> functionalBlock;

    @FindBy(xpath = "//ul[@class = 'Tabs__list']/li")
    @Name("закладок")
    public List<SelenideElement> tabsList;

        @FindBy(id = "begin_journal")
        @Optional
        @Name("начать работу с электронным журналом")
        public SelenideElement beginJournalWorkButton;

        @FindBy(id = "begin_appointments")
        @Optional
        @Name("зарегистрироваться и подключить онлайн-запись")
        public SelenideElement beginAppointmentsButton;

        @FindBy(id = "begin_notifications1")
        @Optional
        @Name("подключить сервис уведомлений")
        public SelenideElement beginNotificationsOneButton;

        @FindBy(id = "begin_notifications2")
        @Optional
        @Name("подключить уведомления")
        public SelenideElement beginNotificationsTwoButton;

        @FindBy(id = "begin_notifications3")
        @Optional
        @Name("зарегистрироваться в уведомлениях")
        public SelenideElement beginNotificationsThreeButton;

        @FindBy(id = "begin_clients")
        @Optional
        @Name("зарегистрироваться в клиентской базе")
        public SelenideElement registerTwoButton;

        @FindBy(id = "begin_employee")
        @Optional
        @Name("зарегистрироваться в сотрудниках")
        public SelenideElement registerThreeButton;

        @FindBy(id = "begin_tips1")
        @Optional
        @Name("получить qr-код для мастера")
        public SelenideElement beginTipsOneButton;

        @FindBy(id = "begin_tips2")
        @Optional
        @Name("зарегистрировать мастера")
        public SelenideElement beginTipsTwoButton;

        @FindBy(id = "begin_tips3")
        @Optional
        @Name("зарегистрироваться в чаевых")
        public SelenideElement beginTipsThreeButton;

}
