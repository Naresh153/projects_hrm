package pom_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myinfo_page_objects 
{
  @FindBy(xpath ="//b[text()='My Info']")
  public static WebElement myinfo;
  @FindBy(id="empPic")
  public static WebElement clickimage;
  @FindBy(xpath ="//input[contains(@id,'photofile')]")
  public static WebElement clickchoosefile;
  @FindBy(id="btnSave")
  public static WebElement clickupload;
}
