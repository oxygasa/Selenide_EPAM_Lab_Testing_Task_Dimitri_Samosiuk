package tests.rw.search.positive;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import tests.base.BaseTest;


public class PositiveRwSearchPage extends BaseTest {

    @Test(priority = 1)
    @Description("Verify the positive data input ends with successful logging into system")
    @Epic("EPAM001")
    @Feature("Login page")
    @Story("As user I want to login into system with my credentials")
    @Step("1. Type positive login credentials. 2. Type positive password credentials. 3. Click the 'Login' button")
    @Severity(SeverityLevel.CRITICAL)

    public void checkIsLoginIsSuccessful() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.goToUrl(LOGIN_PAGE_URL);
        loginPage.find(loginInput).sendKeys(loginPage.getLogin());
        loginPage.find(passwordInput).sendKeys(loginPage.getPassword());
        loginPage.find(loginButton).click();
    }
}