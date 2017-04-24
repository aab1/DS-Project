package cucumber.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.pages.SecurePaymentPage;
import cucumber.pages.ThankYouPage;

public class SecurePaymentSteps {
	SecurePaymentPage securePaymentPage = new SecurePaymentPage();
	ThankYouPage thankYouPage;
	
	@When("^I enter card number\"([^\"]*)\"$")
	public void i_enter_card_number(String cardNum) throws Throwable {
	   securePaymentPage.enterCardNumber(cardNum);
	}

	@When("^I enter the card  expiry month\"([^\"]*)\"$")
	public void i_enter_the_card_expiry_month(String enterCardExpiryMonth) throws Throwable {
	    securePaymentPage.enterCardExpiryMonth(enterCardExpiryMonth);
	}

	@When("^I enter the card expiry year\"([^\"]*)\"$")
	public void i_enter_the_card_expiry_year(String enterCardExpiryYear) throws Throwable {
		securePaymentPage.enterCardExpiryYear(enterCardExpiryYear);
	}

	@When("^I enter security code\"([^\"]*)\"$")
	public void i_enter_security_code(String enterCardCvv) throws Throwable {
		securePaymentPage.enterCardSecurityCode(enterCardCvv);
	}

	@When("^I enter cardholder name \"([^\"]*)\"$")
	public void i_enter_cardholder_name(String enterCardHolderName) throws Throwable {
		securePaymentPage.enterCardHolderName(enterCardHolderName);
	}

	@When("^I click pay now button$")
	public void i_click_pay_now_button() throws Throwable {
		thankYouPage = securePaymentPage.clickPayNowButton();
	}



}
