package helper;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void openBrowser() throws MalformedURLException {
        System.out.print("Before - about to open the browser.");

        driver = Browser_Driver.getBrowser("chrome");

        System.out.println("My browser is launched...........yay");
    }

    @After
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }


}
