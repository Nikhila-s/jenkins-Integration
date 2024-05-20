package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;

	public File file;
	public FileInputStream fis;
	public Properties config;
	 
	public void browserURLLaunch() throws IOException{

		
			file=new File("configs//config.properties");
			fis =new FileInputStream(file);
			config=new Properties();
			config.load(fis);
		

	try{
//			String browserName=config.getProperty("browser");
		String browserName=System.getProperty("browser");
		
			if(browserName.equalsIgnoreCase("Chrome")) {
				 
				WebDriverManager.chromedriver().setup();

	              driver=new ChromeDriver();
	              
	         	}
			else if(browserName.equalsIgnoreCase("Firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
				driver =new FirefoxDriver();
			
			}else if(browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				
				driver =new EdgeDriver();
			}
			
			 System.out.println("Base class");

			driver.manage().window().maximize();
			
//			driver.get(config.getProperty("url"));
			driver.get(System.getProperty("url"));
			//return driver;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	 }
	
}
