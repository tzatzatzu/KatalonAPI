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

WebUI.click(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/a_Not yet a customer'))

WebUI.click(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/div_Email'))

WebUI.setText(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/input_User Registration_emailControl'), email)

WebUI.click(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/div_Password'))

WebUI.setEncryptedText(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/input_Email_passwordControl'), password)

WebUI.click(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/div_Repeat Password'))

WebUI.setEncryptedText(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/input_Password must be 5-40 characters long_repeatPasswordControl'), 
    password)

'step1\r\n'
WebUI.click(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/span_Show password advice_mat-select-placeholder mat-select-min-line ng-tns-c30-17 ng-star-inserted'))

'step1\r\n'
WebUI.click(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/span_Name of your favorite pet'))

WebUI.click(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/div_Answer'))

WebUI.setText(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/input_This cannot be changed later_securityAnswerControl'), 
    'Ayam')

WebUI.click(findTestObject('TestingWEB/CreateAccount/Page_OWASP Juice Shop/button_person_add  Register'))

