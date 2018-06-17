/**
 * 
 */
package config.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Jignesh
 *
 */
public class LoginPageObj extends config.browsers.Chrome {

	public LoginPageObj() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "login")
	public WebElement LoginButton;

	@FindBy(css = "div.lcolumn>h3")
	public WebElement LoginPageHeading;

	@FindBy(id = "reg-lbx-email-page")
	public WebElement usernameField;

	@FindBy(id = "reg-lbx-password-page")
	public WebElement passwordField;

	@FindBy(css = "button[type='submit']")
	public WebElement submitButton;

	@FindBy(css = "#logout_comp>li>a")
	public WebElement MyProfileButton;

	@FindBy(id = "logout")
	public WebElement LogoutButton;

}
