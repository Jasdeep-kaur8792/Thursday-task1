package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

public class LeaveApplyTest extends Baseclass
{
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

    @Test(dependsOnMethods = "verifyleavepage")
    public void verifyLeaveApply() throws InterruptedException
    {
        pageFactoryNew.getLeaveApply().applyLeave();

    }
}
