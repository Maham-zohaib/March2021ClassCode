package restassure;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import Base.Reuseable_code;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteData extends Reuseable_code{

	
	

	@Test(priority = 1)
	public void DeleteData_01() {
		
		
		sURL = sHost + sURI_DeleteData;
		
		Map<String, String> map = new HashMap();
		map.put("token", sToken);
		RestAssured.baseURI = sURL ;
		Response res = RestAssured.given().contentType("application/json").headers(map).body("{\"id\": \"QJon51NJ0ShyXEV9iqyN\", \"userid\": \"8Z9CZ8L5lvQiuyxEbokN\"}").delete();
		System.out.println(res.statusCode());
		res.prettyPrint();
		
	}
	
	
	
	
	
	
	
	
	
}
