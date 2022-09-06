package Test;

public class admintest extends Baseclass {
    public static void main(String[] args) throws InterruptedException {
        setup();
        pageFactory.getLoginPage().login();
        pageFactory.getAdminPage().admin();
        pageFactory.getAdminPage().select();
        driver.close();
    }

}
