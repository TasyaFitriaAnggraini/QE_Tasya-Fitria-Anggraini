package starter.Web;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private SearchableTarget login() {
        return Button.withText("Login");
    }
    private By emailField(){
        return By.id("input-18");
    }
    private By passwordField(){
        return By.id("input-21");
    }
    private By dashboard() {
        return By.className("container");
    }
    private By allert() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]");
    }
    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl();
    }
    @Step
    public void loginButton(){
        $(login()).isDisplayed();
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
    public void onTheDashboardPage(){
        $(dashboard()).isDisplayed();
    }
    @Step
    public void errorAlertMessage(){
        $(allert()).isDisplayed();
    }
}
