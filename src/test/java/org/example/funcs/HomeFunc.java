package org.example.funcs;

import org.example.common.BaseTest;
import org.example.pages.HomePage;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public boolean loginPerformed() {
        boolean logo;
        logo = driver.locator(homePage.getLogoSwagLabs()).isVisible();
        return logo;
    }
}
