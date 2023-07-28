package webdriveruniversities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popups {

	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.manage().window().maximize();
		WebElement javascriptalert = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		javascriptalert.click();
		WebElement modalpopup = driver.findElement(By.xpath("//*[@id=\"button2\"]/p"));
		modalpopup.click();
		WebElement ajaxloader =driver.findElement(By.xpath("//*[@id=\"button3\"]/p"));
		ajaxloader.click();
		WebElement confirmbox =driver.findElement(By.xpath("//*[@id=\"button4\"]"));
		confirmbox.click();
		
		
	}

}
