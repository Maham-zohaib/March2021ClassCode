package restassure;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import Base.Reuseable_code;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateData extends Reuseable_code {

	
	
	
	@Test(priority = 1)
	public void UpdateData_01() {
		
		sURL = sHost + sURI_UpdateData;
		
	Map<String, String> map= new HashMap();
	map.put("token", sToken);
		
		RestAssured.baseURI = sURL;
		Response res = RestAssured.given().contentType("application/json").headers(map).body("{\"accountno\": \"TA-3330098\", \"departmentno\": 4, \"salary\": 4544, \"pincode\": 466744, \"id\": \"QQDIiZ06cSRt9S0LS2bs\", \"userid\":\"8Z9CZ8L5lvQiuyxEbokN\" }").put();
		System.out.println(res.statusCode());
		res.prettyPrint();
		
	}
	
	
	
}
