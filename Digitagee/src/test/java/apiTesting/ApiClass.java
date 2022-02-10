package apiTesting;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiClass {
	//200,400,500bResponseBody-json,response,headers
	//API test
	
	@Test
	public void getUsersDetails() {
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification httprequest = RestAssured.given();
		//inputs required to call a API baseUrl, body , ContentType , Get ,Post ,Put , Delete, End Point,Response
		Response response = httprequest.request(Method.GET, "/api/users?page=2"); 
		int responsecode = response.statusCode();
		System.out.println(responsecode);
		Assert.assertEquals(200, responsecode);
		String body = response.body().asString();
		System.out.println("my response body" +body);
		boolean result = body.contains("contributions towards");
		Assert.assertTrue("result is true",result);
		System.out.println(result);
	}
	
	@Test
	public void createnewUser() {
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.contentType(ContentType.JSON);
		httpRequest.body("{   \"name\": \"kawal\",  \"job\": \"Sr leader\" }");
		//inputs required to call a API baseUrl, body , ContentType , Get ,Post ,Put , Delete, End Point,Response
		Response response = httpRequest.request(Method.POST, "/api/users?page=2"); 
		int responsecode = response.statusCode();
		System.out.println(responsecode);
		Assert.assertEquals(201, responsecode);
		String body = response.body().asString();
		System.out.println("my response body" +body);
		boolean result = body.contains("kawal");
		Assert.assertTrue("result is true",result);
		System.out.println(result);
	}
	
	@Test
	public void updateExistingUser() {
		RestAssured.baseURI = "https://reqres.in";
		RequestSpecification httpRequest = RestAssured.given();
		httpRequest.contentType(ContentType.JSON);
		httpRequest.body("{   \"name\": \"kawal\",  \"job\": \"Sr leader\" }");
		//inputs required to call a API baseUrl, body , ContentType , Get ,Post ,Put , Delete, End Point,Response
		Response response = httpRequest.request(Method.PUT, "/api/users/2"); 
		int responsecode = response.statusCode();
		System.out.println(responsecode);
		Assert.assertEquals(200, responsecode);
		String body = response.body().asString();
		System.out.println("my response body" +body);
		boolean result = body.contains("kawal");
		Assert.assertTrue("result is true",result);
		System.out.println(result);
	}
	
	
	
	
	

}
