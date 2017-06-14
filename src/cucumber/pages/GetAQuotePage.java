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
	WebElement confirmAssumption;
	WebElement offers;
	WebElement datepicker;
	List<WebElement> allDates;
	WebElement agreeTerms;
	WebElement getQuoteBtn;
	WebElement mileageButton;
	WebElement title;
	WebElement partTimeOccupation;
	WebElement studentFirstQuote;
	WebElement offersAndInfoBtn;

	public void navigateToMotorDS() throws Exception
	{
		//launchUrl("https://testservices1.axa.ie/MotorQuote/");
		//launchUrl("https://secureweb.axa.ie/MotorQuote/Step1?promoCode=AXP020001");
		launchUrl("https://dsdev.testaxa.ie/MotorQuote/");
		//launchUrl("https://securewebtest.axa.ie/motorquote");
		//launchUrl("https://securewebtest.axa.ie/aib/motorquote");
	}
	
	public void isMotorDSDisplayed() throws Exception
	{
		yourDetails = getElementByCssSelector("#personal-details > legend");
		VerifyAnElementIsDisplayed(yourDetails);
	}
	public void selectTitle(String sTitle) throws Exception
	{
		title = getElementById("YourDetails_TitleId");
		selectByText(title, sTitle);
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
			scrollToAnElement( getElementById("YourDetails_DateOfBirthYear"));
			gender = getElementByCssSelector("[for=\"YourDetails_GenderIdA\"]");
			
			waitForElementToBeClickable("[for=\"YourDetails_GenderIdA\"]");
			clickAnElement(gender);
		}else
		{
			scrollToAnElement(getElementById("YourDetails_DateOfBirthYear"));
			gender = getElementByCssSelector("[for=\"YourDetails_GenderIdB\"]");
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
		scrollToAnElement(getElementByCssSelector("[for=\"YourDetails_Address_UseEircodeB\"]"));
		waitForElementToBeDisplayed(".btn.btn-emphasis.btn-icon-right.icon.addressLookupSearchButton");
		//findaddress = getElementByCssSelector(".btn.btn-emphasis.btn-icon-right.icon.addressLookupSearchButton");
		findaddress = getElementByXPath("//*[@id=\"address-fieldset\"]/ol/li[8]/div/div/button");
		clickAnElement(findaddress);
		scrollToTheButtomOfAPage();	
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
	
	public void clickYEsYouHaveAPartTimeOccupation() throws Exception
	{
		partTimeOccupation = getElementByCssSelector("[for=\"YourDetails_HasPartTimeOccupationA\"]");
		clickAnElement(partTimeOccupation);
	}
	
	public void selectOccupation(String enterOccupation) throws Exception
	{
		String  dynamicElement = ("[class=\"filterText novalidate evt-input-change-bound\"]");
		waitForElementToBeDisplayed(dynamicElement);
		occupation = getElementsByCssSelector(dynamicElement);
		typeGivenValueInto(occupation.get(1), enterOccupation);
		//after typing into the field, get the webelement of the occupation you want to choose 
		WebElement selectElementFromList = getElementByCssSelector("body > ul:nth-child(1) > li:nth-child(1)");
		clickAnElement(selectElementFromList);
	}
	
	public void selectPartTimeOccupation(String enterpartOccupation) throws Exception
	{
		partTimeOccupation = getElementById("YourDetails_OccupationTypeId");
		selectByText(partTimeOccupation, enterpartOccupation);
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
	public void clickMileageButton(String mileageBtn)throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[for=\"YourCar_CommutingUseTypeIdB\"]"));
		
		try{
			if (mileageBtn.equals("Up to 8,000")){
				mileageButton = getElementByCssSelector("[for=\"YourCar_DrivingUsageId_1\"]");
				clickAnElement(mileageButton);
			}else if(mileageBtn.equals("Up to 13,000")){
				mileageButton = getElementByCssSelector("[for=\"YourCar_DrivingUsageId_2\"]");
				clickAnElement(mileageButton);
			}else{
				mileageButton = getElementByCssSelector("[for=\"YourCar_DrivingUsageId_3\"]");
				clickAnElement(mileageButton);
			}
		}catch(Exception e){
			mileageButton = getElementById("YourCar_DrivingUsageId");
			selectByText(mileageButton, mileageBtn+" "+"km");
		}
		
		
	}
	
	public void clickYourCarSectionContinueButton() throws Exception
	{
		//scrollToAnElement(getElementById("YourCar_DrivingUsageId"));
		scrollToAnElement(getElementByCssSelector("[for=\"YourCar_CommutingUseTypeIdB\"]"));
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
		waitForElementToDisAppear("class=\"validation-wrapper");
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
		scrollToTheButtomOfAPage();
		claimsInLast5Years = getElementByCssSelector("[for=\"YourClaims_AddingClaimB\"]");
		clickAnElement(claimsInLast5Years);
	}
	public void clickClaimsSectionContinueButton() throws Exception
	{
		waitForElementToBeDisplayed("#btn-claims");
		int continue_size = driver.findElements(By.cssSelector("[id=\"btn-claims\"]")).size();
		driver.findElements(By.cssSelector("[id=\"btn-claims\"]")).get(continue_size-1).click();
		//The code above was used cos element was not visited despite waiting
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
	
	public void clickYesYoulikeAnAXAStudentFirstQuote() throws Exception
	{
		studentFirstQuote = getElementByCssSelector("[for=\"YourCover_IsStudentFirstQuoteA\"]");
		clickAnElement(studentFirstQuote);
	}
	
	public void selectPaymentMethod(String methodOfPayment)throws Exception
	{
		paymentMethod = getElementById("YourCover_HowDoYouNormallyPayId");
		selectByText(paymentMethod, methodOfPayment);
	}
	
	public void click_YES_toConfirmAssumptions() throws Exception
	{
		confirmAssumption = getElementByCssSelector("[for=\"YourCover_AgreeTermsA\"]");
		clickAnElement(confirmAssumption);
	}
	
	public void click_YES_toRecieveOffers() throws Exception
	{
		scrollToAnElement(getElementById("CoverDetails_StartDate"));
		offers = getElementByCssSelector("[for=\"YourCover_IsGdprConsentGivenA\"]");
		clickAnElement(offers);
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
		scrollToAnElement(getElementById("CoverDetails_StartDate"));
		waitForElementToBeDisplayed("#agree-terms-label");
		//agreeTerms = getElementByXPath("//*[@id=\"agree-terms-label\"]");
		agreeTerms = getElementById("agree-terms-label");
		clickAnElement(agreeTerms);
	}
	
	public void  clickYesReceiveOffersAndInformationButton() throws Exception
	{
		offersAndInfoBtn = getElementByCssSelector("[for=\"YourCover_GdprConsentFlagA\"]");
		clickAnElement(offersAndInfoBtn);
	}
	
	//return the step2 page below
	public YourQuotePage getQuoteButton() throws Exception
	{
		getQuoteBtn = getElementById("btn-getQuote");
		clickAnElement(getQuoteBtn);
		return new YourQuotePage();
	}
	
	public void getQuoteReferenceNum() throws Exception
	{
		WebElement quoteRef = getElementById("quoteReference");
		System.out.println(quoteRef.getText());
	}
	

	

	

}
