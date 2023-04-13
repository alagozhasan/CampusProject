package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement schoolDepartments;

    @FindBy(xpath = "(//span[text()='Setup']/../fa-icon)[2]")
    private WebElement SetupArrow;

    @FindBy(xpath = "(//span[text()='School Setup']/../fa-icon)[2]")
    private WebElement schoolSetupArrow;




    public WebElement getWebElement(String element) {

        switch (element){
            case "setup":
                return setup;
            case "schoolSetup":
                return schoolSetup;
            case "schoolDepartments":
                return schoolDepartments;
            case "SetupArrow": return SetupArrow;
            case "schoolSetupArrow": return schoolSetupArrow;
        }
        return null;}
}
