import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTestClass {

    //Declare a static driver variable
    static WebDriver driver;
    static String baseURL;

    //Setear los drivers que vamos a usar
    @BeforeClass
    public static void setupTest() {
        System.setProperty("webdriver.google.driver", "C:\\Avenga\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        baseURL = "https://google.com.ar";
    }

    @AfterClass
    public static void quitDriver() {
        driver.close();
    }

    /*public void before () {

    }*/
    @Test
    public void seleniumTest() {

    }
}
