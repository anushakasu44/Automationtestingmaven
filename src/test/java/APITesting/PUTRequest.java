package APITesting;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveAuthProvider;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUTRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eid=67676;
RestAssured.baseURI="http://dummy.restapiexample.com/api/vi";
RequestSpecification request=RestAssured.given();


JSONObject ob1=new JSONObject();
ob1.put("name", "anusha");
ob1.put("age", 25);
ob1.put("salary", 50000);

System.out.println(ob1.toString());
request.body(ob1.toString());
Response response=request.put("/update/"+eid);
System.out.println(response.getStatusCode());
System.out.println(response.getStatusLine());
System.out.println(response.getBody().asString());

	}

}
