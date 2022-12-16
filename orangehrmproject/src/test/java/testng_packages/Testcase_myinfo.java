package testng_packages;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonfunction.Initialization_class;
import pom_pageobjects.Myinfo_page_objects;

public class Testcase_myinfo extends Initialization_class
{
@Test
public void imageupload() throws IOException, InterruptedException 
{
	test=reports.createTest("my info page");
	PageFactory.initElements(driver,pom_pageobjects.Myinfo_page_objects.class);
	Myinfo_page_objects.myinfo.click();
	Myinfo_page_objects.clickimage.click();
	Actions action=new Actions(driver);
	action.moveToElement(pom_pageobjects.Myinfo_page_objects.clickchoosefile).click().build().perform();
	Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\krgpo\\Pictures\\lioninkingdom.exe");
	Thread.sleep(5000);
	Myinfo_page_objects.clickupload.click();
	test.log(Status.INFO,"image uploaded succesfully");
	}
}
