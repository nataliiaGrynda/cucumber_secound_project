package pages;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class BaseSteps {
  WebDriver driver;

  @Before
  public void setup(){
    driver = Driver.getDriver();
  }
}
