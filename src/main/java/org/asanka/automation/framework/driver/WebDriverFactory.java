package org.asanka.automation.framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverFactory {
    public static WebDriver driver;


    public static WebDriver getWebDriver(String driverSelection)  {
        if (driverSelection.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/gecko/geckodriver");
//           driver = new MarionetteDriver();
            driver = new FirefoxDriver();

        } else if (driverSelection.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/chromedriver");
            driver = new ChromeDriver();

        } else if (driverSelection.equalsIgnoreCase("remotefirefox")) {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/gecko/geckodriver");
            DesiredCapabilities capabilities=DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            WebDriver driver = new RemoteWebDriver(capabilities);


        } else if (driverSelection.equalsIgnoreCase("remotechrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/chromedriver");
            DesiredCapabilities desiredCapabilities=DesiredCapabilities.chrome();


        } else if (driverSelection.equalsIgnoreCase("ie")) {
            driver = new InternetExplorerDriver();

        }
        return driver;
    }

}
