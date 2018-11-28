package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import helper.Hooks;
import org.openqa.selenium.WebDriver;
import pageObject.Login_WFB_Page;


import static helper.Browser_Driver.driver;

public class mynewpage_StepDefs {


     Login_WFB_Page login_wfb_page;

    public mynewpage_StepDefs(){
        login_wfb_page=new Login_WFB_Page(driver);

    }

    @Given("^i have a new page$")
    public void iHaveANewPage() throws Throwable {
        driver.get("https://imperialuktest.elluciancrmrecruit.com/Apply/Account/Login");
    }
}
