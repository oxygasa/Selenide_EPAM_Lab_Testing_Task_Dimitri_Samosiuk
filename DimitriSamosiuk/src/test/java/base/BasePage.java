package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static constants.Constant.TimeoutVariables.EXPLICIT_WAIT;

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
    public void goToUrl(String url) {
        driver.get(url);
    }

    /**
     * The method to find element By locator.
     **/
    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    /**
     * Wait for visibility element in DOM model.
     **/
    public void waitElement(By locator){
        WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_WAIT);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}