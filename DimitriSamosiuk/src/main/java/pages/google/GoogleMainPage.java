package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class GoogleMainPage extends BasePage {

    public GoogleMainPage(WebDriver driver) {
        super(driver);
    }
    private final By GOOGLE_SEARCH_BOX_INPUT = By.name("q");
    private final By SEARCH_IN_GOOGLE_SUBMIT_BUTTON = By.className("gNO89b");

    public String getSearchBoxTextForInput() {
        return "белорусская железная дорога";
    }
    public By getGoogleSearchBoxInput() {
        return GOOGLE_SEARCH_BOX_INPUT;
    }
    public By getSearchInGoogleSubmitButton() {
        return SEARCH_IN_GOOGLE_SUBMIT_BUTTON;
    }
}