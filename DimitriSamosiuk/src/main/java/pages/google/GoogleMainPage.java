package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class GoogleMainPage extends BasePage {

    public GoogleMainPage(WebDriver driver) {
        super(driver);
    }

    public static final By googleSearchBoxInput = By.name("q");
    String searchBoxTextForInput = "белорусская железная дорога";
    public static final By searchInGoogleSubmitButton = By.className("gNO89b");
}