package Pages;

import Tools.BrowserTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by vaid.ankur on 8/22/2017.
 */
public class HomePage extends BrowserTools{
    private WebDriver driver;

    /**
     * Creates instance of Home Page
     * @param driver
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By feelingLuckyButton = By.cssSelector(".jsb>center>input:nth-of-type(2)");
    By googleLogo = By.cssSelector("#hplogo");

    public boolean isDisplayed(){
        return this.driver.findElement(googleLogo).isDisplayed();
    }

    public void waitUntilDisplayed(){
        WebDriverWait webDriverWait = new WebDriverWait(this.driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(googleLogo));
    }

    /**
     * Clicks on Feeling Lucky button on Home Page
     */
    public void clickOnFeelingLuckyButton(){
        this.driver.findElement(feelingLuckyButton).click();
    }
}
