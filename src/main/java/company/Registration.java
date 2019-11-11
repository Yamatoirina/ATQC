package company;


import org.junit.Assert;
import org.junit.Test;


public class Registration extends WebBrowserFactory{

    String loginEmail = "aa345345sdfgsd@gmail.com";
    String createAccountContent = "CREATE AN ACCOUNT";
    String errorMessage= "There is 3 errors";

    @Test
    public void SignIntoAccountTest()  {

        signInPage
                .openApplication()
                .goToSignInPage()
                .enterRegistrationEmail(loginEmail)
                .goToRegistrationPage();

        Assert.assertEquals( createAccountContent, signInPage.getCreateAccountContentValue());


    }

    @Test
    public void CreateAccountTest(){
        createAccountPage
             .setFirstName("Vasja")
                .setLastName("Ivanov")
                .enterEmail("glglglgl@test.com")
                .enterPassword("123456")
                .setAddrFirstName("Vasja")
                .setAddrLastName("Ivanov")
                .setAddress("Popova str.")
                .setCity("Berdichev")
                .setCode("48484")
                .setMobilePhone("0504837364")
                .setAlias("Popova str.")
                .registerAccount();

        Assert.assertEquals( errorMessage, createAccountPage.getCreateAccountErrorMessage());


}
}
