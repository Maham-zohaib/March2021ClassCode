package demonstration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locaters_To_Find_WebElement {

	public static void main(String[] args) {
		//
		
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		
		
		
	}

}
