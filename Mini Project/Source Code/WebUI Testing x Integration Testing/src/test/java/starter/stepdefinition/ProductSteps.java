package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Web.Product;

public class ProductSteps {
    @Steps
    Product product;

    //Scenario: TC20 - Buy a product to cart
    @Given("I am already login in the web page")
    public void alreadyLoginInTheWebPage(){
        product.openUrl("https://alta-shop.vercel.app/auth/login");
        product.inputEmail("tasyafangg@gmail.com");
        product.inputPassword("Sezzle2021");
        product.clickTheLoginButton();
    }
    @When("I choose the product item")
    public void chooseTheProductItem(){
        product.productAlta();
    }
    @And("I click the buy button")
    public void clickTheBuyButton(){
        product.addProduct();
    }
    @And("I click the cart button 1")
    public void clickTheCartButton1(){
        product.cartProduct();
    }
    @Then("I am successfully add product to cart")
    public void successfullyAddProductToCart(){
        product.showPayButton();
    }

    //Scenario: TC21 - Buy a product to cart but without login
    @Given("I am already login in the web page 2")
    public void alreadyLoginInTheWebPage2(){
        product.openUrl("https://alta-shop.vercel.app/");
    }
    @When("I choose the product item 2")
    public void chooseTheProductItem2(){
        product.productAlta();
    }
    @And("I click the buy button 2")
    public void clickTheBuyButton2(){
        product.addProduct();
    }
    @And("I click the cart button 2")
    public void clickTheCartButton2(){
        product.cartProduct();
    }
    @Then("I am successfully add product to cart without login")
    public void successfullyAddProductToCartWithoutLogin(){
        product.showPayButton();
    }

    //Scenario: TC22 - Increasing product from the cart
    @Given("I am already login in the web page 3")
    public void alreadyLoginInTheWebPage3() {
        product.openUrl("https://alta-shop.vercel.app/auth/login");
        product.inputEmail("tasyafangg@gmail.com");
        product.inputPassword("Sezzle2021");
        product.clickTheLoginButton();
    }
    @When("I choose the product item 3")
    public void chooseTheProductItem3() {
        product.productAlta();
    }
    @And("I click the buy button 3")
    public void clickTheBuyButton3() {
        product.addProduct();

    }
    @And("I click the cart button 3")
    public void clickTheCartButton3() {
        product.cartProduct();
    }
    @And("I add more product item")
    public void addMoreProductItem() {
        product.clickTheAddProduct();
    }
    @Then("I am successfully increase product item")
    public void successfullyIncreaseProductItem() {

    }

    //Scenario: TC23 - Reducing product from the cart
    @Given("I am already login in the web page 4")
    public void alreadyLoginInTheWebPage4() {
        product.openUrl("https://alta-shop.vercel.app/auth/login");
        product.inputEmail("tasyafangg@gmail.com");
        product.inputPassword("Sezzle2021");
        product.clickTheLoginButton();
    }
    @When("I choose the product item 4")
    public void chooseTheProductItem4() {
        product.productAlta();
    }
    @And("I click the buy button 4")
    public void clickTheBuyButton4() {
        product.addProduct();

    }
    @And("I click the cart button 4")
    public void clickTheCartButton4() {
        product.cartProduct();
        product.cartProduct();
        product.cartProduct();
    }
    @And("I subtract product item")
    public void subtractProductItem() {
        product.clickTheSubstractProduct();
    }
    @Then("I am successfully reducing the product item")
    public void successfullyReducingTheProductItem() {

    }

    //Scenario: TC24 - View Product details
    @Given("I am already login in the web page 5")
    public void alreadyLoginInTheWebPage5(){
        product.openUrl("https://alta-shop.vercel.app/auth/login");
        product.inputEmail("tasyafangg@gmail.com");
        product.inputPassword("Sezzle2021");
        product.clickTheLoginButton();
    }
    @When("I choose the product item 5")
    public void chooseTheProductItem5(){
        product.productAlta();
    }
    @And("I click details button")
    public void clickDetailsButton(){
        product.detailsButton();
    }
    @Then("I am successfully view product details")
    public void successfullyViewProductDetails(){
        product.detailsProduct();
    }

    //Scenario: TC25 - View product details without login
    @Given("I am already login in the web page 6")
    public void alreadyLoginInTheWebPage6(){
        product.openUrl("https://alta-shop.vercel.app/");
    }
    @When("I choose the product item 6")
    public void chooseTheProductItem6(){
        product.productAlta();
    }
    @And("I click details button 2")
    public void clickDetailsButton2(){
        product.detailsButton();
    }
    @Then("I am successfully view product details without login")
    public void successfullyViewProductDetailsWithoutLogin(){
        product.detailsProduct();
    }
}
