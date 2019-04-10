package stepDefination;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import CucumberTest.SeleniumTest;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestRun extends SeleniumTest {
	
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
//		driver = new FirefoxDriver();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println("Given - User is on login page");
		
	   
	}
	
//	@When("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable userdetails) throws Throwable {
//	    
//		List<List<String>> data = userdetails.raw();
//		
//		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(data.get(0).get(1));	
//		
//		System.out.println("Enter Details:: UserName "+data.get(0).get(0)+"Password "+data.get(0).get(1));
//				 
//	}
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password (List<Credentials>  userdetails) throws Throwable {
	    
		for (Credentials credentials: userdetails){
			driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(credentials.getusername());
			driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(credentials.getpassword());	
			
			System.out.println("Enter Details:: UserName "+credentials.getusername()+"Password "+credentials.getpassword());
			
		}
		
		
				 
	}

//	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String Username, String Password) throws Throwable {
//		System.out.println("When - user enters Username_Password");
//	//	driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(Username);
//		//driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(Password);
//		
//		AllObjectRepot allObjectRepot= new AllObjectRepot(driver);
//		allObjectRepot.userName.sendKeys(Username);
//		allObjectRepot.password.sendKeys(Password);
//	}
	
	
//	@When("User enters \"(.*)\" and \"(.*)\"$") //@When("^user enters Username and Password$")
//	public void user_enters_Username_Password(String Username, String Password ) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("When - user enters Username_Password");
//		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(Username);
//		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(Password);
//	   
//	}

	@And("^Click login buttons$")
	public void click_login_buttons() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		System.out.println("And - Click login buttons$");
		Thread.sleep(5000);
		String strInvalidCred = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
		
		if (strInvalidCred.equalsIgnoreCase("Invalid credentials"))
		{
			System.out.println("Password Incorrect "+strInvalidCred);
			driver.quit();
		}
		
	}
	
	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//		driver.quit();
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		System.out.println("And - Click login buttons$");
		
//		String strInvalidCred = driver.findElement(By.xpath("//span[text()='Invalid credentials']")).getText();
//		
//		if (strInvalidCred.equalsIgnoreCase("Invalid credentials"))
//		{
//			System.out.println("Password Incorrect "+strInvalidCred);
//			driver.quit();
//		}
		
		System.out.println("Clicked on login button");
	  
	}

	@Then("^User on dashboard and close browser$")
	public void user_on_dashboard_and_close_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is logout function");
		WebElement elePerformance = driver.findElement(By.xpath("//b[text()='Performance']"));
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(elePerformance).build().perform();
		
		 driver.findElement(By.xpath("//a[@id='menu_performance_viewEmployeePerformanceTrackerList']")).click();
		driver.findElement(By.xpath("//a[@id= 'welcome']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[ text()= 'Logout']")).click();

		
		System.out.println("LogOut Successfully");
		//driver.quit();
	    
	}
	

}
