package tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.LoginPage;
import pages.RegisterPage;

public class test {
	
	private WebDriver driver;
	
	 @Before
	 public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	 
	 @Test
	 public void register() {
		 driver.get(RegisterPage.registerURL);
		 RegisterPage regPage = new RegisterPage(driver);
		 regPage.register("simon", "password123");
	 }
	 
	 @Test
	 public void login() {
		 driver.get(LoginPage.loginURL);
		 LoginPage logPage = new LoginPage(driver);
		 logPage.login("simon", "password123");
		 assertEquals(logPage.verify(), "**Successful Login**");
	 }

	 @After
	 public void teardown() {
		 this.driver.close();
	 }

}
