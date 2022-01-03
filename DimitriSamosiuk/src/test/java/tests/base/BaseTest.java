package tests.base;

import com.codeborne.selenide.Selenide;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import pages.base.BasePage;
import java.io.File;
import java.io.IOException;
import static commons.Config.CLEAR_TEST_REPORT_AND_SCREENSHOT_DIRECTORY;
import static commons.Config.CLEAR_COOKIES_AND_LOCAL_STORAGE;

public class BaseTest extends BasePage {

    @BeforeTest
    public void clearAllReportsBeforeStartEachTest() throws IOException {
        File buildFolder = new File(".build");
        if (buildFolder.isDirectory() && CLEAR_TEST_REPORT_AND_SCREENSHOT_DIRECTORY) {
            FileUtils.deleteDirectory(new File(String.valueOf(buildFolder)));
        }
    }

    @AfterSuite
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_LOCAL_STORAGE) {
            Selenide.clearBrowserCookies();
            Selenide.clearBrowserLocalStorage();
        }
    }
}

