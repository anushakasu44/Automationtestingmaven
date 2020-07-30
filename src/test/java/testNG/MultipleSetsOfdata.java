package testNG;

import org.json.JSONObject;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.http.Method;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class MultipleSetsOfdata {
			
			@Test(dataProvider="employeedetails")
		
          public void multiplesetempdetails(String name1,String age1,String sal1,String phone1) {
				
			RestAssured.baseURI="http://restapi.demoqa.com/customer";
			RequestSpecification httprequest=RestAssured.given();
			
			JSONObject ob=new JSONObject();
			ob.put("name", name1);
			ob.put("age", age1);
			ob.put("sal", sal1);
			ob.put("phone", phone1);
			
			System.out.println(ob.toString());
			httprequest.body(ob.toString());
			Response response=httprequest.request(Method.POST,"/create");
			
			System.out.println(response.getBody().asString());
			System.out.println(response.getStatusCode());
			System.out.println(response.getStatusLine());
			}
			
			
			@DataProvider(name="employeedetails")
			String [][] getempdata(){
				
				String empdata[][]= {{"anus","22","54000","65661323265"},{"arun","25","78000","54531313212"}};
				return empdata;
						
			}
			
			
			
			
	}


