package tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.DropPage;
import pages.ScreenshotManager;

public class testTask05 {
	
	//The same as testTask04 but with screenshot manager
	
	private WebDriver driver;
	private ScreenshotManager screenshotManager;
	
	 @Before
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		screenshotManager = new ScreenshotManager();
	}
	 
	@Test
	public void dropTest() throws IOException {
		driver.get(DropPage.dropURL);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='droppable/default.html']")));
		DropPage dropPage = new DropPage(driver);
		dropPage.dragToDrop();
		screenshotManager.takeAndSaveScreenshot(driver, "./target/screenshots/dragAndDrop.png");
		assertTrue(dropPage.getDroppedText().contains("Dropped!"));
		
	}

	 @After
	 public void teardown() {
		 this.driver.close();
	 }

}
