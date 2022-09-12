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
package pages.client.blocks.Review;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.annotations.Optional;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

public class ReviewMaster extends AkitaPage {

    final public static String reviewMasterOverlayId = "";

    @FindBy(id = "evaluate") // На весь с именем
    @Name("заголовок")
    private SelenideElement titleField;

    @FindBy(id = "positive") // на button
    @Optional
    @Name("положительная")
    private SelenideElement positiveReviewSalonButton;

    @FindBy(id = "negative") // на button
    @Optional
    @Name("отрицательная")
    private SelenideElement negativeReviewSalonButton;

    @FindBy(id = "message_textarea") // на textarea
    @Name("коментарий")
    private SelenideElement commentSalonField;

    @FindBy(id = "send")
    @Name("отправить отзыв")
    private SelenideElement sendReviewButton;

    @FindBy(id = "cancel")
    @Name("отменить")
    private SelenideElement cancelButton;

    @FindBy(id = "cross")
    @Name("Х")
    private SelenideElement closeWindowButton;

}