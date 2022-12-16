package testng_packages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import commonfunction.Initialization_class;

public class Testcases_AdminUsers extends Initialization_class
{
	public static Logger logger=Logger.getLogger(Testcases_AdminUsers.class);
		public void usermodule() 
		{ 
		 Actions action= new Actions(driver);
		 action.moveToElement(pom_pageobjects.AdminUser_page_objects.Admintext);
		 action.moveToElement(pom_pageobjects.AdminUser_page_objects.usermanagementtext);
		 action.moveToElement(pom_pageobjects.AdminUser_page_objects.userslink).click();
		 action.build().perform();	
		 logger.info("entered into user module");
		 test.log(Status.INFO, "entered into user module");
		}
		public void dropdowns() 
		{
			test.log(Status.INFO, "selecting elements from dropdown");
			Select select=new Select(pom_pageobjects.AdminUser_page_objects.userrole);
			select.selectByIndex(1);
			logger.info("user role selected");
			Select select1=new Select(pom_pageobjects.AdminUser_page_objects.userstatus);
			select1.selectByIndex(1);
			logger.info("status enbabled");
			pom_pageobjects.AdminUser_page_objects.search.click();
			logger.info("search button clicked");
			
		}
		public void resulttable() throws IOException
		{
			test.log(Status.INFO, "verifiying whether the selected elements are sorted in table");
			String status1=pom_pageobjects.AdminUser_page_objects.userroleintable.getText();
			//Assert.assertEquals(status1,"Admin");
			  if(status1.equals("Admin")) 
			  { 
			  TakesScreenshot ss=(TakesScreenshot) driver; 
			  File source=ss.getScreenshotAs(OutputType.FILE); 
			  File destination=new File("C:\\Users\\krgpo\\Pictures\\userpage.png"); 
			  FileUtils.copyFile(source,destination);
			   } 
			  else 
			  { 
				  System.out.println("fail"); 
			  }
			 
			String status2=pom_pageobjects.AdminUser_page_objects.userstatusintable.getText();
			Assert.assertEquals(status2,"Enabled");
			logger.info("status is checked");
			
		}
	@Test
	 public void userdetails() throws IOException 
	 {   
		 test=reports.createTest("USER PAGE");
		 PageFactory.initElements(driver, pom_pageobjects.AdminUser_page_objects.class);
		 usermodule();
		 dropdowns();
		 resulttable();
	 }

}
