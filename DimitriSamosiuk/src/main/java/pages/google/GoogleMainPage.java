package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class GoogleMainPage extends BasePage {



    public GoogleMainPage(WebDriver driver) {
        super(driver);
    }
    public static final String SEARCH_BOX_TEXT_FOR_INPUT = "белорусская железная дорога";
    public static final By GOOGLE_SEARCH_BOX_INPUT = By.name("q");
    public static final By SEARCH_IN_GOOGLE_SUBMIT_BUTTON = By.className("gNO89b");
}