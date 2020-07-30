package APITesting;

import org.json.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
  RequestSpecification request= RestAssured.given();
  
 Response response= request.request(Method.GET, "/hyderabad");
 String responsebody=response.getBody().asString();

 System.out.println(response.getStatusCode());
 System.out.println(response.getStatusLine());

 System.out.println(responsebody);
 Assert.assertEquals(responsebody.contains("Hyd"), true);////to check hyderabd is in body or not
 //validate json body in get method type
 
 //To print all the values using key
JsonPath jsonpath=response.jsonPath();
System.out.println(jsonpath.get("City"));
	}

}
