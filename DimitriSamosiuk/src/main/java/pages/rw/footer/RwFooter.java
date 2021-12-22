package pages.rw.footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwFooter extends BasePage {
    public RwFooter(WebDriver driver) {
        super(driver);
    }
    public static final By copyrightOnTheFooter = By.xpath("//div[@class='copyright' and contains (text(), '© 2021 Belarusian Railway')]");
}
