package tests.rw.main.positive;

import constants.Constant;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.google.GoogleMainPage;
import pages.google.GoogleResultListPage;
import pages.rw.main.RwMainPage;
import tests.base.BaseTest;


public class PositiveRwMainPageSwitchToEnglishTest extends BaseTest {

    @Test(priority = 1)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW002")
    @Feature("Main page")
    @Story("As an international user I want to interact with the web service, " +
    "so let all elements will be presented in English.")
    @Severity(SeverityLevel.NORMAL)

    public void searchTheRwByMainPageUsingGoogleSearch() {

        RwMainPage.goToUrl(Constant.Urls.BELARUS_RAILWAY_NAIN_PAGE_URL);
        RwMainPage.clickTheElement(RwMainPage.switchToEnglish);
        RwMainPage.assertElementIsDisplayed(RwMainPage.);
    }
}