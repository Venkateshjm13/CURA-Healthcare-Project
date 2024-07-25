 
package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC004_MedicareTest extends ProjectSpecification {

	@BeforeTest
	public void setup() {

		excelfile = "Login_ValidCredentials";

	}

	@Test(dataProvider = "getData")
	public void MedicareProgramValidation(String username, String password)
			throws IOException {
		HomePage homePage = new HomePage(driver);

		try {

			homePage.navigateToLogin().enterUsername(username).enterPassword(password).clickOnLoginButton()
					.verifyRedirectionToAppointmentPage().selectTokyoFacility().clickOnCheckbox()
					.clickMedicareProgram().selectVisitDate().enterTextOnCommentSection()
					.clickOnBookAppointmentButton().verifyConfirmationMessage_Medicare()
					.clickOnHamBurgerButton().clickOnHistoryLink().verifyTokyoFacility()
					.clickOnHamBurgerButton().clickOnLogoutLink();

		} catch (Exception e) {
			String savedPath = getScreenShot("Screen_TC004_MedicareTest");
			System.out.println("TC004_MedicareTest is failed :Screenshot is captured and saved in " + savedPath);
			e.printStackTrace();
		}

	}
}
