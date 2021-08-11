package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropPage {
	
	private WebDriver driver;
	public final static String dropURL = "http://way2automation.com/way2auto_jquery/droppable.php#load_box";
	
	public DropPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "draggable") 
	private WebElement dragElement;
	
	@FindBy(id = "droppable") 
	private WebElement dropElement;
	
	public void dragToDrop() {
		Actions drag = new Actions(driver);
		drag.dragAndDrop(dragElement, dropElement);
		
		drag.build()
		   .perform();
	}
	
	public String getDroppedText() {
		return dropElement.getText();
	}

}
