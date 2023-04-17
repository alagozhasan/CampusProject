package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MerveDSteps {
    DialogContent dc = new DialogContent();

    @When("Search name and click on the edit button")
    public void searchNameAndClickOnTheEditButton() {

        dc.waitUntilClickable(dc.getWebElement("addButton"));
        dc.clickFunction(dc.orderSearchName);
        dc.clickFunction(dc.orderSearchName);
        for (WebElement name : dc.nameList) {
            if (name.getText().contains("Mrv123")) {
                dc.clickFunction(dc.editButton);
            }
        }
    }

    @When("Search name and delete the Location")
    public void searchNameAndClickOnTheDeleteButton() {

        dc.waitUntilClickable(dc.getWebElement("addButton"));
        dc.clickFunction(dc.orderSearchName);
        dc.clickFunction(dc.orderSearchName);
        for (WebElement name : dc.nameList) {
            if (name.getText().contains("Mrv1234")) {
                dc.clickFunction(dc.deleteButton);
                dc.clickFunction(dc.deleteConfirmButton);
            }
        }
    }

    @Then("Verify that the location is already deleted")
    public void verifyThatTheLocationIsAlreadyDeleted() {

        dc.waitUntilClickable(dc.getWebElement("addButton"));
        dc.clickFunction(dc.orderSearchName);
        dc.clickFunction(dc.orderSearchName);
        for (WebElement name : dc.nameList) {
            if (name.getText().contains("Mrv1234")) {
                Assert.fail("The location is still on the list");
            }
        }
    }
}
