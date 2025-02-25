import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.util.UUID

// Open browser and login
WebUI.openBrowser('')
WebUI.navigateToUrl('https://demo.lcsbridge.com/customer/list')
WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_E-Mail Address_email'), 'rishikesh1@glaubetech.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/input_Password_password'), 'evlVvp79jS9J1YckdsjwBA==')
WebUI.click(findTestObject('Object Repository/Page_Demo Login - Bridge LCS/button_Login'))
WebUI.waitForPageLoad(2) // Reduced wait time

// Number of customers to create
int numberOfCustomers = 10

for (int i = 1; i <= numberOfCustomers; i++) {
	// Click "New Customer" button
	WebUI.click(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/button_New Customer'))
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/input_General_name'), 2)

	// Generate random customer name
	String randomName = "RishiUser_" + UUID.randomUUID().toString().substring(0, 8)

	// Fill customer details
	WebUI.setText(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/input_General_name'), randomName)
	WebUI.setText(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/input_Customer Name In Local Language_notif_2cd6f2'), 'test')

	// Navigate to Contact tab
	WebUI.click(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/a_Contact'))
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/textarea_Customs No For Air Expiry Date_address_1'), 2)
	WebUI.setText(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/textarea_Customs No For Air Expiry Date_address_1'), 'street1 test')
	WebUI.setText(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/input_Zip Code_city'), 'Kozhikode')

	// Select Country (Optimized)
	WebUI.click(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/button_Select'))
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/a_Saudi ArabiaSA'), 2)
	WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/a_Saudi ArabiaSA'), 2)))
	WebUI.delay(0.5)

	// Navigate to Communication tab
	WebUI.click(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/a_Communication'))
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/input_Add Communication_email'), 2)
	WebUI.setText(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/input_Add Communication_email'), 'test@glaubetech.com')

	// Navigate to Sales tab
	WebUI.click(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/a_Sales'))
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/button_Select_1'), 2)
	
	// Select Salesman using JavaScript for faster execution
	WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/button_Select_1'), 2)))
	WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/a_TESTSALESMAN5.00'), 2)
	WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(WebUI.findWebElement(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/a_TESTSALESMAN5.00'), 2)))
	
	WebUI.delay(0.5)

	// Save Customer
	WebUI.click(findTestObject('Object Repository/Page_Customers  Bridge Logistics  Bridge LCS/button_Save'))
	WebUI.waitForPageLoad(2)

	println(":white_check_mark: Customer Created: " + randomName)
}

// Close browser after completion
WebUI.closeBrowser()
