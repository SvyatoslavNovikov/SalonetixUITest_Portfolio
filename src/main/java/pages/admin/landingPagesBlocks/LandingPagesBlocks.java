package pages.admin.landingPagesBlocks;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;

public class LandingPagesBlocks {

    // на поля можно поставить data-id, так как оба блока находятся на одной странице
    // и элементы будут повторяться

    final public static String serviceInGeoID = ""; // на блок Услуга в гео
    final public static String salonsInGeoID = ""; // на блок все салоны в Гео

    @FindBy(id = "")
    @Name("h1")
    public SelenideElement h1Field;

    @FindBy(id = "")
    @Name("seo_text1")
    public SelenideElement seoTextOneField;

    @FindBy(id = "")
    @Name("seo_text2")
    public SelenideElement seoTextTwoField;

    @FindBy(id = "")
    @Name("seo_text")
    public SelenideElement seoTextField;

    @FindBy(id = "")
    @Name("title")
    public SelenideElement titleField;

    @FindBy(id = "")
    @Name("description")
    public SelenideElement descriptionField;

    @FindBy(id = "")
    @Name("keywords")
    public SelenideElement keywordsField;

}
