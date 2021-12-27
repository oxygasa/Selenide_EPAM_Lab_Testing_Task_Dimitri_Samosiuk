package pages.rw.train_result;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwTrainSearchResultListPage extends BasePage {
    public RwTrainSearchResultListPage(WebDriver driver) {
        super(driver);
    }
    private final By TRAIN_ROUTE_LIST_PAGE_TRAIN_ROUTE_TITLE = By.xpath("//a[@class='sch-table__route']");
    private final By TRAIN_ROUTE_LIST_PAGE_ROUTE_TIME = By.xpath("//div[contains(@class,'train-from-time')]");
    private final By TRAIN_ROUTE_PREVIEW_PAGE_TRAIN_ROUTE_TITLE = By.xpath("//div[@class='sch-title__title h2']");
    private final By TRAIN_ROUTE_PREVIEW_PAGE_DAYS_OF_ROUTE = By.xpath("//div[@class='sch-title__descr']");

    public By getTrainRouteListPageTrainRouteTitle() {
        return TRAIN_ROUTE_LIST_PAGE_TRAIN_ROUTE_TITLE;
    }
    public By getTrainRouteListPageRouteTime() {
        return TRAIN_ROUTE_LIST_PAGE_ROUTE_TIME;
    }
    public By getTrainRoutePreviewPageTrainRouteTitle() {
        return TRAIN_ROUTE_PREVIEW_PAGE_TRAIN_ROUTE_TITLE;
    }
    public By getTrainRoutePreviewPageDaysOfRoute() {
        return TRAIN_ROUTE_PREVIEW_PAGE_DAYS_OF_ROUTE;
    }
}
