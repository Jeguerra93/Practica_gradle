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


    @Given ("I enter with my credentials")
    public void i_enter_with_my_credentials() {
        OpenApp.appUrl();
        throw new io.cucumber.java.PendingException();
    }
    @When ("I proceed with authentication")
    public void i_proceed_with_authentication() {
        TaskAction.singIn();
        throw new io.cucumber.java.PendingException();
    }

    @Then ("go to the view")
    public void go_To_The_View() {
        throw new io.cucumber.java.PendingException();
    }
}
