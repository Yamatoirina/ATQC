package company;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.stqa.selenium.factory.WebDriverPool;

public class WebBrowserFactory {

    public static WebDriver driver;
    public  static WebDriverWait wait;


    static SignInPage signInPage;
    static CreateAccountPage createAccountPage;



    @BeforeClass
    public static void setupClass() {

        driver = WebDriverPool.DEFAULT.getDriver(new ChromeOptions());

        driver.manage().window().maximize();
        wait= new WebDriverWait(driver, 15);

        signInPage = new SignInPage(driver);
        createAccountPage = new CreateAccountPage(driver);

    }


    @AfterClass
    public static void closeBrowser(){
        WebDriverPool.DEFAULT.dismissAll();
    }
}
