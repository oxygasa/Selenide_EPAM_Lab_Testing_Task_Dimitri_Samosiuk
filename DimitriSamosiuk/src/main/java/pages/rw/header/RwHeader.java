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
     * "Timetable" section is presented only on the Main Page body.
     */
    private final By SWITCH_TO_ENGLISH = By.xpath("//a[@href='/en/']");
    private final By HEADER_BUTTON_LIST = By.xpath("//table[@class='menu-items']//b");
    private final By HEADER_SEARCH_BOX = By.id("searchinp");
    private final By HEADER_SEARCH_SUBMIT_BUTTON = By.xpath("//div[@class='top-search']//button[@type='submit']");
    private final By RW_COMPANY_LOGO = By.className("logo-png");

    public By getSwitchToEnglish() {
        return SWITCH_TO_ENGLISH;
    }
    public By getHeaderButtonList() {
        return HEADER_BUTTON_LIST;
    }
    public By getHeaderSearchBox() {
        return HEADER_SEARCH_BOX;
    }
    public By getHeaderSearchSubmitButton() {
        return HEADER_SEARCH_SUBMIT_BUTTON;
    }
    public By getRwCompanyLogo() {
        return RW_COMPANY_LOGO;
    }
}
