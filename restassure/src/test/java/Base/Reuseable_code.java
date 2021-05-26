package Base;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Reuseable_code {

	public static String sHost ="https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
	public static String sURI_Login ="/login";
	public static String sURI_GetData ="/getdata";
	public static String sURI_AddData ="/addData";
	public static String sURI_UpdateData ="/updateData";
	public static String sURI_DeleteData ="/deleteData";
	public static String sURI_Logout ="/logout";
	public static String sURL = null;
	
	
	
    public static String sToken, sId, sUserid;
   public static String sGetFirstData;
   
   
 
	
   
   @BeforeSuite
   public void loginAPI(){
		sURL = sHost + sURI_Login ;
		RestAssured.baseURI = sURL ;
		Response res =RestAssured.given().contentType("application/json").body("{\"username\": \"maham.sappal@yahoo.com\", \"password\": \"maham123\"}").post();	
	System.out.println(res.statusCode());
	res.prettyPrint();
	System.out.println(res.jsonPath().getString("token[0]"));
	sToken = res.jsonPath().getString("token[0]");
	}
	


	
}
