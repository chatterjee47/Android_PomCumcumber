package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keywords {

	 public static WebDriver driver;
	  
	    public Keywords (WebDriver driver){
	    	Keywords.driver = driver;
	    }

	    public static void click (By elementLocation) {
	        driver.findElement(elementLocation).click();
	    }
	    
	    public static void input (By elementLocation, String text) {
	        driver.findElement(elementLocation).sendKeys(text);
	    }

	    public String readText (By elementLocation) {
	        return driver.findElement(elementLocation).getText();
	    }
	}