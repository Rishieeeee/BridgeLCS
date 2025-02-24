import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.util.UUID
import java.util.Arrays

// Open browser and navigate
WebUI.openBrowser('')
WebUI.navigateToUrl('https://demo.lcsbridge.com/supplier/list')
WebUI.maximizeWindow()

// Login
WebUI.setText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_E-Mail Address_email'), 'rishikesh1@glaubetech.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), 'evlVvp79jS9J1YckdsjwBA==')
WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))

// Number of suppliers to create
int numberOfSuppliers = 3

for (int i = 1; i <= numberOfSuppliers; i++) {
	WebUI.navigateToUrl(WebUI.getUrl())  // Alternative to refresh()
	WebUI.waitForPageLoad(5)

	// Click "New Supplier" button
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/button_New Supplier'), 5)
	WebUI.click(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/button_New Supplier'))

	// Generate a random supplier name
	String randomName = "RishiSupplier_" + UUID.randomUUID().toString().substring(0, 8)

	// Fill in supplier details
	WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/input_General_name'), 5)
	WebUI.setText(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/input_General_name'), randomName)
	WebUI.setText(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/input_Supplier Name In Local Language_notif_2cd6f2'), 'test')

	// Select Business Type
	WebUI.click(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/div_Unregistered Business (B2C)'))
	
	// Navigate to Contact tab
	WebUI.click(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/a_Contact'))
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/textarea_Salesman_address_1'), 5)
	WebUI.setText(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/textarea_Salesman_address_1'), 'street1')
	WebUI.setText(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/textarea_Street 1 (In Arabic)_address_2'), 'street2')
	WebUI.setText(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/input_Zip Code_city'), 'Kozhikode')

	// Select Country
	WebUI.click(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/div_Select'))
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/a_Saudi ArabiaSA'), 5)
	WebUI.executeJavaScript("arguments[0].click();", [WebUI.findWebElement(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/a_Saudi ArabiaSA'))])

	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/select_Saudi Arabia'), 'Saudi Arabia', true)

	// Navigate to Communication tab
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/a_Communication'), 5)
	WebUI.executeJavaScript("arguments[0].click();", [WebUI.findWebElement(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/a_Communication'))])
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/input_Add Communication_email'), 5)
	WebUI.setText(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/input_Add Communication_email'), 'test@glaubetech.com')

	// Save Supplier
	WebUI.click(findTestObject('Object Repository/Page_Suppliers  Bridge Logistics  Bridge LCS/button_Save'))
	WebUI.waitForPageLoad(5)

	println("✅ Supplier Created: " + randomName)
}

// Close browser after completion
WebUI.closeBrowser()
