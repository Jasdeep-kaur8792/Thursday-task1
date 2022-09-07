package loginPageNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaveApply
{
    WebDriver driver;
    public LeaveApply(WebDriver driver)
    {
        this.driver = driver;
    }
    public void applyLeave() throws InterruptedException {
        driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).click();
       driver.findElement(By.partialLinkText("")).click();
        Thread.sleep(3000);
    }
}
