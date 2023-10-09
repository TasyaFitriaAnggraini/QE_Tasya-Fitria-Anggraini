import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



public class App {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	//Scenario Outline: User want to register to app
	@Given("User open the app")
	public void User_open_the_app() {
		Mobile.startApplication('D:/SEMESTER 5/app.apk', true)
	}

	@When("User redirect to the register page")
	public void User_redirect_to_the_register_page() {
		Mobile.tap(findTestObject('Object Repository/1 - Register Valid/android.widget.TextView - No account yet Create one'), 0)
	}

	@And("User set Name {string}")
	public void User_set_name(String name) {
		Mobile.setText(findTestObject('Object Repository/1 - Register Valid/android.widget.EditText'), 'Tasya Fitria Anggraini', 0)
	}

	@And("User set Email {string}")
	public void User_set_email(String email) {
		Mobile.setText(findTestObject('Object Repository/1 - Register Valid/android.widget.EditText (1)'), 'tasyafangg@gmail.com', 0)
	}

	@And("User set Password {string}")
	public void User_set_password(String password) {
		Mobile.setText(findTestObject('Object Repository/1 - Register Valid/android.widget.EditText (2)'), '@Alterra5', 0)
	}

	@And("User Confirm password")
	public void User_set_confirm_password(String confirmPassword) {
		Mobile.setText(findTestObject('Object Repository/1 - Register Valid/android.widget.EditText (3)'), '@Alterra5', 0)
	}

	@And("User click Register button")
	public void User_click_register_button() {
		Mobile.tap(findTestObject('Object Repository/1 - Register Valid/android.widget.Button - REGISTER'), 0)
	}

	@Then("User registered to the app successfully")
	public void User_registered_to_the_app_successfully() {
		Mobile.tap(findTestObject('Object Repository/1 - Register Valid/android.widget.Button - REGISTER'), 0)
		Mobile.tap(findTestObject('Object Repository/1 - Register Valid/android.widget.TextView - Already a member Login'), 0)
		Mobile.closeApplication()
	}

	//User want to register to app invalid register with missing password field
	@Given("User open in the app")
	public void User_open_in_the_app() {
		Mobile.startApplication('D:/SEMESTER 5/app.apk', true)
	}

	@When("User redirect in the register page")
	public void User_redirect_in_the_register_page() {
		Mobile.tap(findTestObject('Object Repository/2 - Register Invalid/android.widget.TextView - No account yet Create one'), 0)
	}

	@And("User set the Name {string}")
	public void User_set_the_name(String name) {
		Mobile.setText(findTestObject('Object Repository/2 - Register Invalid/android.widget.EditText'), 'Tasya Fitria Anggraini', 0)
	}

	@And("User set the Email {string}")
	public void User_set_the_email(String email) {
		Mobile.setText(findTestObject('Object Repository/2 - Register Invalid/android.widget.EditText (1)'), 'tasyafangg@gmail.com', 0)
	}

	@And("User set the Password {string}")
	public void User_set_the_password(String password) {
		Mobile.setText(findTestObject('Object Repository/2 - Register Invalid/android.widget.EditText (2)'), '@Alterra5', 0)
	}

	@And("User missed Password field")
	public void User_missed_password_field() {
		Mobile.tap(findTestObject('Object Repository/2 - Register Invalid/android.widget.EditText (3)'), 0)
		Mobile.tap(findTestObject('Object Repository/2 - Register Invalid/android.widget.TextView - Password Does Not Matches'), 0)
	}

	@And("User click the Register button")
	public void User_click_the_register_button() {
		Mobile.tap(findTestObject('Object Repository/2 - Register Invalid/android.widget.Button - REGISTER'), 0)
	}

	@Then("User cannot successfully register to the app and get warning message to fill password")
	public void User_cannot_successfully_register_to_the_app_and_get_warning_message_to_fill_password() {
		Mobile.tap(findTestObject('Object Repository/2 - Register Invalid/android.widget.Button - REGISTER'), 0)
		Mobile.closeApplication()
	}

	//User want to login to app
	@Given("User open in the aplikasi app")
	public void User_open_in_the_aplikasi_app() {
		Mobile.startApplication('D:/SEMESTER 5/app.apk', true)
	}

	@And("User register to the app")
	public void User_register_to_the_app() {
		Mobile.tap(findTestObject('Object Repository/3 - Login Valid/android.widget.TextView - No account yet Create one'), 0)
		Mobile.setText(findTestObject('Object Repository/3 - Login Valid/android.widget.EditText'), 'Tasya Fitria Anggrfaini', 0)
		Mobile.setText(findTestObject('Object Repository/3 - Login Valid/android.widget.EditText (1)'), 'tasyafangg@gmail.com', 0)
		Mobile.setText(findTestObject('Object Repository/3 - Login Valid/android.widget.EditText (2)'), '@Alterra5', 0)
		Mobile.setText(findTestObject('Object Repository/3 - Login Valid/android.widget.EditText (3)'), '@Alterra5', 0)
	}
	@When("User has registered to sistem")
	public void User_has_registered_to_sistem() {
		Mobile.tap(findTestObject('Object Repository/3 - Login Valid/android.widget.Button - REGISTER'), 0)
	}

	@And("User redirect to login")
	public void User_redirect_to_login() {
		Mobile.tap(findTestObject('Object Repository/3 - Login Valid/android.widget.TextView - Already a member Login'), 0)
	}

	@And("User set in the Email {string}")
	public void User_set_in_the_email(String email) {
		Mobile.setText(findTestObject('Object Repository/3 - Login Valid/android.widget.EditText (4)'), 'tasyafangg@gmail.com', 0)
	}

	@And("User set in the Password")
	public void User_set_in_the_password(String password) {
		Mobile.setText(findTestObject('Object Repository/3 - Login Valid/android.widget.EditText (5)'), '@Alterra5', 0)
	}

	@And("User click login button")
	public void User_click_login_buton() {
		Mobile.tap(findTestObject('Object Repository/3 - Login Valid/android.widget.Button - LOGIN'), 0)
	}

	@Then("User logged in to the app successfully")
	public void User_logged_in_the_app_successfully() {
		Mobile.tap(findTestObject('Object Repository/3 - Login Valid/android.widget.Button - LOGIN'), 0)
		Mobile.closeApplication()
	}

	//User want to login to app invalid credentials
	@Given("User open the aplikasi app")
	public void User_open_the_aplikasi_app() {
		Mobile.startApplication('D:/SEMESTER 5/app.apk', true)
	}

	@And("User register in the to app")
	public void User_register_in_the_app() {
		Mobile.tap(findTestObject('Object Repository/4 - Login Invalid/android.widget.TextView - No account yet Create one'), 0)
		Mobile.setText(findTestObject('Object Repository/4 - Login Invalid/android.widget.EditText'), 'Tasya Fitria Anggraini', 0)
		Mobile.setText(findTestObject('Object Repository/4 - Login Invalid/android.widget.EditText (1)'), 'tasyafangg@gmail.com', 0)
		Mobile.setText(findTestObject('Object Repository/4 - Login Invalid/android.widget.EditText (2)'), '@Alterra5', 0)
		Mobile.setText(findTestObject('Object Repository/4 - Login Invalid/android.widget.EditText (3)'), '@Alterra5', 0)
	}

	@When("User has registered in to sistem")
	public void User_has_registered_in_to_sistem() {
		Mobile.tap(findTestObject('Object Repository/4 - Login Invalid/android.widget.Button - REGISTER'), 0)
	}

	@And("User redirect in to login")
	public void User_redirect_in_to_login() {
		Mobile.tap(findTestObject('Object Repository/4 - Login Invalid/android.widget.TextView - Already a member Login'), 0)
	}

	@And("User set in Email {string}")
	public void User_set_in_email(String email) {
		Mobile.setText(findTestObject('Object Repository/4 - Login Invalid/android.widget.EditText (4)'), 'tasyafangg@gmail.com', 0)
	}

	@And("User missed the Password field")
	public void User_missed_the_Password_field() {
		Mobile.tap(findTestObject('Object Repository/4 - Login Invalid/android.widget.EditText (5)'), 0)
		Mobile.tap(findTestObject('Object Repository/4 - Login Invalid/android.widget.TextView - Enter Valid Email'), 0)
	}

	@And("User click the login button")
	public void User_the_login_button() {
		Mobile.tap(findTestObject('Object Repository/4 - Login Invalid/android.widget.Button - LOGIN'), 0)
	}

	@Then("User cannot logged in to the app successfully and get mesaage warning")
	public void User_cannot_logged_in_to_the_app_successfully_get_message_warning() {
		Mobile.tap(findTestObject('Object Repository/4 - Login Invalid/android.widget.Button - LOGIN'), 0)
		Mobile.closeApplication()
	}

	//User to access dasboard
	@Given("User open aplikasi the app")
	public void User_open_aplikasi_the_app() {
		Mobile.startApplication('D:/SEMESTER 5/app.apk', true)
	}

	@When("User redirect register page")
	public void User_redirect_register_page() {
		Mobile.tap(findTestObject('Object Repository/5 - Dashboard/android.widget.TextView - No account yet Create one'), 0)
	}

	@And("User set Name in the app {string}")
	public void User_set_name_in_the_app(String name) {
		Mobile.setText(findTestObject('Object Repository/5 - Dashboard/android.widget.EditText'), 'Tasya Fitria Anggraini', 0)
	}

	@And("User set Email in the app {string}")
	public void User_set_email_in_the_app(String password) {
		Mobile.setText(findTestObject('Object Repository/5 - Dashboard/android.widget.EditText (1)'), 'tasyafangg@gmail.com', 0)
	}

	@And("User set Password in the app {string}")
	public void User_set_password_in_the_app(String password) {
		Mobile.setText(findTestObject('Object Repository/5 - Dashboard/android.widget.EditText (2)'), '@Alterra5', 0)
	}

	@And("User set Confirm Password in the app {string}")
	public void User_set_confirm_password_in_the_app(String confirmPassword) {
		Mobile.setText(findTestObject('Object Repository/5 - Dashboard/android.widget.EditText (3)'), '@Alterra5', 0)
	}

	@And("User click in the register button")
	public void User_click_in_the_register_button() {
		Mobile.tap(findTestObject('Object Repository/5 - Dashboard/android.widget.Button - REGISTER'), 0)
	}

	@When("User successfully register redirect to login page")
	public void User_successfully_register_redirect_to_login_page() {
		Mobile.tap(findTestObject('Object Repository/5 - Dashboard/android.widget.TextView - Already a member Login'), 0)
	}

	@And("User set Email to app {string}")
	public void User_set_email_to_app(String email) {
		Mobile.setText(findTestObject('Object Repository/5 - Dashboard/android.widget.EditText (4)'), 'tasyafangg@gmail.com', 0)
	}

	@And("User set Passowrd in the app")
	public void User_password_in_the_app(String password) {
		Mobile.setText(findTestObject('Object Repository/5 - Dashboard/android.widget.EditText (5)'), '@Alterra5', 0)
	}

	@And("User click in the login button")
	public void User_click_in_the_login_button() {
		Mobile.tap(findTestObject('Object Repository/5 - Dashboard/android.widget.Button - LOGIN'), 0)
	}

	@Then("User can successfully go to dashboard")
	public void User_can_successfully_go_to_dashboard() {
		Mobile.tap(findTestObject('Object Repository/5 - Dashboard/android.widget.FrameLayout'), 0)
		Mobile.closeApplication()
	}
}