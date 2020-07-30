package APITesting;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestEmployees {
	public static void main(String[] args) {
		
		 RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		  RequestSpecification request= RestAssured.given();
		  
		  JSONObject requestparams=new JSONObject();
		  requestparams.put("name", "anu");
		  requestparams.put("salary", "5000");
		  requestparams.put("age", "25");
		  
		  request.header("Content-Type","application/json");
		  
		  request.body(requestparams.toString());
		  
		 Response response= request.request(Method.POST, "/create");
		  
		// Response response= request.request(Method.GET, "/employees");
		 String responsebody=response.getBody().asString();
		 System.out.println(responsebody);

		 System.out.println(response.getStatusCode());
		 System.out.println(response.getStatusLine());
}
}
