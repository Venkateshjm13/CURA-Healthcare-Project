 
package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC002_ValidLoginTest extends ProjectSpecification {

	@BeforeTest
	public void setup() {

		excelfile = "Login_ValidCredentials";

	}

	@Test(dataProvider = "getData")
	public void ValidLoginCredential(String username, String password)
			throws IOException {
		HomePage homePage = new HomePage(driver);

		try {

			homePage.navigateToLogin().enterUsername(username).enterPassword(password).clickOnLoginButton()
					.verifyRedirectionToAppointmentPage();

		} catch (Exception e) {
			String savedPath = getScreenShot("Screen_TC002_ValidLoginTest");
			System.out.println("TC002_ValidLoginTest is failed :Screenshot is captured and saved in " + savedPath);
			e.printStackTrace();
		}

	}
}
