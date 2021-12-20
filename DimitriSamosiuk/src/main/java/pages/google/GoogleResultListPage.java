package pages.google;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class GoogleResultListPage extends BasePage {

    public GoogleResultListPage(WebDriver driver) {
        super(driver);
    }

    public static final By searchResultTitleLinkList = By.className("LC20lb MBeuO DKV0Md");

}