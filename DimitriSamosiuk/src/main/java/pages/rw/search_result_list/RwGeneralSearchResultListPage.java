package pages.rw.search_result_list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwGeneralSearchResultListPage extends BasePage {
    public RwGeneralSearchResultListPage(WebDriver driver) {
        super(driver);
    }
    public static final By newsBlockList = By.xpath("//div[@class='index-news-list']//dt");
    public static final By generalSearchResultPreviewTitleList = By.xpath("//li//div[@class='search-preview']/preceding-sibling::h3/a");
    public static final String[] randomSymbolsList = {"!","@","#","$","%","^","&","*","(",")","-","_","+","=","'","{","}","\"",":",";"};
    public static final String cityTextValue = "Санкт-Петербург";
}
