package pages.extra.blocks.requisites;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("ип")
public class businessmanBlock extends AkitaPage {

    @FindBy(id = "FE_name")
    @Name("фио")
    public SelenideElement feNameField;

    @FindBy(id = "FE_ogrnip")
    @Name("огрнип")
    public SelenideElement feOgrnipField;

    @FindBy(id = "FE_inn")
    @Name("инн")
    public SelenideElement feInnField;

    @FindBy(id = "FE_certificate_date")
    @Name("дата свидетельства о регистрации ип")
    public SelenideElement feCertificateDateField;

    @FindBy(id = "FE_certificate_number")
    @Name("номер свидетельства о регистрации ип")
    public SelenideElement feCertificateNumberField;

    @FindBy(id = "FE_bik")
    @Name("бик")
    public SelenideElement feBikField;

    @FindBy(id = "FE_bank")
    @Name("наименование банка")
    public SelenideElement feBankField;

    @FindBy(id = "FE_ks")
    @Name("кс")
    public SelenideElement feKsField;

    @FindBy(id = "FE_rs")
    @Name("рс")
    public SelenideElement feRsField;

    @FindBy(id = "FE_additional")
    @Name("дополнительная информация")
    public SelenideElement feAdditionalField;

}
