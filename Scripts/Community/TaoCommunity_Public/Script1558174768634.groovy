import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('DangNhap_DangXuat/DangNhapThanhCong02'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_community01 community/a_exploreExplore'))

WebUI.click(findTestObject('Page_Explore/button_Create a community'))

WebUI.setText(findTestObject('Object Repository/Page_New community/input_What is your community called_style__StyledInput-sc-17zryot-2 jHXlSy'), 
    'community04')

WebUI.setText(findTestObject('Object Repository/Page_New community/textarea_Describe it in 140 characters or less_style__StyledTextArea-sc-17zryot-3 hSQZHk'), 
    'test 02')

WebUI.click(findTestObject('Object Repository/Page_New community/div_checkboxI have read the Spectrum Code of Conduct and agree to enforce it in my community'))

WebUI.click(findTestObject('Object Repository/Page_New community/button_Create Community  Continue'))

WebUI.click(findTestObject('Object Repository/Page_New community/button_Skip this step'))

WebUI.click(findTestObject('Object Repository/Page_New community/button_Go to my community'))

