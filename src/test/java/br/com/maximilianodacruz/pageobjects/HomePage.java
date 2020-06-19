package br.com.maximilianodacruz.pageobjects;

import br.com.maximilianodacruz.utils.FindTypes;
import br.com.maximilianodacruz.utils.Mappings;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
public class HomePage extends BasePage {

    Mappings mappings = new Mappings("HomePage");
    WebElement fieldSearch = element(FindTypes.valueOf(mappings.getType("fieldSearch")), mappings.getValue("fieldSearch"));
    WebElement btnSearch = element(FindTypes.valueOf(mappings.getType("btnSearch")), mappings.getValue("btnSearch"));

    public void inputSearch(String search) {
        fillField(fieldSearch, search);
    }
    public void clickSearch() {
        click(btnSearch);
    }
}
