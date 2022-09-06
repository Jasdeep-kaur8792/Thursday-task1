package loginPageNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPageNew {
    WebDriver driver;
    By username = By.xpath("//input[@name='username']");
    By password = By.name("password");
    By submit = By.xpath("//button");

    public LoginPageNew(WebDriver driver)
    {
        this.driver = driver;
    }

    public void newlogin() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(username).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();
    }
}
