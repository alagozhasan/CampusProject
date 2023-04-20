package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;

public class BurcuSteps {
    DialogContent dc = new DialogContent();

    @And("Select an element on Form")
    public void selectAnElementOnForm(DataTable dt) {
        List<List<String>> dropDown = dt.asLists(String.class);

        for (int i = 0; i < dropDown.size(); i++) {
            WebElement e = dc.getWebElement(dropDown.get(i).get(0));
            dc.clickFunction(e);
            dc.moveToElementAndClick(dc.getWebElement(dropDown.get(i).get(1)));
        }
    }

    @Then("Verify that the searched {string} still on the list")
    public void verifyThatTheSearchedNameStillOnTheList(String str) {
        Assert.assertEquals(dc.getSearchResult().getText(), str);
    }
}