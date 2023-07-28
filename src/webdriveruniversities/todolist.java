package webdriveruniversities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class todolist {

	public static void main(String[] args) {

		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().maximize();
		WebElement todolist =driver.findElement(By.xpath("//*[@id=\"to-do-list\"]/div/div[1]/h1"));
		todolist.click();
		WebElement plusicon=driver.findElement(By.xpath("//*[@id=\"plus-icon\"]"));
		plusicon.click();
		
	}

}
