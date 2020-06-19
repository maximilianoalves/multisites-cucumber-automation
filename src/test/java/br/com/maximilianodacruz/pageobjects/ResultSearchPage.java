package br.com.maximilianodacruz.pageobjects;

import br.com.maximilianodacruz.utils.Mappings;
import org.junit.Assert;

public class ResultSearchPage extends BasePage {

    Mappings mappings = new Mappings("ResultSearchPage");

    public String getPageTitle() {
        return getCurrentDriver().getTitle();
    }

    public void assertTitle() {
        Assert.assertEquals(mappings.getValue("assertTitle"), getPageTitle());
    }
}
