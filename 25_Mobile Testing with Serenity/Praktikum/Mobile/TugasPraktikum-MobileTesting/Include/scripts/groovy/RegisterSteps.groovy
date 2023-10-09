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



class RegisterSteps {

	@Given("I am on the registration page")
	def onTheRegistrationPage() {
		Mobile.startApplication('E:\\!SIB\\Katalon-MobileTest\\app.apk', true)

		Mobile.tap(findTestObject('Object-LoginPage/android.widget.TextView - No account yet Create one'), 0)
	}

	@When("I enter valid email, password, and confirm password")
	def dataRegisterEmptyName1() {
		Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Email-Register'), 'zaki123@gmail.com', 0)

		Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Password-Register'), 'praktikum123', 0)

		Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Confirm-Register'), 'praktikum123', 0)
	}

	@And("I click register button")
	def clickRegister() {
		Mobile.tap(findTestObject('Object-RegisterPage/android.widget.Button - REGISTER'), 0)
	}

	@Then("I can see alert at name field")
	def validateAlertNameField() {
		Mobile.verifyElementVisible(findTestObject('Object-RegisterPage/android.widget.TextView-ALERT-Name field empty'), 0)

		Mobile.closeApplication()
	}


	@When("I enter valid name, email, password, and confirm password")
	def dataRegisterComplete() {

		Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Name-Register'), 'Ahsan', 0)

		Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Email-Register'), 'ahsan123@gmail.com', 0)

		Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Password-Register'), 'praktikum123', 0)

		Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Confirm-Register'), 'praktikum123', 0)
	}


	@And("I click back to login page button")
	def clickBackToLogin() {

		Mobile.scrollToText('Already a member? Login', FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Object-RegisterPage/android.widget.TextView - Already a member Login'), 0)
	}

	@Then("I am on the login page")
	def onTheLoginPage() {

		Mobile.verifyElementVisible(findTestObject('Object-LoginPage/android.widget.Button - LOGIN'), 0)
	}
}