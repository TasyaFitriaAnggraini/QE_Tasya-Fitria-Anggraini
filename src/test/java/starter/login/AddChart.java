package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AddChart extends PageObject {
    private By enterUsernameField() {
        return By.id("user-name");
    }
    private By enterPasswordField(){
        return By.id("password");
    }
    private By loginTheButton(){
        return By.id("login-button");
    }
    private By getCheckoutButton(){
        return By.id("add-to-cart-sauce-labs-backpack");
    }
    private By getChartButton(){
        return By.id("shopping_cart_container");
    }
    private By getRemoveChartButton(){
        return By.id("remove-sauce-labs-backpack");
    }
    private By getContinueShoppingButton(){
        return By.id("continue-shopping");
    }
    private By getNewCheckoutButton() {
        return By.id("add-to-cart-sauce-labs-bike-light");
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
    public void clickCheckoutButton(){
        $(getCheckoutButton()).click();
    }
    @Step
    public void clickChartButton(){
        $(getChartButton()).click();
    }
    @Step
    public void clickRemoveChartButton(){
        $(getRemoveChartButton()).click();
    }
    @Step
    public void clickContinueShoppingButton(){
        $(getContinueShoppingButton()).click();
    }
    @Step
    public void clickNewCheckoutButton(){
        $(getNewCheckoutButton()).click();
    }
}