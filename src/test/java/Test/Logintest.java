package Test;

public class Logintest extends Baseclass
{
    public static void main(String[] args) throws InterruptedException
    {

        setup();
        pageFactory.getLoginPage().login();
        driver.close();
    }
}
