package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Rating;

public class RatingSteps {
    @Steps
    Rating rating;

    //Scenario: TC26 - Give product ratings
    @Given("I am already login in the web page 1")
    public void alreadyLoginInTheWebPage1(){
        rating.openUrl("https://alta-shop.vercel.app/auth/login");
        rating.inputEmail("tasyafangg@gmail.com");
        rating.inputPassword("Sezzle2021");
        rating.ClickLoginButton();
    }
    @When("I choose the product")
    public void chooseTheProduct(){

    }
    @And("I click the details button")
    public void clickTheDetailsButton(){
        rating.detailButton();
    }
    @And("I click the star")
    public void clickTheStar(){
        rating.giveRating();
    }
    @Then("I am successfully give ratings to product")
    public void successfullyGiveRatingsToProduct(){

    }

    //Scenario: TC27 - Give product ratings without login
//    @Given("I am already login in the web page 2")
//    public void alreadyLoginInTheWebPage2(){
//        rating.openUrl("https://alta-shop.vercel.app/");
//    }
//    @When("I choose the product 2")
//    public void chooseTheProduct2(){
//
//    }
//    @And("I click the details button 2")
//    public void clickTheDetailsButton2(){
//        rating.detailButton();
//    }
//    @And("I click the star 2")
//    public void clickTheStar2(){
//        rating.giveRating();
//    }
//    @Then("I am successfully give ratings to product without login")
//    public void successfullyGiveRatingsToProductWithoutLogin(){
//
//    }
}
