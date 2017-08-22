package Pages;

import Tools.BrowserTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by vaid.ankur on 8/22/2017.
 */
public class DoodlesPage extends BrowserTools {

    private WebDriver driver;

    /**
     * Creates instance of this page
     * @param driver
     */
    public DoodlesPage(WebDriver driver) {
        super(driver);
    }

    By doodlesArchiveLink = By.cssSelector("#archive-link>a");

    public boolean isDisplayed(){
        return this.driver.findElement(doodlesArchiveLink).isDisplayed();
    }
}
