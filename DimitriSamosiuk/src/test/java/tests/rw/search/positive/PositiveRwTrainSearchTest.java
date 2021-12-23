package tests.rw.search.positive;

import commons.CommonActions;
import constants.Constant;
import io.qameta.allure.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.rw.header.RwHeader;
import pages.rw.main.RwMainPage;
import pages.rw.train_result.RwTrainSearchResultListPage;
import tests.base.BaseTest;

import java.util.List;

public class PositiveRwTrainSearchTest extends BaseTest {
    @Test(priority = 1)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW008")
    @Feature("Train search module")
    @Story("As an passenger I want to find the train, " +
            "so let I request a train shedule via train search module.")
    @Severity(SeverityLevel.CRITICAL)

    public void searchTheTrainRouteTest() {
        RwMainPage.goToUrl(Constant.Urls.BELARUS_RAILWAY_NAIN_PAGE_URL);
        RwMainPage.typeText(RwMainPage.TRAIN_SEARCH_TEXT_FIELD_FROM, RwMainPage.CITY_DEPARTURE_FROM);
        RwMainPage.typeText(RwMainPage.TRAIN_SEARCH_TEXT_FIELD_TO, RwMainPage.CITY_ARRIVE_TO);
        RwMainPage.typeText(RwMainPage.TRAIN_SEARCH_DATE_FIELD, RwMainPage.getFiveDaysAfterTodayDate());
        RwMainPage.clickTheElement(RwMainPage.TRAIN_SEARCH_SUBMIT_BUTTON);

//        List<WebElement> allTrainsToConsole = CommonActions.getDriver().findElements(TrainRoutePreviewPage.TRAIN_ROUTE_LIST_PAGE_TRAIN_ROUTE_TITLE);
//        List<WebElement> allTimeToConsole = CommonActions.getDriver().findElements(TrainRoutePreviewPage.TRAIN_ROUTE_LIST_PAGE_ROUTE_TIME);
//        List<String> allTrainsCollection = new ArrayList<>();
//        List<String> allTimeCollection = new ArrayList<>();
//        for(WebElement e : allTrainsToConsole){
//            allTrainsCollection.add(e.getText());
//            System.out.println(allTrainsCollection);
//            allTimeCollection.add(e.getText());
//            System.out.println(allTimeCollection);
//      }
        RwTrainSearchResultListPage.clickTheElement(RwTrainSearchResultListPage.TRAIN_ROUTE_LIST_PAGE_TRAIN_ROUTE_TITLE);
        RwTrainSearchResultListPage.assertElementIsDisplayed(RwTrainSearchResultListPage.TRAIN_ROUTE_PREVIEW_PAGE_TRAIN_ROUTE_TITLE);
        RwTrainSearchResultListPage.assertElementContainsText(RwTrainSearchResultListPage.TRAIN_ROUTE_PREVIEW_PAGE_DAYS_OF_ROUTE,",");
        RwMainPage.clickTheElement(RwHeader.RW_COMPANY_LOGO);
        RwMainPage.assertElementIsDisplayed(RwMainPage.SWITCH_TO_ENGLISH);
    }
}