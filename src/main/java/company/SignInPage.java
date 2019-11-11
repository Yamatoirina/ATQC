package company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    private static final String url = "http://automationpractice.com/index.php";

    private static final By registerEmail = By.id("email_create");

    private static final By signInButton = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");

    private static final By createAccountButton = By.cssSelector("#SubmitCreate");

    private static final By registrationForm = By.cssSelector("#account-creation_form");

    private static final By createAccountContent = By.xpath("//h3[text()='Create an account']");




    private WebDriver driver;
    private WebDriverWait wait;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 5);
    }


    public SignInPage openApplication() {
        driver.get(url);
        return this;
    }


    public SignInPage goToSignInPage(){
        driver.findElement(signInButton).click();
        return this;
    }

    public SignInPage enterRegistrationEmail (String email) {
        driver.findElement(registerEmail).sendKeys(email);
        return this;
    }


    public SignInPage goToRegistrationPage() {
        driver.findElement(createAccountButton).click();
        return this;
    }

    public String getCreateAccountContentValue() {
        return driver.findElement(createAccountContent).getText();
    }

//    public boolean isCreateAccountFormDisplayed() {
//        return driver.findElement(createAccountContent).isDisplayed();
//    }



}
