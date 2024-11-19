package org.example.funcs;

import org.example.common.BaseTest;
import org.example.pages.LoginPage;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();

    public void accessScreen(String screen) {
        if (screen.equals("login")) {
            driver.waitForTimeout(1000);
        }
    }

    public void performLogin(String username, String password) {
        driver.locator(loginPage.getInputLogin()).fill(username);
        driver.locator(loginPage.getInputPassword()).fill(password);
        driver.locator(loginPage.getButtonLogin()).click();
    }
}
