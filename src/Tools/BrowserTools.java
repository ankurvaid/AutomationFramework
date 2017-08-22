package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by vaid.ankur on 8/22/2017.
 */
public class BrowserTools{
    WebDriver driver;

    public BrowserTools(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Clicks on a given element
     * @param locator
     */
    public void click(By locator){
        this.driver.findElement(locator).click();
    }

    /**
     * Hovers mouse over a given element
     * @param locator
     */
    public void hover(By locator){
        Actions actions = new Actions(driver);
        WebElement element = this.driver.findElement(locator);
        actions.moveToElement(element);
    }

    /**
     * Gets text from a given element
     * @param locator
     */
    public void getText(By locator){
        this.driver.findElement(locator).getText();
    }

    /**
     * Perfroms click and clear operation on a given element
     * @param locator
     */
    public void clickAndClear(By locator){
        this.driver.findElement(locator).click();
        this.driver.findElement(locator).clear();
    }

    /**
     * Selects a given value from a dropdown
     * @param locator
     * @param value
     */
    public void selectByValue(By locator, String value){
        WebElement element = this.driver.findElement(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }
}
