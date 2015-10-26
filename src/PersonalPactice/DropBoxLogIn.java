package PersonalPactice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DropBoxLogIn {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.dropbox.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement Sign_in = driver.findElement(By.xpath("//*[@id='sign-in']"));
		Sign_in.click();
	
		Set<String> Winids = driver.getWindowHandles();
		//Iterator<String> iterate = Winids.iterator();
		System.out.println(Winids);
		
		//driver.switchTo().window("[{7cea37ea-d766-4d8c-9dc4-707286d0e707}]");
		
		
		
		
		
		WebElement UserName = driver.findElement(By.id("pyxl1513"));
		UserName.sendKeys("shanto191183@gmail.com");

		
		WebElement Password = driver.findElement(By.id("pyxl1516"));
		Password.sendKeys("01716593313");
		WebElement Sign_In = driver.findElement(By.xpath("//*[@id='regular-login-forms']/form[1]/div[3]/button]"));
		Sign_In.click();

		
		
		
		
		
		

	}

}
