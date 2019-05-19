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

for(int i=0;i<2;i++){
	

WebUI.callTestCase(findTestCase('DangNhap_DangXuat/DangNhapThanhCong'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://localhost:3000/home?authed=true')

WebUI.click(findTestObject('Object Repository/Page_abc community/div_Info_sc-bxivhb beCRxj'))

if(i==0){
	WebUI.setText(findTestObject('Object Repository/Page_abc community/input_Info_sc-gzVnrw lbskuL'), 'Boring and boring')
}else{
	WebUI.setText(findTestObject('Object Repository/Page_abc community/input_Info_sc-gzVnrw lbskuL'), 'Must try hard')
}


WebUI.click(findTestObject('Object Repository/Page_abc community/button_Post'))

}