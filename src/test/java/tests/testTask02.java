package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class testTask02 {
	
	private WebDriver driver;
	
	 @Before
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	 
	@Test
	public void selectableTest() {
		driver.get("http://way2automation.com/way2auto_jquery/selectable.php#load_box");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='selectable/default.html']")));
		WebElement item = this.driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
		item.click();
		String itemBackground = item.getCssValue("background");
		assertTrue(itemBackground.contains("rgb(243, 152, 20)"));
		
	}

	 @After
	 public void teardown() {
		 this.driver.close();
	 }

}
