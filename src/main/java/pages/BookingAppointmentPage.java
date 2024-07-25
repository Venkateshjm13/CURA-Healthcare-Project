package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.ProjectSpecification;

public class BookingAppointmentPage extends ProjectSpecification {

	// Page factory to inspect element inside constructor
	@FindBy(xpath = "//select[@id='combo_facility']")
	private WebElement clickOnFacilityDropdown;

	@FindBy(xpath = "//input[@id='chk_hospotal_readmission']")
	private WebElement Checkbox;

	@FindBy(xpath = "//input[@id='radio_program_medicare']")
	private WebElement medicare_RadioBtn;

	@FindBy(xpath = "//input[@id='radio_program_medicaid']")
	private WebElement medicaid_RadioBtn;

	@FindBy(xpath = "//input[@id='txt_visit_date']")
	private WebElement visitDateCalender;

	@FindBy(xpath = "//td[contains(@class, 'day') and text()='31']")
	private WebElement visitDate;

	@FindBy(xpath = "//textarea[@id='txt_comment']")
	private WebElement commentSectionArea;

	@FindBy(xpath = "//button[@id='btn-book-appointment']")
	private WebElement BookAppointmentButton;

	// Constructor
	public BookingAppointmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Method to Select the Tokyo Facility on the BookingAppointmentPage
	public BookingAppointmentPage selectTokyoFacility() {

		clickabilityOfWebElement(clickOnFacilityDropdown, 10);
		clickOnElement(clickOnFacilityDropdown);
		Select dropDown = new Select(clickOnFacilityDropdown);
		dropDown.selectByVisibleText("Tokyo CURA Healthcare Center");
		return this;

	}

	// Method to Select the Hongkong Facility on the BookingAppointmentPage
	public BookingAppointmentPage selectHongKongFacility() {

		clickabilityOfWebElement(clickOnFacilityDropdown, 10);
		clickOnElement(clickOnFacilityDropdown);
		Select dropDown = new Select(clickOnFacilityDropdown);
		dropDown.selectByValue("Hongkong CURA Healthcare Center");
		return this;

	}

	// Method to Click the Medicare program on the BookingAppointmentPage
	public BookingAppointmentPage clickMedicareProgram() {

		clickabilityOfWebElement(medicare_RadioBtn, 10);
		clickOnElement(medicare_RadioBtn);
		System.out.println("Medicare program is selected");
		return this;

	}

	// Method to Click the Medicaid program on the BookingAppointmentPage
	public BookingAppointmentPage clickMedicaidProgram() {

		clickabilityOfWebElement(medicaid_RadioBtn, 10);
		clickOnElement(medicaid_RadioBtn);
		System.out.println("Medicaid program is selected");
		return this;

	}

	// Method to click on Apply for hospital resubmission checkbox on the  BookingAppointmentPage
	public BookingAppointmentPage clickOnCheckbox() {

		clickabilityOfWebElement(Checkbox, 10);
		clickOnElement(Checkbox);
		return this;

	}

	// Method to Select the visit date on the BookingAppointmentPage
	public BookingAppointmentPage selectVisitDate() {

		clickabilityOfWebElement(visitDateCalender, 10);
		clickOnElement(visitDateCalender);
		clickabilityOfWebElement(visitDate, 10);
		clickOnElement(visitDate);

		return this;
	}

	// Method to enter some text on comment section on the BookingAppointmentPage
	public BookingAppointmentPage enterTextOnCommentSection() {

		clickabilityOfWebElement(commentSectionArea, 10);
		clickOnElement(commentSectionArea);
		commentSectionArea.sendKeys("Please consider my appointment it is Emergency Booking");
		return this;

	}

	// Method to click on Book appointment button on the BookingAppointmentPage
	public AppointmentConfirmationPage clickOnBookAppointmentButton() {

		clickabilityOfWebElement(BookAppointmentButton, 10);
		clickOnElement(BookAppointmentButton);
		return new AppointmentConfirmationPage(driver);

	}
}
