package org.example.steps;

import io.cucumber.java.en.Then;
import org.example.funcs.HomeFunc;
import org.junit.Assert;

public class HomeStep {
    HomeFunc homeFunc = new HomeFunc();

    @Then("check login performed with success")
    public void loginPerformedWithSuccess() {
        Assert.assertTrue(homeFunc.loginPerformed());
    }
}
