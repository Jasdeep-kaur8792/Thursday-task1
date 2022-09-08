package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    static WebDriver driver;
    By pass = By.xpath("(//input[@type='password'])[1]");
    By emp = By.xpath("//div//input[@placeholder='Type for hints...']");
    By uname = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By confirmPass = By.xpath("(//input[@type='password'])[2]");
    By submit = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    String newUname;
    By searchUname = By.xpath("//input[contains(@class,'oxd-input')])[2]");

    public void admin() throws InterruptedException {
        driver.findElement(By.partialLinkText("Admin")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();

    }

    public AdminPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void select() throws InterruptedException
    {
        driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[1]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
        driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[2]")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Enabled')]")).click();
        driver.findElement(pass).sendKeys("Jasdeepk@123");
        driver.findElement(emp).sendKeys("Odis  Adalwin");
        Thread.sleep(2000);
        driver.findElement(uname).sendKeys("Admin87");
        driver.findElement(confirmPass).sendKeys("Jasdeepk@123");
        driver.findElement(submit).click();
        Thread.sleep(4000);
        System.out.println("successly completed");// to check submit works or not
    }

}
