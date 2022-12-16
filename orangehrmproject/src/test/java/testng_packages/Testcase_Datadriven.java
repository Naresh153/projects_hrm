package testng_packages;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import commonfunction.Initialization_class;
import datadrivenpackage.Datadriven_class;

public class Testcase_Datadriven extends Initialization_class 
{
	public static Logger logger=Logger.getLogger(Testcase_Datadriven.class);
	@BeforeSuite
	public void launchbrowser() throws IOException 
	{
		PropertyConfigurator.configure("log4j.properties");
		htmlreporter=new ExtentHtmlReporter("naresh.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlreporter);
		intialization();
		
	}
	@Test(dataProvider = "dp")
	public void login(String uname,String pass) 
	{
		test=reports.createTest("login the HRM");
  		driver.get("https://opensource-demo.orangehrmlive.com");
        test.log(Status.INFO,"website launched");
		logger.info("orange hrm gets launched");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		logger.info("login done");
	}
	@DataProvider(name = "dp")
	public Object[][] getcellvalue() throws IOException {
		Datadriven_class value=new Datadriven_class ();
		value.datasheet("C:\\Users\\krgpo\\Desktop\\OrangeHRMLogin.xlsx");
		int rowno=value.rowcount(0);
		Object[][] data=new Object[rowno][2];
		for(int i=0; i<rowno; i++) {
			data[i][0]=value.getcelldata(0, i, 0);
			data[i][1]=value.getcelldata(0, i, 1);	
		}return data;
	}
	@AfterSuite
	public void driverclose() 
	{
		//driver.quit();
		logger.info("browser gets closed");
		reports.flush();
	}
}
