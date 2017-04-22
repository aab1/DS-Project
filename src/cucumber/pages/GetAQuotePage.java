package cucumber.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.helper.Helper;

public class GetAQuotePage extends Helper{
	
	WebElement yourDetails;
	WebElement firstname;
	WebElement lastname;
	WebElement birthDay;
	WebElement birthMonth;
	WebElement birthYear;
	WebElement gender;
	WebElement email;
	WebElement areaCode;
	WebElement phoneNumber;
	WebElement knowYourEircode;
	WebElement eircode;
	WebElement addressLine;
	WebElement findaddress;
	WebElement addressCheckBox;
	WebElement householdType;
	WebElement employmentSta;
	List<WebElement> occupation;
	WebElement continueButton;
	WebElement yourCarSectionTitle;
	WebElement carReg;
	WebElement findCar;
	WebElement confirmCarReg;
	WebElement notBusinessPurpose;
	WebElement notCommuteToWork;
	WebElement drivingUsage;
	WebElement carSectionContinueBtn;
	WebElement drivingHistorySection;
	WebElement drivingLicence;
	WebElement licenceAge;
	WebElement recentInsurance;
	String recentInsuranceDeterminesClaimsfreeYearsTextFieldDisplayed;
	WebElement claimsFreeYears;
	WebElement drivingHistoryContinueButton;
	WebElement confirmAdditionalDriverSection;
	WebElement noAddtionalDriver;
	WebElement additionalDriverContinueBtn;
	WebElement confirmClaimSection;
	WebElement claimsInLast5Years;
	WebElement claimSectionContinueBtn;
	WebElement coverSection;
	WebElement anotherPolicy;
	WebElement paymentMethod;
	WebElement datepicker;
	List<WebElement> allDates;
	WebElement agreeTerms;
	WebElement getQuoteBtn;

	public void navigateToMotorDS() throws Exception
	{
		launchUrl("https://testservices1.axa.ie/MotorQuote/");
		//launchUrl("https://secureweb.axa.ie/MotorQuote/Step1?promoCode=AXP020001");
	}
	
	public void isMotorDSDisplayed() throws Exception
	{
		yourDetails = getElementByCssSelector("#personal-details > legend");
		VerifyAnElementIsDisplayed(yourDetails);
	}
	public void enterFirstName(String fname) throws Exception
	{
		firstname = getElementById("YourDetails_FirstName");
		typeGivenValueInto(firstname, fname);
	}
	
	public void enterLastName(String lname) throws Exception
	{
		lastname = getElementById("YourDetails_LastName");
		typeGivenValueInto(lastname, lname);
	}
	public void selectBirthDay(String bday)throws Exception
	{
		birthDay = getElementById("YourDetails_DateOfBirthDay");
		selectByText(birthDay, bday);
	}
	public void selectBirthMonth(String bMonth)throws Exception
	{
		birthMonth = getElementById("YourDetails_DateOfBirthMonth");
		selectByText(birthMonth, bMonth);
	}
	
	public void selectBirthYear(String bYear)throws Exception
	{
		birthYear = getElementById("YourDetails_DateOfBirthYear");
		selectByText(birthYear, bYear);
	}
	
	public void gender(String sex)throws Exception
	{
		sex=sex.toLowerCase();
		if(sex.equals("male"))
		{
			gender = getElementByCssSelector("[for=\"YourDetails_GenderIdA\"]");
			//gender = getElementByXPath("//label[text() = \"Male\"]");
			//HoverOver(gender);
			clickAnElement(gender);
		}else
		{
			gender = getElementByCssSelector("[for=\"YourDetails_GenderIdB\"]");
			//gender = getElementByXPath("//label[text() = \"Female\"]");
			//HoverOver(gender);
			clickAnElement(gender);
		}
		
	}
	public void enterEmail(String proposerEmail)throws Exception
	{
		email = getElementById("YourDetails_EmailAddress");
		typeGivenValueInto(email, proposerEmail);
		
	}
	
	public void selectAreaCode(String areacode)throws Exception
	{
		areaCode = getElementById("YourDetails_PhoneNumberAreaCode");
		selectByText(areaCode, areacode);
	}
	
	public void enterPhoneNumber(String num)throws Exception
	{
		phoneNumber = getElementById("YourDetails_PhoneNumberDigits");
		typeGivenValueInto(phoneNumber, num);
		
	}
	public void doYouKnowYourEircode(String enterYesOrNo)throws Exception
	{
		enterYesOrNo = enterYesOrNo.toLowerCase();
		if(enterYesOrNo.equals("yes"))
		{
			knowYourEircode = getElementByCssSelector("[for=\"YourDetails_Address_UseEircodeA\"]");
			clickAnElement(knowYourEircode);
			eircode = getElementById("YourDetails_Address_EirCode"); 
			VerifyAnElementIsDisplayed(eircode);
		}else
		{
			knowYourEircode = getElementByCssSelector("[for=\"YourDetails_Address_UseEircodeB\"]");
			clickAnElement(knowYourEircode);
			addressLine = getElementById("YourDetails_Address_UserEnteredAddressLine1");
			VerifyAnElementIsDisplayed(addressLine);
		}
		
	}
	
	public void enterEircode(String eirCode)throws Exception
	{//The eircode element was gotten from doYouKnowYourEircode method
		typeGivenValueInto(eircode, eirCode);
	}
	
	public void findAddress()throws Exception
	{
		scrollToTheButtomOfAPage();
		waitForElementToBeDisplayed(".btn.btn-emphasis.btn-icon-right.icon.addressLookupSearchButton");
		//findaddress = getElementByCssSelector(".btn.btn-emphasis.btn-icon-right.icon.addressLookupSearchButton");
		findaddress = getElementByXPath("//*[@id=\"address-fieldset\"]/ol/li[8]/div/div/button");
		clickAnElement(findaddress);
			
	}
	
	public void address_checkBox()throws Exception
	{
		waitForElementToBeDisplayed("#confirmAddress-label");
		addressCheckBox = getElementById("confirmAddress-label");
		clickAnElement(addressCheckBox);
		
	}
	
	public void selectHouseholdType(String household)throws Exception
	{
		householdType = getElementById("YourDetails_HouseholdTypeId");
		selectByText(householdType, household);
	}
	
	public void selectEmploymentStatus(String employmentStatus)throws Exception
	{
		employmentSta = getElementById("YourDetails_EmploymentStatusId");
		selectByText(employmentSta, employmentStatus);
	}
	public void selectOccupation(String enterOccupation) throws Exception
	{
		String  dynamicElement = ("[class=\"filterText novalidate evt-input-change-bound\"]");
		waitForElementToBeDisplayed(dynamicElement);
		occupation = getElementsByCssSelector(dynamicElement);
		typeGivenValueInto(occupation.get(1), enterOccupation);
		WebElement selectElementFromList = getElementByCssSelector("body > ul:nth-child(1) > li:nth-child(1)");
		clickAnElement(selectElementFromList);
	}
	
	public void clickContinueOnDetailsSection() throws Exception
	{
		continueButton = getElementById("btn-personal");
		clickAnElement(continueButton);
	}
	
	public void isYourCarSectionDisplayed() throws Exception
	{
		yourCarSectionTitle = getElementByCssSelector("#vehicle-details > legend");
		VerifyAnElementIsDisplayed(yourCarSectionTitle);
	}
	public void enterCarReg(String enterCarReg) throws Exception
	{
		waitForElementToBeDisplayed("[name=\"VehicleDetails.RegistrationNumber\"]");
		carReg = getElementByCssSelector("[name=\"VehicleDetails.RegistrationNumber\"]");
		typeGivenValueInto(carReg, enterCarReg);
	}
	
	public void clickFindCarButton() throws Exception
	{
		findCar = getElementByCssSelector("[class=\"btn btn-emphasis btn-icon-right icon vehicleFindButton\"]");
		clickAnElement(findCar);
	}
	
	public void isThisYourCar() throws Exception
	{
		waitForElementToBeDisplayed("[for=\"IsVehicleRegConfirmedA\"]");
		confirmCarReg = getElementByCssSelector("[for=\"IsVehicleRegConfirmedA\"]");
		clickAnElement(confirmCarReg);
	}
	public void notForBusinessPurpose() throws Exception
	{
		waitForElementToBeDisplayed("[for=\"YourCar_BusinessUseB\"]");
		 notBusinessPurpose = getElementByCssSelector("[for=\"YourCar_BusinessUseB\"]");
		 clickAnElement(notBusinessPurpose);
	}
	public void notToCommuteToWork() throws Exception
	{
		 notCommuteToWork = getElementByCssSelector("[for=\"YourCar_CommutingUseTypeIdB\"]");
		 clickAnElement(notCommuteToWork);
	}
	public void selectNumberOfKilometerForDrivingUsage(String numOfKilo) throws Exception
	{
		drivingUsage = getElementById("YourCar_DrivingUsageId");
		selectByText(drivingUsage, numOfKilo);
	}
	public void clickYourCarSectionContinueButton() throws Exception
	{
		carSectionContinueBtn = getElementById("btn-vehicle");
		clickAnElement(carSectionContinueBtn);
	}
	public void isYourDrivingHistorySectionDisplayed() throws Exception
	{
		drivingHistorySection = getElementByCssSelector("#driving-history > legend");
		VerifyAnElementIsDisplayed(drivingHistorySection);
	}
	public void selectDrivingLicence(String licence) throws Exception
	{
		drivingLicence = getElementById("YourDrivingHistory_DrivingLicenceTypeId");
		selectByText(drivingLicence, licence);
	}
	public void selectHowLongLicenceHeld(String inputLicenceAge) throws Exception
	{
		licenceAge = getElementById("YourDrivingHistory_YearsDrivingLicenseHeldId");
		selectByText(licenceAge, inputLicenceAge);
	}
	public void selectRecentInsurance(String inpuutInsurance) throws Exception
	{
		recentInsuranceDeterminesClaimsfreeYearsTextFieldDisplayed = inpuutInsurance;
		recentInsurance = getElementById("YourDrivingHistory_DrivingExperienceId");
		selectByText(recentInsurance, inpuutInsurance);
	}
	public void selectClaimsFreeYears(String inputClaimsFreeYears) throws Exception
	{
		if(recentInsuranceDeterminesClaimsfreeYearsTextFieldDisplayed.equals("Insured in own name") ||
				recentInsuranceDeterminesClaimsfreeYearsTextFieldDisplayed.equals("Insured on a company car"))
		{
			claimsFreeYears = getElementById("YourDrivingHistory_NoClaimsDiscountYearsInOwnNameId");
			selectByText(claimsFreeYears, inputClaimsFreeYears);
		}else
		{
			claimsFreeYears = getElementById("YourDrivingHistory_NoClaimYearsAsNamedDriverId");
			selectByText(claimsFreeYears, inputClaimsFreeYears);
		}
	}
	public void clickDrivingHistoryContinueButton() throws Exception
	{
		drivingHistoryContinueButton = getElementById("btn-history");
		clickAnElement(drivingHistoryContinueButton);
	}
	
	public void isAddtionalDriverSectionDisplayed()throws Exception
	{
		confirmAdditionalDriverSection = getElementByCssSelector("#additional-drivers > legend");
		VerifyAnElementIsDisplayed(confirmAdditionalDriverSection);
	}
	
	public void clickNoAdditionalDriver() throws Exception
	{
		waitForElementToBeDisplayed("[for=\"YourAdditionalDrivers_AddingAdditionalDriverB\"]");
		noAddtionalDriver = getElementByCssSelector("[for=\"YourAdditionalDrivers_AddingAdditionalDriverB\"]");
		clickAnElement(noAddtionalDriver);
	}
	public void clickAdditionalDriverContinueButton() throws Exception
	{
		waitForElementToBeDisplayed("#btn-additional-drivers");
		additionalDriverContinueBtn = getElementById("btn-additional-drivers");
		clickAnElement(additionalDriverContinueBtn);
	}
	
	public void isClaimSectionDisplayed() throws Exception
	{
		confirmClaimSection = getElementByCssSelector("#claims > legend");
		VerifyAnElementIsDisplayed(confirmClaimSection);
	}
	
	public void clickNoClaimsInLastFiveYears() throws Exception
	{
		claimsInLast5Years = getElementByCssSelector("[for=\"YourClaims_AddingClaimB\"]");
		clickAnElement(claimsInLast5Years);
	}
	public void clickClaimsSectionContinueButton() throws Exception
	{
		waitForElementToBeDisplayed("[id=\"btn-claims\"]");
		int continue_size = driver.findElements(By.cssSelector("[id=\"btn-claims\"]")).size();
		driver.findElements(By.cssSelector("[id=\"btn-claims\"]")).get(continue_size-1).click();
		//The code above was used cos element was not visit despite waiting
		//claimSectionContinueBtn = getElementById("btn-claims");
		//clickAnElement(carSectionContinueBtn);
	}
	
	public void isYourCoverSectionDisplayed() throws Exception
	{
		coverSection = getElementByCssSelector("#your-cover > legend");
		VerifyAnElementIsDisplayed(coverSection);
	}
	
	public void clickNoButtonWhenAskedHaveAnotherPolicyInsuredWithAAXA()throws Exception
	{
		waitForElementToBeDisplayed("[for=\"YourCover_MultiProductB\"]");
		anotherPolicy = getElementByCssSelector("[for=\"YourCover_MultiProductB\"]");
		clickAnElement(anotherPolicy);
	}
	public void selectPaymentMethod(String methodOfPayment)throws Exception
	{
		paymentMethod = getElementById("YourCover_HowDoYouNormallyPayId");
		selectByText(paymentMethod, methodOfPayment);
	}
	
	public void insuranceStartDate(String startDate) throws Exception
	{
		datepicker = getElementByCssSelector("[class=\"k-icon k-i-calendar\"]");
		clickAnElement(datepicker);
		
		allDates = getElementsByXPath("//table[@class=\"k-content\"]//td");
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(startDate))
			{
				ele.click();
				break;
			}
			
		}
	}
	
	public void agreeTermsCheckBox() throws Exception
	{
		waitForElementToBeDisplayed("#agree-terms-label");
		agreeTerms = getElementByXPath("//*[@id=\"agree-terms-label\"]");
		clickAnElement(agreeTerms);
	}
	//handshake happens below
	public YourQuotePage getQuoteButton() throws Exception
	{
		getQuoteBtn = getElementById("btn-getQuote");
		clickAnElement(getQuoteBtn);
		return new YourQuotePage();
	}
	
	
	

}
