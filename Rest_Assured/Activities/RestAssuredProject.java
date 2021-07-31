package gitproject;


import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredProject {

	RequestSpecification requestSpec;
	String sshKey;
	int sshkeyId;
	
	@BeforeClass
	
	public void setup() {
		
		requestSpec =  new RequestSpecBuilder()
		.setContentType(ContentType.JSON)
		.setBaseUri("https://api.github.com")
		.addHeader("authHeader", "token")
		.log(LogDetail.ALL)
		.build();
	}
	
	@Test
	public void postrequest() {
		String pstrqstbody = "{\"title\": \"TestAPIKey\",\"key\":\"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAmBAMKPbuvkUQBdcdAzHrJjPinLj/hPPLJyCNOY6SiqYsQaK+Jtsc0bI9iLxEx4BE43nwXerjBKPR8Z4e6p6Fj+jhNnH9LXJ5SEq39qp4Rke6sCrfG20w4J1ueqq69tVMyu+/un/uXMjtH26tz+6vh1HPcJq5LyiLh0m1MHwd4FKDZbJePnfriOMQ4/I2rXD0Wezggo8ndysCptOBbmOUiZHmi7ud5rgpLqnSp16PS8kAo1c1n3mKGkiXANBzchrth+xnFXaTGQ5mrMOiqH+amoQSkN+21JnJWuwN0jNCt6dns3UTtPOEkq1nlKaCuOFGFWo7MDVTyEbFyECaZVyfvBLspGWXzqa98jHPrtP+pnv4j376FEv0ksW/7WtHDCcAKYbGzYrrsA+w295n23PX9ZzT4pfLeOXwVNLaQCh8a7G3EqEMRKjEjbVh0dRDZXunoHrFdgUDzpKKChSZ8zYL5Er2CYdCMFZnEqrRA944MTHgwZRAoRloOJE38DE0HATU=\" }";
		
		Response response = 
		        given().spec(requestSpec) // Set headers
		        .body(pstrqstbody).when().post("/user/keys");
		String body = response.getBody().asPrettyString();
		    System.out.println(body);
		    
		    sshkeyId = response.then().extract().path("id");
	}
	
	@Test
	public void getrequest() {
		Response response = 
		        given() // Set headers
		        .when().get("/user/keys");
		 System.out.println(response.asPrettyString());
		 
		 response.then().statusCode(200);
	}
	
	@Test
	public void deletereq() {
		Response response = 
		        given().contentType(ContentType.JSON)
		        .pathParam("keyid",sshkeyId)
		        .when().delete("/user/keys/{keyid}");
		System.out.println(response.asPrettyString());
		 
		 response.then().statusCode(204);
	}
	
}