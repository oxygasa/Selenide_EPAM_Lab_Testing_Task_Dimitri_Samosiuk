package pages.google;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.SelenideElement;
import pages.base.BasePage;

public class GoogleMainPage extends BasePage {
    private final SelenideElement GOOGLE_SEARCH_BOX_INPUT = $(byName("q"));
    private final SelenideElement SEARCH_IN_GOOGLE_SUBMIT_BUTTON = $(byClassName("gNO89b"));
    public String getGoogleUrl() {
        return "https://google.com";
    }
    public String getSearchBoxTextForInput() {
        return "белорусская железная дорога";
    }
    public SelenideElement getGoogleSearchBoxInput() {
        return GOOGLE_SEARCH_BOX_INPUT;
    }
    public SelenideElement getSearchInGoogleSubmitButton() {
        return SEARCH_IN_GOOGLE_SUBMIT_BUTTON;
    }
}