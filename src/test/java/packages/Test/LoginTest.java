/**
 * 
 */
package packages.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import config.pageObjects.LoginPageObj;
import readWritePropertyFile.ReadPropertyFile;

/**
 * @author Jignesh
 *
 */
public class LoginTest extends config.browsers.Chrome {

	private static ReadPropertyFile rpf = new ReadPropertyFile();

	@Test
	public void Login() throws InterruptedException {

		LoginPageObj loginObj = new LoginPageObj();

		WebDriverWait wait = new WebDriverWait(getDriver(), 20);

		System.out.println(getDriver().getTitle());
		loginObj.LoginButton.click();
		wait.until(ExpectedConditions.visibilityOf(loginObj.LoginPageHeading));
		Assert.assertTrue(loginObj.LoginPageHeading.getText().equalsIgnoreCase("Login"));
		System.out.println("Login page displayed");
		loginObj.usernameField.sendKeys(rpf.getDirectUsername());
		loginObj.passwordField.sendKeys(rpf.getDirectPassword());
		loginObj.submitButton.click();
		wait.until(ExpectedConditions.visibilityOf(loginObj.MyProfileButton));
		if (loginObj.MyProfileButton.isDisplayed()) {
			System.out.println("User is Logged in");
		} else {
			System.out.println("User is NOT Logged in");
		}
		loginObj.LogoutButton.click();
		wait.until(ExpectedConditions.visibilityOf(loginObj.LoginButton));
		if (loginObj.LoginButton.isDisplayed()) {
			System.out.println("User is logged out");
			System.out.println("Login test pass");
		} else {
			System.out.println("Login test failed");
		}

	}
}
