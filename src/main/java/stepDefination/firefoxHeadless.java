package stepDefination;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import org.openqa.selenium.remote.DesiredCapabilities;

public class firefoxHeadless {
    public static WebDriver ffHeadless() {

    	
    //	  System.setProperty("webdriver.gecko.driver", "D:\\\\ToolsQA\\trunk\\Library\\drivers\\geckodriver.exe");
		
    	 
    	FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
      
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        
        
    	WebDriver nuevoDriver = new FirefoxDriver(firefoxOptions);
        
        return (nuevoDriver);
    }
}
