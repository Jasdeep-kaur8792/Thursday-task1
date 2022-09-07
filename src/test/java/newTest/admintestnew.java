package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;


//public class admintestnew extends LogintestNew
public class admintestnew extends Baseclass
{


    @Test(priority = 1)
    public void verifyStart()
    {
        pageFactoryNew.getAdminPageNew().adminnew();
    }

    @Test(priority = 2)
   public void verifySelect() throws InterruptedException {
    pageFactoryNew.getAdminPageNew().select();
   }
}
