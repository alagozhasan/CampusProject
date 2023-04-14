package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResulSteps {
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

    @When("Send key in Dialog")
    public void sendKeyInDialog(DataTable dt) {
        List<List<String>> items= dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element= dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(element, items.get(i).get(1));
        }
    }

    @And("Click on the stale element in Dialog")
    public void clickOnTheStaleEditButtonInDialog(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String btn : buttons) {
            WebElement e = dc.getWebElement(btn);
            dc.waitUntilClickable(dc.getWebElement("searchButton"));
            dc.clickFunction(e);
        }
    }
}
