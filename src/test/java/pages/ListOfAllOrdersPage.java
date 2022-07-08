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

@FindBy(css = "ul[id='ctl00_menu']>li>a")
  public List<WebElement> webOrdersMenu;

@FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
  public WebElement familyAlbumDropdown;

@FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
  public WebElement quantityInputBox;

@FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
  public WebElement customerNameInputBox;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
  public WebElement streetInputBox;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
  public WebElement cityInputBox;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
  public WebElement stateInputBox;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
  public WebElement zipInputBox;

@FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_0")
  public WebElement cardInformation;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
  public WebElement cardNumberInputBox;

@FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
  public WebElement expireInputBox;

@FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
  public WebElement processButton;

@FindBy(linkText = "View all orders")
  public WebElement viewAllOrdersButton;

@FindBy(xpath = "//table[@class='SampleTable']/tbody/tr[2]/td")
  public List<WebElement> listOfAllMyOrders;

@FindBy(css = "#ctl00_MainContent_btnDelete")
  public WebElement deleteSelectedButton;

@FindBy(css = " table[id='ctl00_MainContent_orderGrid'] tbody tr td:nth-child(1)> input")
  public List<WebElement> listOfOrdersCheckBoxes;

@FindBy(css = "#ctl00_MainContent_orderMessage")
  public WebElement listOfOrdersIsEmptyMessage;



}
