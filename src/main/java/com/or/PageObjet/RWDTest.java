package com.or.PageObjet;


import junit.framework.TestCase; //removes need for annotations by extending
import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class RWDTest extends TestCase {
    private WebDriver driver;
    
    public void setUp() throws Exception {
        DesiredCapabilities capabillities = DesiredCapabilities.firefox();
        capabillities.setCapability("version", "59.0.2");
        capabillities.setCapability("platform", Platform.LINUX);
        capabillities.setCapability("name", "Testing Selenium-2 Remote WebDriver");

        driver = new RemoteWebDriver( new URL("http://localhost:4444/wd/hub"), capabillities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().setPosition(new Point(220, 10));
	driver.manage().window().setSize(new Dimension(1000,650));
    }

    public void testSimple() throws Exception {
        this.driver.get("http://www.google.com");
        assertEquals("Google", this.driver.getTitle());
    }

    public void tearDown() throws Exception {
        this.driver.quit();
    }
}