package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage extends ProjectSpecification {

	// Page factory to inspect element inside constructor
	@FindBy(linkText = "Make Appointment")
	private WebElement loginLink;

	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Method to Click the Login link on the Home page
	public LoginPage navigateToLogin() {
		clickabilityOfWebElement(loginLink, 30);
		clickOnElement(loginLink);
		return new LoginPage(driver);
	}

}
