/**
 * Copyright 2017 Alfa Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package pages.client;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import pages.client.blocks.Footer;
import pages.client.blocks.Header;
import pages.client.blocks.LoginBlocks.Confirm;
import pages.client.blocks.LoginBlocks.Login;
import pages.client.blocks.LoginBlocks.QuickLogin;
import pages.client.blocks.LoginBlocks.Registration;
import pages.client.blocks.Menu;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("личный кабинет пользователя")
public class pageUserBooks extends AkitaPage {

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

    // Мои салоны

    @FindBy(id = "full_name")
    @Name("заголовок")
    public SelenideElement titleField;

    @FindBy(id = "appointments_new")
    @Optional
    @Name("будущие записи")
    public SelenideElement appoinmentNewButton;

    @FindBy(id = "appointments_completed")
    @Optional
    @Name("прошедшие записи")
    public SelenideElement appoinmentCompletedButton;

    @FindBy(id = "appointments_canceled")
    @Optional
    @Name("отмененные записи")
    public SelenideElement appointmentsCanceledButton;

    @FindBy(id = "appointments_search")
    @Optional
    @Name("строка поиска записей")
    public SelenideElement appointmentSearchField;

    static class Book extends AkitaPage{

        @FindBy(xpath = ".//div[@data-id = 'appointments_date']")
        @Name("дата")
        public SelenideElement dateField;

        @FindBy(xpath = ".//div[@data-id = 'appointments_time']")
        @Name("время")
        public SelenideElement timeField;

        @FindBy(xpath = ".//p[@data-id = 'appointments_name']")
        @Name("названия салона")
        public List<SelenideElement> salonNameField;

        // Телефон отображается только в будущих записях

        @FindBy(xpath = ".//p[@data-id = 'appointments_phone']")
        @Name("телефон")
        public SelenideElement phoneField;

        @FindBy(xpath = ".//span[@data-id = 'appointments_reach']")
        @Name("как добраться")
        public SelenideElement locatedLinks;

        // Услуг может быть несколько в одной записи, норм будет если на всех услугах будет стоять одинаковый data-id

        @FindBy(xpath = ".//li[@data-id = 'appointments_service']")
        @Name("услуги")
        public List<SelenideElement> servicesList;

        // Тут обнаружилась проблема
        // Имя мастера сидит на одной ветке вместе с заголовком, то есть, если имя "test", то
        // по xpath вернется "Мастерtest", нужно чтобы просто возвращался test

        @FindBy(xpath = ".//div[@data-id = 'appointments_master']")
        @Name("мастер")
        public SelenideElement masterField;

        @FindBy(xpath = ".//div[@data-id = 'appointments_price']")
        @Name("стоимость")
        public SelenideElement priceField;

        // Кнопка отмены записи отображается не во всех записях

        @FindBy(xpath = ".//i[@data-id = 'appointments_delete']")
        @Optional
        @Name("х")
        public SelenideElement cancelButton;

    }

    // тут data-id на блок с записью целиком, так, чтобы элементы в классе Book были его потомками

    @FindBy(xpath = "//div[@data-id = 'appointments_item']")
    @Optional
    @Name("записи")
    public Book booksList;

}
