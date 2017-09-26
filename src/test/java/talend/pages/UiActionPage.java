package talend.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://talend.surge.sh/components/?selectedKind=ActionDropdown&selectedStory=default&full=0&down=1&left=1&panelRight=0&downPanel=storybook%2Factions%2Factions-panel")
public class UiActionPage extends PageObject{

    private final String locator_dropdown_item_one = "context-dropdown-item-document-1";

    @FindBy(id="storybook-preview-iframe")
    private WebElement iframe;

    @FindBy(xpath="//div[@id='hidelabel']//button[@id='context-dropdown-related-items']")
    private WebElement dropDownWithAriaDescribedby;

    @FindBy(xpath="//div[@id='default']//button[@id='context-dropdown-related-items']")
    private WebElement dropDownWithNoAriaDescribedby;


    @FindBy(id=locator_dropdown_item_one)
    private WebElement dropdown_item_one;

    public void clickOnItemOne(){
        dropdown_item_one.click();
    }

    public void clickOnDropDownKo() {
        waitFor(dropDownWithAriaDescribedby);
        waitABit(2000);
        dropDownWithAriaDescribedby.click();
    }

    public void clickOnDropDownOk() {
        waitFor(iframe);
        getDriver().switchTo().frame(iframe);
        waitFor(dropDownWithNoAriaDescribedby);
        dropDownWithNoAriaDescribedby.click();
    }
}