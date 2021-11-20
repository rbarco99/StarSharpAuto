package co.com.choucair.StarSharp.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.StarSharpData;
import model.UtestData;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.TheMeeting;
import questions.WelcomeMessage;
import tasks.Create;
import tasks.LogIn;
import tasks.OpenUpStarSharp;
import tasks.Schedule;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CreateMeetingStarSharpStepDefinition {
    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
    }

    @Given("^That the admin is authenticated in the StarSharp page$")
    public void thatTheAdminIsAuthenticatedInTheStarSharpPage() {
        theActorCalled("Ricardo").wasAbleTo(
                OpenUpStarSharp.LoginPage(),
                LogIn.withAdminCredentials()
        );
    }

    @When("^the admin creates a new Business Unit$")
    public void theAdminCreatesANewBusinessUnit(List<StarSharpData> starSharpData) {
        theActorInTheSpotlight().attemptsTo(
                Create.businessUnit(starSharpData.get(0)));
    }

    @When("^the admin schedule a new meeting$")
    public void theAdminScheduleANewMeeting(List<StarSharpData> starSharpData) {
        theActorInTheSpotlight().attemptsTo(
                Schedule.newMeeting(starSharpData.get(0)));

    }

    @Then("^the meeting should be created$")
    public void theMeetingShouldBeCreated(List<StarSharpData> starSharpData) {
        theActorInTheSpotlight().should(seeThat(TheMeeting.isCreated(starSharpData.get(0))));
    }

}
