package cucumber.pages;

import org.openqa.selenium.WebElement;

import cucumber.helper.Helper;

public class CompleteAndPayPage extends Helper{
	
	WebElement completeAndPayPage;
	WebElement title;
	WebElement howLongYouHaveResidedInIreland;
	WebElement continuebuttonToGoToLicencedetailsSection;
	WebElement licenceDetails;
	WebElement noPenaltyPoint;
	WebElement licenceIssueDay;
	WebElement licenceIssueMonth;
	WebElement licenceIssueYear;
	WebElement noConviction;
	WebElement noHealthCondition;
	WebElement continueButton;
	WebElement insuranceDetailsSection;
	WebElement currentInsurer;
	WebElement existingPolicyExpDate;
	WebElement claimfree_Yes;
	WebElement declinedMotorInsurance_No;
	WebElement insuranceRenewalRefused_No;
	WebElement continueButtonToGoToCarDetailsSection;
	WebElement carDetailsSecton;
	WebElement areYouMainDriver;
	WebElement areyouTheLegalOwnerOfTheCar_Yes;
	WebElement carValue;
	WebElement monthCarWasPurchased;
	WebElement yearCarWasPurchased;
	WebElement carIsARegisteredByYou;
	WebElement theCarGoingOnCoverHasNotBeenModified;
	WebElement continueButtonOnCompleteCarDetailsSection;
	WebElement confirmDetailsSectionDisplayed;
	WebElement confirmQuoteDetailsCheckBox;
	WebElement continueToPaymentOption;
	WebElement payInFullBtn;
	WebElement closeCookieButton;
	
	
	public void isCompleteAndPayPageDisplayed() throws Exception
	{
		completeAndPayPage = getElementByCssSelector("#main > div > h1");
		VerifyAnElementIsDisplayed(completeAndPayPage);
		
	}
	public void selectTitle(String selecttitle)throws Exception
	{
		title = getElementById("CompletePersonalDetails_Title");
		selectByText(title, selecttitle);
	}
	
	public void selectHowLongHaveYouLivedInIrelandOrUK(String enterDurationOfResidency) throws Exception
	{
		howLongYouHaveResidedInIreland = getElementById("CompletePersonalDetails_LengthOfResidencyId");
		selectByText(howLongYouHaveResidedInIreland, enterDurationOfResidency);
	}
	public void clickContinueToGoToLicenceDetailsSection()throws Exception
	{
		//scrollToAnElement(getElementByCssSelector("#completeLicenceDetails > legend"));
		scrollToAnElement(getElementById("CompletePersonalDetails_LengthOfResidencyId"));
		continuebuttonToGoToLicencedetailsSection = getElementByXPath("//*[@id=\"completePersonalDetails\"]/ol/li[9]/div/div[1]/button");
		clickAnElement(continuebuttonToGoToLicencedetailsSection);
	}
	
	public void isLicenceDetailsSectionDisplayed()throws Exception
	{
		licenceDetails = getElementByCssSelector("#completeLicenceDetails > legend");
		VerifyAnElementIsDisplayed(licenceDetails);
	}
	public void selectDayLicenceWasIssued(String day) throws Exception
	{
		scrollToAnElement(getElementByCssSelector("#completeLicenceDetails > legend"));
		waitForElementToBeDisplayed("#CompleteLicenceDetails_LicenceIssueDateDay");
		licenceIssueDay = getElementById("CompleteLicenceDetails_LicenceIssueDateDay");
		selectByValue(licenceIssueDay, day);
	}
	public void selectMonthLicenceWasIssued(String month) throws Exception
	{
		waitForElementToBeDisplayed("#CompleteLicenceDetails_LicenceIssueDateMonth");
		licenceIssueMonth = getElementById("CompleteLicenceDetails_LicenceIssueDateMonth");
		selectByText(licenceIssueMonth, month);
	}
	public void selectYearLicenceWasIssued(String year) throws Exception
	{
		licenceIssueYear = getElementById("CompleteLicenceDetails_LicenceIssueDateYear");
		selectByText(licenceIssueYear, year);
	}
	public void selectNoPenaltyPoint() throws Exception
	{
		noPenaltyPoint = getElementByCssSelector("[for=\"CompleteLicenceDetails_HasPenaltyPointsB\"]");
		clickAnElement(noPenaltyPoint);
	}
	public void selectNoConviction() throws Exception
	{
		noConviction = getElementByCssSelector("[for=\"CompleteLicenceDetails_Ild1B\"]");
		clickAnElement(noConviction);
	}
	public void selectNoHealthCondition() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[for=\"CompleteLicenceDetails_Ild1B\"]"));
		noHealthCondition = getElementByCssSelector("[for=\"CompleteLicenceDetails_Ild2B\"]");
		clickAnElement(noHealthCondition);
	}
	public void clickContinueButtonToGoToInsuraceDetailSection()throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[for=\"CompleteLicenceDetails_Ild2B\"]"));
		continueButton = getElementByCssSelector("#completeLicenceDetails > ol > li.Bn > div > div:nth-child(1) > button");
		clickAnElement(continueButton);	
	}
	public void isInsuranceDetailSectionDisplayed() throws Exception
	{
		insuranceDetailsSection = getElementByCssSelector("#completeInsuranceDetails > ol > li:nth-child(3) > label");
		VerifyAnElementIsDisplayed(insuranceDetailsSection);
	}
	public void selectCurrentInsurer(String enterCurrentInsurer)throws Exception
	{
		currentInsurer = getElementById("CompleteInsuranceDetails_CurrentInsurerId");
		selectByText(currentInsurer, enterCurrentInsurer);
	}
	public void enterExistingPolicyExpiryDate(String expDate)throws Exception
	{
		existingPolicyExpDate = getElementById("CompleteInsuranceDetails_CurrentInsuranceExpiryDate");
		typeGivenValueInto(existingPolicyExpDate, expDate);
	}
	public void clickYesClaimFreeWasEarnedInIrelandOrUK() throws Exception
	{
		scrollToAnElement(getElementById("CompleteInsuranceDetails_CurrentInsuranceExpiryDate"));
		claimfree_Yes = getElementByCssSelector("[for=\"CompleteInsuranceDetails_HasIrelandOrUkDrivingExperienceA\"]");
		clickAnElement(claimfree_Yes);
	}
	public void clickNo_haveYouBeenRefusedOrDeclinedMotorInsurance() throws Exception
	{
		scrollToAnElement(getElementByCssSelector("[for=\"CompleteInsuranceDetails_HasIrelandOrUkDrivingExperienceA\"]"));
		declinedMotorInsurance_No = getElementByCssSelector("[for=\"CompleteInsuranceDetails_Ild4B\"]");
		clickAnElement(declinedMotorInsurance_No);
	}
	public void clickNo_insuranceRenewalRefused() throws Exception
	{
		insuranceRenewalRefused_No = getElementByCssSelector("#completeInsuranceDetails > ol > li:nth-child(9) > div > div > div > div > label:nth-child(4)");
		clickAnElement(insuranceRenewalRefused_No);
	}
	public void clickContinueButtonToGoToCarDetailsSection() throws Exception
	{
		scrollToTheButtomOfAPage();
		continueButtonToGoToCarDetailsSection = getElementByCssSelector("#completeInsuranceDetails > ol > li.Bn > div > div:nth-child(1) > button");
		clickAnElement(continueButtonToGoToCarDetailsSection);
	}
	public void isCarDetailsSectionDisplayed() throws Exception
	{
		carDetailsSecton = getElementByCssSelector("#completeCarDetails > ol > li:nth-child(3) > label");
		VerifyAnElementIsDisplayed(carDetailsSecton);
	}
	public void clickYes_areYouMainDriver() throws Exception
	{
		//waitForElementToBeDisplayed("#completeCarDetails > ol > li:nth-child(3) > div.validation-wrapper > div > div > label:nth-child(2)");
		scrollToAnElement(getElementByCssSelector("[id=\"CompleteCarDetails_RegistrationNumber\"]"));
		waitForElementToBeDisplayed("[for=\"CompleteCarDetails_IsProposerMainDriverA\"]");
		areYouMainDriver = getElementByCssSelector("[for=\"CompleteCarDetails_IsProposerMainDriverA\"]");
		clickAnElement(areYouMainDriver);
	}
	public void clickYes_AreyouTheLegalOwnerOfTheCar() throws Exception
	{
		areyouTheLegalOwnerOfTheCar_Yes = getElementByCssSelector("#completeCarDetails > ol > li:nth-child(4) > div.validation-wrapper > div > div > label:nth-child(2)");
		clickAnElement(areyouTheLegalOwnerOfTheCar_Yes);
	}
	public void selectcarValue(String enterValueOfCar)throws Exception
	{
		int actualCarValue = Integer.parseInt(enterValueOfCar);
		carValue = getElementById("CompleteCarDetails_CarValueId");
		if (actualCarValue <= 3000)
		{
			selectByValue(carValue, "10280001");
		}else if(actualCarValue <= 5000){
			selectByValue(carValue, "10280002");
		}else if(actualCarValue <= 7000){
			selectByValue(carValue, "10280003");
		}else if(actualCarValue <= 9000){
			selectByValue(carValue, "10280004");
		}else if(actualCarValue <= 11000){
			selectByValue(carValue, "10280005");
		}else if(actualCarValue <= 13000){
			selectByValue(carValue, "10280006");
		}else if(actualCarValue <= 15000){
			selectByValue(carValue, "10280007");
		}else if(actualCarValue <= 20000){
			selectByValue(carValue, "10280008");
		}else if(actualCarValue <= 25000){
			selectByValue(carValue, "10280009");
		}else if(actualCarValue <= 30000){
			selectByValue(carValue, "10280010");
		}else if(actualCarValue <= 35000){
			selectByValue(carValue, "10280011");
		}else if(actualCarValue <= 40000){
			selectByValue(carValue, "10280012");
		}else if(actualCarValue <= 45000){
			selectByValue(carValue, "10280013");
		}else if(actualCarValue <= 50000){
			selectByValue(carValue, "10280014");
		}else if(actualCarValue > 50000){
			selectByValue(carValue, "10280015");
		}
		
	}
	public void selectMonthCarWasPurchased(String enterPurchaseMonth)throws Exception
	{
		monthCarWasPurchased = getElementById("CompleteCarDetails_CarPurchaseDateMonth");
		selectByText(monthCarWasPurchased, enterPurchaseMonth);
	}
	public void selectYearCarWasPurchased(String enterPurchaseYear)throws Exception
	{
		yearCarWasPurchased = getElementById("CompleteCarDetails_CarPurchaseDateYear");
		selectByText(yearCarWasPurchased, enterPurchaseYear);
	}
	public void clickYes_isARegisteredByYou() throws Exception
	{
		scrollToAnElement(getElementById("CompleteCarDetails_CarPurchaseDateYear"));
		carIsARegisteredByYou = getElementByCssSelector("#completeCarDetails > ol > li:nth-child(8) > div > div > div > div > label:nth-child(2)");
		clickAnElement(carIsARegisteredByYou);
		scrollToTheButtomOfAPage();
	}
	public void clickNo_theCarGoingOnCoverHasNotBeenModified() throws Exception
	{
		theCarGoingOnCoverHasNotBeenModified = getElementByCssSelector("#completeCarDetails > ol > li:nth-child(9) > div > div > div > div > label:nth-child(4)");
		clickAnElement(theCarGoingOnCoverHasNotBeenModified);
	}
	public void clickContinueButtonToGoToConfirmDetailsSection() throws Exception
	{
		continueButtonOnCompleteCarDetailsSection = getElementById("btnCompleteCarDetails");
		clickAnElement(continueButtonOnCompleteCarDetailsSection);
	}
	public void isConfirmDetailsSectionDisplayed() throws Exception
	{
		scrollToTheButtomOfAPage();
		confirmDetailsSectionDisplayed = getElementByCssSelector("[for=\"confirmAll\"]");
  
	}
	public void confirmTheQuoteDetailsCheckBox() throws Exception
	{
		scrollToTheButtomOfAPage();
		confirmQuoteDetailsCheckBox = getElementByCssSelector("[for=\"confirmAll\"]");
		clickAnElement(confirmQuoteDetailsCheckBox);
	}
	public void clickContinueButtonToGoToPaymentOption() throws Exception
	{
		scrollToTheButtomOfAPage();
		continueToPaymentOption = getElementById("btnGotoPayment");
		clickAnElement(continueToPaymentOption);
	}
	//moving to another page from here
	public SecurePaymentPage clickPayInFullBtn() throws Exception
	{	
		closeCookieButton = getElementById("set-cookie");
		clickAnElement(closeCookieButton);
		//scrollToAnElement(getElementByCssSelector("[for=\"confirmAll\"]"));
		scrollToTheButtomOfAPage();
		payInFullBtn = getElementById("btnPayInFull");
		clickAnElement(payInFullBtn);
		return new SecurePaymentPage();
	}
	
}
