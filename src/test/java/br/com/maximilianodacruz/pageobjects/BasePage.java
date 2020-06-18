package br.com.maximilianodacruz.pageobjects;

import br.com.maximilianodacruz.utils.Browser;
import br.com.maximilianodacruz.utils.FindTypes;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Browser {

    public WebElement element(FindTypes type, String locator) {
        WebElement el = null;
        switch (type) {
            case CLASSNAME:
                el = getCurrentDriver().findElement(By.className(locator));
                break;
            case CSSSELECTOR:
                el = getCurrentDriver().findElement(By.cssSelector(locator));
                break;
            case ID:
                el = getCurrentDriver().findElement(By.id(locator));
                break;
            case NAME:
                el = getCurrentDriver().findElement(By.name(locator));
                break;
            case XPATH:
                el = getCurrentDriver().findElement(By.xpath(locator));
                break;
            default:
                Assert.fail("Elemento não mapeado");
                break;
        }
        return el;
    }

    public static void visibilityOf(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void toBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(WebElement element) {
        toBeClickable(element);
        element.click();
    }

    public void fillField(WebElement element, String text) {
        visibilityOf(element);
        element.sendKeys(text);
    }

}
