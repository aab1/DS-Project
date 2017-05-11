package cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pages.ThankYouPage;

public class ThankYouPageSteps {
	
	ThankYouPage  thankYouPage = new ThankYouPage();
	
	@When("^the Thank you page displayed$")
	public void the_Thank_you_page_displayed() throws Throwable {
		thankYouPage.isThankYouPageDisplayed();

	}

	@Then("^I view the policy number$")
	public void i_view_the_policy_number() throws Throwable {
		thankYouPage.isPolicyNumberDisplayed();
	}

	@Then("^the option to register for myAxa is also displayed$")
	public void the_option_to_register_for_myAxa_is_also_displayed() throws Throwable {
		thankYouPage.isMyAxaButtonDisplayed();
	}
	//sprint one changes
	@Then("^I see the policy number on the new page$")
	public void i_see_the_policy_number_on_the_new_page() throws Throwable {
		thankYouPage.isPolicyNumDisplayedOnTheNewStep4();
	}
}
