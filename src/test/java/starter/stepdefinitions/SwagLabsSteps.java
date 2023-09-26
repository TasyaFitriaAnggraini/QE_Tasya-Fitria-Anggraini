package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.*;

public class SwagLabsSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Steps
    Checkout checkout;

    @Steps
    AddChart addChart;

    @Steps
    Logout logout;

    @Given("I am on the login page")
    public void ontheLoginPage(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnLoginPage();
    }
    @When("I enter valid username")
    public void enterValidUsername(){
        login.inputUsername("standard_user");
    }
    @And("I enter valid password")
    public void enterValidPassword(){
        login.inputPassword("secret_sauce");
    }
    @And("I click login button")
    public void clickLoginButton(){
        login.clickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        home.validateOnTheHomePage();
    }


    @Given("I am an the login page")
    public void anTheLoginPage(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnLoginPage();
    }
    @When("I enter an incorrect username")
    public void enterIncorrectUsername(){
        login.inputUsername("invalid_user");
    }
    @And("I input valid password")
    public void inputValidPassword(){
        login.inputPassword("secret_sauce");
    }
    @And("I click the login button")
    public void clickTheLoginButton(){
        login.clickLoginButton();
    }
    @Then("I will get the Epic sadface error")
    public void validateEpicSadfaceError(){
        login.validateEpicSadfaceError();
    }


    @Given("I am the login page")
    public void theLoginPage(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnLoginPage();
    }
    @When("I input valid username")
    public void inputValidUsername(){
        login.inputUsername("standard_user");
    }
    @And("I enter an incorrect password")
    public void enterIncorrectPassword(){
        login.inputPassword("invalid_password");
    }
    @And("I click an login button")
    public void clickAnLoginButton(){
        login.clickLoginButton();
    }
    @Then("I will get an the Epic sadface error")
    public void validateTheEpicSadfaceError(){
        login.validateEpicSadfaceError();
    }


    @Given("I am login as a standard user")
    public void loginStandardUser() {
        login.openUrl("https://www.saucedemo.com/");
        checkout.enterUsernameField("standard_user");
        checkout.enterPasswordField("secret_sauce");
        checkout.clickTheLoginButton();
    }

    @Then("I initiate the checkout process")
    public void checkoutProcess() {
        checkout.checkoutButton();
    }

    @And("I provide the required information, including shipping and payment details")
    public void provideRequiredInformation() {
        checkout.openUrl("https://www.saucedemo.com/checkout-step-one.html");
        checkout.enterFirstName("Wiyan");
        checkout.enterLastName("Herra");
        checkout.enterZipCode("50299");
        checkout.providePaymentDetails();
    }

    @And("I confirm my order")
    public void confirmOrder(){
        checkout.confirmOrder();
    }


    @Given("I am logged in as a standard user")
    public void loggedInStardardUser(){
        login.openUrl("https://www.saucedemo.com/");
        checkout.enterUsernameField("standard_user");
        checkout.enterPasswordField("secret_sauce");
        checkout.clickTheLoginButton();
    }
    @When("I click on Continue with a missing postal code on checkout-step-one")
    public void continueMissingPostalCode(){
        checkout.openUrl("https://www.saucedemo.com/checkout-step-one.html");
        checkout.enterFirstName("Wiyan");
        checkout.enterLastName("Herra");
    }
    @And("I try to proceed to the next step")
    public void tryProceedTheNextStep(){
        checkout.enterFirstName("Wiyan");
        checkout.enterLastName("Herra");
        checkout.providePaymentDetails();
    }
    @Then("I should receive an error message indicating that the postal code is required")
    public void receiveErrorMessage(){
        checkout.validateEpicSadfaceError();
    }


    @Given("I am logged in to the SauceDemo site")
    public void loggedInToTheSauceDemoSite(){
        login.openUrl("https://www.saucedemo.com/");
        addChart.enterUsernameField("standard_user");
        addChart.enterPasswordField("secret_sauce");
        addChart.clickTheLoginButton();
    }
    @When("I add an item to my cart")
    public void addItemToMyCart(){
        addChart.clickCheckoutButton();
    }
    @And("An item is successfully added to my cart")
    public void itemSuccessfullyAddCart(){
        addChart.clickChartButton();
    }
    @Then("I should see a remove from cart button displayed next to the item in my cart")
    public void removeItemFromCart(){
        addChart.clickRemoveChartButton();
    }


    @Given("I am login in to the SauceDemo site")
    public void loginTheSauceDemo(){
        login.openUrl("https://www.saucedemo.com/");
        addChart.enterUsernameField("standard_user");
        addChart.enterPasswordField("secret_sauce");
        addChart.clickTheLoginButton();
    }
    @When("I add item to my cart")
    public void addItemMyCart(){
        addChart.clickCheckoutButton();
    }
    @Then("I click cart button")
    public void clickCartButton(){
        addChart.clickChartButton();
    }
    @And("I click continue shopping button")
    public void clickContinueShoppingButton(){
        addChart.clickContinueShoppingButton();
    }
    @And("I add new item to cart")
    public void addNewItemToCart(){
        addChart.clickNewCheckoutButton();
    }
    @Then("I see update item in my cart")
    public void updateItemInMyCart(){
        addChart.clickChartButton();
    }


    @Given("I am already logged in to the SauceDemo site")
    public void alreadyLoggedInToSauceDemoSite(){
        login.openUrl("https://www.saucedemo.com/");
        logout.enterUsernameField("standard_user");
        logout.enterPasswordField("secret_sauce");
        logout.clickTheLoginButton();
    }
    @When("I click menu")
    public void clickMenu(){
        logout.clickMenuButton();
    }
    @And("I click Log Out")
    public void clickLogout(){
        logout.clickLogout();
    }
    @Then("I should be directed to the main log in page")
    public void shouldBeDirectedTheMainLoginPage(){
        logout.backToLoginPage();
    }
}