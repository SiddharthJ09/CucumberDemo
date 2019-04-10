package utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import CucumberTest.SeleniumTest;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends SeleniumTest{
	
	
	@Before
	public void beforeTest()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("This is Hook Method :: Brower Launched Successfully");
	}

	@After
	public void afterTest(){
		driver.quit();
		System.out.println("This is Hook Method :: Browser Closed.");
	}
}
