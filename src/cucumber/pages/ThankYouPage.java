package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class ThankYouPage extends Helper{
	WebElement thankYouPagedisplayed;
	WebElement policyNumber;
	WebElement btnMyAXA;
	
	public void isThankYouPageDisplayed() throws Exception
	{
		thankYouPagedisplayed = getElementByXPath("//*[@id=\"page-content\"]/div[2]");
		VerifyAnElementIsDisplayed(thankYouPagedisplayed);
	}
	public void isPolicyNumberDisplayed()throws Exception
	{
		policyNumber = getElementById("policyNumber");
		String actualpolicyNumber = policyNumber.getAttribute(getPageSource());
		System.out.println(actualpolicyNumber);
	}
	
	public void isMyAxaButtonDisplayed()throws Exception
	{
		btnMyAXA = getElementById("btnMyAXA");
		VerifyAnElementIsDisplayed(btnMyAXA);
	}
}
