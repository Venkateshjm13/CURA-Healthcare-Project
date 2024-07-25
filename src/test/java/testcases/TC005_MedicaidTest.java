
package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC005_MedicaidTest extends ProjectSpecification {

	@BeforeTest
	public void setup() {

		excelfile = "Login_ValidCredentials";

	}

	@Test(dataProvider = "getData")
	public void MedicaidProgramValidation(String username, String password)
			throws IOException {
		HomePage homePage = new HomePage(driver);

		try {

			homePage.navigateToLogin().enterUsername(username).enterPassword(password).clickOnLoginButton()
					.verifyRedirectionToAppointmentPage().selectHongKongFacility().clickOnCheckbox()
					.clickMedicaidProgram().selectVisitDate().enterTextOnCommentSection()
					.clickOnBookAppointmentButton().verifyConfirmationMessage_Medicaid()
					.clickOnHamBurgerButton().clickOnHistoryLink().verifyHongkongFacility()
					.clickOnHamBurgerButton().clickOnLogoutLink();

		} catch (Exception e) {
			String savedPath = getScreenShot("Screen_TC005_MedicaidTest");
			System.out.println("TC005_MedicaidTest is failed :Screenshot is captured and saved in " + savedPath);
			e.printStackTrace();
		}

	}
}
