package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ListOfAllOrdersPage;
import pages.SmartBearSoftwareLogInPage;
import utilities.Driver;
import utilities.DropDownHandler;
import utilities.Waiter;

import java.util.List;

public class SmartBearsSoftwareSteps {

  WebDriver driver;
  SmartBearSoftwareLogInPage smartBearSoftwareLogInPage;
  ListOfAllOrdersPage listOfAllOrdersPage;

  @Before
  public void setup() {
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

  @And("validate below menu items are displayed")
  public void validateBelowMenuItemsAreDisplayed(DataTable dataTable) {
    List<String> expectedText = dataTable.asList(String.class);
    for (int i = 0; i < expectedText.size(); i++) {
      Assert.assertEquals(expectedText.get(i), listOfAllOrdersPage.webOrdersButtons.get(i).getText());
    }
  }

  @When("user clicks on {string} button")
  public void userClicksOnButton(String checkButtons) {
  switch (checkButtons){
    case "checked":
      listOfAllOrdersPage.checkAllButton.click();
      break;
    case "unchecked":
      listOfAllOrdersPage.uncheckAllButton.click();
      break;
    case "Delete Selected":
      listOfAllOrdersPage.deleteSelectedButton.click();
  }
  }

  @Then("all rows should be checked")
  public void allRowsShouldBeChecked() {
    for(WebElement checkBox: listOfAllOrdersPage.checkBoxes){
Assert.assertFalse(checkBox.isSelected());
    }
  }

  @Then("all rows should be unchecked")
  public void allRowsShouldBeUnchecked() {
    for(WebElement checkBox: listOfAllOrdersPage.checkBoxes){
      Assert.assertFalse(checkBox.isSelected());
    }
  }

  @When("user clicks on {string} menu item")
  public void userClicksOnMenuItem(String ordersMenu) {
    switch (ordersMenu) {
      case "Orders":
        for (int i = 0; i < listOfAllOrdersPage.webOrdersMenu.size(); i++) {
          listOfAllOrdersPage.webOrdersMenu.get(i).click();
        }
        break;
      case "View all orders":
        listOfAllOrdersPage.viewAllOrdersButton.click();
         break;
    }
  }
  @And("user selects {string} as product")
  public void userSelectsAsProduct(String familyAlbum) {
    DropDownHandler.selectOptionByValue(listOfAllOrdersPage.familyAlbumDropdown, familyAlbum);
  }

  @And("user enters {int} as quantity")
  public void userEntersAsQuantity(int number) {
    listOfAllOrdersPage.quantityInputBox.sendKeys(String.valueOf(number));
  }

  @And("user enters all address information")
  public void userEntersAllAddressInformation() {
  listOfAllOrdersPage.customerNameInputBox.sendKeys("Nataliia Grynda");
  listOfAllOrdersPage.streetInputBox.sendKeys("6126 W Henderson St");
  listOfAllOrdersPage.cityInputBox.sendKeys("Chicago");
  listOfAllOrdersPage.stateInputBox.sendKeys("Illinois");
  listOfAllOrdersPage.zipInputBox.sendKeys("60634");
  }

  @And("user enters all payment information")
  public void userEntersAllPaymentInformation() {
    listOfAllOrdersPage.cardInformation.click();
    listOfAllOrdersPage.cardNumberInputBox.sendKeys("1234123456785678");
    listOfAllOrdersPage.expireInputBox.sendKeys("04/25");
    listOfAllOrdersPage.processButton.click();

  }

  @Then("user should see their order displayed in the {string} table")
  public void userShouldSeeTheirOrderDisplayedInTheTable(String myOrder) {
   for(int i = 0; i < listOfAllOrdersPage.listOfAllMyOrders.size();i++){
     Assert.assertEquals(myOrder, listOfAllOrdersPage.listOfAllMyOrders.get(i).isDisplayed());
   }
  }

  @And("validate all information entered displayed correct with the order")
  public void validateAllInformationEnteredDisplayedCorrectWithTheOrder(DataTable dataTable) {
  for(int i = 0; i < listOfAllOrdersPage.listOfAllMyOrders.size();i++ ){
    Assert.assertEquals(dataTable.asList().get(i), listOfAllOrdersPage.listOfAllMyOrders.get(i).getText());
  }
  }

  @Then("validate all orders are deleted from the {string}")
  public void validateAllOrdersAreDeletedFromThe(String allOrders) {
  Assert.assertNotNull(allOrders);

  }

  @And("validate user sees {string} Message")
  public void validateUserSeesMessage(String listOfOrdersIsEmpty) {
   Assert.assertEquals(listOfOrdersIsEmpty, listOfAllOrdersPage.listOfOrdersIsEmptyMessage.getText());
  }
}
