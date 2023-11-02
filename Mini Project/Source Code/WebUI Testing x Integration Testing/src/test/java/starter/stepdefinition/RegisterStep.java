package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Register;

public class RegisterStep {
    @Steps
    Register register;

    //Scenario: TC01 - Register with valid data
    @Given("I am on the register page 1")
    public void onTheRegisterPage() {
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
    }
    @When("I enter valid full name 1")
    public void enterValidFullName() {
        register.inputFullName("Tasimah Fitri Yanti");
    }
    @And("I enter valid email 1")
    public void enterValidEmail() {
        register.inputEmail("fitritest1@mail.com");
    }
    @And("I enter valid password 1")
    public void enterValidPassword() {
        register.inputPassword("Fitri2021");
    }
    @And("I click register button 1")
    public void clickRegisterButton() {
        register.clickRegisterButton();
    }
    @Then("I successfully register and redirected to login page 1")
    public void onTheHomePage(){
        register.redirectedToLoginPage();
    }

    //Scenario: TC02 - Register with invalid full name 2 space
//    @Given("I am on the register page 5")
//    public void onTheRegisterPage5() {
//        register.openUrl("https://alta-shop.vercel.app/auth/register");
//        register.validateOnRegisterPage();
//    }
//    @When("I enter invalid the full name")
//    public void enterInvalidTheFullName() {
//        register.inputFullName("                             ");
//    }
//    @And("I enter valid email 5")
//    public void enterValidEmail5() {
//        register.inputEmail("acalagitest@mail.com");
//    }
//    @And("I enter valid password 5")
//    public void enterValidPassword5() {
//        register.inputPassword("icici123");
//    }
//    @Then("I click register button 5")
//    public void clickRegisterButton5() {
//        register.clickRegisterButton();
//    }

    //Scenario: TC03 - Register with invalid email 2 space
//    @Given("I am on the register page 6")
//    public void onTheRegisterPage6() {
//        register.openUrl("https://alta-shop.vercel.app/auth/register");
//        register.validateOnRegisterPage();
//    }
//    @When("I enter valid full name 6")
//    public void enterValidFullName6() {
//        register.inputFullName("Tasya Fitria Anggraini");
//    }
//    @And("I enter invalid the email")
//    public void enterInvalidTheEmail() {
//        register.inputEmail("  ");
//    }
//    @And("I enter valid password 6")
//    public void enterValidPassword6() {
//        register.inputPassword("aca123");
//    }
//    @Then("I click register button 6")
//    public void clickRegisterButton6() {
//        register.clickRegisterButton();
//    }

    //Scenario: TC04 - Register with invalid password 2 space
//    @Given("I am on the register page 7")
//    public void onTheRegisterPage7() {
//        register.openUrl("https://alta-shop.vercel.app/auth/register");
//        register.validateOnRegisterPage();
//    }
//    @When("I enter valid full name 7")
//    public void enterValidFullName7() {
//        register.inputFullName("Tasya Fitria Anggraini");
//    }
//    @And("I enter valid email 7")
//    public void enterValidEmail7() {
//        register.inputEmail("acatest3@mail.com");
//    }
//    @And("I enter invalid the password")
//    public void enterInvalidThePassword() {
//        register.inputPassword("  ");
//    }
//    @Then("I click register button 7")
//    public void clickRegisterButton7() {
//        register.clickRegisterButton();
//    }

    //Scenario: TC05 - Register without using fullname
    @Given("I am on the register page 2")
    public void onTheRegisterPage2() {
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
    }
    @When("I enter invalid full name")
    public void enterInvalidFullName() {
        register.inputFullName("");
    }
    @And("I enter valid email 2")
    public void enterValidEmail2() {
        register.inputEmail("acatest@mail.com");
    }
    @And("I enter valid password 2")
    public void enterValidPassword2() {
        register.inputPassword("Naura2021");
    }
    @And("I click register button 2")
    public void clickRegisterButton2() {
        register.clickRegisterButton();
    }
    @Then("I failed to register and redirected to the login page 2")
    public void failedRegisterandRedirectedInHomepage2() {
        register.allertAppear();
    }

    //Scenario: TC06 - Register without using email
    @Given("I am on the register page 3")
    public void onTheRegisterPage3() {
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
    }
    @When("I enter valid full name 3")
    public void enterValidFullName3() {
        register.inputFullName("Naura Vieta Hafla");
    }
    @And("I enter invalid email")
    public void enterInvalidEmail() {
        register.inputEmail("");
    }
    @And("I enter valid password 3")
    public void enterValidPassword3() {
        register.inputPassword("Naura2021");
    }
    @And("I click register button 3")
    public void clickRegisterButton3() {
        register.clickRegisterButton();
    }
    @Then("I failed to register and redirected to the login page 3")
    public void failedRegisterandRedirectedInHomepage3() {
        register.allertAppear();
    }

    //Scenario: TC07 - Register without using password
    @Given("I am on the register page 4")
    public void onTheRegisterPage4() {
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
    }
    @When("I enter valid full name 4")
    public void enterValidFullName4() {
        register.inputFullName("Naura vieta Hafla");
    }
    @And("I enter valid email 4")
    public void enterValidEmail4() {
        register.inputEmail("acatest@mail.com");
    }
    @And("I enter invalid password")
    public void enterInvalidPassword() {
        register.inputPassword("");
    }
    @And("I click register button 4")
    public void clickRegisterButton4() {
        register.clickRegisterButton();
    }
    @Then("I failed to register and redirected to the login page 4")
    public void failedRegisterandRedirectedInHomepage4() {
        register.allertAppear();
    }

    //Scenario: TC08 - Register with existed account
    @Given("I am in the register page 5")
    public void inTheRegisterPage5() {
        register.openUrl("https://alta-shop.vercel.app/auth/register");
        register.validateOnRegisterPage();
    }
    @When("I enter valid full name 5")
    public void enterValidFullName5() {
        register.inputFullName("Tasimah Fitri Yanti");
    }
    @And("I enter the valid email 5")
    public void enterTheValidEmail5() {
        register.inputEmail("fitritest1@mail.com");
    }
    @And("I enter the valid password 5")
    public void enterTheValidPassword5() {
        register.inputPassword("Fitri2021");
    }
    @And("I click the register button 5")
    public void clickTheRegisterButton5() {
        register.clickRegisterButton();
    }
    @Then("I failed register and get warning message")
    public void failedRegisterAndGetWarningMessage() {

    }
}
