package starter.Web;

import net.serenitybdd.screenplay.actions.OpenUrl;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Transactions extends PageObject {
    private SearchableTarget pay() {
        return Button.withText("Bayar");
    }
    private SearchableTarget login() {
        return Button.withText("Login");
    }
    private By emailField(){
        return By.id("input-18");
    }
    private By passwordField(){
        return By.id("input-21");
    }
    private SearchableTarget addProductTransaction() {
        return Button.withText("+");
    }
    private By user() {
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]");
    }
    private By beli() {
        return By.xpath("/html/body/div/div/main/div/div/div[2]/div/div[1]/div/div[3]/div[2]/button[2]");
    }
    private By cart() {
        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[1]");
    }
    private By transaction() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div");
    }
    private By ascending() {
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[1]/table/thead/tr/th[4]");
    }
    private By descending() {
        return By.xpath("/html/body/div/div/main/div/div/div/div/div[1]/table/thead/tr/th[4]");
    }

    private By transactionMenu() {
        return By.xpath("/html/body/div/div[2]/div/div[1]/div[2]");
    }

    private By rowNumber(){
        return By.xpath("/html/body/div/div[1]/main/div/div/div/div/div[2]/div[1]/div/div/div");
    }

    private By rowNumber10(){
        return By.xpath("/html/body/div/div[3]/div/div[2]/div");
    }

    private By userHeader(){
        return By.xpath("/html/body/div/div/header/div/button[2]/span/i");
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
    public void clickTheLoginButton(){
        $(login()).click();
    }
    @Step
    public void userButton(){
        $(user()).click();
    }
    @Step
    public void addProduct(){
        $(beli()).click();
    }
    @Step
    public void cartProduct(){
        $(cart()).click();
    }
    @Step
    public void increaseProduct(){
        $(addProductTransaction()).click();
    }
    @Step
    public void payTheOrder(){
        $(pay()).click();
    }
    @Step
    public void transactionList(){
        $(transaction()).isDisplayed();
    }
    @Step
    public void loginDisplayed(){
        $(login()).isDisplayed();
    }
    @Step
    public void activateAscending(){
        $(ascending()).click();
    }
    @Step
    public void activateDescending(){
        $(descending()).click();
    }
    @Step
    public void getTransactionMenu(){
        $(transactionMenu()).click();
    }
    @Step
    public void clickRowNumber(){
        $(rowNumber()).click();
    }
    @Step
    public void clickRowNumber10(){
        $(rowNumber10()).click();
    }
    @Step
    public void clickHeaderUser(){
        $(userHeader()).click();
    }
}
