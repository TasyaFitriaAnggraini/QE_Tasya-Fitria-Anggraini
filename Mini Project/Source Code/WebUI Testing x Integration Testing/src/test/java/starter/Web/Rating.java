package starter.Web;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Rating extends PageObject {
    private By emailField(){
        return By.id("input-18");
    }
    private By passwordField(){
        return By.id("input-21");
    }
    private SearchableTarget login() {
        return Button.withText("Login");
    }
    private By detail() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[1]");
    }
    private By rating5() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div/div/div/div/div/button[5]");
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
    public void ClickLoginButton(){
        $(login()).click();
    }
    @Step
    public void detailButton(){
        $(detail()).click();
    }
    @Step
    public void giveRating(){
        $(rating5()).click();
    }
}
