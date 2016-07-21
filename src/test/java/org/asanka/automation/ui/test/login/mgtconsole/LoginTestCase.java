package org.asanka.automation.ui.test.login.mgtconsole;

/**
 * Created by asankav on 7/21/16.
 */


import org.asanka.automation.ui.utils.browser.APIMIntegrationUiBaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;


/**
 * The following test case checks whether the admin user can login and logout.
 */
public class LoginTestCase extends APIMIntegrationUiBaseTest {

//    public String baseURL="https://192.168.1.4:9443/carbon/admin/login.jsp";
//    public WebDriver driver;

    @BeforeClass()
    public void init() {
        super.init();
        driver.get(this.getmgtConsoleLoginURL());
    }

    @Test()
    public void verifyLogin(){
        String expected="WSO2 API Manager";
        Assert.assertEquals(expected,driver.getTitle());
    }

    @AfterClass()
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }



}
