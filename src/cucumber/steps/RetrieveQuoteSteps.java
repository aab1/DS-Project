package cucumber.steps;

import cucumber.api.java.en.When;
import cucumber.pages.RetrieveQuotePage;

public class RetrieveQuoteSteps {
	RetrieveQuotePage retrieveQuotePage = new RetrieveQuotePage();
	
	@When("^I navigate to ROI Motor Retrieval page$")
	public void i_navigate_to_ROI_Motor_Retrieval_page() throws Throwable {
		retrieveQuotePage.navigateToRetrieveQuotePageInNewTab();
	}
}
