Feature:Step 2 and 4 new design inluding secure logos
		In order to incept a policy
		As a potential axa customer
		I want to be able to incept a policy online	
@sprint1	
Scenario Outline: Incept a student first TPFT ROI motor policy 
		 Given I navigate to ROI motor DS
		 And motor DS Your Detail section is displayed
		 #When I select title "<Title>"
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
#student first profile
		 And I click  Yes when asked: Do you have a part-time occupation?
		 And I select part time occupation"<partTimeoccupation>"
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
#student first added
		 And I select Yes when asked: Would you like an AXA Student First quote?
		 And I select how insurance is paid "<methodOfPayment>" 
		 And I pick insurance start date"<startDate>"
		 And I tick the box to confirm  assumptions & data protection information has been read
		 And I click Get a Quote button
#New step 2 page
		And stepTwo with quote refernece is displayed
		And I click Switch to Third-party fire & theft cover 
		And I click continue to Buy  
#steps 2 ends 
		And Complete and Pay page is displayed
		And I select title  "<title>"
		And I select how long I have stayed in Ireland "<residency>"
		And I click continue button to proceed to licence details section
		And Licence details section is displayed
		And I select the day licence was first issued "<dayLicenceIssue>"
		And I select the month licence was first issued "<monthLicenceIssue>"
		And I select the Year licence was first issued "<yearLicenceIssue>"
		And I select No penalty point
		And I select No conviction
		And I select No health issues
		And I click continue button to proceed to insurance details section
		And insurance details section is displayed
		And I select current insurer"<currentInsurer>"
		And I enter the expiration date of the existing policy "<existingPolicyExpirationDate>"
		And I click Yes claim free insurance was earned in either UK or Ireland
		And I click No when asked have you been refused or declined motor insurance
		And I click No when asked Had a motor insurance renewal refused
		And I click continue button to proceed to car details section
		And car details section is displayed
		And I clicked Yes when asked Are you the main driver of the car
		And I clicked Yes when asked Are you or your spouse/civil partner the legal owner of the car
		And I select the value of the car"<carValue>"
		And I select the month car was purchased"<monthCarWasPurchased>"
		And I select the year car was purchased "<yearCarWasPurchased>"
		And I select Yes when asked Is registered by you or your spouse/civil partner
		And I select No when asked has the car going on cover been modified
		And I click continue button to proceed to confirm details section
		And confirm details section is displayed
		And I click the checkbox to confirm that the quote details I have provided are correct
#sprint two changes continue button was removed
		And I click continue button to select payment option
		And I click pay in full button
		And the secure payment page is displayed
		And I enter card number"<cardNumber>"
		And I enter the card  expiry month"<cardExpMonth>"
		And I enter the card expiry year"<cardExpYear>"
		And I enter security code"<cvv>"
		And I enter cardholder name "<cardholderName>"
		And I click pay now button 
		And the Thank you page displayed
		
		 

		 
		 	

		


		 
Scenarios:		 
		|Title	|firstName		|lastName|dayOfBirth  |birthMonth	|birthYear |gender	|email				   	   |areaCode |phoneNumber|eircodeYes/No|eircode  |household 			|employmentStatus	|partTimeoccupation |carRegNum|kilometersDriven|drivingLicence|licenceAge|recentInsurance	 |numOfClaimFreeYears		  |methodOfPayment|startDate	|title	|residency			|dayLicenceIssue|monthLicenceIssue	|yearLicenceIssue	|currentInsurer	|existingPolicyExpirationDate	|carValue		|monthCarWasPurchased	|yearCarWasPurchased	|cardNumber			|cardExpMonth	|cardExpYear	|cvv	|cardholderName	|
		|Mrs	|studentfirst  	|tpft	 |12		  |	05 - May 	|	1998   |Female  |	atsst1@sttesting.net   |087		 |0879567812  |Yes		   |K32VP28  |Rented Accommodation  |Full Time Student	|Student 3rd Level	|10D262 	|Up to 5,000 km|ROI (Full)	  |9 years	 |Insured in own name|6+ Years Claims Free Driving|Pay in full	  |29			|Mrs	|More than 3 years	|02				|05 - May			|2010				|AA Insurance	|30/04/2017						|43000			|05 - May				|2016					|4263971921001307	|02				|22				|123	|Test			|
		#|Mr		|sudentfirst	|tpft	 |15		  |	05 - May 	|	1998   |Male  	|	atsst2@sttesting.net   |087		 |0879567812  |Yes		   |K32VP28  |Rented Accommodation  |Full Time Student 	|Student 3rd Level	|151D262 	|Up to 5,000 km|ROI (Full)	  |9 years	 |Insured in own name|6+ Years Claims Free Driving|Pay in full	  |29			|Mr		|More than 3 years	|02				|05 - May			|2010				|AA Insurance	|30/04/2017						|43000			|05 - May				|2016					|4263971921001307	|02				|22				|123	|Test			|
		
		
		
				