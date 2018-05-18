package com.org.learningMaven.testForCarolina;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.or.PageObjet.*;

public class seleniumTest {



    public static void main(String[] args) {
    	WebDriver driver = new FirefoxDriver();


    	PaginaPrincipalPage mainPage = new PaginaPrincipalPage(driver);
    	
    	mainPage.clickenCotizar();

    	mainPage.completarNombre("NombreSaranga");
    	
    	CarDataPage cardata = new CarDataPage(driver);
    	
    	    	
    }
}
