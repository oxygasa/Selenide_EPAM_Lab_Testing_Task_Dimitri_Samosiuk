package tests.rw.search.positive;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.rw.header.RwHeader;
import pages.rw.main.RwMainPage;
import pages.rw.train_result.RwTrainSearchResultListPage;
import tests.base.BaseTest;

import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;

public class PositiveRwTrainSearchTest extends BaseTest {
    RwMainPage rwMainPage = new RwMainPage();
    RwTrainSearchResultListPage rwTrainSearchResultListPage = new RwTrainSearchResultListPage();
    RwHeader rwHeader = new RwHeader();
    @Test(priority = 1)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW008")
    @Feature("Train search module")
    @Story("As an passenger I want to find the train, " +
            "so let I request a train shedule via train search module.")
    @Severity(SeverityLevel.CRITICAL)

    public void searchTheTrainRouteTest() {
        open(rwMainPage.getRwUrl());
        rwMainPage
                .getTrainSearchTextFieldFrom()
                .setValue(rwMainPage.getCityDepartureFrom());
        rwMainPage
                .getTrainSearchTextFieldTo()
                .setValue(rwMainPage.getCityArriveTo());
        rwMainPage
                .getTrainSearchDateField()
                .setValue(RwMainPage.getFiveDaysAfterTodayDate());
        rwMainPage
                .getTrainSearchSubmitButton().click();

        /*** Display all trains in the console prompt**/
        //Need "To String"
Stream<String> allTrainsToConsole = rwTrainSearchResultListPage.getTrainRouteListPageTrainRouteTitle().stream().map(SelenideElement::getText);
        System.out.println(allTrainsToConsole);
        Stream<String> allTimeToConsole = rwTrainSearchResultListPage.getTrainRouteListPageRouteTime().stream().map(SelenideElement::getText);
        System.out.println(allTimeToConsole);
        /*** Continue the test**/
        //Need xpath
        rwTrainSearchResultListPage
                .getTrainRouteListPageTrainRouteTitle()
                .get(0)
                .click();
        rwTrainSearchResultListPage
                .getTrainRoutePreviewPageTrainRouteTitle()
                .shouldBe(Condition.visible);
        rwTrainSearchResultListPage
                .getTrainRoutePreviewPageDaysOfRoute()
                .shouldBe(Condition.visible);
        rwHeader
                .getRwCompanyLogo().click();
        rwMainPage
                .getTrainSearchTextFieldFromAfterClickOnLogo()
                .shouldBe(Condition.visible);
    }
}