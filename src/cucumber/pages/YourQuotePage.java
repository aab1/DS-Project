package cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.helper.Helper;

public class YourQuotePage extends Helper{
	WebElement quotePageWithQuoteReference;
	WebElement carAndKeyRescue;
	WebElement openDriving;
	WebElement protectedNcd;
	WebElement injuryCover;
	WebElement legalExpenses;
	WebElement carHireReplacementPlus;
	WebElement comprehensiveDriveOtherCars;
	WebElement updateQuoteButton;
	WebElement buyNowBtn;
	
	
	
	public void isYourQuotePageDisplayed() throws Exception
	{
		quotePageWithQuoteReference = getElementById("quoteReference");
		VerifyAnElementIsDisplayed(quotePageWithQuoteReference);
				
	}
	
	public void CarAndKeyRescueCheckBox() throws Exception
	{
		Actions act = new Actions(driver);
		scrollToAnElement(getElementByCssSelector("#extras > div.box-header > h2"));
		act.moveToElement(getElementByCssSelector("[for=\"CoverDetails_OptionalAddonCover_2__IsOptionalCoverSelected\"]")).click().build().perform();
	}
	
	public void openDrivingCheckBox() throws Exception
	{
		openDriving = getElementByCssSelector("#extras > div.content > ul > li:nth-child(4) > label");
		clickAnElement(openDriving);
	}
	public void protectedNcdCheckBox() throws Exception
	{
		protectedNcd = getElementByCssSelector("#extras > div.content > ul > li:nth-child(5) > label");
		clickAnElement(protectedNcd);
	}
	public void injuryCoverCheckBox() throws Exception
	{
		injuryCover = getElementByCssSelector("#extras > div.content > ul > li:nth-child(6) > label");
		clickAnElement(injuryCover);
	}
	public void legalExpensesCheckBox() throws Exception
	{
		legalExpenses = getElementByCssSelector("#extras > div.content > ul > li:nth-child(7) > label");
		clickAnElement(legalExpenses);
	}
	public void carHireReplacementPlusCheckBox() throws Exception
	{
		 carHireReplacementPlus = getElementByCssSelector("#extras > div.content > ul > li:nth-child(8) > label");
		clickAnElement( carHireReplacementPlus);
	}
	public void comprehensiveDriveOtherCarsCheckBox() throws Exception
	{
		comprehensiveDriveOtherCars = getElementByCssSelector("#extras > div.content > ul > li:nth-child(9) > label");
		clickAnElement( comprehensiveDriveOtherCars);
	}
	public void updateQuoteButton() throws Exception
	{
		scrollToTheButtomOfAPage();
		updateQuoteButton = getElementByCssSelector("#Qr > div.Bn.clearfloat.quote-actions > div > div:nth-child(1) > button.btn.btn-lg.btn-block.btn-emphasis.update");
		clickAnElement(updateQuoteButton);
	}
	public CompleteAndPayPage buyNowButton() throws Exception
	{
		buyNowBtn = getElementByXPath("//*[@id=\"Qr\"]/div[4]/div/div[1]/button[2]");
		waitForElementToBeDisplayed("#Qr > div.Bn.clearfloat.quote-actions > div > div:nth-child(1) > button.btn.btn-lg.btn-block.btn-go.btn-icon-right.icon.buy");
		clickAnElement(buyNowBtn);
		return new CompleteAndPayPage();
	}

}
