package APITesting;

import static org.junit.Assert.assertThat;

import org.json.JSONObject;
import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//specify base uri
		RestAssured.baseURI="http://restapi.demoqa.com/customer";

		//request object
		RequestSpecification request=RestAssured.given();

//request payload(body) sending along with post request
		JSONObject obj=new JSONObject();
obj.put("FirstName", "aruanu");
obj.put("LastName", "redd");
obj.put("UserName", "arunanureddy44");
obj.put("Password", "arunreddy44");
obj.put("Email", "arunaddy44@gmail.com");

System.out.println(obj.toString());
request.body(obj.toString()); 

//response object:using this obj we can send the request
Response response= request.post("/register");

//print response on consloe window
System.out.println(response.getBody().asString());


//status code validation
int statuscode=response.getStatusCode();
System.out.println("ststus code is" +statuscode);


//status line verification
System.out.println(response.getStatusLine());





	}

}
