package pom_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_page_objects 
{
	@FindBy(xpath = "//div[@id='task-list-group-panel-menu_holder']//following::td[1]")
	public static WebElement leaverequest;
}
