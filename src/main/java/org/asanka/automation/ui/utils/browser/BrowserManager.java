package org.asanka.automation.ui.utils.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



/**
 * Created by asankav on 7/21/16.
 */
public class BrowserManager {
    public static WebDriver driver;


    public static WebDriver getWebDriver(String driverSelection)  {
        if (driverSelection.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (driverSelection.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/chromedriver");
            driver = new ChromeDriver();
        } else if (driverSelection.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();
        } else if (driverSelection.equalsIgnoreCase("geko")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/gecko/geckodriver");
            driver = new MarionetteDriver();
        }
        else if (driverSelection.equalsIgnoreCase("htmlUnit")) {
            driver = new HtmlUnitDriver(true);
        } else {
//            driver = new OperaDriver();
        }
        return driver;
    }


}
