
package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;

public class LoginTest extends BaseClass  {
	
//	File file;
//	FileInputStream fis;
//	Properties config;
//	
	@BeforeMethod
	public void setup() throws IOException {
		 System.out.println("Setup !!");
//		file=new File("configs//config.properties");
//		fis=new FileInputStream(file);
//		config.load(fis);
		browserURLLaunch();
	}
  @Test
  public void loginTest() {
	  System.out.println("Login Test");
  }
  
  @AfterMethod
  public void teardown() {
	  System.out.println("Tear down!!");
	  driver.quit();
  }
}
