package commonfunction;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.orangehrm_utilities.Read_config;



public class Initialization_class 
{
	Read_config readconfig=new Read_config();
	public String  browser=readconfig. getbrowsername();
	public String location=readconfig.getlocation();
	public String url=readconfig.geturl();
	public static Logger logger=Logger.getLogger(Initialization_class.class);
	public static WebDriver driver;
    public ExtentHtmlReporter htmlreporter;
    public ExtentReports reports;
    public ExtentTest test;
public  void intialization() 
{
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", location);
		driver=new ChromeDriver();
		logger.info("chrome gets launched");
	}
	else if (browser.equalsIgnoreCase("firefox")) 
	{
		System.setProperty("webdriver.gekho.driver",location);
		driver=new FirefoxDriver();	
		logger.info("firfox gets launched");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
}
