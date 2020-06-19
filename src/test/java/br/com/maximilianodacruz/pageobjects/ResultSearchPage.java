package br.com.maximilianodacruz.pageobjects;

public class ResultSearchPage extends BasePage {

    public String getPageTitle() {
        return getCurrentDriver().getTitle();
    }
}
