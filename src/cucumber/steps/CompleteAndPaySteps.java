package cucumber.steps;

import cucumber.api.java.en.When;
import cucumber.pages.CompleteAndPayPage;
import cucumber.pages.SecurePaymentPage;

public class CompleteAndPaySteps {
	CompleteAndPayPage completeAndPayPage = new CompleteAndPayPage();
	SecurePaymentPage securePaymentPage;
	
	@When("^I select title  \"([^\"]*)\"$")
	public void i_select_title(String selecttitle) throws Throwable {
		completeAndPayPage.selectTitle(selecttitle);
	}

	@When("^I select how long I have stayed in Ireland \"([^\"]*)\"$")
	public void i_select_how_long_I_have_stayed_in_Ireland(String enterDurationOfResidency) throws Throwable {
	    completeAndPayPage.selectHowLongHaveYouLivedInIrelandOrUK(enterDurationOfResidency);
	}

	@When("^I click continue button to proceed to licence details section$")
	public void i_click_continue_button_to_proceed_to_licence_details_section() throws Throwable {
	    completeAndPayPage.clickContinueToGoToLicenceDetailsSection();
	}

	@When("^Licence details section is displayed$")
	public void licence_details_section_is_displayed() throws Throwable {
	   completeAndPayPage.isCompleteAndPayPageDisplayed();
	}

	@When("^I select the day licence was first issued \"([^\"]*)\"$")
	public void i_select_the_day_licence_was_first_issued(String day) throws Throwable {
	    completeAndPayPage.selectDayLicenceWasIssued(day);
	}

	@When("^I select the month licence was first issued \"([^\"]*)\"$")
	public void i_select_the_month_licence_was_first_issued(String month) throws Throwable {
	    completeAndPayPage.selectMonthLicenceWasIssued(month);
	}

	@When("^I select the Year licence was first issued \"([^\"]*)\"$")
	public void i_select_the_Year_licence_was_first_issued(String year) throws Throwable {
	   completeAndPayPage.selectYearLicenceWasIssued(year);
	}

	@When("^I select No penalty point$")
	public void i_select_No_penalty_point() throws Throwable {
	   completeAndPayPage.selectNoPenaltyPoint();
	}

	@When("^I select No conviction$")
	public void i_select_No_conviction() throws Throwable {
	   completeAndPayPage.selectNoConviction();
	}

	@When("^I select No health issues$")
	public void i_select_No_health_issues() throws Throwable {
	    completeAndPayPage.selectNoHealthCondition();
	}

	@When("^I click continue button to proceed to insurance details section$")
	public void i_click_continue_button_to_proceed_to_insurance_details_section() throws Throwable {
	   completeAndPayPage.clickContinueButtonToGoToInsuraceDetailSection();
	}

	@When("^insurance details section is displayed$")
	public void insurance_details_section_is_displayed() throws Throwable {
	   completeAndPayPage.isInsuranceDetailSectionDisplayed();
	}
	@When("^I select current insurer\"([^\"]*)\"$")
	public void i_select_current_insurer(String enterCurrentInsurer) throws Throwable {
	   completeAndPayPage.selectCurrentInsurer(enterCurrentInsurer);
	}

	@When("^I enter the expiration date of the existing policy \"([^\"]*)\"$")
	public void i_enter_the_expiration_date_of_the_existing_policy(String expDate) throws Throwable {
	  completeAndPayPage.enterExistingPolicyExpiryDate(expDate);
	}

	@When("^I click Yes claim free insurance was earned in either UK or Ireland$")
	public void i_click_Yes_claim_free_insurance_was_earned_in_either_UK_or_Ireland() throws Throwable {
		completeAndPayPage.clickYesClaimFreeWasEarnedInIrelandOrUK();
	}

	@When("^I click No when asked have you been refused or declined motor insurance$")
	public void i_click_No_when_asked_have_you_been_refused_or_declined_motor_insurance() throws Throwable {
		completeAndPayPage.clickNo_haveYouBeenRefusedOrDeclinedMotorInsurance();
	}

	@When("^I click No when asked Had a motor insurance renewal refused$")
	public void i_click_No_when_asked_Had_a_motor_insurance_renewal_refused() throws Throwable {
		completeAndPayPage.clickNo_insuranceRenewalRefused();
	}

	@When("^I click continue button to proceed to car details section$")
	public void i_click_continue_button_to_proceed_to_car_details_section() throws Throwable {
		completeAndPayPage.clickContinueButtonToGoToCarDetailsSection();
	}
	@When("^car details section is displayed$")
	public void car_details_scetion_is_displayed() throws Throwable {
	   completeAndPayPage.isCarDetailsSectionDisplayed();
	}

	@When("^I clicked Yes when asked Are you the main driver of the car$")
	public void i_clicked_Yes_when_asked_Are_you_the_main_driver_of_the_car() throws Throwable {
	   completeAndPayPage.clickYes_areYouMainDriver();
	}

	@When("^I clicked Yes when asked Are you or your spouse/civil partner the legal owner of the car$")
	public void i_clicked_Yes_when_asked_Are_you_or_your_spouse_civil_partner_the_legal_owner_of_the_car() throws Throwable {
	   completeAndPayPage.clickYes_AreyouTheLegalOwnerOfTheCar();
	}

	@When("^I select the value of the car\"([^\"]*)\"$")
	public void i_select_the_value_of_the_car(String enterValueOfCar) throws Throwable {
	   completeAndPayPage.selectcarValue(enterValueOfCar);
	}

	@When("^I select the month car was purchased\"([^\"]*)\"$")
	public void i_select_the_month_car_was_purchased(String enterPurchaseMonth) throws Throwable {
	   completeAndPayPage.selectMonthCarWasPurchased(enterPurchaseMonth);
	}

	@When("^I select the year car was purchased \"([^\"]*)\"$")
	public void i_select_the_year_car_was_purchased(String enterPurchaseYear) throws Throwable {
	 completeAndPayPage.selectYearCarWasPurchased(enterPurchaseYear);
	}

	@When("^I select Yes when asked Is registered by you or your spouse/civil partner$")
	public void i_select_Yes_when_asked_Is_registered_by_you_or_your_spouse_civil_partner() throws Throwable {
	  completeAndPayPage.clickYes_isARegisteredByYou();
	}

	@When("^I select No when asked has the car going on cover been modified$")
	public void i_select_No_when_asked_has_the_car_going_on_cover_been_modified() throws Throwable {
	   completeAndPayPage.clickNo_theCarGoingOnCoverHasNotBeenModified();
	}

	@When("^I click continue button to proceed to confirm details section$")
	public void i_click_continue_button_to_proceed_to_confirm_details_section() throws Throwable {
		completeAndPayPage.clickContinueButtonToGoToConfirmDetailsSection();
	}

	@When("^confirm details section is displayed$")
	public void confirm_details_section_is_displayed() throws Throwable {
	  completeAndPayPage.isConfirmDetailsSectionDisplayed();
	}
	@When("^I click the checkbox to confirm that the quote details I have provided are correct$")
	public void i_click_the_checkbox_to_confirm_that_the_quote_details_I_have_provided_are_correct() throws Throwable {
	    completeAndPayPage.confirmTheQuoteDetailsCheckBox();
	}

	@When("^I click continue button to select payment option$")
	public void i_click_continue_button_to_select_payment_option() throws Throwable {
	   completeAndPayPage.clickContinueButtonToGoToPaymentOption();
	}
	//handshake here
	@When("^I click pay in full button$")
	public void i_click_pay_in_full_button() throws Throwable {
		securePaymentPage = completeAndPayPage.clickPayInFullBtn();
	}

	@When("^the secure payment page is displayed$")
	public void the_secure_payment_page_is_displayed() throws Throwable {
		securePaymentPage.isSecurePaymentDisplayed();
	}


}
