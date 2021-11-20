package co.com.choucair.StarSharp.stepdefinitions;

import cucumber.api.java.en.Then;
import questions.EndDateError;
import questions.TheMeeting;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EndDateErrorStarSharpStepDefinition {
    @Then("^an error message should be displayed$")
    public void anErrorMessageShouldBeDisplayed() {
        theActorInTheSpotlight().should(seeThat(EndDateError.displays()));
    }
}
