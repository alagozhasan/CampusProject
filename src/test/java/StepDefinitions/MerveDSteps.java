package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.Then;

public class MerveDSteps {

    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    @Then("Verify the notification message that is successfully")
    public void verifyTheNotificationMessageThatIsCreatedSuccessfully() {
        dc.verifyContainsTextFunction(dc.getWebElement("dynamicMessage"),"success");
    }

    @Then("Verify the notification message that is already exist")
    public void verifyTheNotificationMessageThatIsAlreadyExist() {
        dc.verifyContainsTextFunction(dc.getWebElement("dynamicMessage"),"already");
    }
}
