package webdriveruniversities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datatablesandbutton {

	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		
		driver.manage().window().maximize();
    //first name
		WebElement firstname =driver.findElement(By.xpath("//*[@id=\"form-textfield\"]/input[1]"));
		firstname.sendKeys("Harry");
		//lastname
		WebElement lastname =driver.findElement(By.xpath("//*[@id=\"form-textfield\"]/input[2]"));
		lastname.sendKeys("Porter");
		
		
		
		
		
		
		
		
	}

}
