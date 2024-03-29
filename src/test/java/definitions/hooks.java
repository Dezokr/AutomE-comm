package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class hooks {

    public static WebDriver driver;

    @Before
    public static void setUp(){
        System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
        driver =new EdgeDriver();
        driver.manage().window().maximize();
    }

    @After
    public static void tearDown(){
        driver.manage().deleteAllCookies();
        //driver.quit();
    }
}
