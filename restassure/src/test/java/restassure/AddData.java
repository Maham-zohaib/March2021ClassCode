package restassure;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import Base.Reuseable_code;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AddData extends Reuseable_code {

	
	
	@Test(priority = 1)
	public void AddData_01() {
		
		
		sURL = sHost + sURI_AddData ;
		
		Map<String, String> map = new HashMap();
		map.put("token", sToken);
		RestAssured.baseURI = sURL ;
		Response res = RestAssured.given().contentType("application/json").headers(map).body("{\"accountno\": \"TA-4440098\", \"departmentno\": \"4\", \"salary\": \"4448\", \"pincode\": \"366778\"}").post();
		System.out.println(res.statusCode());
		res.prettyPrint();
		
	}
	
	
	
	
	
	
	
	
}
