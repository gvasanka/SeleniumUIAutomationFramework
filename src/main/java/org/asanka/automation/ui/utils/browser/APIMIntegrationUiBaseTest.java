package org.asanka.automation.ui.utils.browser;

import org.openqa.selenium.WebDriver;

import javax.xml.xpath.XPathExpressionException;

/**
 * Created by asankav on 7/21/16.
 */
public class APIMIntegrationUiBaseTest {
    protected WebDriver driver;

    protected void init(){
        this.driver=BrowserManager.getWebDriver(PropertyMapper.getInstance().getElement("defaultBrowser"));

    }
    /**
     * Gets the default login url for management console.
     * @return The URL.
     */
    protected String getmgtConsoleLoginURL()  {
        return PropertyMapper.getInstance().getElement("mgtConsoleBaseURL");
    }

    /**
     * Gets the default login url for Store .
     * @return The URL.
     */
    protected String getStoreLoginURL() {
        return PropertyMapper.getInstance().getElement("storeBaseURL");
    }

    /**
     * Gets the default login url for Publisher .
     * @return The URL.
     */
    protected String getPublisherLoginURL() {
        return PropertyMapper.getInstance().getElement("publisherBaseURL");
    }

}
