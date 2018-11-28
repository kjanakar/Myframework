package pageObject;

import helper.Browser_Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStep_Page extends Browser_Driver {

    public MyStep_Page(){

        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "")
    public static WebElement myPath;


    public void printgiven(){
        System.out.println("Printgiven");
    }

    public void printwhen(){
        System.out.println("Printwhen");
    }
    public void printthen(){
        System.out.println("Printthen");
    }
}
