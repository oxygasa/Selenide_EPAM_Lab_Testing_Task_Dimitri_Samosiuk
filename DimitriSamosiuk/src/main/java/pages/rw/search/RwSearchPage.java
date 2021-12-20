package pages.rw.search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwSearchPage extends BasePage {

    public RwSearchPage(WebDriver driver) {
        super(driver);
    }

    public String login = "6317985@mail.ru";
    public String password = "123456qwerty";
    public static final By loginInput = By.xpath(".//");
    public static final By passwordInput = By.xpath(".//");
    public static final By loginButton = By.xpath(".//");

    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    }




