package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Browser_Driver {
   //private static WebDriver driver;

    public static WebDriver driver;

    public static WebDriver getBrowser(String browser){

        if(browser.equalsIgnoreCase("chrome")){
//            System.setProperty("webdriver.chrome.driver","classpath:BrowserDriver"+ File.separator+"chromedriver.exe");
            System.setProperty("webdriver.chrome.driver","src\\main\\resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
            System.out.print("Called Chrome Browser");
        }else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src\\main\\resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.print("Called Firefox Browser");
        }else if(browser.equalsIgnoreCase("InternetExplorer")){
            System.setProperty("webdriver.ie.driver","src\\main\\resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            System.out.print("Called IE Browser");
        }
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Constants.PAGELOAD_TIMEOUT_SECONDS,TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(640,360));

        return driver;
    }



}
