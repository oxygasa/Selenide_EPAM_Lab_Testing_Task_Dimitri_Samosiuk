package pages.rw.train_perview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class TrainRoutePreviewPage extends BasePage {
    public TrainRoutePreviewPage(WebDriver driver) {
        super(driver);
    }
    public static final By trainRoutePreviewPageTrainRouteTitle = By.className("sch-title__title h2");
    public static final By trainRoutePerviewPageRouteDays = By.className("sch-title__descr");
}
