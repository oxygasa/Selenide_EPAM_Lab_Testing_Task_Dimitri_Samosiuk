package pages.rw.main;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class RwMainPage extends BasePage {
    private final SelenideElement TRAIN_SEARCH_TEXT_FIELD_FROM = $(byId("acFrom"));
    private final SelenideElement TRAIN_SEARCH_TEXT_FIELD_TO = $(byId("acTo"));
    private final SelenideElement TRAIN_SEARCH_DATE_FIELD = $(byId("yDate"));
    private final SelenideElement TRAIN_SEARCH_SUBMIT_BUTTON = $x("//span[@class='std-button']//input[@type='submit']");
    private final ElementsCollection MAIN_PAGE_NEWS_MODULE_WITH_NEWS_LIST = $$x(("//dt[contains(@id,'bx_1373509569')]"));
    private final SelenideElement TRAIN_SEARCH_TEXT_FIELD_FROM_AFTER_CLICK_ON_LOGO = $(byId("one-way-raspFormFromTitle"));
    private final SelenideElement ONLINE_SCHEDULE_LINK = $x("//i[text()='Online-schedule']");
    public String getRwUrl() {
        return "https://rw.by";
    }
    public String getCityDepartureFrom() {
        return "Минск-Пассажирский";
    }
    public String getCityArriveTo() {
        return "Брест-Центральный";
    }
    public int getCountOfPresentedNewsOnMainPage(){return 4;}

    public boolean checkTheNewsCountIsEqualOrHigherThanConstant(ElementsCollection elements) {
        return elements.size() > getCountOfPresentedNewsOnMainPage();
    }

    public static String getFiveDaysAfterTodayDate() {
        java.util.Calendar TrainDate = java.util.Calendar.getInstance();
        TrainDate.add(Calendar.DAY_OF_WEEK, 5);
        SimpleDateFormat dateFormatddMMyyyy = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormatddMMyyyy.format(TrainDate.getTime());
    }

    public SelenideElement getTrainSearchTextFieldFrom() {
        return TRAIN_SEARCH_TEXT_FIELD_FROM;
    }
    public SelenideElement getTrainSearchTextFieldTo() {
        return TRAIN_SEARCH_TEXT_FIELD_TO;
    }
    public SelenideElement getTrainSearchDateField() {
        return TRAIN_SEARCH_DATE_FIELD;
    }
    public SelenideElement getTrainSearchSubmitButton() {
        return TRAIN_SEARCH_SUBMIT_BUTTON;
    }
    public ElementsCollection getMainPageNewsModuleWithNewsList() {
        return MAIN_PAGE_NEWS_MODULE_WITH_NEWS_LIST;
    }
    public SelenideElement getTrainSearchTextFieldFromAfterClickOnLogo() {
        return TRAIN_SEARCH_TEXT_FIELD_FROM_AFTER_CLICK_ON_LOGO;
    }

    public SelenideElement getOnlineScheduleLink() {
        return ONLINE_SCHEDULE_LINK;
    }
}



