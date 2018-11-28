package pageObject;

import helper.Browser_Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_WFB_Page extends Browser_Driver {




    public Login_WFB_Page(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
//
//    @FindBy(Xpath="")
//    public static WebElement username;
//
//    @FindBy(Xpath="")
//    public static WebElement password;
//
//    @FindBy(Xpath="")
//    public static WebElement Submit;

    public void PageTitle(){

    }

    public void Sendkeys(){

    }

    public void Click(){

    }

}
