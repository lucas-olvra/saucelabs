package org.example.common;

import com.microsoft.playwright.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseTest {

    public static Playwright playwright;

    static Browser browser;

    public static BrowserContext context;
    public static Page driver;

    public static void initializeDriver() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }

    protected void createContextAndPage() {
        context = browser.newContext();
        driver = context.newPage();
    }

    public String readProperties(String properties, String info) {
        String contents = null;
        try {
            FileReader reader = new FileReader(System.getProperty("user.dir") + "/src/main/java/resources/" + properties + ".properties");
            Properties p = new Properties();
            p.load(reader);
            contents = p.getProperty(info);
        } catch (IOException io) {
            io.printStackTrace();
        }
        return contents;
    }
}
