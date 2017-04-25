package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class ThankYouPage extends Helper{
	WebElement thankYouPagedisplayed;
	WebElement policyNumber;
	WebElement btnMyAXA;
	
	public void isThankYouPageDisplayed() throws Exception
	{
		thankYouPagedisplayed = getElementByCssSelector("[class=\"h3 heading\"]");
		VerifyAnElementIsDisplayed(thankYouPagedisplayed);
	}
	public void isPolicyNumberDisplayed()throws Exception
	{
		policyNumber = getElementById("policyNumber");
		String actualpolicyNumber = policyNumber.getText();
		System.out.println(actualpolicyNumber);
		scrollToTheButtomOfAPage();
	}
	
	public void isMyAxaButtonDisplayed()throws Exception
	{
		btnMyAXA = getElementById("btnMyAXA");
		VerifyAnElementIsDisplayed(btnMyAXA);
	}
}
