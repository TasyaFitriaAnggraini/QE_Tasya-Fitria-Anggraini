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



class LoginSteps {


	@When("I enter valid email and password")
	def dataLoginValid() {

		Mobile.setText(findTestObject('Object-LoginPage/android.widget.EditText-Email-Login'), 'ahsan123@gmail.com', 0)

		Mobile.setText(findTestObject('Object-LoginPage/android.widget.EditText-Password-Login'), 'praktikum123', 0)
	}

	@And("I click login button")
	def clickLogin() {

		Mobile.tap(findTestObject('Object-LoginPage/android.widget.Button - LOGIN'), 0)
	}

	@Then("I am on the home page")
	def validateOnHomePage() {

		Mobile.verifyElementVisible(findTestObject('Object-LoginPage/android.widget.TextView-Validate Login Success-Android NewLine Learning'), 0)

		Mobile.closeApplication()
	}

	@Given("I am already on the login page")
	def validateOnLoginPage() {
		Mobile.startApplication('E:\\!SIB\\Katalon-MobileTest\\app.apk', true)
	}


	@When("I enter valid password")
	def dataEmptyEmail() {

		Mobile.setText(findTestObject('Object-LoginPage/android.widget.EditText-Password-Login'), 'praktikum123', 0)
	}

	@Then("I can see alert at email field")
	def validateEmptyEmail() {

		Mobile.verifyElementVisible(findTestObject('Object-LoginPage/android.widget.TextView-ALERT-Enter Valid Email'), 0)

		Mobile.closeApplication()
	}

	@When("I enter valid email")
	dataEmptyPassword(){

		Mobile.setText(findTestObject('Object-LoginPage/android.widget.EditText-Email-Login'), 'ahsan123@gmail.com', 0)
	}

	@Then("I can see alert at password field")
	def validateEmptyPassword() {

		Mobile.verifyElementVisible(findTestObject('Object-LoginPage/android.widget.TextView-ALERT-Password empty'), 0)

		Mobile.closeApplication()
	}
}