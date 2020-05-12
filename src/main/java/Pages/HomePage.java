package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By FormAuthenticationLink = By.linkText("Form Authentication");
    private By ForgotPasswordLink = By.linkText("Forgot Password");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(FormAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        driver.findElement(ForgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }
}
