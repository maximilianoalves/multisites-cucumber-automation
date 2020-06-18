package br.com.maximilianodacruz.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class ResultSearchPage extends BasePage {

    public String getPageTitle() {
        System.out.println(getCurrentDriver().getTitle());
        return getCurrentDriver().getTitle();
    }
}
