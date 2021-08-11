package pages;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RegisterPage {
		
		private WebDriver driver;
		public final static String registerURL = "http://thedemosite.co.uk/addauser.php";
		
		public RegisterPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input")
		private WebElement usernameInput;
		
		@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input")
		private WebElement passwordInput;
		
		@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input")
		private WebElement saveButton;
		
		public void register(String username, String password) {
			usernameInput.sendKeys(username);
			passwordInput.sendKeys(password);
			saveButton.click();
		}
		
	}
