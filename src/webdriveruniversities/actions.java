package webdriveruniversities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actions {

	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		driver.manage().window().maximize();
		

	}

}
