package com.or.PageObjet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaPrincipalPage {

	WebDriver driver;

	// Ubiquity each object from view

	
		By cotizarButton 	 =	By.className("botonEntrar");		

	// Initialize driver on page objet
	
		public PaginaPrincipalPage(WebDriver driver)
		{
			
				this.driver=driver;
				
		}

	// Actions for each objects combinations
		
		public void clickenCotizar() {

			driver.findElement(cotizarButton).click(); 

			
		}
		public void 		completarNombre(String nombre){

			driver.findElement(cotizarButton).sendKeys(nombre); 

			
		}

		

}
