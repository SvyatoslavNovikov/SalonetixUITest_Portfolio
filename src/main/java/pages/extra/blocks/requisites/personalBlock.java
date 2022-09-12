package pages.extra.blocks.requisites;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("физическое лицо")
public class personalBlock extends AkitaPage {

    // ToDO Добавлена задача на добавление локаторов https://jira.techranch.ru/browse/SLNX-5779

    @FindBy(id = "")
    @Name("фио")
    public SelenideElement phyNameField;

    @FindBy(id = "")
    @Name("серия и номер паспорта")
    public SelenideElement phyOccupationField;

    @FindBy(id = "")
    @Name("кем выдан")
    public SelenideElement phySignerNameField;

    @FindBy(id = "")
    @Name("когда выдан")
    public SelenideElement phyBasedOfField;

    @FindBy(id = "")
    @Name("дополнительная информация")
    public SelenideElement phyAdditionalField;

}
