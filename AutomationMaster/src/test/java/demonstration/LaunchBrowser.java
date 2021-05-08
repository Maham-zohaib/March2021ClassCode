package demonstration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		//Old way of launching web browser
		
		//we called "WebDriver" interface with obj reference "driver"
		WebDriver driver;
		
		//setting path to chrome driver executable file  
		System.setProperty("webdriver.chrome.driver", "/Users/Maham/Downloads/chromedriver.exe");

		//creating new object to launch chrome browser
		driver = new ChromeDriver();
		
		//launching a website on chrome browser
		driver.get("https://google.com");
	}

}
