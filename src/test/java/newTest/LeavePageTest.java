package newTest;

import Test.Baseclass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static baseTestNew.Baseclass.pageFactoryNew;

public class LeavePageTest extends Baseclass {
    static WebDriver driver;

    @Test
    public void veryfyLeavePageClick()
    {
        pageFactoryNew.getLeavePage().leavePageClick();
    }


}
