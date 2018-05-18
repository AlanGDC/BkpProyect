package com.or.PageObjet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmpireStrikesBackPage {

	WebDriver driver;

	//Ubicate each object from view

	
		
		By languageButton 	 =	By.xpath("//a[@title='Star Wars: Episode V - The Empire Strikes Back – Spanish']");

	
		   private void waitForByclassName(String selectorName) throws Error{
			   new WebDriverWait(driver, 20)
	           .until(ExpectedConditions.visibilityOfElementLocated(By.className(selectorName)));
		   }
		   

		
		   private void waitForBycssSelector(String selectorName) throws Error{
			   new WebDriverWait(driver, 20)
	           .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selectorName)));
		   }
		
		   private void waitForByLinkText(String selectorName) throws Error{
			   new WebDriverWait(driver, 20)
	           .until(ExpectedConditions.visibilityOfElementLocated(By.linkText(selectorName)));
		   }
		
		   private void waitForByXpath(String selectorName) throws Error{
			   new WebDriverWait(driver, 20)
	           .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectorName)));
		   }
	
		   
		   
		   
			public EmpireStrikesBackPage(WebDriver driver)
			{
				
					this.driver=driver;
					
			}
			
	// Actions for each objects combinations
			
			public void clickChangeLanguage()
			{
				
				
				waitForByXpath("//a[@title='Star Wars: Episode V - The Empire Strikes Back – Spanish']");
				driver.findElement(languageButton).sendKeys("");
				driver.findElement(languageButton).click(); 
				
				
			
			}			
			

	
}
