package PersonalPactice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Box_Customer_LogIn {

	public static void main(String[] args) {
	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://app.box.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement UserName = driver.findElement(By.id("login"));
		//UserName.sendKeys("shanto191183@gmail.com");
		//UserName.sendKeys("mdszaman83@gmail.com");
		UserName.sendKeys("2automationremoteschool@gmail.com");
		
		
		

		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("01716593313");
		WebElement LogIn = driver.findElement(By.id("continue"));
		LogIn.click();
		
		
		
		
		

	}

}
