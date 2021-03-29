package com.despegar.screenplay.stepdefinitions;

import com.despegar.screenplay.model.Package;
import com.despegar.screenplay.tasks.ConfirmTrip;
import com.despegar.screenplay.tasks.PackageResult;
import com.despegar.screenplay.tasks.SearchPackage;
import com.despegar.screenplay.userinterface.PackageResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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
        theActorInTheSpotlight().attemptsTo(SearchPackage.with(new Package(departure, destination)));
        theActorInTheSpotlight().attemptsTo(PackageResult.with());
        theActorInTheSpotlight().attemptsTo(ConfirmTrip.with());
    }

    @Then("^Daniel should see the resume page$")
    public void shouldSeeTheResumePage() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
