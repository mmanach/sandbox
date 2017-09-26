package talend.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import talend.steps.serenity.UiActionSteps;

public class UiActionBddSteps {

    @Steps
    private UiActionSteps uiActionSteps;

    @Given("I am on the react UI actions")
    public void iAmOnPage() {
        uiActionSteps.goToPage();
    }

    @When("I click on the dropdown element with aria-describedby")
    public void clickOnElementKo() {
        uiActionSteps.clickOnDropDownKo();
    }

    @When("I click on the dropdown element with no aria-describedby")
    public void clickOnElementOk() {
        uiActionSteps.clickOnDropDownOk();
    }

    @Then("I should click on the item")
    public void shouldClickOnItem() {
        uiActionSteps.shouldClickOnItem();
    }
}