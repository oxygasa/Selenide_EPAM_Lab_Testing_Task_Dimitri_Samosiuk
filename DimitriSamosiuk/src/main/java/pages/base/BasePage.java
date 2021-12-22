package pages.base;

import commons.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;
import static constants.Constant.TimeoutVariables.IMPLICIT_WAIT;

public class BasePage {

    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage() {
    }

    /**
     * The method to navigate to specific url address.
     **/
    public static void goToUrl(String url) {
        CommonActions.getDriver().get(url);
    }

    /**
     * The method is to find element By locator.
     **/
    public static void find(By locator){
        CommonActions.getDriver().findElement(locator);
    }
    /**
     * The method is to find element By locator and type text into it.
     **/
    public static void typeText(By locator, String anyTextForInput) {
        CommonActions.getDriver().findElement(locator).sendKeys(anyTextForInput);
    }
    /**
     * The method is to find element By locator and click it.
     **/
    public static void clickTheElement(By locator){
        CommonActions.getDriver().findElement(locator).click();
    }

    /**
     * Wait for visibility element in DOM model.
     *
     * @return*/
    public static void waitElement(By locator){
        WebDriverWait wait = new WebDriverWait(CommonActions.getDriver(), EXPLICIT_WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void assertElementIsDisplayed(By locator){
        boolean isDisplayed = CommonActions.getDriver().findElement(locator).isDisplayed();
         Assert.assertTrue(isDisplayed);
    }
}