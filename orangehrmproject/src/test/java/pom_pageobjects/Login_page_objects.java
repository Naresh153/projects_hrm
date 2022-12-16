package pom_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page_objects 
{
	@FindBy(id="btnLogin")
	public static WebElement login;
}
