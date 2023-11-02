package starter.Web;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Logout extends PageObject {
    private By user() {
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }
    private By emailField(){
        return By.id("input-18");
    }
    private By passwordField(){
        return By.id("input-21");
    }
    private By logout() {
        return By.xpath("/html/body/div/div[2]/div/div[2]");
    }
    private SearchableTarget login() {
        return Button.withText("Login");
    }
    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl();
    }
    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickLoginButton(){
        $(login()).click();
    }
    @Step
    public void userButton(){
        $(user()).click();
    }
    @Step
    public void logoutButton(){
        $(logout()).click();
    }
    @Step
    public void loginButtonDisplayed(){
        $(login()).isDisplayed();
    }
}
