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

Mobile.startApplication('C:\\Users\\Lenovo\\Katalon Studio\\FinalProjectWEB\\Object Repository\\TestingMobile\\Todo_2.0_APKPure.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.ImageButton'), 0)

Mobile.setText(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.EditText - Enter task title'), 
    Tittle, 0)

Mobile.setText(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.EditText - Enter your task'), Task, 
    0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.EditText - Set Date'), 0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.view.View - 21'), 0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.Button - Oke Set Date'), 0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.EditText - Set Time'), 0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.RadialTimePickerViewRadialPickerTouchHelper'), 
    0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.RadialTimePickerViewRadialPickerTouchHelper (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.RadioButton - PM'), 0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.Button - Oke Set Time'), 0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.Spinner'), 0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.CheckedTextView - Banking'), 0)

Mobile.tap(findTestObject('Object Repository/TestingMobile/CreateTask/android.widget.TextView'), 0)

Mobile.verifyElementText(findTestObject('TestingMobile/CreateTask/android.widget.TextView - ViewTitle'), Tittle, FailureHandling.OPTIONAL)

Mobile.closeApplication()

