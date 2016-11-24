package trainings;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectsPage {
	
	public ObjectsPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//input[@type='radio' and contains(@name,'cars')]")
	public List <WebElement> radioButtons;
	
	@FindBy (xpath="//select[@id='flight-children']")
	public WebElement ChildrenDropDown;
	
}
