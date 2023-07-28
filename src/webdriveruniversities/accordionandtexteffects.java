package webdriveruniversities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class accordionandtexteffects {

	public static void main(String[] args) {

		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		
		driver.manage().window().maximize();
		WebElement manualtesting = driver.findElement(By.id("manual-testing-accordion"));
		 manualtesting .click();
		 WebElement CucumberBDD =driver.findElement(By.id("cucumber-accordion"));
		 CucumberBDD .click();
		 WebElement Automationtesting= driver.findElement(By.id("automation-accordion"));
		 Automationtesting.click();
		 WebElement Keepclicking = driver.findElement(By.id("click- accordion"));
		 Keepclicking.click();
		 
	}

}
