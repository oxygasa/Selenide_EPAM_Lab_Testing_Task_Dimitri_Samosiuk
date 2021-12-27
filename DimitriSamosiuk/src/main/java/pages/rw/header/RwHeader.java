package pages.rw.header;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RwHeader extends BasePage {
    /**
     * Message to the mentor
     * Requirements: Double interpretation about “Timetable” section. The name has been changed to "Tickets".
     * "Timetable" section is presented only on the Main Page body.
     */
    private final SelenideElement SWITCH_TO_ENGLISH = $x("//a[@href='/en/']");
    private final ElementsCollection HEADER_BUTTON_LIST = $$x("//table[@class='menu-items']//b");
    private final SelenideElement HEADER_SEARCH_BOX = $(byId("searchinp"));
    private final SelenideElement HEADER_SEARCH_SUBMIT_BUTTON = $x("//div[@class='top-search']//button[@type='submit']");
    private final SelenideElement RW_COMPANY_LOGO = $(byClassName("logo-png"));

    public SelenideElement getSwitchToEnglish() {
        return SWITCH_TO_ENGLISH;
    }
    public ElementsCollection getHeaderButtonList() {
        return HEADER_BUTTON_LIST;
    }
    public SelenideElement getHeaderSearchBox() {
        return HEADER_SEARCH_BOX;
    }
    public SelenideElement getHeaderSearchSubmitButton() {
        return HEADER_SEARCH_SUBMIT_BUTTON;
    }
    public SelenideElement getRwCompanyLogo() {
        return RW_COMPANY_LOGO;
    }
}
