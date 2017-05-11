package cucumber.steps;

import cucumber.api.java.en.When;
import cucumber.pages.CompleteAndPayPage;
import cucumber.pages.YourQuotePage;

public class YourQuotePageSteps {
	YourQuotePage yourQuotePage = new YourQuotePage();
	CompleteAndPayPage completeAndPayPage;
	
	@When("^I click Switch to Third-party fire & theft cover$")
	public void i_click_Switch_to_Third_party_fire_theft_cover() throws Throwable {
	   yourQuotePage.SwitchToThirdPartyFireAndTheftCover();
	}
	
	@When("^I click Car and Key Rescue check box$")
	public void i_click_Car_and_Key_Rescue_check_box() throws Throwable {
		yourQuotePage.CarAndKeyRescueCheckBox();
	}

	@When("^I click Open Driving  check box$")
	public void i_click_Open_Driving_check_box() throws Throwable {
	    yourQuotePage.openDrivingCheckBox();
	}

	@When("^I click Protected NCD  check box$")
	public void i_click_Protected_NCD_check_box() throws Throwable {
	   yourQuotePage.protectedNcdCheckBox();
	}

	@When("^I click Injury Cover  check box$")
	public void i_click_Injury_Cover_check_box() throws Throwable {
	   yourQuotePage.injuryCoverCheckBox();
	}

	@When("^I click Legal Expenses  check box$")
	public void i_click_Legal_Expenses_check_box() throws Throwable {
	   yourQuotePage.legalExpensesCheckBox();
	}

	@When("^I click Car Hire / Replacement Plus  check box$")
	public void i_click_Car_Hire_Replacement_Plus_check_box() throws Throwable {
	   yourQuotePage.carHireReplacementPlusCheckBox();
	}

	@When("^I click Comprehensive Drive Other Cars  check box$")
	public void i_click_Comprehensive_Drive_Other_Cars_check_box() throws Throwable {
	    yourQuotePage.comprehensiveDriveOtherCarsCheckBox();
	}

	@When("^I click Update Quote button$")
	public void i_click_Update_Quote_button() throws Throwable {
	   yourQuotePage.updateQuoteButton();
	}
	//Handshake took place below
	@When("^I click Buy Now button$")
	public void i_click_Buy_Now_button() throws Throwable {
		completeAndPayPage = yourQuotePage.buyNowButton();
	}

	@When("^Complete and Pay page is displayed$")
	public void complete_and_Pay_page_is_displayed() throws Throwable {
		completeAndPayPage.isCompleteAndPayPageDisplayed();
	}
	
//changes in sprint 1:steps 2 new page design
	
		@When("^stepTwo with quote refernece is displayed$")
		public void steptwo_with_quote_refernece_is_displayed() throws Throwable {
		   yourQuotePage.isStep2_Sprint1_displayed();
		}
		
		@When("^I click Car and Key Rescue add button$")
		public void i_click_Car_and_Key_Rescue_add_button() throws Throwable {
		    yourQuotePage.carAndKeyRescueButton();
		}

		@When("^I click Open Driving  add button$")
		public void i_click_Open_Driving_add_button() throws Throwable {
			yourQuotePage.openDrivingButton();
		}

		@When("^I click Protected NCD add button$")
		public void i_click_Protected_NCD_add_button() throws Throwable {
			yourQuotePage.protectedNcdButton();
		}

		@When("^I click Injury Cover  add button$")
		public void i_click_Injury_Cover_add_button() throws Throwable {
		   yourQuotePage.injuryCoverButton();
		}

		@When("^I click Legal Expenses  add button$")
		public void i_click_Legal_Expenses_add_button() throws Throwable {
		   yourQuotePage.legalExpensesButton();
		}

		@When("^I click Car Hire / Replacement Plus  add button$")
		public void i_click_Car_Hire_Replacement_Plus_add_button() throws Throwable {
			yourQuotePage.carHireReplacementPlusbutton();
		}

		@When("^I click Comprehensive Drive Other Cars  add button$")
		public void i_click_Comprehensive_Drive_Other_Cars_add_button() throws Throwable {
		   yourQuotePage.comprehensiveDriveOtherCarsButton();
		}

		@When("^I click Update Quote button at the top of the page$")
		public void i_click_Update_Quote_button_at_the_top_of_the_page() throws Throwable {
		  yourQuotePage.updateQuoteButtonAtPageTop();
		}

		@When("^I click continue to Buy$")
		public void i_click_continue_to_Buy() throws Throwable {
			completeAndPayPage = yourQuotePage.clickContinueToBuyNow();;
		}


}
