package starter.Web;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Product extends PageObject {
    private SearchableTarget login() {
        return Button.withText("Login");
    }
    private By emailField(){
        return By.id("input-18");
    }
    private By passwordField(){
        return By.id("input-21");
    }
    private By product() {
        return By.xpath("//*[@id=\"app\"]/div[1]/main/div/div/div[2]/div/div[2]");
    }
    private By buy() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[2]");
    }
    private By cart() {
        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[1]");
    }
    private By details() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[1]");
    }
    private By productDetails() {
        return By.xpath("/html/body/div/div[1]/main/div/div");
    }
    private SearchableTarget pay() {
        return Button.withText("Bayar");
    }
    private SearchableTarget add() {
        return Button.withText("+");
    }
    private SearchableTarget substract() {
        return Button.withText("-");
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
    public void clickTheLoginButton(){
        $(login()).click();
    }
    @Step
    public static OpenUrl url(String targeturl){
        return new OpenUrl();
    }
    @Step
    public void productAlta(){
        $(product()).isDisplayed();
    }
    @Step
    public void addProduct(){
        $(buy()).click();
    }
    @Step
    public void cartProduct(){
        $(cart()).click();
    }
    @Step
    public void showPayButton(){
        $(pay()).isDisplayed();
    }
    @Step
    public void detailsButton(){
        $(details()).click();
    }
    @Step
    public void detailsProduct(){
        $(productDetails()).isDisplayed();
    }
    @Step
    public void clickTheAddProduct(){
        $(add()).click();
    }
    @Step
    public void clickTheSubstractProduct(){
        $(substract()).click();
    }

}
