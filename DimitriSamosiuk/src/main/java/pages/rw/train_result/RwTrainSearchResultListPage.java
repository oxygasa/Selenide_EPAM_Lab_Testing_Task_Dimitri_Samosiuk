package pages.rw.train_result;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwTrainSearchResultListPage extends BasePage {
    public RwTrainSearchResultListPage(WebDriver driver) {
        super(driver);
    }
    public static final By TRAIN_ROUTE_LIST_PAGE_TRAIN_ROUTE_TITLE = By.xpath("//a[@class='sch-table__route']");
    public static final By TRAIN_ROUTE_LIST_PAGE_ROUTE_TIME = By.xpath("//div[contains(@class,'train-from-time')]");
    public static final By TRAIN_ROUTE_PREVIEW_PAGE_TRAIN_ROUTE_TITLE = By.xpath("//div[@class='sch-title__title h2']");
    public static final By TRAIN_ROUTE_PREVIEW_PAGE_DAYS_OF_ROUTE = By.xpath("//div[@class='sch-title__descr']");
}
