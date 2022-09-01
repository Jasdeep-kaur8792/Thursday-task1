package Test;

import Pages.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
    static WebDriver driver;
    protected static PageFactory pageFactory;
    public static void setup()
    {
        driver = new ChromeDriver();
 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 pageFactory=new PageFactory(driver);
}
public void close()
{
   driver.close();
}
}
