import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('E:\\!SIB\\Katalon-MobileTest\\app.apk', true)

Mobile.tap(findTestObject('Object-LoginPage/android.widget.TextView - No account yet Create one'), 0)

Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Name-Register'), 'Ahsan', 0)

Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Email-Register'), 'ahsan123@gmail.com', 0)

Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Password-Register'), 'praktikum123', 0)

Mobile.setText(findTestObject('Object-RegisterPage/android.widget.EditText-Confirm-Register'), 'praktikum123', 0)

Mobile.tap(findTestObject('Object-RegisterPage/android.widget.Button - REGISTER'), 0)

Mobile.scrollToText('Already a member? Login', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object-RegisterPage/android.widget.TextView - Already a member Login'), 0)

Mobile.verifyElementVisible(findTestObject('Object-LoginPage/android.widget.Button - LOGIN'), 0)

