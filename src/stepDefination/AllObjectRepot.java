package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import CucumberTest.SeleniumTest;


///*//import org.openqa.selenium.By;
////import org.openqa.selenium.WebDriver;
////import org.openqa.selenium.WebElement;

public class AllObjectRepot extends SeleniumTest {

 
 public AllObjectRepot(WebDriver driver) {           
	 this.driver = driver; 
	 PageFactory.initElements(driver, this);
	 }
 
 		@FindBy(xpath="//*[@id='txtUsername']")
 		public WebElement userName;
 		
 		@FindBy(xpath="//*[@id='txtPassword']")
 		public WebElement password;
 		
 		
 		
 				
}
