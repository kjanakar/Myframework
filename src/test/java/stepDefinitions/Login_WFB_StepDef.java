package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helper.Hooks;
import org.openqa.selenium.WebDriver;
import pageObject.Login_WFB_Page;
import static helper.Browser_Driver.driver;


public class Login_WFB_StepDef {

//    public WebDriver driver;
    Login_WFB_Page login_wfb_page;

    public Login_WFB_StepDef(){
//        driver = Hooks.driver;
    }




    @Given("^I am in the waaaaebfrontend page$")
    public void iAmInTheabcWebfrontendPage() throws Throwable {
        driver.get("https://imperialuktest.elluciancrmrecruit.com/Apply/Account/Login ");

    }

    @And("^i enter username$")
    public void iEnterUsername() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @And("^i enter password$")
    public void iEnterPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^i should see \"([^\"]*)\" page$")
    public void iShouldSeePage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
