Feature:Incept a motor policy
		In order to incept a policy
		As a potential axa customer
		I want to be able to incept a policy online	
		
Scenario Outline: Incept scheme A comprehensive ROI motor policy for employed and unemployed persons who knows their eircode
		 Given I navigate to ROI motor DS
		 And motor DS Your Detail section is displayed
		 When I input firstname "<firstName>"
		 And I input lastname "<lastName>"
		 And I select day of birth"<dayOfBirth>"
		 And I select birth month "<birthMonth>"
		 And I select birth Year "<birthYear>"
		 And I click gender "<gender>"
		 And I input email"<email>"
		 And I select area code "<areaCode>"
		 And I input phone number"<phoneNumber>"
		 And I click "<eircodeYes/No>"Yes/No to Do you know your Eircode question
		 And I input the eircode"<eircode>"
		 And I click find address
		 And I click address checkbox
		 And I select type of household "<household>"
		 And I select employment status"<employmentStatus>" 
		 And I select occupation"<occupation>"
		 And I click continue button on the details section
		 And your car section is displayed
		 And I input the car reg"<carRegNum>"
		 And I click find car
		 And I click YES to the question Is this your car
   		 And I click NO to the question Will this car be used for business purposes
		 And I click NO to the question Will this car be used for commuting to work
		 And I select the number kilometers driven per year"<kilometersDriven>"
		 And I click continue button under Your Car section
		 And Your driving history section was displayed
		 And I select current driving licence"<drivingLicence>"	
		 And I select how long the licence has been held"<licenceAge>"	
		 And I select most recent insurance"<recentInsurance>"
		 And I select number of claims free years within UK and Ireland"<numOfClaimFreeYears>"
		 And I click continue button under driving history section
		 And additional driver section is displayed 
		 And I click NO to additional driver
		 And I click continue under additional driver section
		 And claims section was displayed
		 And I click No to claims in the last five years
		 And I click continue button under claim section
		 And Your cover section is displayed
		 And I click NO to the question Do you or anyone living at your address have another policy insured with AXA
		 And I select how insurance is paid "<methodOfPayment>" 
		 And I pick insurance start date"<startDate>"
		 And I tick the box to confirm  assumptions & data protection information has been read
		 And I click Get a Quote button
		 And Your quote page is displayed 
		 
		 
		 	

		


		 
Scenarios:		 
		|firstName|lastName|dayOfBirth|birthMonth|birthYear|gender	|email				   	   |areaCode |phoneNumber|eircodeYes/No|eircode  |household 			|employmentStatus|occupation|carRegNum|kilometersDriven|drivingLicence|licenceAge|recentInsurance	 |numOfClaimFreeYears		  |methodOfPayment|startDate	|
		|Ade	  |Peters  |12		  |	05 - May |	1970   |Female  |	test@sttesting.net	   |085		 |857765432  |Yes		   |D15tx65  |Rented Accommodation  |	Employed	 |Accountant|10D262 |Up to 5,000 km  |ROI (Full)	  |9 years	 |Insured in own name|6+ Years Claims Free Driving|Pay in full	  |28			|
		
		
		
		