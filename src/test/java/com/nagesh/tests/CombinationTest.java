package com.nagesh.tests;

import static com.nagesh.challenge.AllCombinations.combinations;
import static io.dropwizard.testing.FixtureHelpers.fixture;
import static io.restassured.RestAssured.given;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by nageshkumar
 * since  18/12/17.
 */
public class CombinationTest {
    // @Test
    public void GarudaTest() throws IOException {

        String jsonRequestString = fixture("request.json");
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Set<Object>> jsonToMap;
        jsonToMap = mapper.readValue(jsonRequestString, new TypeReference<Map<String, Set<Object>>>() {});

        List<Map<String, Object>> list = new LinkedList<>();
        combinations(jsonToMap, list);
        for (int i = 0; i < list.size(); i++) {
            given().
                           contentType("application/json").
                           header("X-APP-TOKEN", "d212c624-574d-4934-8c87-6ebee413d906").
                           body(list.get(i)).
                           expect().
                           log().all().
                           when().
                           post("http://jump.stage.halodoc.com:9110/v1/communication_requests");
        }
    }

    @Test (dataProvider = "RequestProvider")
    public void GarudaDPTest(String requestBody) throws IOException {
        System.out.println("Running Request : \n"+ requestBody);
        given().
                       contentType("application/json").
                       header("X-APP-TOKEN", "d212c624-574d-4934-8c87-6ebee413d906").
                       body(requestBody).
                       expect().
                       log().all().
                       statusCode(201).
                       when().
                       post("http://jump.stage.halodoc.com:9110/v1/communication_requests");
    }

    @DataProvider
    public Iterator<Object[]> RequestProvider(ITestContext context) throws IOException {
        List<Object[]> dataToBeReturned = new ArrayList<>();
        String jsonRequestString = fixture("request.json");
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Set<Object>> jsonToMap;
        jsonToMap = mapper.readValue(jsonRequestString, new TypeReference<Map<String, Set<Object>>>() {});

        List<Map<String, Object>> list = new LinkedList<>();
        combinations(jsonToMap, list);
        Gson gson = new GsonBuilder().create();
        for (int i = 0; i < list.size(); i++) {
            dataToBeReturned.add(new Object[] { gson.toJson(list.get(i)) });

        }
        return dataToBeReturned.iterator();
    }
}