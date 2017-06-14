package cucumber.pages;





import cucumber.helper.Helper;

public class RetrieveQuotePage extends Helper{
	public void navigateToRetrieveQuotePageInNewTab() throws Exception
	{
		launchUrl_In_NewTab("https://dsdev.testaxa.ie/MotorQuote/RetrieveQuote/");
		
	}
	
}
