package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GokceSteps {

    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    WebDriverWait wait= new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(15));
    @When("Admin click Education-Setup-Subject Categories")
    public void adminClickEducationSetupSubjectCategories() {
        ln.clickFunction(ln.education);
        ln.clickFunction(ln.educationSetup);
        ln.clickFunction(ln.subjectCat);
    }
    @When("Admin click on the Add Subject Category")
    public void adminClickOnTheAddSubjectCategory() {
        dc.clickFunction(dc.getWebElement("addButton"));

    }
    @And("Admin add name and code")
    public void adminAddNameAndCode() {
        dc.sendKeysFunction(dc.getWebElement("nameInput2"), "SDLC");
        dc.sendKeysFunction(dc.getWebElement("codeInput"),"9876");
    }
    @And("Admin click save button")
    public void adminClickSaveButton() {
        dc.clickFunction(dc.getWebElement("saveButton"));
    }
    @Then("Admin will see success message")
    public void adminWillSeeSuccessMessage() {
        dc.verifyContainsTextFunction(dc.getWebElement("dynamicMessage"), "success");
    }
    @Then("Admin will see unsuccessfull message")
    public void adminWillSeeUnsuccessfullMessage() {
        dc.verifyContainsTextFunction(dc.getWebElement("dynamicMessage"), "already");
    }
    @When("Admin write Subject name on the name text box to search")
    public void adminWriteSubjectNameOnTheNameTextBoxToSearch() {
        dc.sendKeysFunction(dc.getWebElement("nameSearch"), "SDLC");
    }
    @And("Admin click search button")
    public void adminClickSearchButton() {
        dc.clickFunction(dc.getWebElement("searchButton"));
    }
    @And("Admin click edit button")
    public void adminClickEditButton() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.searchButton));
        dc.clickFunction(dc.getWebElement("lastItemEditBtn"));
    }
    @And("Admin change name and code")
    public void adminChangeNameAndCode() {
        dc.sendKeysFunction(dc.getWebElement("nameInput2"), "Java");
        dc.sendKeysFunction(dc.getWebElement("codeInput"), "1290");
    }

    @When("Admin write new Subject name on the name text box to search")
    public void adminWriteNewSubjectNameOnTheNameTextBoxToSearch() {
        dc.sendKeysFunction(dc.getWebElement("nameSearch"), "Java");
    }
    @And("Admin click delete button")
    public void adminClickDeleteButton() {
        dc.waitUntilClickable(dc.searchButton);
        dc.clickFunction(dc.getWebElement("deleteButton"));
    }

    @When("Admin will see delete confirmation dialog box and click delete button")
    public void adminWillSeeDeleteConfirmationDialogBoxAndClickDeleteButton() {
        dc.clickFunction(dc.getWebElement("deleteConfirmButton"));
    }

    @Then("Admin will see no data message")
    public void adminWillSeeNoDataMessage() {
        dc.verifyContainsTextFunction(dc.noDisplayMessage, "no data");

    }

    //Bank Account Functionality
    @When("Admin click Setup-Parameters-Bank Account")
    public void adminClickSetupParametersBankAccount() {
        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.getWebElement("parameters"));
        ln.clickFunction(ln.bankAccount);
    }

    @When("Admin click on the Add Bank Account")
    public void adminClickOnTheAddBankAccount() {
        dc.clickFunction(dc.getWebElement("addButton"));
    }

    @And("Admin add name, iban, currency and integration code")
    public void adminAddNameIbanCurrencyAndIntegrationCode() {
        dc.sendKeysFunction(dc.getWebElement("nameInput2"), "GokceBank");
        dc.sendKeysFunction(dc.ibanInput, "TR348007");
        dc.clickFunction(dc.currency);
        Actions act= new Actions(GWD.getDriver());
        //act.moveToElement(dc.currency).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ENTER).build().perform();
        dc.sendKeysFunction(dc.integrationInput2, "0606");

    }

    @When("Admin write Bank name on the name text box to search")
    public void adminWriteBankNameOnTheNameTextBoxToSearch() {
        dc.sendKeysFunction(dc.getWebElement("nameSearch"), "GokceBank");
    }

    @And("Admin change name, iban, currency and integration code")
    public void adminChangeNameIbanCurrencyAndIntegrationCode() {
        dc.sendKeysFunction(dc.getWebElement("nameInput2"),"SasmazBank");
        dc.sendKeysFunction(dc.ibanInput, "TR98769876");
        dc.sendKeysFunction(dc.integrationInput2, "0707");
    }

    @When("Admin write new Bank name on the name text box to search")
    public void adminWriteNewBankNameOnTheNameTextBoxToSearch() {
        dc.sendKeysFunction(dc.getWebElement("nameSearch"), "SasmazBank");
    }
}
