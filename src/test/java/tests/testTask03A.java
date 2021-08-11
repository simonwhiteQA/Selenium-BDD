package tests;

	import static org.junit.Assert.assertThat;
	import static org.junit.Assert.assertTrue;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class testTask03A {
		
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
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='alert/simple-alert.html']")));
			
			WebElement alertButton = this.driver.findElement(By.xpath("/html/body/button"));
			alertButton.click();
		    Alert alert = driver.switchTo().alert();
		    alert.accept();
			
		}

		 @After
		 public void teardown() {
			 this.driver.close();
		 }

	}

