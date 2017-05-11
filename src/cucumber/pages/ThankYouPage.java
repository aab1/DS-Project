package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class ThankYouPage extends Helper{
	WebElement thankYouPagedisplayed;
	WebElement policyNumber;
	WebElement btnMyAXA;
	
	public void isThankYouPageDisplayed() throws Exception
	{
//		thankYouPagedisplayed = getElementByCssSelector("[class=\"h3 heading\"]");
//		VerifyAnElementIsDisplayed(thankYouPagedisplayed);
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
	
	//sprint 1 changes
	public void isPolicyNumDisplayedOnTheNewStep4() throws Exception
	{
		policyNumber = getElementByXPath("//*[@id=\"main-content-wrapper\"]/div/div/div/div[1]/div[3]/span");
		VerifyAnElementIsDisplayed(policyNumber);
		String actualpolicyNumber = policyNumber.getText();
		System.out.println(actualpolicyNumber);
	}
}
