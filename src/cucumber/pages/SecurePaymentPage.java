package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class SecurePaymentPage extends Helper{
	
	
	WebElement  PaymentDetails;
	WebElement cardNumber;
	WebElement cardExpMonth;
	WebElement cardExpYear;
	WebElement cardHolderName;
	WebElement payNowButton;
	WebElement cardSecurityCode;
	
	public void isSecurePaymentDisplayed() throws Exception
	{
		PaymentDetails = getElementByCssSelector("#rxp-body > div.rxp-page-title.rxp-merchant-page-title > span.rxp-page-title-text");
		VerifyAnElementIsDisplayed(PaymentDetails);
	}
	public void enterCardNumber(String cardNum)throws Exception
	{
		cardNumber = getElementById("pas_ccnum");
		typeGivenValueInto(cardNumber, cardNum);
	}
	public void enterCardExpiryMonth(String enterCardExpiryMonth)throws Exception
	{
		cardExpMonth = getElementById("pas_ccmonth");
		typeGivenValueInto(cardExpMonth, enterCardExpiryMonth);
	}
	public void enterCardExpiryYear(String enterCardExpiryYear)throws Exception
	{
		cardExpYear = getElementById("pas_ccyear");
		clickAnElement(cardExpYear);
		typeGivenValueInto(cardExpYear, enterCardExpiryYear);
	}
	public void enterCardSecurityCode(String enterCardCvv)throws Exception
	{
		cardSecurityCode = getElementById("pas_cccvc");
		typeGivenValueInto(cardSecurityCode, enterCardCvv);
	}
	
	public void enterCardHolderName(String enterCardHolderName)throws Exception
	{
		cardHolderName = getElementById("pas_ccname");
		typeGivenValueInto(cardHolderName, enterCardHolderName);
	}
	//thank page is returned
	public ThankYouPage clickPayNowButton()throws Exception
	{
		payNowButton = getElementById("rxp-primary-btn"); 
		clickAnElement(payNowButton);
		return new ThankYouPage();
	}

}
