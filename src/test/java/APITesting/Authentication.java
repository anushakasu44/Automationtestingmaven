package APITesting;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckForAuthentication";
		  
		 //for setting authenticationusername and password
		  PreemptiveBasicAuthScheme auth=new PreemptiveBasicAuthScheme();
		  auth.setUserName("ToolsQA");
		  auth.setPassword("TestPassword");
		  RestAssured.authentication=auth;
		  
		  RequestSpecification request= RestAssured.given();
		  
		 Response response= request.request(Method.GET, "/");
		 
		 String responsebody=response.getBody().asString();
                  System.out.println(responsebody);

		 System.out.println(response.getStatusCode());
		 
		 JsonPath jp=response.jsonPath();
		 System.out.println(jp.get("FaultId"));
		 

	}

}
