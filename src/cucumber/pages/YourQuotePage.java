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
	WebElement continueToBuyNow;
	WebElement tpft;
	
	
	public void isYourQuotePageDisplayed() throws Exception
	{
		quotePageWithQuoteReference = getElementById("quoteReference");
		VerifyAnElementIsDisplayed(quotePageWithQuoteReference);
				
	}
	public void SwitchToThirdPartyFireAndTheftCover() throws Exception
	{
		tpft = getElementByCssSelector("[class=\"link cover-switch\"]");
		clickAnElement(tpft);
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
	
	//Sprint 1 changes
	public void isStep2_Sprint1_displayed() throws Exception
	{
		quotePageWithQuoteReference = getElementById("qtpFullQuoteRef");
		VerifyAnElementIsDisplayed(quotePageWithQuoteReference);
	}
	public void carAndKeyRescueButton() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[id=\"PromotionCode_Btn\"]"));
		carAndKeyRescue = getElementByCssSelector("[for=\"car-and-key-rescue\"]");
		clickAnElement(carAndKeyRescue);
	}
	public void openDrivingButton() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[for=\"car-and-key-rescue\"]"));
		openDriving = getElementByCssSelector("[for=\"open-driving\"]");
		clickAnElement(openDriving);
	}
	public void protectedNcdButton() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[for=\"open-driving\"]"));
		protectedNcd = getElementByCssSelector("[for=\"protected-ncd\"]");
		clickAnElement(protectedNcd);
	}
	public void injuryCoverButton() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[for=\"protected-ncd\"]"));
		injuryCover = getElementByCssSelector("[for=\"injury-cover\"]");
		clickAnElement(injuryCover);
	}
	public void legalExpensesButton() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[id=\"PromotionCode_Btn\"]"));
		legalExpenses = getElementByCssSelector("[for=\"legal-expenses\"]");
		clickAnElement(legalExpenses);
	}
	public void carHireReplacementPlusbutton() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[for=\"legal-expenses\"]"));
		carHireReplacementPlus = getElementByCssSelector("[for=\"car-hire-replacement-plus\"]");
		clickAnElement(carHireReplacementPlus);
	}
	public void comprehensiveDriveOtherCarsButton() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[for=\"car-hire-replacement-plus\"]"));
		comprehensiveDriveOtherCars = getElementByCssSelector("[for=\"comprehensive-drive-other-cars\"]");
		clickAnElement(comprehensiveDriveOtherCars);
	}
	public void updateQuoteButtonAtPageTop() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[class=\"cover-image\"]"));
		updateQuoteButton = getElementByCssSelector("#main-content-wrapper > section.band.color-a-bg.color-f.blur-on-updating > div > div > div.col-sm-8.col-sm-push-4.col-md-6.col-md-push-6.blur-on-update-required > div.update-required-message.darken-more > button");
		clickAnElement(updateQuoteButton);
	}
	public CompleteAndPayPage clickContinueToBuyNow() throws Exception
	{
		try{
			
			waitForElementToDisAppear("[class=\"color-d-bg blur-on-update-required\"]");	
			
		}catch(Exception e){
			
		}
		scrollToTheButtomOfAPage();
		waitForElementToBeDisplayed("#main-content-wrapper > section:nth-child(8) > div > div > div > div > a.btn.btn-go.btn-icon-right.icon.buy-now-btn");
		continueToBuyNow = getElementByCssSelector("[class=\"btn btn-go btn-icon-right icon buy-now-btn\"]");
		clickAnElement(continueToBuyNow);
		return new CompleteAndPayPage();
	}

}
