package tests.rw.search.positive;

import commons.CommonActions;
import constants.Constant;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rw.header.RwHeader;
import pages.rw.main.RwMainPage;
import pages.rw.train_result.RwGeneralSearchResultListPage;
import tests.base.BaseTest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;


public class PositiveRwGeneralSearchTest extends BaseTest {
    RwMainPage rwMainPage = new RwMainPage(getDriver());
    RwHeader rwHeader = new RwHeader(getDriver());
    RwGeneralSearchResultListPage rwGeneralSearchResultListPage = new RwGeneralSearchResultListPage(getDriver());

    @Test(priority = 2)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW006")
    @Feature("General search text box")
    @Story("As a user I want to search the information from informational sections, so I need to do it via" +
            "general search text box.")
    @Severity(SeverityLevel.NORMAL)

    public void checkingReactionOnInputCharacters() throws UnsupportedEncodingException {
        for (int i = 0; i < RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST.length; i++) {
            rwMainPage.goToUrl(Constant.Urls.BELARUS_RAILWAY_NAIN_PAGE_URL);
            rwHeader.typeText(rwHeader.getHeaderSearchBox(), RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i]);
            rwHeader.clickTheElement(rwHeader.getHeaderSearchSubmitButton());
            String actualUriOfGeneralSearchResultPage = CommonActions.getDriver().getCurrentUrl();
            String cuttedUriThreeLastCharacters = actualUriOfGeneralSearchResultPage.substring(actualUriOfGeneralSearchResultPage.length() - 1);
            String actualCharacterNumberParse = String.valueOf(cuttedUriThreeLastCharacters);
            actualCharacterNumberParse = URLEncoder.encode(actualCharacterNumberParse, StandardCharsets.UTF_8);
            RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i] = URLEncoder.encode(RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i], StandardCharsets.UTF_8);
            String expectedCharacterNumberParse = RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i].substring(RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i].length() - 1);
            Assert.assertEquals(actualCharacterNumberParse, expectedCharacterNumberParse);
        }
    }

    @Test(priority = 2)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW007")
    @Feature("General search text box")
    @Story("As a user I want to search the information from informational sections (for example %CITY_NAME%) so" +
            " I need to do it via general search text box.")
    @Severity(SeverityLevel.NORMAL)

    public void checkingReactionOnStringInput() {
        rwMainPage.
                goToUrl(Constant.Urls.BELARUS_RAILWAY_NAIN_PAGE_URL);
        rwHeader.
                typeText(rwHeader.getHeaderSearchBox(), RwGeneralSearchResultListPage.CITY_TEXT_VALUE);
        rwHeader.
                clickTheElement(rwHeader.getHeaderSearchSubmitButton());
        String actualUriOfGeneralSearchResultPage = CommonActions.getDriver().getCurrentUrl();
        RwGeneralSearchResultListPage.CITY_TEXT_VALUE = URLEncoder.encode(RwGeneralSearchResultListPage.CITY_TEXT_VALUE, StandardCharsets.UTF_8);
        String cuttedUriToLastWordsAccordingToSearch =
                actualUriOfGeneralSearchResultPage.
                substring(actualUriOfGeneralSearchResultPage.length() -
                RwGeneralSearchResultListPage.CITY_TEXT_VALUE.length());
        Assert.assertEquals(cuttedUriToLastWordsAccordingToSearch, RwGeneralSearchResultListPage.CITY_TEXT_VALUE);
        rwGeneralSearchResultListPage.assertElementsAreDisplayed(rwGeneralSearchResultListPage.getGeneralSearchResultPreviewTitleList());

/** Requirement: Print in the console prompt the list of elements text.*/
        List<WebElement> allTitlesToConsole = CommonActions.getDriver().findElements(rwGeneralSearchResultListPage.getGeneralSearchResultPreviewTitleList());
        for (WebElement element : allTitlesToConsole) {
            System.out.println(element.getText());
        }
    }
}

