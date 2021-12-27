package tests.rw.main.positive;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rw.footer.RwFooter;
import pages.rw.header.RwHeader;
import pages.rw.main.RwMainPage;
import tests.base.BaseTest;
import static com.codeborne.selenide.Selenide.open;
import static pages.rw.footer.RwFooter.getExpectedTextOfCopyright;


public class PositiveRwMainPageTest extends BaseTest {
RwMainPage rwMainPage = new RwMainPage();
RwHeader rwHeader = new RwHeader();
RwFooter rwFooter = new RwFooter();

    @Test(priority = 2)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW002")
    @Feature("Main page")
    @Story("As an international user I want to interact with the web service, " +
            "so let all elements will be presented in English.")
    @Severity(SeverityLevel.NORMAL)

    public void switchToEnglishLanguageTest() {
        open(rwMainPage.getRwUrl());
        rwHeader
                .getSwitchToEnglish()
                .click();
        rwMainPage
                .getOnlineScheduleLink()
                .shouldHave(Condition.text("Online-schedule"));
    }

    @Test(priority = 3)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW003")
    @Feature("Main page")
    @Story("The count of news in block must be more than constant.")
    @Severity(SeverityLevel.TRIVIAL)

    public void countTheEnglishNewsBlockListTest() {
        rwMainPage
                .checkTheNewsCountIsEqualOrHigherThanConstant(rwMainPage.getMainPageNewsModuleWithNewsList());
    }

    @Test(priority = 3)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW004")
    @Feature("Footer")
    @Story("The copyright text must be '© %CURRENT_YEAR% Belarusian Railway'.")
    @Severity(SeverityLevel.TRIVIAL)

    public void checkTheEnglishCopyrightTextTest() {
        String actualTextOfCopyrightElement = rwFooter
                .getCopyrightOnTheFooter()
                .getText();
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
        open(rwMainPage.getRwUrl());
        rwHeader
                .getHeaderButtonList()
                .shouldBe(CollectionCondition.sizeGreaterThan(5));
    }
}
