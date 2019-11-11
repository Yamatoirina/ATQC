package company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage {

    private static final By firstName = By.id("customer_firstname");
    private static final By lastName = By.id("customer_lastname");
    private static final By email = By.id("email");
    private static final By password = By.id("passwd");
    private static final By addressFirstName = By.id("firstname");
    private static final By addressLastName = By.id("lastname");
    private static final By address = By.id("address1");
    private static final By city = By.id("city");
    private static final By code = By.id("postcode");
    private static final By mobilePhone = By.id("phone_mobile");
    private static final By alias = By.id("alias");
    private static final By registerButton = By.id("submitAccount");
    private static final By errorMessage = By.xpath("//div[contains(@class,'alert')]/p");


    private WebDriver driver;
    private WebDriverWait wait;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 5);
    }



    public CreateAccountPage setFirstName(String name){
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(name);
        return this;
    }

    public CreateAccountPage setLastName(String nameLast){
        driver.findElement(lastName).sendKeys(nameLast);
        return this;
    }

    public CreateAccountPage enterEmail (String accEmail) {
        driver.findElement(email).sendKeys(accEmail);
        return this;
    }


    public CreateAccountPage enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
        return this;
    }

    public CreateAccountPage setAddrFirstName(String name){
        driver.findElement(addressFirstName).sendKeys(name);
        return this;
    }

    public CreateAccountPage setAddrLastName(String nameLast){
        driver.findElement(addressLastName).sendKeys(nameLast);
        return this;
    }


    public CreateAccountPage setAddress(String addr){
        driver.findElement(address).sendKeys(addr);
        return this;
    }

    public CreateAccountPage setCity(String cityname){
        driver.findElement(city).sendKeys(cityname);
        return this;
    }

    public CreateAccountPage setCode(String postCode){
        driver.findElement(code).sendKeys(postCode);
        return this;
    }

    public CreateAccountPage setMobilePhone(String phone){
        driver.findElement(mobilePhone).sendKeys(phone);
        return this;
    }


    public CreateAccountPage setAlias(String Aladdr){
        driver.findElement(alias).sendKeys(Aladdr);
        return this;
    }

    public CreateAccountPage registerAccount() {
        driver.findElement(registerButton).click();
        return this;
    }

    public String getCreateAccountErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

}
