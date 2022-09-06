package baseTestNew;

import Pages.PageFactory;

import loginPageNew.PageFactoryNew;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Baseclass {
    static WebDriver driver;
    public static PageFactoryNew pageFactoryNew;

    @BeforeClass
    public static void setup()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        pageFactoryNew=new PageFactoryNew(driver);
    }

   @AfterClass
   public void close()
   {
      driver.close();
   }
}
