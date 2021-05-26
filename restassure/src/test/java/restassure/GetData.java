package restassure;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Reuseable_code;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class GetData extends Reuseable_code {

	
	 
	
	@Test(priority = 1)
	public void GetData_01() {
		sURL = sHost + sURI_GetData;
		
		Map<String, String> map = new HashMap();
		map.put("token", sToken);
		RestAssured.baseURI = sURL;
		Response res =RestAssured.given().contentType("application/json").headers(map).get();
		System.out.println(res.statusCode());
		res.prettyPrint();
		System.out.println(res.jsonPath().getString("[0]"));
	sGetFirstData = res.jsonPath().getString("[0]"); 
		
	}
	
	
	
}
