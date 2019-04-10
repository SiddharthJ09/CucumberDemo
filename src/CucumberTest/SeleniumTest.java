package CucumberTest;

import stepDefination.AllObjectRepot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTest {

	protected static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "F://Software Testing//chromedriver.exe");
		//driver = new ChromeDriver();

		driver = new FirefoxDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("admin");

		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
		Thread.sleep(5000);
		
		
		
		WebElement elePerformance = driver.findElement(By.xpath("//b[text()='Performance']"));
		
		Actions act1 = new Actions(driver);
		act1.moveToElement(elePerformance).build().perform();
		
		 driver.findElement(By.xpath("//a[@id='menu_performance_viewEmployeePerformanceTrackerList']")).click();
		driver.findElement(By.xpath("//a[@id= 'welcome']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[ text()= 'Logout']")).click();

		
		System.out.println("LogOut Successfully");



		driver.quit();

	}

}
