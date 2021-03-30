package com.despegar.screenplay.stepdefinitions;

import com.despegar.screenplay.model.Package;
import com.despegar.screenplay.questions.TheCheckoutPage;
import com.despegar.screenplay.tasks.ConfirmTheTrip;
import com.despegar.screenplay.tasks.SelectAPackage;
import com.despegar.screenplay.tasks.SearchPackage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
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
        theActorInTheSpotlight().attemptsTo(SelectAPackage.betweenTheResults());
        theActorInTheSpotlight().attemptsTo(ConfirmTheTrip.inANewTab());
    }

    @Then("^Daniel should see the resume page$")
    public void shouldSeeTheResumePage() {
        theActorInTheSpotlight().should(seeThat(TheCheckoutPage.isVisible()));
    }
}
