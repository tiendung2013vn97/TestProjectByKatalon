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

WebUI.callTestCase(findTestCase('DangNhap_DangXuat/DangNhapThanhCong'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_abc community/a_Profile'))

WebUI.click(findTestObject('Page_tiendung2013vn97  tiendung/button_Settings'))

WebUI.setText(findTestObject('Object Repository/Page_My settings/textarea_Bio_style__StyledTextArea-sc-17zryot-3 hSQZHk'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Page_My settings/textarea_a'), 'ab')

WebUI.setText(findTestObject('Object Repository/Page_My settings/textarea_ab'), 'abc')

WebUI.setText(findTestObject('Object Repository/Page_My settings/textarea_abc'), 'abcd')

WebUI.click(findTestObject('Object Repository/Page_My settings/button_Save'))
