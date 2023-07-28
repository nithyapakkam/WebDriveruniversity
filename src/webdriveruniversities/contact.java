package webdriveruniversities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact {

	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://webdriveruniversity.com/");
		
		driver.manage().window().maximize();
		
		//contactus
		WebElement contactus =driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1"));
		contactus.click();
		//firstname  
		WebElement firstname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		firstname.sendKeys("nithya");
        //lastname
		WebElement lastname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		lastname.sendKeys("sreejith");
		//Email
		WebElement email = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		email.sendKeys("dev@gmail.com");
		//comments
		WebElement comments = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		comments.sendKeys("welcome");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
		submit.click();
	
		
		
	}

}
