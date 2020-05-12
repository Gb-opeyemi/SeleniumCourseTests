package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    private WebDriver driver;

    private By Emailfield = By.id("email");
    private By Retrievebutton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void setEmailfield(String email){
        driver.findElement(Emailfield).sendKeys(email);
    }

    public EmailSentPage clickRetrievebutton(){
        driver.findElement(Retrievebutton).click();
        return new EmailSentPage(driver);
    }
}
