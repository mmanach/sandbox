package talend.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


@DefaultUrl("https://www.google.fr/")
public class BasePage extends PageObject{


    @FindBy(id="lst-ib")
    private WebElement lstib;

    @FindBy(id="hjgkjfkhyfkdki")
    private WebElement elementNotExisting;

    private String logo = "hplogo";

    public void fillSearch(String txt){
        waitFor(lstib);
        lstib.sendKeys(txt);
       // elementNotExisting.click(); // generate the fail step
    }

    public boolean isLogoPresent(){
        return isElementVisible(By.id(logo));
    }


}