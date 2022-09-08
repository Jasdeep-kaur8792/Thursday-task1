package baseTestNew;

import io.github.bonigarcia.wdm.WebDriverManager;
import loginPageNew.PageFactoryNew;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass
{
    static WebDriver driver;
    protected static PageFactoryNew pageFactoryNew;

    @Parameters("browserName")
    @BeforeClass

    public static void setup(String browserName)
    {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            pageFactoryNew = new PageFactoryNew(driver);

        } else if (browserName.equalsIgnoreCase("firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            pageFactoryNew = new PageFactoryNew(driver);
        }
    }

    @AfterClass
    public void close() {
        driver.close();
    }
}

