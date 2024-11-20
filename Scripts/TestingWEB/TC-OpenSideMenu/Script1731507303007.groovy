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

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/button_menu'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/span_feedback  Customer Feedback'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/button_menu'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/span_sentiment_dissatisfied  Complaint'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/button_menu'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/span_chat  Support Chat'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/button_menu'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/span_business_center  About Us'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/button_menu'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/span_camera  Photo Wall'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/button_menu'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/span_card_membership  Deluxe Membership'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/button_menu'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/span_Score Board'))

WebUI.click(findTestObject('TestingWEB/OpenSideMenu/Page_OWASP Juice Shop/button_menu'))

