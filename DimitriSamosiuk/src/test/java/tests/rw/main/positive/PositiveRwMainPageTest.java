package tests.rw.main.positive;

import constants.Constant;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rw.footer.RwFooter;
import pages.rw.main.RwMainPage;
import tests.base.BaseTest;


public class PositiveRwMainPageTest extends BaseTest {

    @Test(priority = 2)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW002")
    @Feature("Main page")
    @Story("As an international user I want to interact with the web service, " +
            "so let all elements will be presented in English.")
    @Severity(SeverityLevel.NORMAL)

    public void switchToEnglish() {
        RwMainPage.goToUrl(Constant.Urls.BELARUS_RAILWAY_NAIN_PAGE_URL);
        RwMainPage.clickTheElement(RwMainPage.switchToEnglish);
    }

    @Test(priority = 3)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW003")
    @Feature("Main page")
    @Story("The count of news in block must be more than constant.")
    @Severity(SeverityLevel.TRIVIAL)

    public void countTheEnglishNewsBlockList() {
        RwMainPage.checkTheNewsCountIsEqualOrHigherThanConstant(RwMainPage.mainPageNewsModuleWithNewsList);
    }

    @Test(priority = 3)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW004")
    @Feature("Footer")
    @Story("The copyright text must be '© YEAR Belarusian Railway'.")
    @Severity(SeverityLevel.TRIVIAL)

    public void checkTheEnglishCopyrightText() {
        String actualTextOfCopyrightElement = find(RwFooter.copyrightOnTheFooter).getText();
        Assert.assertEquals((actualTextOfCopyrightElement.substring(0,25)),RwFooter.getExpectedTextOfCopyright());
    }
}