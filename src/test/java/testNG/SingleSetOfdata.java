package testNG;

import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SingleSetOfdata {
	
		
		@Test
	
		public void singlesetempdetails() {
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RequestSpecification httprequest=RestAssured.given();
		
		JSONObject ob=new JSONObject();
		ob.put("name", "anu");
		ob.put("age", "20");
		ob.put("sal", "5000");
		ob.put("phone", "957842611");
		System.out.println(ob.toString());
		httprequest.body(ob.toString());
		Response response=httprequest.request(Method.POST,"/create");
		
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		}
		
		
	
		
		
		
}
