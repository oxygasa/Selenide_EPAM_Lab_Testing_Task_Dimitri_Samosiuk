package pages.rw.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RwFooter extends BasePage {
    public static final By COPYRIGHT_ON_THE_FOOTER = By.xpath("//div[@class='copyright' and contains (text(), '© 2021 Belarusian Railway')]");

    /*** A method to change the year to current for copuright text and following test */
    public static String getExpectedTextOfCopyright(){
    java.util.Calendar CalendarForCopyright = java.util.Calendar.getInstance();
    SimpleDateFormat dateFormatYyyy = new SimpleDateFormat("yyyy");
    String expectedYearOfCopyright = dateFormatYyyy.format(CalendarForCopyright.getTime());
    String expectedCopyrightText = "© "+expectedYearOfCopyright+" Belarusian Railway";
    return expectedCopyrightText;
    }

    public RwFooter(WebDriver driver) {
        super(driver);
    }
}
