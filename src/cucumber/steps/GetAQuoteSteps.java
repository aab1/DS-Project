package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.helper.Helper;
import cucumber.pages.GetAQuotePage;
import cucumber.pages.YourQuotePage;

public class GetAQuoteSteps extends Helper{
	
	GetAQuotePage getAQuotePage = new GetAQuotePage();
	YourQuotePage yourQuotePage;

	@Given("^I navigate to ROI motor DS$")
	public void i_navigate_to_ROI_motor_DS() throws Throwable {
		getAQuotePage.navigateToMotorDS();
	}

	@Given("^motor DS Your Detail section is displayed$")
	public void motor_DS_Your_Detail_section_is_displayed() throws Throwable {
		getAQuotePage.isMotorDSDisplayed();
	}
	@When("^I select title \"([^\"]*)\"$")
	public void i_select_title(String sTitle) throws Throwable {
	   getAQuotePage.selectTitle(sTitle);
	}


	@When("^I input firstname \"([^\"]*)\"$")
	public void i_input_firstname(String fname ) throws Throwable {
		getAQuotePage.enterFirstName(fname);
	}

	@When("^I input lastname \"([^\"]*)\"$")
	public void i_input_lastname(String lname) throws Throwable {
		getAQuotePage.enterLastName(lname);
	}

	@When("^I select day of birth\"([^\"]*)\"$")
	public void i_select_day_of_birth(String bday) throws Throwable {
		getAQuotePage.selectBirthDay(bday);
	}

	@When("^I select birth month \"([^\"]*)\"$")
	public void i_select_birth_month(String bMonth) throws Throwable {
		getAQuotePage.selectBirthMonth(bMonth);
	}
	
	@When("^I select birth Year \"([^\"]*)\"$")
	public void i_select_birth_Year(String bYear) throws Throwable {
		getAQuotePage.selectBirthYear(bYear);
	}
	
	@When("^I click gender \"([^\"]*)\"$")
	public void i_click_gender(String sex) throws Throwable {
		getAQuotePage.gender(sex);
	}
	

	@When("^I input email\"([^\"]*)\"$")
	public void i_input_email(String proposerEmail) throws Throwable {
		getAQuotePage.enterEmail(proposerEmail);
	}

	@When("^I select area code \"([^\"]*)\"$")
	public void i_select_area_code(String areacode) throws Throwable {
		getAQuotePage.selectAreaCode(areacode);
	}

	@When("^I input phone number\"([^\"]*)\"$")
	public void i_input_phone_number(String num) throws Throwable {
		getAQuotePage.enterPhoneNumber(num);
	}

	@When("^I click \"([^\"]*)\"Yes/No to Do you know your Eircode question$")
	public void i_click_Yes_No_to_Do_you_know_your_Eircode_question(String enterYesOrNo) throws Throwable {
		getAQuotePage.doYouKnowYourEircode(enterYesOrNo);
	}

	@When("^I input the eircode\"([^\"]*)\"$")
	public void i_input_the_eircode(String eirCode) throws Throwable {
		getAQuotePage.enterEircode(eirCode);
	}

	@When("^I click find address$")
	public void i_click_find_address() throws Throwable {
		getAQuotePage.findAddress();
	}

	@When("^I click address checkbox$")
	public void i_click_address_checkbox() throws Throwable {
	   getAQuotePage.address_checkBox();
	}

	@When("^I select type of household \"([^\"]*)\"$")
	public void i_select_type_of_household(String household) throws Throwable {
	   getAQuotePage.selectHouseholdType(household);
	}

	@When("^I select employment status\"([^\"]*)\"$")
	public void i_select_employment_status(String employmentStatus) throws Throwable {
		getAQuotePage.selectEmploymentStatus(employmentStatus);
	}
	@When("^I click  Yes when asked: Do you have a part-time occupation\\?$")
	public void i_click_Yes_when_asked_Do_you_have_a_part_time_occupation() throws Throwable {
	   getAQuotePage.clickYEsYouHaveAPartTimeOccupation();
	}

	@When("^I select part time occupation\"([^\"]*)\"$")
	public void i_select_part_time_occupation(String enterpartOccupation) throws Throwable {
		getAQuotePage.selectPartTimeOccupation(enterpartOccupation);
	}

	@When("^I select occupation\"([^\"]*)\"$")
	public void i_select_occupation(String enterOccupation) throws Throwable {
		getAQuotePage.selectOccupation(enterOccupation);
	}

	@When("^I click continue button on the details section$")
	public void i_click_continue_button_on_the_details_section() throws Throwable {
	   getAQuotePage.clickContinueOnDetailsSection();
	}

	@When("^your car section is displayed$")
	public void your_car_section_is_displayed() throws Throwable {
	  getAQuotePage.isYourCarSectionDisplayed();
	}

	@When("^I input the car reg\"([^\"]*)\"$")
	public void i_input_the_car_reg(String enterCarReg) throws Throwable {
	   getAQuotePage.enterCarReg(enterCarReg); 
	}

	@When("^I click find car$")
	public void i_click_find_car() throws Throwable {
	   getAQuotePage.clickFindCarButton();
	}

	@When("^I click YES to the question Is this your car$")
	public void i_click_YES_to_the_question_Is_this_your_car() throws Throwable {
		getAQuotePage.isThisYourCar();
	}

	@When("^I click NO to the question Will this car be used for business purposes$")
	public void i_click_NO_to_the_question_Will_this_car_be_used_for_business_purposes() throws Throwable {
	   getAQuotePage.notForBusinessPurpose();
	}

	@When("^I click NO to the question Will this car be used for commuting to work$")
	public void i_click_NO_to_the_question_Will_this_car_be_used_for_commuting_to_work() throws Throwable {
	 getAQuotePage.notToCommuteToWork();  
	}


	@When("^I select the number kilometers driven per year\"([^\"]*)\"$")
	public void i_select_the_number_kilometers_driven_per_year(String numOfKilo) throws Throwable {
	   getAQuotePage.selectNumberOfKilometerForDrivingUsage(numOfKilo);
	}
	// sprint 1 experiment code changes for mileage buttons
	@When("^I select a button for the number of kilometers driven per year\"([^\"]*)\"$")
	public void i_select_a_button_for_the_number_of_kilometers_driven_per_year(String mileageBtn) throws Throwable {
	   getAQuotePage.clickMileageButton(mileageBtn);
	}

	@When("^I click continue button under Your Car section$")
	public void i_click_continue_button_under_Your_Car_section() throws Throwable {
	   getAQuotePage.clickYourCarSectionContinueButton();
	}

	@When("^Your driving history section was displayed$")
	public void your_driving_history_section_was_displayed() throws Throwable {
	   getAQuotePage.isYourDrivingHistorySectionDisplayed();
	}
	
	@When("^I select current driving licence\"([^\"]*)\"$")
	public void i_select_current_driving_licence(String licence) throws Throwable {
	   getAQuotePage.selectDrivingLicence(licence);
	}

	@When("^I select how long the licence has been held\"([^\"]*)\"$")
	public void i_select_how_long_the_licence_has_been_held(String inputLicenceAge) throws Throwable {
	   getAQuotePage.selectHowLongLicenceHeld(inputLicenceAge);
	}

	@When("^I select most recent insurance\"([^\"]*)\"$")
	public void i_select_most_recent_insurance(String inpuutInsurance) throws Throwable {
	   getAQuotePage.selectRecentInsurance(inpuutInsurance); 
	}

	@When("^I select number of claims free years within UK and Ireland\"([^\"]*)\"$")
	public void i_select_number_of_claims_free_years_within_UK_and_Ireland(String inputClaimsFreeYears) throws Throwable {
	  getAQuotePage.selectClaimsFreeYears(inputClaimsFreeYears);
	}

	@When("^I click continue button under driving history section$")
	public void i_click_continue_button_under_driving_history_section() throws Throwable {
	 getAQuotePage.clickDrivingHistoryContinueButton();
	}

	@When("^additional driver section is displayed$")
	public void additional_driver_section_is_displayed() throws Throwable {
	   getAQuotePage.isAddtionalDriverSectionDisplayed();
	}

	@When("^I click NO to additional driver$")
	public void i_click_NO_to_additional_driver() throws Throwable {
	   getAQuotePage.clickNoAdditionalDriver();
	}

	@When("^I click continue under additional driver section$")
	public void i_click_continue_under_additional_driver_section() throws Throwable {
	   getAQuotePage.clickAdditionalDriverContinueButton();
	}

	@When("^claims section was displayed$")
	public void claims_section_was_displayed() throws Throwable {
		getAQuotePage.isClaimSectionDisplayed();
	}

	@When("^I click No to claims in the last five years$")
	public void i_click_No_to_claims_in_the_last_five_years() throws Throwable {
		getAQuotePage.clickNoClaimsInLastFiveYears(); 
	}

	@When("^I click continue button under claim section$")
	public void i_click_continue_button_under_claim_section() throws Throwable {
		getAQuotePage.clickClaimsSectionContinueButton();
	}

	@When("^Your cover section is displayed$")
	public void your_cover_section_is_displayed() throws Throwable {
		getAQuotePage.isYourCoverSectionDisplayed();
	}

	@When("^I click NO to the question Do you or anyone living at your address have another policy insured with AXA$")
	public void i_click_NO_to_the_question_Do_you_or_anyone_living_at_your_address_have_another_policy_insured_with_AXA() throws Throwable {
	    getAQuotePage.clickNoButtonWhenAskedHaveAnotherPolicyInsuredWithAAXA();
	}
	@When("^I select Yes when asked: Would you like an AXA Student First quote\\?$")
	public void i_select_Yes_when_asked_Would_you_like_an_AXA_Student_First_quote() throws Throwable {
	    getAQuotePage.clickYesYoulikeAnAXAStudentFirstQuote();
	}


	@When("^I select how insurance is paid \"([^\"]*)\"$")
	public void i_select_how_insurance_is_paid(String methodOfPayment) throws Throwable {
	    getAQuotePage.selectPaymentMethod(methodOfPayment);
	}

		
	@When("^I pick insurance start date\"([^\"]*)\"$")
	public void i_pick_insurance_start_date(String startDate) throws Throwable {
		getAQuotePage.insuranceStartDate(startDate);
	}


	@When("^I tick the box to confirm  assumptions & data protection information has been read$")
	public void i_tick_the_box_to_confirm_assumptions_data_protection_information_has_been_read() throws Throwable {
	   getAQuotePage.agreeTermsCheckBox();
	}
//handshake here below
	@When("^I click Get a Quote button$")
	public void i_click_Get_a_Quote_button() throws Throwable {
		yourQuotePage = getAQuotePage.getQuoteButton();
	}

	@When("^Your quote page is displayed$")
	public void your_quote_page_is_displayed() throws Throwable {
	   yourQuotePage.isYourQuotePageDisplayed();
	}



}
