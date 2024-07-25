package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class AppointmentConfirmationPage extends ProjectSpecification {

	
	// Page factory to inspect element inside constructor
	@FindBy(xpath = "//h2[text()='Appointment Confirmation']")
	private WebElement confirmationMessage;

	@FindBy(xpath = "//p[@id='program']")
	private WebElement healthcareProgram;

	@FindBy(xpath = "//a[@id='menu-toggle']")
	private WebElement hamburgerButton;
	
	@FindBy(xpath = "//a[text()='History']")
	private WebElement historyLink;
	
	// Constructor
	public AppointmentConfirmationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Method to Validate the Medicare program confirmation message is present on the AppointmentConfirmationPage
	public AppointmentConfirmationPage verifyConfirmationMessage_Medicare() {
		visibiltiyOfWebElement(confirmationMessage, 20);
		Assert.assertTrue(confirmationMessage.isDisplayed());
		String healthcareProgramText = healthcareProgram.getText();
		Assert.assertEquals(healthcareProgramText, "Medicare");
		System.out.println(healthcareProgramText + " is Displayed on the confirmation message ");
		return this;
	}

	// Method to Validate the Medicare program confirmation message is present on the AppointmentConfirmationPage
	public AppointmentConfirmationPage verifyConfirmationMessage_Medicaid() {
		visibiltiyOfWebElement(confirmationMessage, 20);
		Assert.assertTrue(confirmationMessage.isDisplayed());
		String healthcareProgramText = healthcareProgram.getText();
		Assert.assertEquals(healthcareProgramText, "Medicaid");
		System.out.println(healthcareProgramText + " is Displayed on the confirmation message ");
		return this;
	}
	
	//Method to click on the HamBurger button
		public AppointmentConfirmationPage clickOnHamBurgerButton() {

			clickabilityOfWebElement(hamburgerButton, 10);
			clickOnElement(hamburgerButton);
			return this;

		}

		//Method to click the History link
		public HistoryPage clickOnHistoryLink() {

			clickabilityOfWebElement(historyLink, 10);
			clickOnElement(historyLink);
			return new HistoryPage(driver);

		}
}
