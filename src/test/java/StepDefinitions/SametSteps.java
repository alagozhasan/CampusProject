package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SametSteps {

    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();

    @Then("Verify that notification messages “Attestation successfully created”")
    public void verifyThatNotificationMessagesAttestationSuccessfullyCreated() {
        dc.verifyContainsTextFunction(dc.successMessage, "Attestation successfully created");
    }

    @Then("Verify that notification messages “The Attestation with Name \"SamBay34\" already exists.”")
    public void verifyThatNotificationMessagesTheAttestationWithNameAlreadyExists() {
        dc.verifyContainsTextFunction(dc.existMessage, "already");
    }

    @And("Fill the search field for added Attestation")
    public void fillTheSearchFieldForAddedAttestation() {
        dc.sendKeysFunction(dc.nameSearch, "SamBay34");
    }

    @Then("Verify that notification messages “Attestation successfully updated”")
    public void verifyThatNotificationMessagesAttestationSuccessfullyUpdated() {
        dc.verifyContainsTextFunction(dc.successMessage, "Attestation successfully updated");
    }

    @And("Fill the search field for edited Attestation")
    public void fillTheSearchFieldForEditedAttestation() {
        dc.sendKeysFunction(dc.nameSearch, "SamBay345");
    }

    @Then("Verify that notification messages “Attestation successfully deleted”")
    public void verifyThatNotificationMessagesAttestationSuccessfullyDeleted() {
        dc.verifyContainsTextFunction(dc.successMessage, "Attestation successfully deleted");
    }

    @Then("Verify that notification messages “There is no data to display”")
    public void verifyThatNotificationMessagesThereIsNoDataToDisplay() {
        dc.verifyContainsTextFunction(dc.noDisplayMessage, "There is no data to display");
    }
}
