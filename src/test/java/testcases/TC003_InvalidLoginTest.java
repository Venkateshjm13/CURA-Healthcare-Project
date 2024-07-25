
package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import pages.HomePage;

public class TC003_InvalidLoginTest extends ProjectSpecification {

	@BeforeTest
	public void setup() {

		excelfile = "Login_InvalidCredentials";

	}

	@Test(dataProvider = "getData")
	public void InvalidLoginCredential(String username, String password,String scenario)
			throws IOException {
		HomePage homePage = new HomePage(driver);

		try {

			homePage.navigateToLogin().enterUsername(username).enterPassword(password).clickOnLoginButton()
					.verifyErrorLoginMessage(username,password,scenario);

		} catch (Exception e) {
			String savedPath = getScreenShot("Screen_TC003_InvalidLoginTest");
			System.out.println("TC003_InvalidLoginTest is failed :Screenshot is captured and saved in " + savedPath);
			e.printStackTrace();
		}

	}
}
