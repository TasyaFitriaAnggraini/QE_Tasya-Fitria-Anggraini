package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Login;

public class LoginSteps {
    @Steps
    Login login;

    //Scenario: TC09 - Login using valid account
    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.loginButton();
    }
    @When("I enter valid email 8")
    public void enterValidEmail8(){
        login.inputEmail("tasyafangg@gmail.com");
    }
    @And("I enter valid password 8")
    public void enterValidPassword8(){
        login.inputPassword("Sezzle2021");
    }
    @And("I click the login button")
    public void clickTheLoginButton(){
        login.clickLoginButton();
    }
    @Then("I am successfully login")
    public void successfullyLogin(){
        login.onTheDashboardPage();
    }

    //Scenario: TC10 - Login using valid account but empty email
    @Given("I am on the login page 2")
    public void onTheLoginPage2(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.loginButton();
    }
    @When("Email field is empty")
    public void emailFieldIsEmpty(){
        login.inputEmail("");
    }
    @And("I enter valid password 9")
    public void enterValidPassword9(){
        login.inputPassword("Sezzle2021");
    }
    @And("I click the login button 2")
    public void clickTheLoginButton2(){
        login.clickLoginButton();
    }
    @Then("I am failed to login 2")
    public void failedToLogin2() {
        login.errorAlertMessage();
    }

    //Scenario: TC11 - Login using valid account but empty password
    @Given("I am on the login page 3")
    public void onTheLoginPage3(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.loginButton();
    }
    @When("I enter valid email 10")
    public void enterValidEmail10(){
        login.inputEmail("tasyafangg@gmail.com");
    }
    @And("Password field is empty")
    public void passwordFieldIsEmpty(){
        login.inputPassword("");
    }
    @And("I click the login button 3")
    public void clickTheLoginButton3(){
        login.clickLoginButton();
    }
    @Then("I am failed to login 3")
    public void failedToLogin3(){
        login.errorAlertMessage();
    }

    //Scenario: TC12 - Login using valid account but fill the email with password and fill the password with email
    @Given("I am on the login page 4")
    public void onTheLoginPage4() {
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.loginButton();
    }
    @When("I enter email with password")
    public void enterEmailWithPassword() {
        login.inputEmail("Sezzle2021");
    }
    @And("I enter password with email")
    public void enterPasswordWithEmail() {
        login.inputPassword("tasyafangg@gmail.com");
    }
    @And("I click the login button 4")
    public void clickTheLoginButton4() {
        login.clickLoginButton();
    }
    @Then("I am failed to login 4")
    public void failedToLogin4() {
        login.errorAlertMessage();
    }

    //Scenario: TC13 - Login using valid account but fill the email field with fullname
    @Given("I am on the login page 5")
    public void onTheLoginPage5() {
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.loginButton();
    }
    @When("I enter email with fullname")
    public void enterEmailWithFullname() {
        login.inputEmail("Tasya Fitria Anggraini");
    }
    @And("I enter valid password 11")
    public void enterValidPassword11() {
        login.inputPassword("Sezzle2021");
    }
    @And("I click the login button 5")
    public void clickTheLoginButton5() {
        login.clickLoginButton();
    }
    @Then("I am failed to login 5")
    public void failedToLogin5() {
        login.errorAlertMessage();
    }

    //Scenario: TC14 - Login using valid account but invalid email
    @Given("I am on the login page 6")
    public void onTheLoginPage6(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.loginButton();
    }
    @When("I enter invalid email 2")
    public void enterInvalidEmail2(){
        login.inputEmail("tasyafanggg@gmail.com");
    }
    @And("I enter valid password 12")
    public void enterValidPassword12(){
        login.inputPassword("Sezzle2021");
    }
    @And("I click the login button 6")
    public void clickTheLoginButton6(){
        login.clickLoginButton();
    }
    @Then("I am failed to login 6")
    public void FailedToLogin(){
        login.errorAlertMessage();
    }

    //Scenario: TC15 - Login without fill any field
    @Given("I am on the login page 7")
    public void onTheLoginPage7(){
        login.openUrl("https://alta-shop.vercel.app/auth/login");
        login.loginButton();
    }
    @When("I not enter email")
    public void notEnterEmail(){
        login.inputEmail("");
    }
    @And("I not enter password")
    public void notEnterPassword(){
        login.inputPassword("");
    }
    @And("I click the login button 7")
    public void clickTheLoginButton7(){
        login.clickLoginButton();
    }
    @Then("I am failed to login 7")
    public void failedToLogin7(){
        login.errorAlertMessage();
    }
}
