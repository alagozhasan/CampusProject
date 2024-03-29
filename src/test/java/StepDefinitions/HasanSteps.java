package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;


public class HasanSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();
    private static final String myData = "Aircraft Technician";

    @Given("Navigate to Campus")
    public void navigateToCampus() {

        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.sendKeysFunction(dc.username, "turkeyts");
        dc.sendKeysFunction(dc.password, "TechnoStudy123");
        dc.clickFunction(dc.loginButton);
    }

    @Then("User should login succesfully")
    public void userShouldLoginSuccesfully() {
        dc.verifyContainsTextFunction(dc.txtTechnoStudy, "Techno Study");
    }


    @And("Click on the leftnav")
    public void clickOnTheLeftnav(DataTable dt) {
        List<String> buttons = dt.asList(String.class);

        for (String btn : buttons) {
            WebElement e = ln.getWebElement(btn);
            ln.clickFunction(e);
        }
    }


    @And("Click on the element in Dialog")
    public void clickOnTheElementInDialog(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String btn : buttons) {
            WebElement e = dc.getWebElement(btn);
            dc.clickFunction(e);
        }
    }

    @And("Fill out the form")
    public void fillOutTheForm(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(e, items.get(i).get(1));
        }
    }

    @Then("verify process")
    public void verifyProcess() {
        dc.verifyContainsTextFunction(dc.successMessage, "successfully");
    }

    @Then("verify process but negative")
    public void verifyProcessButNegative() {
        dc.verifyContainsTextFunction(dc.existMessage, "already");
    }

    @Then("Read on list,for search my data name")
    public void readOnListForSearchMyDataName() {
        dc.waitUntilClickable(dc.addButton);
        for (WebElement e : dc.getMyDataOnList()) {
            Assert.assertFalse(
                    e.getText().contains(myData));
        }
    }

    @Then("Click on the leftnav arrow")
    public void clickOnTheLeftnavArrow(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String btn : buttons) {
            WebElement e = ln.getWebElement(btn);
            e.click();
        }
    }

    @And("verify dropdown menu")
    public void verifyDropdownMenu(DataTable dt) {
        List<String> buttons = dt.asList(String.class);

        for (String btn : buttons) {
            WebElement e = ln.getWebElement(btn);
            e.click();
        }
        Assert.assertFalse(
                (ln.schoolSetup.isDisplayed() & ln.schoolDepartments.isDisplayed()));
    }

    @And("Click on the leftnav but no function")
    public void clickOnTheLeftnavButNoFunction(DataTable dt) {
        List<String> buttons = dt.asList(String.class);

        for (String btn : buttons) {
            WebElement e = ln.getWebElement(btn);
            ln.waitUntilClickable(e);
            e.click();
        }
    }

    @Then("Fill out the form stale element")
    public void fillOutTheFormStaleElement(DataTable dt) {
        dc.waitUntilVisible(dc.shortName);
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(e, items.get(i).get(1));
        }
    }
}

