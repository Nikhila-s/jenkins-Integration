package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(name="username")
	WebElement userName;
	
	
	@FindBy(name="password")
	WebElement password;
	
	
	@FindBy(css="button[type='submit']")
	WebElement submit;
	

	
	public void login(String username,String Password) throws InterruptedException, IOException {
		

//		file=new File("Config//config.properties");
//		fis =new FileInputStream(file);
//		prop.load(fis);
		
		Thread.sleep(2000);
		userName.sendKeys(username);
		
		password.sendKeys(Password);
		
		Thread.sleep(1000);
		submit.click();
	
	}

}
