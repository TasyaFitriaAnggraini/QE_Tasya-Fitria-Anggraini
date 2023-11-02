package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Category;

public class CategorySteps {

    @Steps
    Category category;

    //Scenario: TC17 - Select category
    @Given("I am already the web page")
    public void alreadyTheWebPage(){
        category.openUrl("https://alta-shop.vercel.app/");
    }
    @When("I click on the transaction button in the navigation menu")
    public void clickOnTheTransactionButtonInTheNavigationMenu(){

    }
    @And("I select the sort by category from the dropdown menu")
    public void selectTheSortByCategoryFromTheDropdownMenu(){
        category.listCategory();
        category.clickProductCategory();
    }
    @Then("I should be taken to a page displaying all the available clothing items for sale")
    public void shouldBeTakenToAPageDisplayingAllTheAvailableClothingItemsForSale(){

    }

    //Scenario: TC18 - Clear category
    @Given("I am already the web page 2")
    public void alreadyTheWebPage2() {
        category.openUrl("https://alta-shop.vercel.app/");
    }

    @When("I click the select category")
    public void clickTheSelectCategory() {
        category.listCategory();
    }

    @And("I choose the category")
    public void chooseTheCategory() {
        category.clickProductCategory();
    }

    @And("I click on the clear button next to the category dropdown menu")
    public void clickOnTheClearButtonNextToTheCategoryDropdownMenu() {
        category.clickTheClearCategory();
    }

    @Then("I should be taken back to the homepage of the web")
    public void shouldBeTakenBackToTheHomepageOfTheWeb() {

    }

    //Scenario: View category
    @Given ("I am already the web page 3")
    public void alreadyTheWebPage3(){
        category.openUrl("https://alta-shop.vercel.app/");
    }
    @When ("I click the select category 2")
    public void clickTheSelectCategory2(){
        category.listCategory();
    }
    @Then ("I see all listed category")
    public void seeAllListedCategory(){

    }
}
