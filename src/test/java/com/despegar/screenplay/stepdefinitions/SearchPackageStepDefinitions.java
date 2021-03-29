package com.despegar.screenplay.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SearchPackageStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants to search for a package$")
    public void goToHomePage(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url("https://www.despegar.com.co/paquetes/"));
    }


    @When("^Daniel enters departure (.*) and destination (.*)$")
    public void searchPackage(String departure, String destination) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Daniel should see the resume page$")
    public void shouldSeeTheResumePage() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
