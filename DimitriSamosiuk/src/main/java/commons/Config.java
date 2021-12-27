package commons;

public class Config {
    /**
     * Change the browser name for cross browser testing. Available:
     * chrome
     * firefox
     * ie
     * edge
     * opera
     **/
    public static final String BROWSER_NAME = "firefox";
    /** Clear all cookies and cache after each iteration.*/
    public static final Boolean CLEAR_COOKIES_AND_LOCAL_STORAGE = false;
    /** To keep browser open after all tests.*/
    public static final Boolean HOLD_BROWSER_OPEN = true;
    /**
     * Selenide makes screenshots automatically after tests fail.
     * Screenshots of the failed tests are located ./build/reports by default
     * Screenshots path can be changed here.
     **/
    public static final Boolean MAKE_ALLURE_REPORTS = true;
    public static final Boolean MAKE_SCREENSHOTS_FOR_ALLURE = false;
    /**
     * Before each run the reports and screenshots can stay deleted.
     * ".build/reports" and .DimitriSamosiuk/../allure-results
     **/
    public static final Boolean CLEAR_TEST_REPORT_AND_SCREENSHOT_DIRECTORY = false;

}
