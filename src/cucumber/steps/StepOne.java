package cucumber.steps;

import cucumber.api.java.en.When;
import cucumber.helper.Helper;
import cucumber.pages.GetAQuotePage;
import cucumber.pages.YourQuotePage;

public class StepOne extends Helper
{
	GetAQuotePage getAQuotePage = new GetAQuotePage();
	YourQuotePage yourQuotePage;
	
	@When("^I enter name \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" DOB \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and gender\"([^\"]*)\"$")
	public void i_enter_name_DOB_and_gender(String sTitle, String firstName, String lastName, String dayOfBirth, String birthMonth, String birthYear, String gender) throws Throwable {
		getAQuotePage.selectTitle(sTitle);
		getAQuotePage.enterFirstName(firstName);
		getAQuotePage.enterLastName(lastName);
		getAQuotePage.selectBirthDay(dayOfBirth);
		getAQuotePage.selectBirthMonth(birthMonth);
		getAQuotePage.selectBirthYear(birthYear);
		getAQuotePage.gender(gender);
	}

	@When("^I enter email \"([^\"]*)\" phone number\"([^\"]*)\" \"([^\"]*)\" and address\"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter_email_phone_number_and_address(String email, String areacode, String num, String enterYesOrNo, String eirCode) throws Throwable {
	    getAQuotePage.enterEmail(email);
	    getAQuotePage.selectAreaCode(areacode);
	    getAQuotePage.enterPhoneNumber(num);
	    getAQuotePage.doYouKnowYourEircode(enterYesOrNo);
	    getAQuotePage.enterEircode(eirCode);
	    getAQuotePage.findAddress();
	    getAQuotePage.address_checkBox();
	}

	@When("^I select household type \"([^\"]*)\" employment\"([^\"]*)\" and occupation \"([^\"]*)\"$")
	public void i_select_household_type_employment_and_occupation(String household, String employmentStatus, String occupation) throws Throwable {
	    getAQuotePage.selectHouseholdType(household);
	    getAQuotePage.selectEmploymentStatus(employmentStatus);
	    getAQuotePage.selectOccupation(occupation);
	    getAQuotePage.clickContinueOnDetailsSection();
	}
	
	@When("^I complete car section with car reg \"([^\"]*)\" and mileage \"([^\"]*)\"$")
	public void i_complete_car_section_with_car_reg_and_mileage(String enterCarReg, String numOfKilo) throws Throwable {
		getAQuotePage.enterCarReg(enterCarReg);
		getAQuotePage.clickFindCarButton();
		getAQuotePage.isThisYourCar();
		getAQuotePage.notForBusinessPurpose();
		getAQuotePage.notToCommuteToWork();
		//getAQuotePage.selectNumberOfKilometerForDrivingUsage(numOfKilo);
		getAQuotePage.clickMileageButton(numOfKilo);
		getAQuotePage.clickYourCarSectionContinueButton();
	}
	
//driving history section	
	@When("^I enter drivers licence details \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_enter_drivers_licence_details(String licence, String inputLicenceAge) throws Throwable {
		 getAQuotePage.selectDrivingLicence(licence);
		 getAQuotePage.selectHowLongLicenceHeld(inputLicenceAge);
	}

	@When("^I enter the NCD details \"([^\"]*)\"  \"([^\"]*)\"$")
	public void i_enter_the_NCD_details(String inpuutInsurance, String inputClaimsFreeYears) throws Throwable {
		getAQuotePage.selectRecentInsurance(inpuutInsurance);
		getAQuotePage.selectClaimsFreeYears(inputClaimsFreeYears);
		getAQuotePage.clickDrivingHistoryContinueButton();
	}
	@When("^I added No driver and claim$")
	public void i_added_No_driver_and_claim() throws Throwable {
		getAQuotePage.clickNoAdditionalDriver();
		getAQuotePage.clickAdditionalDriverContinueButton();
		getAQuotePage.clickNoClaimsInLastFiveYears(); 
		getAQuotePage.clickClaimsSectionContinueButton();
	}
	
//Your cover section
	@When("^I complete the cover section including payment method \"([^\"]*)\"$")
	public void i_complete_the_cover_section_including_payment_method(String methodOfPayment) throws Throwable {
	   getAQuotePage.clickNoButtonWhenAskedHaveAnotherPolicyInsuredWithAAXA();
	   getAQuotePage.selectPaymentMethod(methodOfPayment);
	   getAQuotePage.click_YES_toConfirmAssumptions();
	   getAQuotePage.click_YES_toRecieveOffers();
	   getAQuotePage.getQuoteButton();
	   getAQuotePage.getQuoteReferenceNum();
	}


}
