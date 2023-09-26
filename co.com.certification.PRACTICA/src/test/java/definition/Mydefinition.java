package definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import step.OpenApp;
import step.TasksAction;

public class Mydefinition {

    @Steps
    OpenApp OpenApp;
    TasksAction TaskAction;

    @Given("^I enter with my credentials$")
    public void iEnterWithMyCredentials() {
    OpenApp.appUrl();
    }
    @When("^I proceed with authentication$")
    public void iProceedMyAuthentication() {
      TaskAction.singIn();
    }
    @Then("^go to the main view$")
    public void goToMain() {

    }
}
