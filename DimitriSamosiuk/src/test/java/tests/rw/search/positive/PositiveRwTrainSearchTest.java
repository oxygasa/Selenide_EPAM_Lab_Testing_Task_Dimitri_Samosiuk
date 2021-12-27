//package tests.rw.search.positive;
//
//import commons.CommonActions;
//import constants.Constant;
//import io.qameta.allure.*;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.rw.header.RwHeader;
//import pages.rw.main.RwMainPage;
//import pages.rw.train_result.RwTrainSearchResultListPage;
//import tests.base.BaseTest;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class PositiveRwTrainSearchTest extends BaseTest {
//    RwMainPage rwMainPage = new RwMainPage(getDriver());
//    RwTrainSearchResultListPage rwTrainSearchResultListPage = new RwTrainSearchResultListPage(getDriver());
//    RwHeader rwHeader = new RwHeader(getDriver());
//    @Test(priority = 1)
//    @Description("Requirements: https://clck.ru/ZXihb")
//    @Epic("RW008")
//    @Feature("Train search module")
//    @Story("As an passenger I want to find the train, " +
//            "so let I request a train shedule via train search module.")
//    @Severity(SeverityLevel.CRITICAL)
//
//    public void searchTheTrainRouteTest() {
//        rwMainPage.
//                goToUrl(Constant.Urls.BELARUS_RAILWAY_NAIN_PAGE_URL);
//        rwMainPage.
//                typeText(rwMainPage.getTrainSearchTextFieldFrom(), rwMainPage.getCityDepartureFrom());
//        rwMainPage.
//                typeText(rwMainPage.getTrainSearchTextFieldTo(), rwMainPage.getCityArriveTo());
//        rwMainPage.
//                typeText(rwMainPage.getTrainSearchDateField(), RwMainPage.getFiveDaysAfterTodayDate());
//        rwMainPage.
//                clickTheElement(rwMainPage.getTrainSearchSubmitButton());
//
//        /*** Display all tains in the console prompt**/
//        List<WebElement> allTrainsToConsole =
//                CommonActions.getDriver().findElements(rwTrainSearchResultListPage.getTrainRouteListPageTrainRouteTitle());
//        List<WebElement> allTimeToConsole =
//                CommonActions.getDriver().findElements(rwTrainSearchResultListPage.getTrainRouteListPageRouteTime());
//        List<String> allTrainsCollection = new ArrayList<>();
//        List<String> allTimeCollection = new ArrayList<>();
//        for (WebElement eachElement : allTrainsToConsole) {
//            allTrainsCollection.add(eachElement.getText());
//        }
//        for (WebElement eachElement : allTimeToConsole) {
//            allTimeCollection.add(eachElement.getText());
//        }
//        String[] displayAllTrainsAndTime = new String[16];
//        for (int i = 0; i < 16; i++) {
//            displayAllTrainsAndTime[i] = allTrainsCollection.get(i);
//            displayAllTrainsAndTime[i+1] = allTimeCollection.get(i);
//            i++;
//        }
//        System.out.println(Arrays.toString(displayAllTrainsAndTime));
//
//        rwTrainSearchResultListPage.
//                clickTheElement(rwTrainSearchResultListPage.getTrainRouteListPageTrainRouteTitle());
//        rwTrainSearchResultListPage.
//                assertElementIsDisplayed(rwTrainSearchResultListPage.getTrainRoutePreviewPageTrainRouteTitle());
//        Assert.assertNotNull(rwTrainSearchResultListPage.getTrainRoutePreviewPageDaysOfRoute());
//        rwMainPage.
//                clickTheElement(rwHeader.getRwCompanyLogo());
//        rwMainPage.
//                assertElementIsDisplayed(rwMainPage.getTrainSearshTextFieldFromAfterClickOnLogo());
//    }
//}