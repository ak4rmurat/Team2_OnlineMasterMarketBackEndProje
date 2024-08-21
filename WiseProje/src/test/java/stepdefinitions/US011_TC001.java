package stepdefinitions;

import config_Requirements.ConfigReader;
import io.cucumber.java.en.Given;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.API_Utilities.API_Methods;
import utilities.API_Utilities.Authentication;
import utilities.API_Utilities.RequestBuilder;

import static io.restassured.RestAssured.given;

public class US011_TC001 {

    JsonPath jsonPath;
    JSONObject jsonObject;
    Response response;



}
