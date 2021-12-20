package pages.rw.main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwMainPage extends BasePage {

    public RwMainPage(WebDriver driver) {
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




