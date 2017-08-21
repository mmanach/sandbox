package talend.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.annotations.AfterScenario;
import talend.pages.BasePage;

public class GoogleSteps extends ScenarioSteps {

    private BasePage basePage;

    @Step
    public void iAmOnLoginPage() {
        basePage.open();
    }

    @Step
    public void fillSearch(String txt) {
        basePage.fillSearch(txt);
    }

    @AfterScenario(uponOutcome=AfterScenario.Outcome.ANY)
    public void checkIfElementPresent() {
        System.out.println("____________________AFTER SCENARIO ___________________ ");
        System.out.println("Current URL : " + basePage.getDriver().getCurrentUrl());

        if (basePage.isLogoPresent()){
            System.out.println("Yes element is present !");
        } else {
            System.out.println("No element found...");
            System.out.println(basePage.getDriver().getCurrentUrl());
        }
    }


}