package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearSoftwareLogInPage {

public SmartBearSoftwareLogInPage(WebDriver driver){
  PageFactory.initElements(driver, this);
}
@FindBy(id = "ctl00_MainContent_username")
  public WebElement usernameInputBox;

@FindBy(id = "ctl00_MainContent_password")
public WebElement passwordInputBox;

@FindBy(id = "ctl00_MainContent_login_button")
public WebElement loginButton;

@FindBy(xpath = "//span[@class='error']/..")
  public WebElement errorMessage;



}
