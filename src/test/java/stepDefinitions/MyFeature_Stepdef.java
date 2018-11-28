package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.MyStep_Page;

public class MyFeature_Stepdef {


    MyStep_Page myStep_page;

    public MyFeature_Stepdef() {

        myStep_page = new MyStep_Page();
    }

    @Given("^I am logged into jenkins$")
    public void iAmLoggedIntoJenkins() throws Throwable {
        myStep_page.printgiven();
    }

    @When("^i add two plus two$")
    public void iAddTwoPlusTwo() throws Throwable {
        myStep_page.printwhen();
    }

    @Then("^i should get four$")
    public void iShouldGetFour() throws Throwable {
        myStep_page.printthen();
    }
}
