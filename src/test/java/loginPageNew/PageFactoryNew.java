package loginPageNew;

import org.openqa.selenium.WebDriver;

public class PageFactoryNew {

    WebDriver driver;

    private LoginPageNew loginPageNew;
    private AdminPageNew admin;

    public PageFactoryNew(WebDriver driver)
    {
        this.driver = driver;

    }

    public LoginPageNew getLoginPage() {
        if (loginPageNew == null) {
            loginPageNew = new LoginPageNew(driver);
        }
        return loginPageNew;
    }

    public AdminPageNew getAdminPageNew()
    {
        if (admin == null) {
            admin = new AdminPageNew(driver);
        }
        return admin;
    }
}
