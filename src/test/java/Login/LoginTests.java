package Login;

import Base.BaseTests;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){

       LoginPage loginPage = homePage.clickFormAuthentication();
       loginPage.setUsernamefield("tomsmith");
       loginPage.setPasswordfield("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.setLoginbutton();
       assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Messages don't match");


    }

}
