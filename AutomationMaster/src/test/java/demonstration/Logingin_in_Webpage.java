package demonstration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logingin_in_Webpage {
	

	public static void main(String[] args) {
		
		//first launching a webpage and then logging in into a web page throught automation
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://qa-tekarch.firebaseapp.com/");
		
		
		//now logging in by giving username and password
		
		WebElement username = driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
		
		WebElement psw = driver.findElement(By.id("password_field"));
		psw.sendKeys("admin123");
	}

}
