package Base;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;

    protected HomePage homePage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(5000);

        // maximize the window
        driver.manage().window().maximize();
        // get page title
        System.out.println(driver.getTitle());
        // To make the page wait until the URL fully loads so as to avoid our test from Failing, add a global wait time.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
