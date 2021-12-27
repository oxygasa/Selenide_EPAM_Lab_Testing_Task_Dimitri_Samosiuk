package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class GoogleResultListPage extends BasePage {

    public GoogleResultListPage(WebDriver driver) {
        super(driver);
    }

    private final By SEARCH_RESULT_TITLE_LINK_LIST = By.xpath("//h3[contains(@class,'LC20lb')]/../..");

    public By getSearchResultTitleLinkList() {
        return SEARCH_RESULT_TITLE_LINK_LIST;
    }
}