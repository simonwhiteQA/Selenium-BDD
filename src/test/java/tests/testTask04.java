package tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DropPage;

public class testTask04 {
	
	private WebDriver driver;
	
	 @Before
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	 
	@Test
	public void dropTest() {
		driver.get(DropPage.dropURL);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='droppable/default.html']")));
		DropPage dropPage = new DropPage(driver);
		dropPage.dragToDrop();
		assertTrue(dropPage.getDroppedText().contains("Dropped!"));
		
	}

	 @After
	 public void teardown() {
		 this.driver.close();
	 }

}
