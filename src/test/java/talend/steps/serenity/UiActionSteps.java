package talend.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import talend.pages.UiActionPage;

public class UiActionSteps extends ScenarioSteps {

    private UiActionPage uiActionPage;

    @Step
    public void goToPage() {
        uiActionPage.open();
    }

    @Step
    public void clickOnDropDownKo() {
        uiActionPage.clickOnDropDownKo();
    }

    @Step
    public void shouldClickOnItem() {
        uiActionPage.clickOnItemOne();
    }

    @Step
    public void clickOnDropDownOk() {
        uiActionPage.clickOnDropDownOk();
    }
}