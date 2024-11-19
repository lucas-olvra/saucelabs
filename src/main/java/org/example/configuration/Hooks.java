package org.example.configuration;

import com.microsoft.playwright.Page;
import io.cucumber.java.*;
import org.example.common.BaseTest;
import org.example.common.StaticVariables;

import java.io.IOException;
import java.nio.file.Paths;

public class Hooks extends BaseTest {

    @BeforeAll
    public static void beforeTest() {
        System.out.println("Sistema operacional: " + System.getProperty("os.name"));
        initializeDriver();
    }

    @Before
    public void before(Scenario scenario) {
        super.createContextAndPage();
        StaticVariables.setUrl("https://www.saucedemo.com");
        driver.setViewportSize(1400, 720);
        driver.navigate(StaticVariables.getUrl());
        System.out.println();
    }

    @After
    public void close(Scenario scenario) {
        byte[] screenshot = driver.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenshot.png")).setFullPage(true));
        scenario.attach(screenshot, "image/png", scenario.getName());
        driver.locator("//div[@class='app_logo']").click();
    }

    @AfterAll
    public static void closeBrowser() {
        playwright.close();
    }
}
