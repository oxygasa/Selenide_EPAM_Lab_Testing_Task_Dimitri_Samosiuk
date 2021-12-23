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
    public RwMainPage(WebDriver driver) {
        super(driver);
    }
    public static final By switchToEnglish = By.xpath("//a[contains(text(),'ENG')]");
    public static final By trainSearchTextFieldFrom = By.id("acFrom");
    public static final By trainSearchTextFieldTo = By.id("acTo");
    public static final By trainSearchSubmitButton = By.xpath("//span[@class='std-button']//input[@type='submit']");
    public static final List<WebElement> mainPageNewsModuleWithNewsList = CommonActions.getDriver().findElements(By.xpath("//dt[contains(@id,'bx_1373509569')]"));

    public static boolean checkTheNewsCountIsEqualOrHigherThanConstant(List<WebElement> elements){
        return elements.size() > Constant.RwMainPageConstants.COUNT_OF_PRESENTED_NEWS_ON_MAIN_PAGE;
    }
    public static void getFiveDaysAfterTodayDate() {
        java.util.Calendar TrainDate = java.util.Calendar.getInstance();
        TrainDate.add(Calendar.DAY_OF_WEEK, 5);
        SimpleDateFormat dateFormatddMMyyyy = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(dateFormatddMMyyyy.format(TrainDate.getTime()));
    }
}



