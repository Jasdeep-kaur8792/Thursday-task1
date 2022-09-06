package loginPageNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPageNew {

        static WebDriver driver;
        //user add
        By pass = By.xpath("(//input[@type='password'])[1]");
        // By emp=By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']//input[@placeholder='Type for hints...']");
        By emp = By.xpath("//div//input[@placeholder='Type for hints...']");
        By uname = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");

        By confirmPass = By.xpath("(//input[@type='password'])[2]");
        By submit = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public AdminPageNew(WebDriver driver)
    {
        this.driver = driver;
    }

    public void adminnew(){
        driver.findElement(By.partialLinkText("Admin")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();

    }public void select() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[1]")).click();
        Thread.sleep(4000);
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

