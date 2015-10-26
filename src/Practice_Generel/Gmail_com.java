package Practice_Generel;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Gmail_com {
	
public static String decode(String encodedPassword){   //Return type is String  //this is the one of the method is created 
		
		byte[] valueDecoded= Base64.decodeBase64(encodedPassword );
		return new String(valueDecoded);
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		   /*
	       // encode data on your side using BASE64
			byte[]   bytesEncoded = Base64.encodeBase64("01716593313" .getBytes());
			System.out.println("ecncoded value is " + new String(bytesEncoded ));

			// Decode data on other side, by processing encoded data
			byte[] valueDecoded= Base64.decodeBase64(bytesEncoded );
			System.out.println("Decoded value is " + new String(valueDecoded));
			*/
		
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://gmail.com");
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Gmail = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		Gmail.click();
		
		WebElement Sign_in = driver.findElement(By.xpath("//*[@id='gmail-sign-in']"));
		Sign_in.click();
		
		WebElement EnterYourEmail = driver.findElement(By.xpath("//*[@id='Email']"));
		//EnterYourEmail.sendKeys("2automationremoteschool@gmail.com");
		//EnterYourEmail.sendKeys("shanto191183@gmail.com");
		//EnterYourEmail.sendKeys("mdszaman83@gmail.com");
		//EnterYourEmail.sendKeys("mshahnewaz1@gmail.com");
		//EnterYourEmail.sendKeys("md83shahnewaz@gmail.com");
		//EnterYourEmail.sendKeys("tareque979@gmail.com");

		
		
		WebElement Next1 = driver.findElement(By.xpath("//*[@id='next']"));
		Next1.click();
		
		WebElement Password = driver.findElement(By.xpath("//*[@id='Passwd']"));
		Password.sendKeys(decode("MDE3MTY1OTMzMTM="));
		//Password.sendKeys(decode("Hir123456"));
		//Password.sendKeys("Shama@1981");
		
		//System.out.println(decode("MDE3MTY1OTMzMTM="));
		
		WebElement Next2 = driver.findElement(By.xpath("//*[@id='signIn']"));
		Next2.click();
		
		WebElement Dynamic_Inbox = driver.findElement(By.xpath("//*[contains(@title,'Inbox')]"));
		Dynamic_Inbox.click();
		
		
		
		
		//driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		//driver.quit();
		

	}

}
