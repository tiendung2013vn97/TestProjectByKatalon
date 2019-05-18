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

WebUI.callTestCase(findTestCase('DangNhapThanhCong02'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_ccommitchange community/a_ccommitchange'))

WebUI.click(findTestObject('Object Repository/Page_ccommitchange community/button_Settings'))

WebUI.click(findTestObject('Object Repository/Page_ccommitchange settings/div_Members'))

WebUI.setText(findTestObject('Object Repository/Page_ccommitchange settings/input_Invite by email_style__EmailInviteInput-sc-1vvoo0f-1 gNxvqX'), 
    'ngophuochai2@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_ccommitchange settings/input_Invite by email_style__EmailInviteInput-sc-1vvoo0f-1 kRLwzc'), 
    'Hai')

WebUI.click(findTestObject('Object Repository/Page_ccommitchange settings/button_Send Invitations'))

