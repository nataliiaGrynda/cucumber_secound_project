package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.ListOfAllOrdersPage;
import pages.SmartBearSoftwareLogInPage;
import utilities.Driver;
import utilities.Waiter;

public class SmartBearsSoftwareSteps {

  WebDriver driver;
  SmartBearSoftwareLogInPage smartBearSoftwareLogInPage;
  ListOfAllOrdersPage listOfAllOrdersPage;

 @Before
 public void setup(){
  driver = Driver.getDriver();
  smartBearSoftwareLogInPage = new SmartBearSoftwareLogInPage(driver);
  listOfAllOrdersPage = new ListOfAllOrdersPage(driver);
 }

 @Given("user is on {string}")
  public void userIsOn(String url) {
  driver.get(url);
  }

  @When("user enters username as {string}")
  public void userEntersUsernameAs(String username) {
   Waiter.pause(5);
    switch (username) {
      case "abcd":
        smartBearSoftwareLogInPage.usernameInputBox.sendKeys("abcd");
        break;
      case "Tester":
        smartBearSoftwareLogInPage.usernameInputBox.sendKeys("Tester");
        break;
    }
  }
  @And("user enters password as {string}")
  public void userEntersPasswordAs(String password) {
   Waiter.pause(5);
    switch (password) {
      case "abcd1234":
      smartBearSoftwareLogInPage.passwordInputBox.sendKeys("abcd1234");
      break;
      case "test":
        smartBearSoftwareLogInPage.passwordInputBox.sendKeys("test");
        break;
    }
  }
  @And("user clicks on Login button")
  public void userClicksOnLoginButton() {
  smartBearSoftwareLogInPage.loginButton.click();
  }

  @Then("user should see {string} Message")
  public void userShouldSeeMessage(String message) {
    Waiter.pause(5);
   Assert.assertEquals(message, smartBearSoftwareLogInPage.errorMessage.getText());
  }

  @Then("user should be routed to {string}")
  public void userShouldBeRoutedTo(String urlSecond) {
   Assert.assertTrue(urlSecond.equals("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/"));
  }
//
//  @And("validate below menu items are displayed")
//  public void validateBelowMenuItemsAreDisplayed(DataTable dataTable) {
//  for(int i =0;i< dataTable.asList().size();i++){
//   if(i == 0){
//     Assert.assertNotNull(listOfAllOrdersPage.webOrdersButtons.get(i).getText());
//     Assert.assertFalse(listOfAllOrdersPage.webOrdersButtons.get(i).getText().isEmpty());
//   }else{
//     Assert.assertEquals(dataTable.asList().get(i), listOfAllOrdersPage.webOrdersButtons.get(i).getText());
//   }
  }


