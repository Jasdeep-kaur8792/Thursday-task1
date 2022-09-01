package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By username = By.xpath("//input[@name='username']");
    By password = By.name("password");
    By submit = By.xpath("//button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(username).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();
    }
    public void admin() throws InterruptedException{
        driver.findElement(By.partialLinkText("Admin")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
        
    }

}
