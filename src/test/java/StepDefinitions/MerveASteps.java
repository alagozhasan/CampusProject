package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MerveASteps {
    DialogContent dc = new DialogContent();

    @And("Select an element on Form Document Types")
    public void selectAnElementOnFormDT(DataTable dt) {
        List<List<String>> dropDown = dt.asLists(String.class);

        for (int i = 0; i < dropDown.size(); i++) {
            WebElement e = dc.getWebElement(dropDown.get(i).get(0));
            dc.clickFunction(e);
            dc.moveToElementAndClick(dc.getWebElement(dropDown.get(i).get(1)));
        }
        Actions actions=new Actions(GWD.getDriver());
        actions.sendKeys(Keys.ESCAPE).build().perform();
    }
}
