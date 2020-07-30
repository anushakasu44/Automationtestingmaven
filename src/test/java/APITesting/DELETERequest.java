package APITesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETERequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eid=12345;
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RequestSpecification request=RestAssured.given();
		
		//add a header stating that the request body is Json//
		request.headers("Content-Type", "application/json");
		
		//del the request and check the response
		Response response=request.delete("/delete/"+eid);
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asString());

	}

}
