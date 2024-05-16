import groovy.transform.ASTTest;
import io.restassured.*;
import io.restassured.response.*;
import org.junit.Test;
import org.testng.*;
import static org.hamcrest.Matchers.*;
import java.util.*;

public class restAssured {
    public static void main(String[] args) {


















//        RestAssured.baseURI = "https://reqres.in/";
//                    RestAssured.given()
//                    .when()
//                    .get("api/users?page=2")
//                    .then().log().all()
//                    .statusCode(200)
//        .body("data[5]['id']",equalTo(12)).log().all();


//        String payload="{"+
//                "name"+":" +"morpheus"+','+
//                "job"+":"+"leader";
//
//
//        RestAssured.given()
//                .body(payload)
////                .contentType("application/json")
////                .header("Content-Type","application/json")
//                .when()
//                .post("api/users")
//                .then().log().all()
//                .assertThat()
//                .statusCode(201)
//                .body("token",is(notNullValue()))
//                .body("$",hasKey("token"));


//        RestAssured.baseURI="https://reqres.in/";
//        RestAssured.given()
//                .contentType("application/json")
//                .header("Content-Type","application/json")
//                .when().post("api/users")
//                .then().log().all()
//                .statusCode(201)
//                .assertThat()
//                .body("id",notNullValue());
//        RestAssured.baseURI = "https://reqres.in/";
//        RestAssured.given().contentType("application/json").header("Content-Type","application/json").when().get("api/users?page=2").then().log().all()
//                .statusCode(200).assertThat().body("id",is(notNullValue()));

//        String test= "{" + "name" + ":" + "Morpheus" + "," + "job" + ":" + "leader" + "}";
//RestAssured.baseURI="https://reqres.in/";
//RestAssured.given().body(test).contentType("application/json").when().post("/api/users").then().statusCode(201).log().all();
//
//
//RestAssured.baseURI="https://spb-srv-wlci1.cardpay-test.com/app/api/v1";
//RestAssured.given().auth().basic("Asya Partner","123456").when()
//        .post("/auth/issue-token")
//        .then().statusCode(200).log().all();

//        HashMap<String,String> hm = new HashMap<>();
//        hm.put("name","Morpheus");
//        hm.put("job","leader");
//        RestAssured.baseURI="https://reqres.in/";
//Response res = RestAssured.given().
//        body(hm).contentType("application/json")
//        .when().post("/api/users");
//System.out.println("response code"+res.asString());
//System.out.println("response code"+res.getStatusCode());

//
        RestAssured.baseURI = "https://reqres.in/";
                    RestAssured.given()
                    .when()
                    .get("api/users?page=2")
                    .then().log().all()
                    .statusCode(200).assertThat().body("data[2]['id']",equalTo(8));


    }

}