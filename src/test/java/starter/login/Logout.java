package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
public class Logout extends PageObject {

    private By enterUsernameField() {
        return By.id("user-name");
    }
    private By enterPasswordField(){
        return By.id("password");
    }
    private By loginTheButton(){
        return By.id("login-button");
    }
    private By getMenuButton(){
        return By.id("react-burger-menu-btn");
    }
    private By getLogout(){
        return By.id("logout_sidebar_link");
    }
    private By getLogin(){
        return By.id("root");
    }
    @Step
    public void enterUsernameField(String username){
        $(enterUsernameField()).type(username);
    }
    @Step
    public void enterPasswordField(String password){
        $(enterPasswordField()).type(password);
    }
    @Step
    public void clickTheLoginButton(){
        $(loginTheButton()).click();
    }
    @Step
    public void clickMenuButton(){
        $(getMenuButton()).click();
    }
    @Step
    public void clickLogout(){
        $(getLogout()).click();
    }
    @Step
    public void backToLoginPage(){
        $(getLogin()).click();
    }
}
