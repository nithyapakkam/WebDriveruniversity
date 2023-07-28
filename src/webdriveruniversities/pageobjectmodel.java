package webdriveruniversities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageobjectmodel {

	public static void main(String[] args) {

		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().maximize();
		WebElement pageobjectmodel = driver.findElement(By.xpath("//*[@id=\"page-object-model\"]/div/div[1]"));
		pageobjectmodel.click();
	}

}
