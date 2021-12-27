package pages.rw.main;

import commons.CommonActions;
import constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class RwMainPage extends BasePage {
    public RwMainPage(WebDriver driver) {
        super(driver);
    }
    private final By TRAIN_SEARCH_TEXT_FIELD_FROM = By.id("acFrom");
    private final By TRAIN_SEARCH_TEXT_FIELD_TO = By.id("acTo");
    private final By TRAIN_SEARCH_DATE_FIELD = By.id("yDate");
    private final By TRAIN_SEARCH_SUBMIT_BUTTON = By.xpath("//span[@class='std-button']//input[@type='submit']");
    private final List<WebElement> MAIN_PAGE_NEWS_MODULE_WITH_NEWS_LIST = CommonActions.getDriver().findElements(By.xpath("//dt[contains(@id,'bx_1373509569')]"));
    private final By TRAIN_SEARSH_TEXT_FIELD_FROM_AFTER_CLICK_ON_LOGO = By.id("one-way-raspFormFromTitle");
    public String getCityDepartureFrom() {
        return "Минск-Пассажирский";
    }
    public String getCityArriveTo() {
        return "Брест-Центральный";
    }

    public boolean checkTheNewsCountIsEqualOrHigherThanConstant(List<WebElement> elements) {
        return elements.size() > Constant.RwMainPageConstants.COUNT_OF_PRESENTED_NEWS_ON_MAIN_PAGE;
    }

    public static String getFiveDaysAfterTodayDate() {
        java.util.Calendar TrainDate = java.util.Calendar.getInstance();
        TrainDate.add(Calendar.DAY_OF_WEEK, 5);
        SimpleDateFormat dateFormatddMMyyyy = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormatddMMyyyy.format(TrainDate.getTime());
    }

    public By getTrainSearchTextFieldFrom() {
        return TRAIN_SEARCH_TEXT_FIELD_FROM;
    }
    public By getTrainSearchTextFieldTo() {
        return TRAIN_SEARCH_TEXT_FIELD_TO;
    }
    public By getTrainSearchDateField() {
        return TRAIN_SEARCH_DATE_FIELD;
    }
    public By getTrainSearchSubmitButton() {
        return TRAIN_SEARCH_SUBMIT_BUTTON;
    }
    public List<WebElement> getMainPageNewsModuleWithNewsList() {
        return MAIN_PAGE_NEWS_MODULE_WITH_NEWS_LIST;
    }
    public By getTrainSearshTextFieldFromAfterClickOnLogo() {
        return TRAIN_SEARSH_TEXT_FIELD_FROM_AFTER_CLICK_ON_LOGO;
    }
}



