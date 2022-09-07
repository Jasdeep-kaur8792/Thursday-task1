package loginPageNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {
    static WebDriver driver;
    By leaveclick= By.xpath("class=\"oxd-main-menu-item active\"");

    public LeavePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void leavePageClick()
    {
        driver.findElement(By.partialLinkText(String.valueOf(leaveclick))).click();
    }
}
