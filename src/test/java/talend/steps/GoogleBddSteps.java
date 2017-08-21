package talend.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import talend.steps.serenity.GoogleSteps;

public class GoogleBddSteps {

    @Steps
    private GoogleSteps googleSteps;

    @Given("I am on the google HP")
    public void iAmOnLoginPage() {
        googleSteps.iAmOnLoginPage();
    }

    @When("Fill $txt")
    public void fillSearch(String txt) {
        googleSteps.fillSearch(txt);
    }

}