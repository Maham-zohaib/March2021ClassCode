package restassure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

public class Sirinidhi_Login_Code {
//URL = Host + URI
	String sHost ="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
	String sURI_Login ="/login";
	String sURI_GetData ="/getdata";
	String sURL = null;
	String sToken;
	//steps to add for api testing
	//1--> set URL
	//2--> Header
	//3--> Body
	//4--> Method
	
	
	 
	@Test
	public void loginAPI(){
		sURL = sHost + sURI_Login ;
		RestAssured.baseURI = sURL ;
		Response res =RestAssured.given().contentType("application/json").body("{\"username\": \"maham.sappal@yahoo.com\", \"password\": \"maham123\"}").post();	
	System.out.println(res.asString());
	System.out.println(res.statusCode());
	res.prettyPrint();
	System.out.println(res.jsonPath().getString("token").toString());
	System.out.println(res.jsonPath().getString("token[0]"));
	sToken = res.jsonPath().getString("token[0]");
	}

	@BeforeMethod
	public void Clear_URL() {
		sURL = null;
	}
	
	@Test
	public void getData() {
		sURL = sHost + sURI_GetData ;
		
		Map<String, String> map = new HashMap();
		map.put("token", sToken);
		
		RestAssured.baseURI = sURL ;
		Response res =RestAssured.given().contentType("application/json").headers(map).get();
		System.out.println(res.asString());
		System.out.println(res.statusCode());
		res.prettyPrint();
		System.out.println(res.jsonPath().getString("accountno").toString());
		System.out.println(res.jsonPath().getString("accountno[0]"));
		List<Object> liAcc = res.jsonPath().getList("accountno");
		for(Object s: liAcc) {
			System.out.println(s);
		}
		
	}
	
}
