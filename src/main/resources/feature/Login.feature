Feature: Login 
	In order to buy the product in webpage
 As a customer
 I want to get access to the portal
 
Background: Below are the common steps for the scenarios 
	Given I have browser with productstore page. 
	
Scenario: Valid Credential Test 

	When I enter username as 'kavyakalathuru1998@gmail.com' and I enter password as 'kavyakalathuru' 
	Then I Should access to the portal with title as 'Log out' 
	
Scenario Outline: Valid Credential Test
	When I enter username as '<username>' and I enter password as '<password>'
	Then I Should access to the portal with title as 'Log out'
	Examples:
	|username|password|
	|veerahemagovada@gmail.com|veerahema|
	|oohasri234@gmail.com|9493824001|
	
Scenario: Invalid Password Credential 
	When I enter valid username as 'kavyakalathuru1998@gmail.com' and password as 'kavyakalathuru1' 
	Then I should get error popup message as 'Wrong password.' 
Scenario: Empty userName 
	When I  will not enter valid username as '' and i will enter valid password as 'kavyakalathuru' 
	Then I should get  popup message as 'Please fill out Username and Password.' 
Scenario: Empty password 
	When I enter valid username as 'kavyakalathuru1998@gmail.com' and i will not enter password  '' 
	Then I should get error popup message for empty password as 'Please fill out Username and Password.' 
Scenario: valid filling contact 
	When I enter valid recepeintEmail as 'kavyakalathuru1998@gmail.com' and recepientName as 'kavyakalathuru' and message as 'want to buy a mobile' 
	Then I should get complete contact filling popup message as 'Thanks for the message!!' 
Scenario: Contact Blank fill 
	When I will not enter valid recepientEmail as '' and recepientName as '' and message as '' 
	Then I should get popup message without filling details as 'Thanks for the message!!' 
Scenario: selecting a product in the home page 
	When I click on the product in home page and click on add to cart 
	Then I should get a popup message as 'Product added' 
Scenario: Deleting a product from the cart 
	When I click on delete 
	Then The product should be deleted 
Scenario: Placing order 
	When I click on place order 
	Then it should display form for filling details 
Scenario: Filling all details for purchase 
	When I enter my name as 'ooha' and country as 'India' and city as 'Nellore' and credit card as '605385697632' and month as 'nov' and year as '2022' and click on purchase order 
	Then It should display purchase details popup message as 'Thank you for your purchase!' 
Scenario: Blank name or Credit card 
	When I enter the name as '' and country as 'India' and city as 'Nellore' and credit card as '' and month as 'nov' and year as '2022' and click on purchase order 
	Then It should display a popup message as 'Please fill out Name and Creditcard.' 
Scenario: Filling all the details and click on close 
	When I enter the name in purchase detail  as 'kavya' and country as 'India' and city as 'Nellore' and credit card as '605385697632' and month as 'nov' and year as '2022' and click on purchase order and click on close 
	Then Check for home page 
Scenario: Filling all the userdetails and click on close button 
	When I enter the useer name as 'kavya' and country as 'India' and city as 'chirala' and credit card as '605385697632' and month as 'nov' and year as '2022' and click on purchase order and click on close 
	Then It should go back to the cartpage and assert for 'PRODUCT STORE' 
Scenario: Valid signUp 
	When I enter username as 'sulochana@gmail.com' and Password as 'sulochana' 
	Then I should click on signUp 
Scenario: Already exsisted user for SignUp 
	When I enter the already used username as 'kavyakalathuru12@gmail.com' and password as 'kavyakalathuru' 
	Then I should click on signup and I should get popup message as 'This user already exist.' 
	When I will not enter the username '' and i will not enter the password '' 
	Then I should click on signup and I should get the popup message as 'Please fill out Username and Password.' 
Scenario: checking categories for Phones 
	When I click on mobile phones it will show only mobile phones 
	Then I search for mobile phone visibility for assertion 
Scenario: checking categories for Laptops 
	When I click on laptops it will show only Laptops 
	Then I search for laptops visibility for assertion 
Scenario: checking categories for Monitors 
	When I click on monitors it will show only monitors 
	Then I search for monitors visibility for assertion 
