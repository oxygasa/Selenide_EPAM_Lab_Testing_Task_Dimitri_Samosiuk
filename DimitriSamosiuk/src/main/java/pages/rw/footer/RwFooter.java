package pages.rw.footer;

import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import java.text.SimpleDateFormat;

import static com.codeborne.selenide.Selenide.$x;

public class RwFooter extends BasePage {
    private final SelenideElement COPYRIGHT_ON_THE_FOOTER = $x("//div[@class='copyright' and contains (text(), '©')]");
    /*** A method to change the year to current for copuright text and following test */
    public static String getExpectedTextOfCopyright(){
    java.util.Calendar CalendarForCopyright = java.util.Calendar.getInstance();
    SimpleDateFormat dateFormatYyyy = new SimpleDateFormat("yyyy");
    String expectedYearOfCopyright = dateFormatYyyy.format(CalendarForCopyright.getTime());
        return "© "+expectedYearOfCopyright+" Belarusian Railway";
    }
    public SelenideElement getCopyrightOnTheFooter() {
        return COPYRIGHT_ON_THE_FOOTER;
    }
}
