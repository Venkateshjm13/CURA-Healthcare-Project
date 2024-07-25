package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.ProjectSpecification;

public class HistoryPage extends ProjectSpecification {

	// Page factory to inspect element inside constructor
	@FindBy(xpath = "//a[@id='menu-toggle']")
	private WebElement hamburgerButton;

	@FindBy(xpath = "//h2[text()='History']")
	private WebElement historyHeading;

	@FindBy(xpath = "//p[text()='Tokyo CURA Healthcare Center']")
	private WebElement tokyoFacility;
	
	@FindBy(xpath = "//p[text()='Hongkong CURA Healthcare Center']")
	private WebElement hongkongFacility;
	
	 
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;
	

	// Constructor
	public HistoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//Method to click on the HamBurger button
	public HistoryPage clickOnHamBurgerButton() {

		clickabilityOfWebElement(hamburgerButton, 10);
		clickOnElement(hamburgerButton);
		return this;

	}

	 

	// Method to Validate the Tokyo facility is present on HistoryPage
	public HistoryPage verifyTokyoFacility() {
		visibiltiyOfWebElement(historyHeading, 20);
		Assert.assertTrue(historyHeading.isDisplayed());
		String facilityText = tokyoFacility.getText();
		Assert.assertEquals(facilityText, "Tokyo CURA Healthcare Center");
		System.out.println(facilityText + " is Displayed on the History page");
		return this;
	}

	// Method to Validate the HongKong facility is present on HistoryPage
	public HistoryPage verifyHongkongFacility() {
		visibiltiyOfWebElement(historyHeading, 20);
		Assert.assertTrue(historyHeading.isDisplayed());
		String facilityText = hongkongFacility.getText();
		Assert.assertEquals(facilityText, "Hongkong CURA Healthcare Center");
		System.out.println(facilityText + " is Displayed on the History page");
		return this;
	}
	
	//Method to click the logout link
	public HistoryPage clickOnLogoutLink() {
		
		clickabilityOfWebElement(logoutLink, 10);
		clickOnElement(logoutLink);
		return this;
	}

}
