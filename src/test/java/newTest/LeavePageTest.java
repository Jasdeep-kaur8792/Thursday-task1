package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

public class LeavePageTest extends Baseclass {
    @Test
  public void start() throws InterruptedException
  {
      pageFactoryNew.getLoginPage().newlogin();
  }
    @Test(dependsOnMethods = "start")
    public void verifyleavepage()
    {
        pageFactoryNew.getLeavePage().leavePageClick();
    }
}
