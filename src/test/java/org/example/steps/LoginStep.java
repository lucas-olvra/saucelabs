package org.example.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.funcs.LoginFunc;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();

    @Given("access screen {string}")
    public void accessScreenLogin(String screen) {
        loginFunc.accessScreen(screen);
    }

    @When("perform the login with the user")
    public void performLoginUser(DataTable dataTable) {
        List<Map<String, String>> maps = dataTable.asMaps();
        String username = maps.get(0).get("username");
        String password = maps.get(0).get("password");

        loginFunc.performLogin(username, password);
    }
}
