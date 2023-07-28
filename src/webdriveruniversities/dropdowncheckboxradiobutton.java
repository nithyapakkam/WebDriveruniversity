package webdriveruniversities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowncheckboxradiobutton {

	public static void main(String[] args) {
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().maximize();
		
		//Drop down menu
		 
		Select dropskills1= new Select(driver.findElement(By.id("dropdowm-menu-1")));
		dropskills1.selectByVisibleText("SQL");
		
		Select dropskills2= new Select(driver.findElement(By.id("dropdowm-menu-2")));
		dropskills2.selectByVisibleText("Eclipse");
		Select dropskills3= new Select(driver.findElement(By.id("dropdowm-menu-3")));
		dropskills3.selectByVisibleText("CSS");
		
		//checkbox
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]/input"));
		checkbox.click();
		
		//RadioButton
		WebElement radiobutton = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[5]"));
		 radiobutton .sendKeys("purple");
		 radiobutton.click();
		 
		 //selected and disables
		 WebElement selected = driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
		selected .sendKeys("lettuce");
		 selected.click();
		 Select fruits= new Select(driver.findElement(By.id("fruit-selects")));
			fruits.selectByVisibleText("Apple");
		
	}

}
