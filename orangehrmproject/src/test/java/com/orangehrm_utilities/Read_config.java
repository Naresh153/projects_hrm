package com.orangehrm_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_config 
{
	public static Properties properties;
	public Read_config() 
	{
		File f=new File("OR.properties");
		try {
			FileInputStream stream=new FileInputStream(f);
		    properties=new Properties();
			properties.load(stream);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
	    }
  }
	public String getbrowsername() {
		String bname=properties.getProperty("browser");
		return bname;
	}
	public String getlocation() 
	{
		String bl=properties.getProperty("location");
		return bl;
	}
	public String geturl() {
		String webgurl=properties.getProperty("url");
		return webgurl;
	}
}