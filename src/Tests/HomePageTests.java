package Tests;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by vaid.ankur on 8/22/2017.
 */
public class HomePageTests extends HomePage{
    WebDriver driver;

    HomePage homePage = new HomePageTests(driver);

    /**
     * Creates instance of Home Page
     *
     * @param driver
     */
    public HomePageTests(WebDriver driver){
        super(driver);
    }

    @Test(groups = {"basic_tests"})
    public void testFeelingLuckyClick(){

        this.homePage.clickOnFeelingLuckyButton();
    }
}
