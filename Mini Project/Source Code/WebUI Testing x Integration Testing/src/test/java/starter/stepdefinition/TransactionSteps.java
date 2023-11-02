package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Transactions;

public class TransactionSteps {
    @Steps
    Transactions transactions;

    //Scenario: TC28 - View transaction
    @Given("I am already login in the web page alta")
    public void alreadyLoginInTheWebPageAlta(){
        transactions.openUrl("https://alta-shop.vercel.app/auth/login");
        transactions.inputEmail("tasyafangg@gmail.com");
        transactions.inputPassword("Sezzle2021");
        transactions.clickTheLoginButton();
    }
    @When("I do the transaction")
    public void doTheTransaction(){
        transactions.addProduct();
        transactions.cartProduct();
        transactions.increaseProduct();
        transactions.payTheOrder();
    }
    @Then("I can see user transaction history")
    public void canSeeUserTransactionHistory(){
        transactions.transactionList();
    }

    //Scenario: TC29 - View transaction but without login
    @Given("I am already login in the web page alta 2")
    public void alreadyLoginInTheWebPageAlta2() {
        transactions.openUrl("https://alta-shop.vercel.app/");
    }
    @When("I click user transaction 2")
    public void clickUserTransaction2() {
        transactions.clickHeaderUser();
    }
    @Then("I am navigate to login first")
    public void navigateToLoginFirst() {
        transactions.loginDisplayed();
    }

    //Scenario: TC30 - Pay the order
    @Given("I am already login in the web page alta 3")
    public void alreadyLoginInTheWebPageAlta3(){
        transactions.openUrl("https://alta-shop.vercel.app/auth/login");
        transactions.inputEmail("tasyafangg@gmail.com");
        transactions.inputPassword("Sezzle2021");
        transactions.clickTheLoginButton();
    }
    @When("I add the some product to cart")
    public void addTheSomeProductToCart(){
        transactions.addProduct();
    }
    @And("I go to the user cart")
    public void goToTheUserCart(){
        transactions.cartProduct();
    }
    @And("I checking the product before paying")
    public void checkingTheProductBeforePaying(){
        transactions.increaseProduct();
        transactions.increaseProduct();
    }
    @And("I click the pay button")
    public void clickThePayButton(){
        transactions.payTheOrder();
    }
    @Then("I am successfully pay the product")
    public void successfullyPayTheProduct(){
        transactions.transactionList();
    }

    //Scenario: TC31 - Failed pay the order without login
    @Given("I am already login in the web page alta 4")
    public void alreadyLoginInTheWebPageAlta4(){
        transactions.openUrl("https://alta-shop.vercel.app");
    }
    @When("I add the some product to cart 2")
    public void addTheSomeProductToCart2(){
        transactions.addProduct();
    }
    @And("I go to the user cart 2")
    public void goToUserCart2(){
        transactions.cartProduct();
    }
    @And("I checking the product before paying 2")
    public void checkingTheProductBeforePaying2(){
        transactions.increaseProduct();
        transactions.increaseProduct();
    }
    @And("I click the pay button 2")
    public void clickThePayButton2(){
        transactions.payTheOrder();
    }
    @Then("I am failed pay the product and redirected to login page")
    public void failedPayTheProductAndRedirectedToLoginPage(){
        transactions.loginDisplayed();
    }

    //Scenario: TC32 - View user transaction in ascending order
    @Given("I am already login in the web page alta 5")
    public void alreadyLoginInTheWebPageAlta5(){
        transactions.openUrl("https://alta-shop.vercel.app/auth/login");
        transactions.inputEmail("tasyafangg@gmail.com");
        transactions.inputPassword("Sezzle2021");
        transactions.clickTheLoginButton();
    }
    @When("I do the product transaction")
    public void doTheProductTransaction(){
        transactions.addProduct();
        transactions.cartProduct();
        transactions.increaseProduct();
        transactions.payTheOrder();
    }
    @And("I can see the transactions history")
    public void canSeeTheTransactionHistory(){
        transactions.transactionList();
    }
    @And("I click the ascending button")
    public void clickTheAscendingButton(){
        transactions.activateAscending();
    }
    @Then("I can see view user transaction in ascending order")
    public void canSeeViewUserTransactionInAscendingOrder(){

    }

    //Scenario: TC33 - View user transaction in descending order
    @Given("I am already login in the web page alta 6")
    public void alreadyLoginInTheWebPageAlta6(){
        transactions.openUrl("https://alta-shop.vercel.app/auth/login");
        transactions.inputEmail("tasyafangg@gmail.com");
        transactions.inputPassword("Sezzle2021");
        transactions.clickTheLoginButton();
    }
    @When("I do the product transaction 2")
    public void doTheProductTransaction2(){
        transactions.addProduct();
        transactions.cartProduct();
        transactions.increaseProduct();
        transactions.payTheOrder();
    }
    @And("I can see the transactions history 2")
    public void canSeeTheTransactionHistory2(){
        transactions.transactionList();
    }
    @And("I click the descending button")
    public void clickTheDescendingButton(){
        transactions.activateAscending();
        transactions.activateDescending();
    }
    @Then("I can see view user transaction in descending order")
    public void canSeeViewUserTransactionInDescendingOrder(){

    }

    //Scenario: TC34 - Set the number of transaction history per page
    @Given("I am already login in the web page alta 7")
    public void alreadyLoginInTheWebPageAlta7() {
        transactions.openUrl("https://alta-shop.vercel.app/auth/login");
        transactions.inputEmail("tasyafangg@gmail.com");
        transactions.inputPassword("Sezzle2021");
        transactions.clickTheLoginButton();
    }

    @When("I do the transaction 2")
    public void doTheTransaction2() {
        transactions.addProduct();
        transactions.cartProduct();
        transactions.increaseProduct();
        transactions.payTheOrder();
    }

    @And("I can view the transactions history")
    public void canViewTheTransactionsHistory() {
        transactions.userButton();
        transactions.getTransactionMenu();
    }

    @And("I choose sort by transaction")
    public void chooseSortByTransaction() {

    }

    @And("I set the number of item per page")
    public void setTheNumberOfItemPerHalaman() {
        transactions.clickRowNumber();
        transactions.clickRowNumber10();
    }

    @Then("I should see the history transaction item on the page")
    public void shouldSeeTheHistoryTransactionItemOnThePage() {

    }
}
