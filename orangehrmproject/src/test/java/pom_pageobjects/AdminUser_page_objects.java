package pom_pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminUser_page_objects 
{
	@FindBy(xpath = "//*[text()='Admin']")
	public static WebElement Admintext;
	@FindBy(xpath = "//a[text()='User Management']")
	public static WebElement usermanagementtext;
	@FindBy(xpath ="//a[text()='Users']")
	public static WebElement userslink;
	@FindBy(xpath = "//select[@id='searchSystemUser_userType']")
	public static WebElement userrole;
	@FindBy(id="searchSystemUser_status")
	public static WebElement userstatus;
	@FindBy(id="searchBtn")
	public static WebElement search;
	@FindBy(xpath = "//tr[1]//td[3]")
	public static WebElement userroleintable;
	@FindBy(xpath = "//tr[1]//td[5]")
	public static WebElement userstatusintable;

}
