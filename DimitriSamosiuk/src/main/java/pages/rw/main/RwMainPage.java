package pages.rw.main;

import commons.CommonActions;
import commons.Config;
import constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class RwMainPage extends BasePage {
    public static final By TRAIN_SEARCH_TEXT_FIELD_FROM = By.id("acFrom");
    public static final By TRAIN_SEARCH_TEXT_FIELD_TO = By.id("acTo");
    public static final By TRAIN_SEARCH_DATE_FIELD = By.id("yDate");
    public static final String CITY_DEPARTURE_FROM = "Минск-Пассажирский";
    public static final String CITY_ARRIVE_TO = "Брест-Центральный";
    public static final By TRAIN_SEARCH_SUBMIT_BUTTON = By.xpath("//span[@class='std-button']//input[@type='submit']");
    public static final List<WebElement> MAIN_PAGE_NEWS_MODULE_WITH_NEWS_LIST = CommonActions.getDriver().findElements(By.xpath("//dt[contains(@id,'bx_1373509569')]"));
    public static final By TRAIN_SEARSH_TEXT_FIELD_FROM_AFTER_CLICK_ON_LOGO = By.id("one-way-raspFormFromTitle");
    public RwMainPage(WebDriver driver) {
        super(driver);
    }

    public static boolean checkTheNewsCountIsEqualOrHigherThanConstant(List<WebElement> elements) {
        return elements.size() > Constant.RwMainPageConstants.COUNT_OF_PRESENTED_NEWS_ON_MAIN_PAGE;
    }

    public static String getFiveDaysAfterTodayDate() {
        java.util.Calendar TrainDate = java.util.Calendar.getInstance();
        TrainDate.add(Calendar.DAY_OF_WEEK, 5);
        SimpleDateFormat dateFormatddMMyyyy = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormatddMMyyyy.format(TrainDate.getTime());
    }
}



