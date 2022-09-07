package loginPageNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeavePage {
    WebDriver driver;

    public LeavePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void leavePageClick()
    {
        driver.findElement(By.partialLinkText("Leave")).click();
        driver.findElement(By.partialLinkText("Apply")).click();
    }
}
