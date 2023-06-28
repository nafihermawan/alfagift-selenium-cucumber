package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage extends BaseClass{

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/button[1]/span[1]")
	WebElement profileName;
	
	public String getProfileName() {
		return profileName.getText();
	}
}
