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

WebUI.click(findTestObject('Page_Spectrum community/a_ccommitchange'))

WebUI.click(findTestObject('Page_ccommitchange community/button_Settings'))

WebUI.click(findTestObject('Object Repository/Page_ccommitchange settings/button_Create Channel'))

WebUI.setText(findTestObject('Object Repository/Page_ccommitchange settings/input_Channel Name_name'), 'channel here private')

WebUI.setText(findTestObject('Object Repository/Page_ccommitchange settings/textarea_Describe it in 140 characters or less_slug'), 
    'describe here')

WebUI.click(findTestObject('Object Repository/Page_ccommitchange settings/svg_checkbox'))

WebUI.click(findTestObject('Object Repository/Page_ccommitchange settings/button_Create Channel'))

