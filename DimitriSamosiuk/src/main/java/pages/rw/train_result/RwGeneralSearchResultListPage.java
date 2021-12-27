package pages.rw.train_result;

import com.codeborne.selenide.ElementsCollection;
import pages.base.BasePage;
import static com.codeborne.selenide.Selenide.$$x;

public class RwGeneralSearchResultListPage extends BasePage {
    public static final String[] RANDOM_SYMBOLS_LIST = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", ">", "{", "}", "\"", ":", ";"};
    private final ElementsCollection GENERAL_SEARCH_RESULT_PREVIEW_TITLE_LIST = $$x("//li//div[@class='search-preview']/preceding-sibling::h3/a");
    public String getCityTextValue() {
        return "Санкт-Петербург";
    }
    public ElementsCollection getGeneralSearchResultPreviewTitleList() {
        return GENERAL_SEARCH_RESULT_PREVIEW_TITLE_LIST;
    }
}

