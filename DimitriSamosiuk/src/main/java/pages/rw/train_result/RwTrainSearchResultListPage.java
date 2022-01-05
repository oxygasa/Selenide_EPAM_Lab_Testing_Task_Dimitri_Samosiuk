package pages.rw.train_result;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class RwTrainSearchResultListPage extends BasePage {
    private final ElementsCollection TRAIN_ROUTE_LIST_PAGE_TRAIN_ROUTE_TITLE = $$x("//div[@id='sch-route']//span[@class='train-route']");
    private final ElementsCollection TRAIN_ROUTE_LIST_PAGE_ROUTE_TIME = $$x("//div[contains(@class,'train-from-time')]");
    private final SelenideElement TRAIN_ROUTE_PREVIEW_PAGE_TRAIN_ROUTE_TITLE = $x("//div[@class='sch-title__title h2']");
    private final SelenideElement TRAIN_ROUTE_PREVIEW_PAGE_DAYS_OF_ROUTE = $x("//div[@class='sch-title__descr']");

    public ElementsCollection getTrainRouteListPageTrainRouteTitle() {
        return TRAIN_ROUTE_LIST_PAGE_TRAIN_ROUTE_TITLE;
    }
    public ElementsCollection getTrainRouteListPageRouteTime() {
        return TRAIN_ROUTE_LIST_PAGE_ROUTE_TIME;
    }
    public SelenideElement getTrainRoutePreviewPageTrainRouteTitle() { return TRAIN_ROUTE_PREVIEW_PAGE_TRAIN_ROUTE_TITLE; }
    public SelenideElement getTrainRoutePreviewPageDaysOfRoute() {
        return TRAIN_ROUTE_PREVIEW_PAGE_DAYS_OF_ROUTE;
    }
}
