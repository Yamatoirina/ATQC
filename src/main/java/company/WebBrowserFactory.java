package company;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.selenium.factory.WebDriverPool;

import java.util.concurrent.TimeUnit;

public class WebBrowserFactory {

    public static WebDriver driver;
    public  static WebDriverWait wait;


    static SignInPage signInPage;
    static CreateAccountPage createAccountPage;



    @BeforeClass
    public static void setupClass() {

        driver = WebDriverPool.DEFAULT.getDriver(new ChromeOptions());

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        signInPage = new SignInPage(driver);
        createAccountPage = new CreateAccountPage(driver);

    }



//    @AfterClass
//    public static void closeBrowser(){
//        WebDriverPool.DEFAULT.dismissAll();
//    }
}
