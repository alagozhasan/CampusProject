package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class Parent {

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(),
            Duration.ofSeconds(15));


    public void sendKeysFunction(WebElement element, String yazi)
    {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void clickFunction(WebElement element){
        waitUntilVisible(element);   //Merve A  Hata alırsanız silebilirsiniz ben kendi case i mi düzeltirim
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void verifyContainsTextFunction(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),"No such TEXT"); //bo fixed
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void waitUntilVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public void moveToElementAndClick(WebElement element){
        Actions action=new Actions(GWD.getDriver());
        action.moveToElement(element).click().perform();
    }
    }


