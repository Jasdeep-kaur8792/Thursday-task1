package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

    public void admin() throws InterruptedException {
        driver.findElement(By.partialLinkText("Admin")).click();
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser");
    }

    public void select() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[1]")).click();
        Select objSelect =new Select(driver.findElement(By.xpath("(//div[@class = 'oxd-select-text--after'])[1]")));
        objSelect.selectByIndex(2);

    }
}
