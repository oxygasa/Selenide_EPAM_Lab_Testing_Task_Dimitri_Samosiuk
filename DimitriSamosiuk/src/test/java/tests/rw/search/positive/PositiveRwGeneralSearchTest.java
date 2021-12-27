package tests.rw.search.positive;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.rw.header.RwHeader;
import pages.rw.main.RwMainPage;
import pages.rw.train_result.RwGeneralSearchResultListPage;
import tests.base.BaseTest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static com.codeborne.selenide.Selenide.open;


public class PositiveRwGeneralSearchTest extends BaseTest {
    RwMainPage rwMainPage = new RwMainPage();
    RwHeader rwHeader = new RwHeader();
    RwGeneralSearchResultListPage rwGeneralSearchResultListPage = new RwGeneralSearchResultListPage();

    @Test(priority = 2)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW006")
    @Feature("General search text box")
    @Story("As a user I want to search the information from informational sections, so I need to do it via" +
            "general search text box.")
    @Severity(SeverityLevel.NORMAL)

    public void checkingReactionOnInputCharacters() throws UnsupportedEncodingException {
        for (int i = 0; i < RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST.length; i++) {
            open(rwMainPage.getRwUrl());
            rwHeader
                    .getHeaderSearchBox()
                    .setValue(RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i]);
            rwHeader
                    .getHeaderSearchSubmitButton()
                    .click();
            String actualUriOfGeneralSearchResultPage = WebDriverRunner.source();
            String actualCharacterNumberParse =
                    actualUriOfGeneralSearchResultPage
                    .substring(actualUriOfGeneralSearchResultPage.length() - 1);
            actualCharacterNumberParse =
                    URLEncoder.encode(actualCharacterNumberParse, StandardCharsets.UTF_8);
            RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i] =
                    URLEncoder.encode(RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i], StandardCharsets.UTF_8);
            String expectedCharacterNumberParse =
                    RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i].substring(RwGeneralSearchResultListPage.RANDOM_SYMBOLS_LIST[i].length() - 1);
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
        open(rwMainPage.getRwUrl());
       rwHeader
               .getHeaderSearchBox()
               .setValue(rwGeneralSearchResultListPage.getCityTextValue());
        rwHeader
                .getHeaderSearchSubmitButton()
                .click();
        String actualUriOfGeneralSearchResultPage = WebDriverRunner.source();
                URLEncoder.encode(rwGeneralSearchResultListPage.getCityTextValue(), StandardCharsets.UTF_8);
        String cutUriToLastWordsAccordingToSearch =
                actualUriOfGeneralSearchResultPage
                .substring(actualUriOfGeneralSearchResultPage.length() -
                rwGeneralSearchResultListPage.getCityTextValue().length());
        Assert.assertEquals(cutUriToLastWordsAccordingToSearch, rwGeneralSearchResultListPage.getCityTextValue());
        rwGeneralSearchResultListPage
                .getGeneralSearchResultPreviewTitleList().shouldHave(CollectionCondition.sizeGreaterThanOrEqual(1));

/** Requirement: Print in the console prompt the list of elements text.*/
            System.out.println(Arrays
                    .toString(rwGeneralSearchResultListPage
                    .getGeneralSearchResultPreviewTitleList()
                    .toArray()));
        }
    }

