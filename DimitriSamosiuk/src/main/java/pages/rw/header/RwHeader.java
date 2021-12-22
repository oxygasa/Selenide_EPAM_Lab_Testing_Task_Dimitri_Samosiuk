package pages.rw.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwHeader extends BasePage {
    public RwHeader(WebDriver driver) {
        super(driver);
    }
    /**
     * Message to the mentor
     * Requirements: Double interpretation about “Timetable” section. The name has been changed to "Tickets".
     * "Timetable" section is mentioned on the Main Page body.
     */
    public static final By headerButtonList = By.xpath("//table[@class='menu-items']//b");
    public static final By headerSearchBox = By.id("searchinp");
    public static final By headerSearchSubmitButton = By.xpath("//div[@class='top-search']//button[@type='submit']");
    public static final By rwCompanyLogo = By.className("logo-png");

}
