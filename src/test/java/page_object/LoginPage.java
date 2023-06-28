package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "password")
	private WebElement txtEmail;
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[@class='btn btn-primary btn-block']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//div[@class='alert alert-danger text-sm']")
	private WebElement alertMsg;
	
	public void setEmail(String email) {
		setText(txtEmail, email);
	}
	
	public void setPassword(String password) {
		setText(btnLogin, password);
	}
	
	public void clickLogin() {
		click(btnLogin);
	}
	
	public boolean fieldDisplayed() {
		return txtEmail.isDisplayed();
	}
	
	public boolean alertDislpayed() {
		return alertMsg.isDisplayed();
	}
	
	public String getAlert() {
		return alertMsg.getText();
	}
}
