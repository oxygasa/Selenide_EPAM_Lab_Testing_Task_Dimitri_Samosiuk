package pages.rw.search_result_list;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.Arrays;

public class RwTrainSearchResultListPage extends BasePage {

    public RwTrainSearchResultListPage(WebDriver driver) {
        super(driver);
    }
    String trainRouteNameFrom = "Minsk Pasažyrski";
    String trainRouteNameTo = "Brest Centraĺny";
    public static final By getSearchTrainResultPageRouteNameFromAndTo = By.xpath("//span[@class='train-route']");
    public static final By getSearchTrainResultPageDepartureTimeFrom = By.xpath("//div[contains(@class,'train-from-time')]");
    }




