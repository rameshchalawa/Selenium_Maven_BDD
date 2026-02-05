package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitHelper;

public class LoginPage {

	public WebDriver ldriver;
	
	WaitHelper waithelper;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper = new WaitHelper(ldriver);
	}
	
	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement lnkLogout;
	
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		waithelper.WaitForElement(btnLogin, Duration.ofSeconds(30));
		btnLogin.click();
		
	}

	public void clickLogout() {
		waithelper.WaitForElement(lnkLogout, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click();", lnkLogout);
	}
	
}