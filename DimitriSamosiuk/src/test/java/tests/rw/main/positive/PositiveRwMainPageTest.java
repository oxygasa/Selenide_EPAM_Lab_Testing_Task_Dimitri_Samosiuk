package tests.rw.main.positive;

import constants.Constant;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rw.footer.RwFooter;
import pages.rw.header.RwHeader;
import pages.rw.main.RwMainPage;
import tests.base.BaseTest;

import static pages.rw.footer.RwFooter.getExpectedTextOfCopyright;


public class PositiveRwMainPageTest extends BaseTest {
RwMainPage rwMainPage = new RwMainPage(getDriver());
RwHeader rwHeader = new RwHeader(getDriver());
RwFooter rwFooter = new RwFooter(getDriver());

    @Test(priority = 2)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW002")
    @Feature("Main page")
    @Story("As an international user I want to interact with the web service, " +
            "so let all elements will be presented in English.")
    @Severity(SeverityLevel.NORMAL)

    public void switchToEnglishLanguageTest() {
        rwMainPage.
                goToUrl(Constant.Urls.BELARUS_RAILWAY_NAIN_PAGE_URL);
        rwMainPage.
                clickTheElement(rwHeader.getSwitchToEnglish());
    }

    @Test(priority = 3)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW003")
    @Feature("Main page")
    @Story("The count of news in block must be more than constant.")
    @Severity(SeverityLevel.TRIVIAL)

    public void countTheEnglishNewsBlockListTest() {
        rwMainPage.
                checkTheNewsCountIsEqualOrHigherThanConstant(rwMainPage.getMainPageNewsModuleWithNewsList());
    }

    @Test(priority = 3)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW004")
    @Feature("Footer")
    @Story("The copyright text must be '© %CURRENT_YEAR% Belarusian Railway'.")
    @Severity(SeverityLevel.TRIVIAL)

    public void checkTheEnglishCopyrightTextTest() {
        String actualTextOfCopyrightElement = find(rwFooter.getCopyrightOnTheFooter()).getText();
        Assert.assertEquals((actualTextOfCopyrightElement.substring(0, 25)), getExpectedTextOfCopyright());
    }

    @Test(priority = 2)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW005")
    @Feature("Header")
    @Story("As user I want to navigate over the webservice, So as a map I need following buttons: " +
            "'Press Center', 'Timetable', 'Passenger', 'Services', 'Freight', 'Corporate'")
    @Severity(SeverityLevel.NORMAL)

    public void checkTheNavigationHeaderBarElementsTest() {
        assertElementsAreDisplayed(rwHeader.getHeaderButtonList());
    }
}
