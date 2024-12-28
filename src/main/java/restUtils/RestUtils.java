package restUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import org.json.simple.JSONObject;
import reporting.ExtentReportManager;
import java.util.Map;


public class RestUtils {

    private static RequestSpecification getRequestSpecificationGet(String endPoint, Map<String, String> headers, Map<String,String> queryParams) {
        return RestAssured.given()
                .baseUri(endPoint)
                .contentType(ContentType.JSON)
                .headers(headers);
    }

    private static RequestSpecification getRequestSpecificationPost(String endPoint, JSONObject requestPayload, Map<String, String> headers) {
        return RestAssured.given()
                .baseUri(endPoint)
                .contentType(ContentType.JSON)
                .headers(headers)
                .body(requestPayload);
    }

    //This method is for printing the request info details in extent report
    private static void printRequestInfoInLogReport(RequestSpecification requestSpecification) {
        QueryableRequestSpecification queryableRequestSpecification = SpecificationQuerier.query(requestSpecification);
        queryableRequestSpecification.getBaseUri();
        ExtentReportManager.logInfoDetails("API End Point is" + queryableRequestSpecification.getBaseUri());
        ExtentReportManager.logInfoDetails("Method is:" + queryableRequestSpecification.getMethod());
        ExtentReportManager.logInfoDetails("Request Headers are:");
        ExtentReportManager.logHeaders(queryableRequestSpecification.getHeaders().asList());
        ExtentReportManager.logInfoDetails("Request Body is:");
        ExtentReportManager.logJson(queryableRequestSpecification.getBody());
    }

    //This method is for printing the response info details in extent report
    private static void printResponseInfoInLogReport(Response response) {
        ExtentReportManager.logInfoDetails("Response Status is:" + response.getStatusCode());
        ExtentReportManager.logInfoDetails("Response Headers are:");
        ExtentReportManager.logHeaders(response.getHeaders().asList());
        ExtentReportManager.logInfoDetails("Response Body is:");
        ExtentReportManager.logJson(response.getBody().prettyPrint());
        ExtentReportManager.logInfoDetails("Response Status Line:" + response.getStatusLine());
    }

    //This method is for clubbing the above two methods
    private static void printRequestResponseDetailsInLogReport(RequestSpecification requestSpecification, Response response) {
        printRequestInfoInLogReport(requestSpecification);
        printResponseInfoInLogReport(response);
    }

    public static Response performPost(String endPoint, JSONObject requestPayload, Map<String, String> headers) {
        RequestSpecification requestSpecification = getRequestSpecificationPost(endPoint, requestPayload, headers);
        Response response = requestSpecification.post();
        printRequestResponseDetailsInLogReport(requestSpecification, response);
        return response;
    }

    public static Response performGet(String endPoint, Map<String, String> headers, Map<String, String> queryParam) {
        RequestSpecification requestSpecification = getRequestSpecificationGet(endPoint, headers, queryParam);
        Response response = requestSpecification.get();
        printRequestResponseDetailsInLogReport(requestSpecification, response);
        return response;
    }
}
