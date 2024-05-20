
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
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;

public class LoginTest extends BaseClass  {
	
	File file;
	FileInputStream fis;
	Properties config;
//	
	@BeforeMethod
	
	public void setup() throws IOException {
		 System.out.println("Setup !!");
//		file=new File("configs//config.properties");
//		fis=new FileInputStream(file);
//		config.load(fis);
		browserURLLaunch();
	}
	
	@Ignore
  @Test(enabled=false)
  @Parameters({ "userName","password"})
  public void loginTest(String userName,String password ) throws InterruptedException, IOException {
	  System.out.println("Login Test");
	  LoginPage lp=new LoginPage(driver);
	  lp.login(userName, password);
	  
  }
  
  @Test
  public void loginTest() throws InterruptedException, IOException {
		file=new File("configs//config.properties");
		fis =new FileInputStream(file);
		config=new Properties();
		config.load(fis);
		
	  System.out.println("Login Test");
	  LoginPage lp=new LoginPage(driver);
//	  lp.login(config.getProperty("username"),config.getProperty("password")); // from config property file
	  lp.login(System.getProperty("username"),System.getProperty("password"));  // from pom properties- using jenkins
  }
  
  @AfterMethod
  public void teardown() {
	  System.out.println("Tear down!!");
	  driver.quit();
  }
}
