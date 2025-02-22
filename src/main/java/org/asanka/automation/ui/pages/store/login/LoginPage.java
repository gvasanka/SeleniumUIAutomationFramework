package org.asanka.automation.ui.pages.store.login;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by asankav on 7/21/16.
 */
public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) throws IOException {
        this.driver = driver;
        // Check that we're on the right page.
        if (!(driver.getCurrentUrl().contains("login.jsp"))) {
            // Alternatively, we could navigate to the login page, perhaps logging out first
            throw new IllegalStateException("This is not the login page");
        }
    }
}
