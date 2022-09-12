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

public class ReviewSalon extends AkitaPage {

    final public static String reviewSalonOverlayId = "";

    @FindBy(id = "evaluate") // На весь с именем
    @Name("заголовок")
    private SelenideElement titleField;

    @FindBy(id = "positive") // на button
    @Name("положительная оценка салона")
    private SelenideElement positiveReviewSalonButton;

    @FindBy(id = "negative") // на button
    @Name("отрицательная оценка саллона")
    private SelenideElement negativeReviewSalonButton;

    @FindBy(id = "message_textarea") // на textarea
    @Name("коментарий о салоне")
    private SelenideElement commentSalonField;

    @FindBy(id = "master_select") // на input
    @Name("выберите мастера")
    private SelenideElement mastersFilterField;

//  В следующих двух локаторах списки. Нужно добавить data-id на аватары и на имена, data-id должны быть одинаковые.
//  Например @data-id = 'avatarList' на всех аватарах и @data-id = 'namesList' на всех именах

    @FindBy(id = "avatar_list")
    @Name("аватаров мастеров")
    private List<SelenideElement> avatarMastersList;

    @FindBy(id = "name_list")
    @Name("имен мастеров")
    private List<SelenideElement> nameMastersList;

    @FindBy(id = "arrow_left")
    @Name("листать список мастеров влево")
    private SelenideElement slickListLeftButton;

    @FindBy(id = "arrow_right")
    @Name("листать список мастеров вправо")
    private SelenideElement slickListRightButton;

    @FindBy(id = "master_positive")
    @Optional
    @Name("положительная оценка мастера")
    private SelenideElement positiveReviewMasterButton;

    @FindBy(id = "master_negative")
    @Name("отрицательная оценка мастера")
    private SelenideElement negativeReviewMasterButton;

    @FindBy(id = "master_message")
    @Name("коментарий о мастере")
    private SelenideElement commentMasterField;

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