import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class unSwitch {
    private static WebDriver driver;
    static String baseURL;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.google.driver", "C:\\Avenga\\Automation\\chromedriver.exe");
        driver = new ChromeDriver();
        baseURL = "https://ux.gruposancorseguros.com/#/nf2/components/table/full/demo";

    }

    @Test
    public void switchButton() {
        driver.get(baseURL);
        driver.manage().window().maximize();
        //Wait porque el elto cambia de clase al clickearse
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); //no me dejó poner a duración con un valor común
            By switchButton = By.xpath("//ul[28]/li/a");
            WebElement switchB = wait.until(ExpectedConditions.elementToBeClickable(switchButton));
            switchB.click();
        }
        driver.findElement(By.xpath("//li/a[contains(.,'Switch')]")).click();

        //1. Elto no interactuable segun SE --> agregue wait
        //2. Elto no alcanzable, cambié //div[1]/div/div[2]/div/figure/div/img sin el img
        WebElement imgClick = driver.findElement(By.xpath("//div[1]/div/div[2]/div/figure/div"));
        if (imgClick.isEnabled()) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(imgClick));
            element.click();
        } else {
            System.out.println("Element is not displayed");
        }

        driver.findElement(By.xpath("//div/span[1]/span/span[2]")).click();
        driver.findElement(By.xpath("//div/span[1]/span/span[2]")).click();
        driver.findElement(By.xpath("//div/span[2]/span/span[2]")).click();
        driver.findElement(By.xpath("//div/span[2]/span/span[2]")).click();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


}
