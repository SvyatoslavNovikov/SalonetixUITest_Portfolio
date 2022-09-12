package pages.admin;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import pages.admin.blocks.Header;
import pages.admin.blocks.Menu;
import pages.admin.landingPagesBlocks.LandingPagesBlocks;
import ru.alfabank.alfatest.cucumber.annotations.Name;

public class LandingPages {

    @FindBy(id = Header.headerXpath)
    @Name("хедер")
    public Header headerBlock;

    @FindBy(id = Menu.menuId)
    @Name("меню")
    public Menu menuBlock;

    @FindBy(id = LandingPagesBlocks.serviceInGeoID)
    @Name("услуга в гео")
    public LandingPagesBlocks serviceInGeoBlock;

    @FindBy(id = LandingPagesBlocks.salonsInGeoID)
    @Name("услуга в гео")
    public LandingPagesBlocks salonsInGeoBlock;

    @FindBy(xpath = "//button[@type = 'submit']")
    @Name("услуга в гео")
    public SelenideElement submitBlock;

}
