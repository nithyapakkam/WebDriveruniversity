package webdriveruniversities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginportal {

	public static void main(String[] args) {
		
		
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().maximize();
		WebElement loginportal=driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]"));
		loginportal.click();
		//username
		WebElement username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
		username.sendKeys("nithya");
		 //Password
		 WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 Password.sendKeys("dev12");
		 WebElement loginbutton =driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		 loginbutton.click();
		 
	

	}

}
