package pages.rw.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RwMainPage extends BasePage {
    public RwMainPage(WebDriver driver) {
        super(driver);
    }
    public static final By switchToEnglish = By.xpath("//a[contains(text(),'ENG')]");
    public static final By trainSearchTextFieldFrom = By.id("acFrom");
    public static final By trainSearchTextFieldTo = By.id("acTo");
    public static final By trainSearchSubmitButton = By.xpath("//span[@class='std-button']//input[@type='submit']");

    public static void getFiveDaysAfterTodayDate() {
        java.util.Calendar TrainDate = java.util.Calendar.getInstance();
        TrainDate.add(Calendar.DAY_OF_WEEK, 5);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(dateFormat.format(TrainDate.getTime()));
    }
}



