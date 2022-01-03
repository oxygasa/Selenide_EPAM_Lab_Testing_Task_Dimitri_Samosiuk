package commons;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import static commons.Config.*;
public class CommonActions {

    /** All changes must be provided only in src/main/java/commons/Config */

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.browser = BROWSER_NAME;
    }

    @BeforeSuite
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(MAKE_SCREENSHOTS_FOR_ALLURE)
                .savePageSource(MAKE_ALLURE_REPORTS)
        );
    }

    @BeforeTest
    public void clearAllReportsTrigger() throws IOException {
        File allureResultFolder = new File(".allure-results");
        File SelenideReportFolder = new File(".build/reports");
        if (allureResultFolder.isDirectory() || SelenideReportFolder.isDirectory() && CLEAR_TEST_REPORT_AND_SCREENSHOT_DIRECTORY) {
            FileUtils.deleteDirectory(new File(String.valueOf(allureResultFolder)));
            FileUtils.deleteDirectory(new File(String.valueOf(SelenideReportFolder)));
        }
    }
    @AfterSuite
    public void clearCookiesTrigger() {
        if (CLEAR_COOKIES_AND_LOCAL_STORAGE) {
            try {
                Selenide.clearBrowserCookies();
                Selenide.clearBrowserLocalStorage();
                Selenide.executeJavaScript("window.sessionStoreage.clear()");
            } catch (Exception e) {
                System.out.println("Fail to to clearCookiesAndLocalStorage()" + e);
            }
        }
    }
}
