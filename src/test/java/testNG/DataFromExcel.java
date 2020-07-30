package testNG;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DataFromExcel {

	 @Test(dataProvider="employeedetails")
	public void excelData(String name1,String age1,String sal1,String phone1) {
			
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
		public	String [][] getempdata() throws Exception{
				
				
			
				FileInputStream fis=new FileInputStream("D:/Anu.xlsx");
				XSSFWorkbook excel=new XSSFWorkbook(fis);
				XSSFSheet sheet=excel.getSheetAt(0);
				String empdata[][]= new String[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()];
				for(int i=0;i<=sheet.getLastRowNum();i++) {
				XSSFRow row=sheet.getRow(i);
				
				for(int j=0;j<row.getLastCellNum();j++) {
					XSSFCell column=row.getCell(j);
					System.out.println(column.getStringCellValue());
					
					empdata[i][j]=column.getStringCellValue();
					
					
				}

				
				
				
						
			}
				return empdata;
				
			}
}
			
			
			

