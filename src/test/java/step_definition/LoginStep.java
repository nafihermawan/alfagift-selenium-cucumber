package step_definition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_object.HomePage;
import page_object.LoginPage;

public class LoginStep {
	private WebDriver driver;

	public LoginStep() {
		super();
		this.driver = Hooks.driver;
	}

	@Given("User open login page")
	public void openPage() {
		LoginPage loginPage = new LoginPage(driver);

		Assert.assertTrue(loginPage.fieldDisplayed());
	}

	@When("User input invalid \"(.*)\" and \"(.*)\"")
	public void setCredential(String email, String Password) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setEmail(email);
		loginPage.setPassword(Password);
	}
	
	@And("User click login")
	public void clickLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickLogin();
	}
	
	@Then("Login failed")
	public void verifyLoginError() {
		LoginPage loginPage = new LoginPage(driver);
		Assert.assertTrue(loginPage.alertDislpayed());
	}
	
	@Then("Login Success")
	public void verifyLoginFailed() {
		HomePage homePage = new HomePage(driver);
		String actualProfileName = homePage.getProfileName();
		
		Assert.assertEquals("Nafi Hermawan", actualProfileName);
	}
}
