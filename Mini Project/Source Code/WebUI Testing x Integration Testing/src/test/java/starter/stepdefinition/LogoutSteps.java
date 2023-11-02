package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Logout;

public class LogoutSteps {
    @Steps
    Logout logout;

    //Scenario: TC16 - Successfully logout
    @Given("I am already the login")
    public void alreadyTheLogin(){
        logout.openUrl("https://alta-shop.vercel.app/auth/login");
        logout.inputEmail("tasyafangg@gmail.com");
        logout.inputPassword("Sezzle2021");
        logout.clickLoginButton();
    }
    @When("I click the user button")
    public void clickTheUserButton(){
        logout.userButton();
    }
    @And("I click the logout button")
    public void clickTheLogoutButton(){
        logout.logoutButton();
    }
    @Then("I am successfully logout")
    public void successfullyLogout(){
        logout.loginButtonDisplayed();
    }
}
