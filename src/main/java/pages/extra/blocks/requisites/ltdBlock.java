package pages.extra.blocks.requisites;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("юридическое лицо")
public class ltdBlock extends AkitaPage {

    @FindBy(id = "LTD_name")
    @Name("наименование юр лица")
    public SelenideElement ltdNameField;

    @FindBy(id = "LTD_occupation")
    @Name("должность подписанта")
    public SelenideElement ltdOccupationField;

    @FindBy(id = "LTD_signer_name")
    @Name("фио подписанта")
    public SelenideElement ltdSignerNameField;

    @FindBy(id = "LTD_based_of")
    @Name("на основании чего действует")
    public SelenideElement ltdBasedOfField;

    @FindBy(id = "LTD_inn")
    @Name("инн")
    public SelenideElement ltdInnField;

    @FindBy(id = "LTD_kpp")
    @Name("кпп")
    public SelenideElement ltdKppField;

    @FindBy(id = "LTD_bik")
    @Name("бик")
    public SelenideElement ltdBikField;

    @FindBy(id = "LTD_bank")
    @Name("наименование банка")
    public SelenideElement ltdBankField;

    @FindBy(id = "LTD_ks")
    @Name("кс")
    public SelenideElement ltdKsField;

    @FindBy(id = "LTD_rs")
    @Name("рс")
    public SelenideElement ltdRsField;

    @FindBy(id = "LTD_additional")
    @Name("дополнительная информация")
    public SelenideElement ltdAdditionalField;

}
