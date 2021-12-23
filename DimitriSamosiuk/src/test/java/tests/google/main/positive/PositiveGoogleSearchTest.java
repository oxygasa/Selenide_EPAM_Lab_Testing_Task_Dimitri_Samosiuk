package tests.google.main.positive;

import constants.Constant;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.google.GoogleMainPage;
import pages.google.GoogleResultListPage;
import pages.rw.footer.RwFooter;
import pages.rw.main.RwMainPage;
import tests.base.BaseTest;


public class PositiveGoogleSearchTest extends BaseTest {

    @Test(priority = 3)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW001")
    @Feature("3rd party web search service")
    @Story("As user I want to search by a request \"белорусская железная дорога\" " +
            "in a google.com and open the rw.by main page by clicking a search service redirect link." +
            "So I want to do it via 3rd party web search service - Google.")
    @Severity(SeverityLevel.TRIVIAL)

    public void searchTheRwByMainPageUsingGoogleSearch() {
        GoogleMainPage.goToUrl(Constant.Urls.GOOGLE_MAIN_PAGE_URL);
        GoogleMainPage.typeText(GoogleMainPage.googleSearchBoxInput, GoogleMainPage.SEARCH_BOX_TEXT_FOR_INPUT);
        GoogleMainPage.clickTheElement(GoogleMainPage.searchInGoogleSubmitButton);
        GoogleResultListPage.clickTheElement(GoogleResultListPage.searchResultTitleLinkList);
        RwMainPage.assertElementIsDisplayed(RwMainPage.switchToEnglish);
    }
}