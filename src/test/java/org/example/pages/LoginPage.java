package org.example.pages;

public class LoginPage {

    private String inputLogin = "//input[@placeholder='Username']";

    private String inputPassword = "//input[@placeholder='Password']";

    private String buttonLogin = "//input[@id='login-button']";

    public String getButtonLogin() {
        return buttonLogin;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public String getInputLogin() {
        return inputLogin;
    }
}
