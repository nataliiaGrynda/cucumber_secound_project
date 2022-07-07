package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ListOfAllOrdersPage {
  public ListOfAllOrdersPage(WebDriver driver){
    PageFactory.initElements(driver, this);
  }

@FindBy(xpath = "//ul[@id='ctl00_menu']//a")
  public List<WebElement> webOrdersButtons;

@FindBy(id = "ctl00_MainContent_btnCheckAll")
  public WebElement checkAllButton;

@FindBy(id = "ctl00_MainContent_btnUncheckAll")
  public WebElement uncheckAllButton;

@FindBy(xpath = "//table[@id=\'ctl00_MainContent_orderGrid\']//tr//td[1]//input")
  public List<WebElement> checkBoxes;

}
