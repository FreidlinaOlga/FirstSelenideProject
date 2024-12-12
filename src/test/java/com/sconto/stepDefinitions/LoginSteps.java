package com.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import com.sconto.pages.HomePage;
import com.sconto.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps {

    private static final Logger log = LoggerFactory.getLogger(LoginSteps.class);
    HomePage home;
    LoginPage login;

    @And("User enters valid data")
    public void enter_valid_data() {
        login = Selenide.page(LoginPage.class);
        login.enterData();
    }

    @And("User clicks on Anmelden button")
    public void click_on_Anmelden() {

        login.clickOnAnmelden();
    }

        @And("User clicks on User icon")
    public void click_on_User_icon() {
        home = Selenide.page(HomePage.class);
        home.clickOnStatusLogin();
    }

    @Then("User verifies his name")
    public void verify_User_name() {
        login.verifyName();

    }
    @And("User enters invalid email and correct password")

    public void enter_incorrect_data() {
        login = Selenide.page(LoginPage.class);
        login.enterData();
    }

    @Then("User verifies login unsuccessful")
    public void verify_login_unsuccessful() {
        login = Selenide.page(LoginPage.class);
        login.verifyLoginUnsuccessful();
    }
}
