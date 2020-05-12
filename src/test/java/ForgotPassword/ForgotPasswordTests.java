package ForgotPassword;

import Base.BaseTests;
import Pages.EmailSentPage;
import Pages.ForgotPasswordPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testSuccessfulRetrieve(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmailfield("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrievebutton();
        assertTrue(emailSentPage.getpageText().contains("Your e-mail's been sent!"), "Messages don't match");
    }
}
