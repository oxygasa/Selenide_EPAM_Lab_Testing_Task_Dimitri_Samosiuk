package pages.rw.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwMainPage extends BasePage {

    public RwMainPage(WebDriver driver) {
        super(driver);
    }

    
    public static final By switchToEnglish = By.xpath("//a[contains(text(),'ENG')]");

    }




