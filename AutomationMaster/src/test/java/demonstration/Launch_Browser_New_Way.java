package demonstration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser_New_Way {

	public static void main(String[] args) {
		//way two to launch all types of browsers without downloading specific browser driver executable
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://target.com");
		
		

	}

}
