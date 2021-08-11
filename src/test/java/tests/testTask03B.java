package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testTask03B {
	
	private WebDriver driver;
	
	 @Before
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	 
	@Test
	public void alertTest() {
		driver.get("http://way2automation.com/way2auto_jquery/alert.php#load_box");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='alert/input-alert.html']")));
		
		WebElement inputButton = this.driver.findElement(By.xpath("/html/body/button"));
		inputButton.click();
	    
		
	}

	 @After
	 public void teardown() {
		 this.driver.close();
	 }


}
