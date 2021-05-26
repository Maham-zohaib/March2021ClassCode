package restassure;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Login {

	
	

	
	@Test(priority = 1)
	public void Login_01() {
		
		// only username entered
		String sURL = ("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login") ;
		
		RestAssured.baseURI = sURL;
		
		Response res = RestAssured.given().contentType("application/json").body("{\"username\": \"maham.sappal@yahoo.com\"}").post().then().extract().response();
		
		System.out.println(res.statusCode());
		res.prettyPrint();
		
		
	}
	
	
	
	
	
	@Test(priority = 2)
	public void Login_02() {
		
		// wronge password entered
		String sURL = ("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login") ;
		
		RestAssured.baseURI = sURL;
		
		Response res = RestAssured.given().contentType("application/json").body("{\\\"username\\\": \\\"maham.sappal@yahoo.com\\\", \\\"password\\\": \\\"Haider123\\\"}").post().then().extract().response();
		
		System.out.println(res.statusCode());
		res.prettyPrint();
		
		
	}
	
	
	@Test(priority = 3)
	public void Login_03() {
		
		// right username and password entered
		String sURL = ("https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net/login") ;
		
		RestAssured.baseURI = sURL;
		
		Response res = RestAssured.given().contentType("application/json").body("{\\\"username\\\": \\\"maham.sappal@yahoo.com\\\", \\\"password\\\": \\\"maham123\\\"}").post().then().extract().response();
		
		System.out.println(res.statusCode());
		res.prettyPrint();
		
		
	}
	
}
