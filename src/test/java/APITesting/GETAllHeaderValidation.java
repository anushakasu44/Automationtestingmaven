package APITesting;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETAllHeaderValidation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		  RequestSpecification request= RestAssured.given();
		  
		 Response response= request.request(Method.GET, "/hyderabad");
		 String responsebody=response.getBody().asString();
		 System.out.println(responsebody);
		 
		 JsonPath jp=response.jsonPath();
		 System.out.println(jp.get("City"));
		 
		 
		String contenttype= response.header("Content-Type");//capture details of each content type header
		System.out.println(contenttype);
		Assert.assertEquals(contenttype, "application/json");

		Headers allheaders=response.headers(); //verify all the headers
		for(Header header:allheaders) {
			System.out.println(header.getName()+"     "+header.getValue());
		}
		
		
		
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getStatusLine());
}
}

