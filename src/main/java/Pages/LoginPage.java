package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By Usernamefield = By.id("username");
    private By Passwordfield = By.id("password");
    private By Loginbutton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsernamefield(String username){
        driver.findElement(Usernamefield).sendKeys(username);
    }

    public void setPasswordfield(String password){
        driver.findElement(Passwordfield).sendKeys(password);
    }

    public SecureAreaPage setLoginbutton(){
        driver.findElement(Loginbutton).click();
        return new SecureAreaPage(driver);
    }

}
