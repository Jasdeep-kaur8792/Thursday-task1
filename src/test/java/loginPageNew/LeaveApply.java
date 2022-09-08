package loginPageNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeaveApply {
    WebDriver driver;
    By leaveType = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])");
    By toDate = By.xpath("//i[@class='oxd-icon bi-calendar oxd-date-input-icon']");
    By comments =By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']");
    By Apply = By.xpath("//button[@type='submit']");
    public LeaveApply(WebDriver driver)
    {
        this.driver = driver;
    }

    public void applyLeave() throws InterruptedException {
        driver.findElement(leaveType).click();
        driver.findElement(By.xpath("//*[contains(text(),'CAN - Bereavement')]")).click();
        Thread.sleep(3000);
        driver.findElement(toDate).click();
        driver.findElement(By.xpath("//*[contains(text(),'Today')]")).click();
        driver.findElement(comments).sendKeys("urgent work");
        Thread.sleep(3000);
        driver.findElement(Apply).click();

    }
}
