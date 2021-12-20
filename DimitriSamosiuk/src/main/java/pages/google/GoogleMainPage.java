package pages.google;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class GoogleMainPage extends BasePage {

    public GoogleMainPage(WebDriver driver) {
        super(driver);
    }

    public static final By addButton =By.xpath("//a[@id='create-entry']");
    public static final By editableArea =By.xpath("//div[@id='editable']");
    public static final By homeButton =By.xpath("//a[@id='back-to-overview']");

}