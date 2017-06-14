Feature: Get and retrieve motor quote
		In order to incept a policy
		As a potential axa customer
		I want to be able to make payment as quickly as possible
		
@dev
Scenario Outline: Get Motor Quote And Retrieve 
		Given I navigate to ROI motor DS
		And motor DS Your Detail section is displayed
		When I enter name "<Title>" "<firstName>" "<lastName>" DOB "<dayOfBirth>" "<birthMonth>" "<birthYear>" and gender"<gender>"
		And I enter email "<email>" phone number"<areaCode>" "<phoneNumber>" and address"<eircodeYes/No>" "<eircode>"
		And I select household type "<household>" employment"<employmentStatus>" and occupation "<occupation>"
		And I complete car section with car reg "<carRegNum>" and mileage "<kilometersDriven>"
		And I enter drivers licence details "<drivingLicence>" "<licenceAge>"
		And  I enter the NCD details "<recentInsurance>"  "<numOfClaimFreeYears>"
		And I added No driver and claim
		And I complete the cover section including payment method "<methodOfPayment>"
		And I navigate to ROI Motor Retrieval page
		#And I 	 

		

		
Scenarios:		 
		|Title	|firstName|lastName|dayOfBirth|birthMonth|birthYear|gender		|email				   	   |areaCode |phoneNumber|eircodeYes/No|eircode  |household 			|employmentStatus|occupation|carRegNum	|kilometersDriven|drivingLicence|licenceAge	 |recentInsurance	 |numOfClaimFreeYears		  |methodOfPayment|startDate	|title	|residency			|dayLicenceIssue|monthLicenceIssue	|yearLicenceIssue	|currentInsurer	|existingPolicyExpirationDate	|carValue		|monthCarWasPurchased	|yearCarWasPurchased	|cardNumber			|cardExpMonth	|cardExpYear	|cvv	|cardholderName	|
		|Mrs	|Test	  |Ptester |12		  |	05 - May |	1970   |Female  	|	atsst1@sttesting.net   |087		 |0879567812  |Yes		   |K32VP28  |Rented Accommodation  |	Employed	 |Accountant|10D262 	|Up to 5,000 km|ROI (Full)	  	|9 years	 |Insured in own name|6+ Years Claims Free Driving|Pay in full	  |29			|Mrs	|More than 3 years	|02				|05 - May			|2010				|AA Insurance	|30/04/2017						|43000			|05 - May				|2016					|4263971921001307	|02				|22				|123	|Test			|
		


	