package testcasesNG;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import base.BaseTest;
import utilities.CommenUtilities;


public class VerifyLoginFunctionality extends BaseTest{

	
	SoftAssert sa = new SoftAssert();
	
	
	@BeforeMethod
	public void CreateReport(Method sTestMethod) {
		test = extent.createTest(sTestMethod.getName());
	}
	
	@AfterMethod
	public void CloseReport() throws InterruptedException {
		Thread.sleep(4000);
	driver.close();
		
	}
	
	
	@Test
	public void VerifyLoginErrorMsg01() throws IOException, InterruptedException {
		//-------------//
		driver=getDriver("chrome");
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);
		
		//----------------//
		WebElement sUserName = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("we.username.xpath")));
	if(	oCommonUtilities.waitForElementVisible(sUserName))
		sUserName.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
	sa.assertNotNull(sUserName.getText(), "maham.mar21@abc.com");
	test.info("Username is Entered");
	Thread.sleep(5000);
	//----------------//
	WebElement sPassword = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("we.password.xpath")));
	if(	oCommonUtilities.waitForElementVisible(sPassword)) {
		sPassword.clear();
		test.info("password is empty");
	}
		//sPassword.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
	sa.assertEquals(sPassword.getText(),"");
	
	
	//-----------------//
	WebElement sLoginButton = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("we.login.xpath")));
	if(	oCommonUtilities.waitForElementVisible(sLoginButton))
		sLoginButton.click();
	
	
	//--------------//
	WebElement sErrorMsg = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("we.errormsg.xpath")));
	sa.assertEquals(sErrorMsg.getText(),oDataUtils.ReadWebElementProperties("login.errormsg"));
	
	sa.assertAll();
	if(sErrorMsg.getText().equals(oDataUtils.ReadWebElementProperties("login.errormsg"))) {

		test.pass("TC01 Passed");
	} else {
		test.addScreenCaptureFromPath(oCommonUtilities.takeScreenshot());
		test.fail("TC01 FAILED");
	}

}
	@Test
	public void VerifyLoginErrorMsg02(Method mName) throws IOException, InterruptedException {
		//-------------//
		driver=getDriver("chrome");
		driver.get(oDataUtils.ReadWebElementProperties("App.URL"));
		sa.assertEquals(driver.getTitle(), "Login | Salesforce");
		test.info("Application is launched");
		Thread.sleep(4000);
		
		//----------------//
		WebElement sUserName = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("we.username.xpath")));
	if(	oCommonUtilities.waitForElementVisible(sUserName))
		sUserName.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.name"));
	sa.assertNotNull(sUserName.getText(), "maham.mar21@abc.com");
	test.info("Username is Entered");
	Thread.sleep(5000);
	//----------------//
	WebElement sPassword = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("we.password.xpath")));
	if(	oCommonUtilities.waitForElementVisible(sPassword)) {
		sPassword.sendKeys(oDataUtils.ReadAccountProperties("prodaccount.password"));
		sa.assertNotNull(sPassword.getText(), "Haider123!");
		test.info("password is entered");
	}
		
	
	
	
	//-----------------//
	WebElement sLoginButton = driver.findElement(By.xpath(oDataUtils.ReadWebElementProperties("we.login.xpath")));
	if(	oCommonUtilities.waitForElementVisible(sLoginButton))
		sLoginButton.click();
	
	
	//--------------//
	sa.assertEquals(driver.getCurrentUrl(), oDataUtils.ReadPageURLproperties("Salesforce.HomePage"));
	if (driver.getCurrentUrl().equals(oDataUtils.ReadPageURLproperties("Salesforce.HomePage"))) {

		test.pass(mName.getName()+" PASSED");
	} else {
		test.addScreenCaptureFromPath(oCommonUtilities.takeScreenshot());
		test.fail(mName.getName()+"TC02 FAILED");
	}
	sa.assertAll();
}
}