package PersonalPactice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OneDrive_LogIn {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://onedrive.live.com/about/en-us/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Sign_in = driver.findElement(By.xpath("//*[@id='site-nav']/div/nav/ul[2]/li[3]/a"));
		Sign_in.click();
		WebElement UserName = driver.findElement(By.xpath("//*[@id='messagePanel-0']/div/form/input[1]"));
		UserName.sendKeys("shanto191183@gmail.com");
		WebElement Next = driver.findElement(By.xpath("//*[@id='messagePanel-0']/a"));
		Next.click();
		
		
		WebElement Password = driver.findElement(By.xpath("//*[@id='i0118']"));
		Password.sendKeys("Zaman5213");
		WebElement Sign_In = driver.findElement(By.xpath("//*[@id='idSIButton9']"));
		Sign_In.click();


	}

}
