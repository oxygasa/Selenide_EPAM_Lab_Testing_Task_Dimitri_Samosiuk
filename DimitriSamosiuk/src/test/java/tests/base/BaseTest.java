package tests.base;
import commons.CommonActions;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import pages.base.BasePage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import static commons.Config.CLEAR_TEST_REPORT_AND_SCREENSHOT_DIRECTORY;
import static commons.Config.CLEAR_COOKIES;
import static commons.Config.MAKE_SCREENSHOT_FOR_ALLURE;
import static commons.Config.HOLD_BROWSER_OPEN;
public class BaseTest extends BasePage {
    WebDriver driver;

    @BeforeTest
    public void startBrowser() {
        driver = CommonActions.getDriver();
    }

    @BeforeTest
    public void clearAllReportsBeforeStartEachTest() throws IOException {
        File buildFolder = new File("./DimitriSamosiuk/build/");
        File allureResultFolder = new File(".allure-results");
        if(buildFolder.isDirectory() && CLEAR_TEST_REPORT_AND_SCREENSHOT_DIRECTORY){
            FileUtils.deleteDirectory(new File(String.valueOf(buildFolder)));
            FileUtils.deleteDirectory(new File(String.valueOf(allureResultFolder)));
        }
    }

    @AfterSuite
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES) {
            driver.manage().deleteAllCookies();
        }
    }

    @AfterMethod
    public void takingScreenshootsAfterEachTest() throws IOException {
        if (MAKE_SCREENSHOT_FOR_ALLURE) {
            Date date = new Date();
            String currentTime = String.valueOf(date.getTime());
            TakesScreenshot ts = (TakesScreenshot) driver;
            File bufferedScreenshotFile = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(bufferedScreenshotFile, new File(new StringBuilder().
                    append("./DimitriSamosiuk/build/screenshots/scr").append(currentTime).append(".png").toString()));
        makeAttachScreenshotToAllure(ts);
        }
    }
    @Attachment
    public byte[] makeAttachScreenshotToAllure(TakesScreenshot takesScreenshot){
        return takesScreenshot.getScreenshotAs(OutputType.BYTES);
    }

    @AfterSuite
    public void closeBrowser() {
        if (!HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
