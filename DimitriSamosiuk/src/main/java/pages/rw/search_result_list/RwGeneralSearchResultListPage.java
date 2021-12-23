package pages.rw.search_result_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwGeneralSearchResultListPage extends BasePage {
    public RwGeneralSearchResultListPage(WebDriver driver) {
        super(driver);
    }
    public static final By NEWS_BLOCK_LIST = By.xpath("//div[@class='index-news-list']//dt");
    public static final By GENERAL_SEARCH_RESULT_PREVIEW_TITLE_LIST = By.xpath("//li//div[@class='search-preview']/preceding-sibling::h3/a");
    public static final String[] RANDOM_SYMBOLS_LIST = {"!","@","#","$","%","^","&","*","(",")","-","_","+","=",">","{","}","\"",":",";"};
    public static String CITY_TEXT_VALUE = "Санкт-Петербург";
}
