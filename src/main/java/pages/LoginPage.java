package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class LoginPage extends ProjectSpecification {

	@FindBy(xpath = "//input[@id='txt-username']")
	private WebElement usernameField;

	@FindBy(xpath = "//input[@id='txt-password']")
	private WebElement passwordField;

	@FindBy(xpath = "//button[@id='btn-login']")
	private WebElement loginButton;

	@FindBy(xpath = "//p[@class='lead text-danger']")
	private WebElement loginErrorMessage;

	/*
	@FindBy(xpath = "//a[@id='menu-toggle']")
	private WebElement hamburgerButton;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;

	*/
	@FindBy(xpath = "//h2[text()='Make Appointment']")
	private WebElement makeAppointment;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Method to Enter the Username on the Loign page
	public LoginPage enterUsername(String username) {
		clickabilityOfWebElement(usernameField, 10);
		usernameField.sendKeys(username);
		return this;

	}

	// Method to Enter the Password in the Loign page
	public LoginPage enterPassword(String password) {
		passwordField.sendKeys(password);
		return this;
	}

	// Method to validate the Login Error message
	public LoginPage verifyErrorLoginMessage(String username, String password, String scenario) {

		if (scenario.equals("Invalid")) {
			visibiltiyOfWebElement(loginErrorMessage, 20);
			String healthcareProgramText = loginErrorMessage.getText();
			Assert.assertEquals(healthcareProgramText,
					"Login failed! Please ensure the username and password are valid.");
			System.out.println("Entered Username: " + username + " or Password: " + password + " is Invalid");
			// System.out.println(healthcareProgramText + " is Displayed on the Loginpage
			// ");
		}
		return this;
	}

	// Method to Click the Login button on the Login page
	public LoginPage clickOnLoginButton() {
		clickabilityOfWebElement(loginButton, 30);
		clickOnElement(loginButton);
		return this;
	}

	// Method to Validate the text on the Booking appointment page
	public BookingAppointmentPage verifyRedirectionToAppointmentPage() {
		visibiltiyOfWebElement(makeAppointment, 20);
		Assert.assertTrue(makeAppointment.isDisplayed());
		System.out.println("Re-directed to Booking appointment page");
		return new BookingAppointmentPage(driver);
	}

	/*
	// Method to click on the HamBurger button
	public HistoryPage clickOnHamBurgerButton() {

		clickabilityOfWebElement(hamburgerButton, 10);
		clickOnElement(hamburgerButton);
		return this;

	}

	// Method to click the logout link
	public HistoryPage clickOnLogoutLink() {

		clickabilityOfWebElement(logoutLink, 10);
		clickOnElement(logoutLink);
		return this;
	}
	*/

}
