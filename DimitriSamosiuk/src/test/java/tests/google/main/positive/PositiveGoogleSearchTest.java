package tests.google.main.positive;

import com.codeborne.selenide.Condition;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.google.GoogleMainPage;
import pages.google.GoogleResultListPage;
import pages.rw.main.RwMainPage;
import tests.base.BaseTest;

import static com.codeborne.selenide.Selenide.open;


public class PositiveGoogleSearchTest extends BaseTest {
    GoogleMainPage googleMainPage = new GoogleMainPage();
    GoogleResultListPage googleResultListPage = new GoogleResultListPage();
    RwMainPage rwMainPage = new RwMainPage();
    @Test(priority = 3)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW001")
    @Feature("3rd party web search service")
    @Story("As user I want to search by a request \"белорусская железная дорога\" " +
            "in a google.com and open the rw.by main page by clicking a search service redirect link." +
            "So I want to do it via 3rd party web search service - Google.")
    @Severity(SeverityLevel.TRIVIAL)

    public void searchTheRwByMainPageUsingGoogleSearchTest() {
        open(googleMainPage.getGoogleUrl());
        googleMainPage
                .getGoogleSearchBoxInput()
                .setValue(googleMainPage.getSearchBoxTextForInput());
        googleMainPage
                .getSearchInGoogleSubmitButton()
                .click();
        googleResultListPage
                .getSearchResultTitleLinkList().
                findBy(Condition.text("Белорусская железная дорога"))
                .click();
        rwMainPage.
                getTrainSearchTextFieldFrom().
                shouldBe(Condition.visible);
    }
}