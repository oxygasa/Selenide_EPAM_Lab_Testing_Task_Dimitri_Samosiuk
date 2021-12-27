package pages.google;

import com.codeborne.selenide.ElementsCollection;
import pages.base.BasePage;

import static com.codeborne.selenide.Selenide.$$x;

public class GoogleResultListPage extends BasePage {

    private final ElementsCollection SEARCH_RESULT_TITLE_LINK_LIST = $$x("//h3[contains(@class,'LC20lb')]/../..");

    public ElementsCollection getSearchResultTitleLinkList() {
        return SEARCH_RESULT_TITLE_LINK_LIST;
    }
}