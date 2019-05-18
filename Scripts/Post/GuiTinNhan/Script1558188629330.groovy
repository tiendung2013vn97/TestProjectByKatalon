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

WebUI.click(findTestObject('Page_abc community/a_Boring and boring 2_style__InboxLinkWrapper-q7eler-1 iENQxs'))

WebUI.setText(findTestObject('Page_Boring and boring  abc/textarea_No messages yet_style__Input-yy8ipz-4__input'), 'Try hard')

WebUI.click(findTestObject('Page_Boring and boring  abc/button_Send'))

