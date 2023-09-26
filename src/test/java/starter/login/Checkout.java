package starter.login;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Checkout extends PageObject {
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
    private By firstNameField(){
        return By.id("first-name");
    }
    private By lastNameField(){
        return By.id("last-name");
    }
    private By zipCodeField(){
        return By.id("postal-code");
    }
    private By continueButton(){
        return By.id("continue");
    }
    private By finishButton(){
        return By.id("finish");
    }
    private By epicSadfaceError(){
        return By.cssSelector("h3[data-test='error']");
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
    public void checkoutButton(){
        $(getCheckoutButton()).click();
    }
    @Step
    public void enterFirstName(String firstName){
        $(firstNameField()).type(firstName);
    }
    @Step
    public void enterLastName(String lastName){
        $(lastNameField()).type(lastName);
    }
    @Step
    public void enterZipCode(String postalCode){
        $(zipCodeField()).type(postalCode);
    }
    @Step
    public void providePaymentDetails(){
        $(continueButton()).click();
    }
    @Step
    public void confirmOrder(){
        $(finishButton()).click();
    }
    @Step
    public void validateEpicSadfaceError(){
        $(epicSadfaceError()).isDisplayed();
    }
}