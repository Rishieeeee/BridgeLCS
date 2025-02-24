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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.lcsbridge.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_E-Mail Address_email'), 'rishikesh1@glaubetech.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), '/aIpElAL6ib3FA7r+ZSVkQ==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), 'vB31XdcLjIY6huYb935v5g==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), '/aIpElAL6ib3FA7r+ZSVkQ==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), 'coyTzePnvdWA8o1zv9Cx1A==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), 'evlVvp79jS9m5MhQP8n7Nw==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), '/aIpElAL6iYz1/c22QdfjQ==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), '/aIpElAL6ib3FA7r+ZSVkQ==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), 'vB31XdcLjIY6huYb935v5g==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), 'coyTzePnvdWA8o1zv9Cx1A==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), 'evlVvp79jS9J1YckdsjwBA==')

WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Demo Version - 9.0.11 - Whats New - Br_fde26b/img'))

WebUI.switchToWindowTitle('Demo Version - 9.0.11 - Whats New - Bridge LCS')

WebUI.click(findTestObject('Object Repository/Page_Demo Version - 9.0.11 - Whats New - Br_fde26b/a_Back to                                Dashboard'))

