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
package pages.client.blocks.Booking;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;


public class ServiceOrMaster extends AkitaPage {

    final public static String masterOrServiceID = "";
    final public static String masterOrServiceXPath = "//div[contains(@class, 'overlay')]";


    @FindBy(xpath = "//button//span[contains(text(), 'Выбрать')]")
    @Name("выбрать услугу")
    public SelenideElement choseServiceButton;

    @FindBy(xpath = "//button//span[contains(text(), 'Записаться')]")
    @Name("записаться к своему мастеру")
    public SelenideElement choseMasterButton;

}