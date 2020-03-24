package com.cts.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cts.productstorepages.AddToCartPage;
import com.cts.productstorepages.CartInfoPage;
import com.cts.productstorepages.CategoryPage;
import com.cts.productstorepages.ContactInfoPage;
import com.cts.productstorepages.DeletePage;
import com.cts.productstorepages.LoginPage;
import com.cts.productstorepages.PlaceOrderPage;
import com.cts.productstorepages.ProductPage;
import com.cts.productstorepages.UserDetailPage;
import com.cts.productstorepages.signUpPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;

	@Given("I have browser with productstore page.")
	public void i_have_browser_with_productstore_page() {
		
		// launching the chrome driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		//maximizing the window
		driver.manage().window().maximize();
		// providing implicit wait of 30 seconds to all findElement
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//getting the link
		driver.get("https://www.demoblaze.com");
	}
	//Scenario: Valid Credential Test 
	
	@When("I enter username as {string} and I enter password as {string}")
	public void i_enter_username_as_and_I_enter_password_as(String userName, String password) throws InterruptedException {
		// click on login in home page
		LoginPage.clickOnLogin(driver);
		//providing explicit wait of 30 seconds to wait for the presence of login user name
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginusername")));
		Thread.sleep(1000);
		//entering user name
		LoginPage.enterUserName(driver, userName);
		//providing explicit wait of 30 seconds to wait for the presence of login password
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginpassword")));
		//entering password
		LoginPage.enterPassword(driver, password);
		// click on login
		LoginPage.clickOnLoginAgain(driver);
	}

	@Then("I Should access to the portal with title as {string}")
	public void i_Should_access_to_the_portal_with_title_as(String expectedText) {
		//getting the text and storing into a string variable
		String actualText = driver.findElement(By.linkText("Log out")).getText();
		//comparing the expected with actual
		Assert.assertEquals(actualText, expectedText);
		//quit the driver
		driver.quit();

	}
	//Scenario Outline: Valid Credential Test
	
	@When("I enter valid username as {string} and password as {string}")
	public void i_enter_valid_username_as_and_password_as(String username, String Password) throws InterruptedException {
		// click on login in home page
		LoginPage.clickOnLogin(driver);
		//providing explicit wait of 30 sec to locate for the presence of user name and password elements
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginusername")));
		// entering user name
		LoginPage.enterUserName(driver, username);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginpassword")));
		// entering password
		LoginPage.enterPassword(driver, Password);
		// click on login
		LoginPage.clickOnLoginAgain(driver);
	}

	@Then("I should get error popup message as {string}")
	public void i_should_get_error_popup_message_as(String expectedAlertMessage) {
		//providing explicit wait of 30 seconds to locate for the presence of alert
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		// getting the actual text and storing in a string variable
		String actualAlertMessage = driver.switchTo().alert().getText();
		// comparing the expected with actual
		Assert.assertEquals(actualAlertMessage, expectedAlertMessage);
		//quit the driver
		driver.quit();
	}
	//Scenario: Scenario: Empty userName 
	
	@When("I  will not enter valid username as {string} and i will enter valid password as {string}")
	public void i_will_not_enter_valid_username_as_and_i_will_enter_valid_password_as(String emptyUserName,
			String password) {
		// click on login in the home page
		LoginPage.clickOnLogin(driver);
		// providing explicit wait of 30 sec to locate for the presence of username and password elements
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginusername")));
		// leave user name as blank
		LoginPage.enterUserName(driver, emptyUserName);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginpassword")));
		// enter password
		LoginPage.enterPassword(driver, password);
		// click on login
		LoginPage.clickOnLoginAgain(driver);

	}

	@Then("I should get  popup message as {string}")
	public void i_should_get_popup_message_as(String expectedUserAlertMessage) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		//providing explicit wait of 30 seconds to locate for the presence of alert
		String actualUserAlretMessage = driver.switchTo().alert().getText();
		//comparing the expected with actual
		Assert.assertEquals(actualUserAlretMessage, expectedUserAlertMessage);
		//quit the driver
		driver.quit();
	}
	//Scenario: Empty password 
	
	@When("I enter valid username as {string} and i will not enter password  {string}")
	public void i_enter_valid_username_as_and_i_will_not_enter_password(String userName, String emptypassword) {
		//click on login in the home page
		LoginPage.clickOnLogin(driver);
		// providing explicit wait of 30 seconds to locate the presence of user name and password elements
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginusername")));
		//enter user name
		LoginPage.enterUserName(driver, userName);
		//leave password as empty
		LoginPage.enterPassword(driver, emptypassword);
		// click on login
		LoginPage.clickOnLoginAgain(driver);
	}

	@Then("I should get error popup message for empty password as {string}")
	public void i_should_get_error_popup_message_for_empty_password_as(String expectedPasswordAlertMessage) {
		//providing explicit wait of 30 seconds to wait for the presence of alert
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		// getting the text and storing in a string variable
		String actualPasswordAlretMessage = driver.switchTo().alert().getText();
		// comparing expected with actual
		Assert.assertEquals(actualPasswordAlretMessage, expectedPasswordAlertMessage);
		//quit the driver
		driver.quit();
	}
	//Scenario: valid filling contact
	
	@When("I enter valid recepeintEmail as {string} and recepientName as {string} and message as {string}")
	public void i_enter_valid_recepeintEmail_as_and_recepientName_as_and_message_as(String recepientMailId,
			String recepientName, String Message) {
		//click on contact in the home page
		ContactInfoPage.clickOnContact(driver);
		// providing some explicit wait of 30 seconds to locate for the presence of recipient email and recipient name and message text elements	
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("recipient-email")));
		// entering the user mail id
		ContactInfoPage.enterRecepientMailId(driver, recepientMailId);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("recipient-name")));
		// entering the user name
		ContactInfoPage.enterRecepientName(driver, recepientName);
		// entering any message 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message-text")));
		ContactInfoPage.enterMessage(driver, Message);
		// click on send message in the pop up
		ContactInfoPage.clickOnMessage(driver);
	}

	@Then("I should get complete contact filling popup message as {string}")
	public void i_should_get_complete_contact_filling_popup_message_as(String expectedContactFillingAlertMessage) {
		// providing the explicit wait of 40 seconds for the presence of alert 
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.alertIsPresent());
		// getting the text and storing it in a string variable
		String actualContactFillingAlertMessage = driver.switchTo().alert().getText();
		//comparing the expected with actual
		Assert.assertEquals(actualContactFillingAlertMessage, expectedContactFillingAlertMessage);
		// quit the driver
		driver.quit();
	}
	//Scenario: Contact Blank fill 
	
	@When("I will not enter valid recepientEmail as {string} and recepientName as {string} and message as {string}")
	public void i_will_not_enter_valid_recepientEmail_as_and_recepientName_as_and_message_as(String recepientMailId,
			String recepientName, String Message) {
		//click on contact in the home page
		ContactInfoPage.clickOnContact(driver);
		// leave recipient mail id/ user mail id as blank
		ContactInfoPage.enterRecepientMailId(driver, recepientMailId);
		// leave recipient name/ username as blank
		ContactInfoPage.enterRecepientName(driver, recepientName);
		// leave message as blank
		ContactInfoPage.enterMessage(driver, Message);
		// click on send message in the pop up
		ContactInfoPage.clickOnMessage(driver);
	}

	@Then("I should get popup message without filling details as {string}")
	public void i_should_get_popup_message_without_filling_details_as(
			String expectedWithoutContactFillingAlertMessage) {
		// providing explicit wait of 40 seconds for alert
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.alertIsPresent());
		// getting the text and storing it in a string variable
		String actualWithoutContactFillingAlertMessage = driver.switchTo().alert().getText();
		// comparing the expected with actual
		Assert.assertEquals(actualWithoutContactFillingAlertMessage, expectedWithoutContactFillingAlertMessage);
		// quit the driver
		driver.quit();
	}
	//Scenario: selecting a product in the home page
	
	@When("I click on the product in home page and click on add to cart")
	public void i_click_on_the_product_in_home_page_and_click_on_add_to_cart() {
		// providing explicit wait of 60 seconds for the element to be clickable
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Home")));
		// click on home page
		LoginPage.clickOnHomePage(driver);

		// wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//img[@src='imgs/galaxy_s6.jpg']"))));
		// click on any product in the home page
		ProductPage.clickOnProduct(driver);
		// adding the product to cart
		AddToCartPage.clickProductToAddToCart(driver);
		AddToCartPage.clickOnAddToCart(driver);
	}

	@Then("I should get a popup message as {string}")
	public void i_should_get_a_popup_message_as(String expectedAddToCartAlertMessage) {
		// providing explicit wait of 60 seconds for alert
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.alertIsPresent());
		// getting the text and storing it ina string variable
		String actualAddToCartAlertMessage = driver.switchTo().alert().getText();
		// comparing the expected with the actual
		Assert.assertEquals(actualAddToCartAlertMessage, expectedAddToCartAlertMessage);
		// click on add to cart
		AddToCartPage.clickOnAlert(driver);
		// quit the driver
		driver.quit();
	}
	// Scenario: Deleting a product from the cart 

	@When("I click on delete")
	public void i_click_on_delete() {
		// providing some explicit wait of 60 seconds for the element to be clickable
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Home")));
		//click on home page
		LoginPage.clickOnHomePage(driver);
		//click on product you like
		ProductPage.clickOnProduct(driver);
		//add to cart
		AddToCartPage.clickProductToAddToCart(driver);
		AddToCartPage.clickOnAddToCart(driver);
		//explicit wait of 60 seconds for the alert
		wait.until(ExpectedConditions.alertIsPresent());
		//click on ok in the alert
		AddToCartPage.clickOnAlert(driver);
		// click on cart in the home page
		CartInfoPage.clickOnCart(driver);
		// click on delete in the popup
		DeletePage.clickOnDelete(driver);
	}

	@Then("The product should be deleted")
	public void the_product_should_be_deleted() {
		// getting the text and storing it in a string variable
		String total = driver.findElement(By.xpath("//h3[text()='360']")).getText();
		// converting it into integer
		int Total = Integer.parseInt(total);
		// comparing the expected with actual
		if (Total < 0) {
			Assert.fail("Does not meet my requirements");
		} else {
			System.out.println("passed");
		}
	}
	//Scenario: Placing order
	
	@When("I click on place order")
	public void i_click_on_place_order() {
		// providing some explicit wait of 60 seconds for the element to be cickable
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Home")));
		// click on home in the home page
		LoginPage.clickOnHomePage(driver);
		// click any product 
		ProductPage.clickOnProduct(driver);
		// click on the add to cart of the product
		AddToCartPage.clickProductToAddToCart(driver);
		// click on add to cart
		AddToCartPage.clickOnAddToCart(driver);
		// waiting for the alert presence
		wait.until(ExpectedConditions.alertIsPresent());
		// click on ok in the alert pop up
		AddToCartPage.clickOnAlert(driver);
		// click on cart in the home page
		CartInfoPage.clickOnCart(driver);
		// click on place order in the cart page
		PlaceOrderPage.clickOnPlaceOrder(driver);
	}

	@Then("it should display form for filling details")
	public void it_should_display_form_for_filling_details() throws InterruptedException {
		// getting the text and storing it in the string variable
		String actualText = driver.findElement(By.xpath("//span[text()='×']")).getText();
		Thread.sleep(1000);
		// comparing the expected with the actual
		Assert.assertEquals(actualText, "");
		// quit the driver
		driver.quit();
	}
	
	//Scenario: Filling all details for purchase 
	
//	@When("I enter name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order")
//	public void i_enter_my_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order(String name, String country,
//			String city, String creditCard, String month, String year) {

	@When("I enter my name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order")
	public void i_enter_my_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order(
			String name, String country, String city, String creditCard, String month, String year) {
		// providing some explicit wait for the element to be clickable
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Home")));
		// click on home in the home page
		LoginPage.clickOnHomePage(driver);
		// click on product 
		ProductPage.clickOnProduct(driver);
		//click on add to cart
		AddToCartPage.clickProductToAddToCart(driver);
		AddToCartPage.clickOnAddToCart(driver);
		// waiting for the alert of 60 seconds
		wait.until(ExpectedConditions.alertIsPresent());
		//click on ok in th elaert pop up
		AddToCartPage.clickOnAlert(driver);
		//click on cart in the home page
		CartInfoPage.clickOnCart(driver);
		// click on placeorder in the cart page
		PlaceOrderPage.clickOnPlaceOrder(driver);
		// entering the nmae
		UserDetailPage.enterName(driver, name);
		// entering the country
		UserDetailPage.enterCountry(driver, country);
		// entering the city
		UserDetailPage.enterCity(driver, city);
		// entering the credit card number
		UserDetailPage.enterCreditCard(driver, creditCard);
		// entering the expiry month of credit card
		UserDetailPage.enterMonth(driver, month);
		// entering the expiry year of credit card
		UserDetailPage.enterYear(driver, year);
		// click on purchase order
		UserDetailPage.clickOnPurchase(driver);
	}

	@Then("It should display purchase details popup message as {string}")
	
	public void it_should_display_purchase_details_popup_message_as(String expectedText) {
		// getting the text and storing it in a string variable
		String actualText = driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']")).getText();
		//comparing the expected with actual
		Assert.assertEquals(actualText, expectedText);
		// quit the driver
		driver.quit();
	}

	//Scenario: Blank name or Credit card 
	
	
	@When("I enter the name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order")
	public void i_enter_the_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order(
			String name, String country, String city, String creditCard, String month, String year) {
		// providng some explicit wait for the element to be clickable
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Home")));
		//click on home in the home page
		LoginPage.clickOnHomePage(driver);
		//click on any product 
		ProductPage.clickOnProduct(driver);
		//click on add to cart 
		AddToCartPage.clickProductToAddToCart(driver);
		AddToCartPage.clickOnAddToCart(driver);
		//waiting for the alert message
		wait.until(ExpectedConditions.alertIsPresent());
		//click on alert
		AddToCartPage.clickOnAlert(driver);
		//click on cart in the home page
		CartInfoPage.clickOnCart(driver);
		//click on place order in the cart page
		PlaceOrderPage.clickOnPlaceOrder(driver);
		// leaving the user name as blank
		UserDetailPage.enterName(driver, name);
		// entering the country 
		UserDetailPage.enterCountry(driver, country);
		// entering the city
		UserDetailPage.enterCity(driver, city);
		// leaving the credit card number as blank
		UserDetailPage.enterCreditCard(driver, creditCard);
		// entering the expiry month of credit card
		UserDetailPage.enterMonth(driver, month);
		// entering the expiry year of credit card
		UserDetailPage.enterYear(driver, year);
		//click on purchase order in the pop up
		UserDetailPage.clickOnPurchase(driver);
	}

	@Then("It should display a popup message as {string}")
	public void it_should_display_a_popup_message_as(String expectedMissingdetailsText) {
		// getting the text and storing it in a string variable
		String actualMissingdetailsText = driver.switchTo().alert().getText();
		//comparing the expected with actual
		Assert.assertEquals(actualMissingdetailsText, expectedMissingdetailsText);
		// quit the driver
		driver.quit();
	}

	//Scenario: Filling all the details and click on close 
	
//	@When("I enter the name in purchase detail as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order and click on close")
//	public void i_enter_the_name_in_purchase_detail__as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_close(
//			String name, String country, String city, String creditCard, String month, String year) {

	@When("I enter the name in purchase detail  as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order and click on close")
	public void i_enter_the_name_in_purchase_detail_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_close(
			String name, String country, String city, String creditCard, String month, String year) {
		// providing some explicit wait of 60 seconds for the element to be clickable
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Home")));
		// click on home page
		LoginPage.clickOnHomePage(driver);
		// click on any product that you like
		ProductPage.clickOnProduct(driver);
		// click on add to cart
		AddToCartPage.clickProductToAddToCart(driver);
		AddToCartPage.clickOnAddToCart(driver);
		// waiting for alert message
		wait.until(ExpectedConditions.alertIsPresent());
		//click on ok in the alert pop up
		AddToCartPage.clickOnAlert(driver);
		//click on cart in the home page
		CartInfoPage.clickOnCart(driver);
		//click on place order
		PlaceOrderPage.clickOnPlaceOrder(driver);
		// entering name
		UserDetailPage.enterName(driver, name);
		// entering country
		UserDetailPage.enterCountry(driver, country);
		//entering the city
		UserDetailPage.enterCity(driver, city);
		//entering the credit card number
		UserDetailPage.enterCreditCard(driver, creditCard);
		// entering the expiry month of credit card 
		UserDetailPage.enterMonth(driver, month);
		// entering the expiry year of credit card
		UserDetailPage.enterYear(driver, year);
		// click on purchase order  
		UserDetailPage.clickOnPurchase(driver);
		// click on ok in the pop up
		UserDetailPage.clickOnOk(driver);
	}

	@Then("Check for home page")
	public void check_for_home_page() {
		// getting the text and storing it in a string variable
		String actualTextInHomeIcon = driver.findElement(By.partialLinkText("PRODUCT STORE")).getText();
		// comparing expected with actual
		Assert.assertEquals(actualTextInHomeIcon, "PRODUCT STORE");
		//quit the driver
		driver.quit();
	}

	//Scenario: Filling all the userdetails and click on close button
	
//	@When("I enter the useer name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order and click on close button")
//	public void i_enter_the_useer_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_close_button(
//			String name, String country, String city, String creditCard, String month, String year) {

	@When("I enter the useer name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order and click on close")
	public void i_enter_the_useer_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_close(
			String name, String country, String city, String creditCard, String month, String year) {
		// providing some explicit wait of 60 seconds  for the element to be clickable
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Home")));
		//click on home page
		LoginPage.clickOnHomePage(driver);
		//click on the product
		ProductPage.clickOnProduct(driver);
		//click on add to cart
		AddToCartPage.clickProductToAddToCart(driver);
		AddToCartPage.clickOnAddToCart(driver);
		//waiting for the alert message
		wait.until(ExpectedConditions.alertIsPresent());
		//click on ok in the laert pop up
		AddToCartPage.clickOnAlert(driver);
		//click on cart in the home page
		CartInfoPage.clickOnCart(driver);
		// click on place order in the cart page
		PlaceOrderPage.clickOnPlaceOrder(driver);
		//entering username
		UserDetailPage.enterName(driver, name);
		// entering the country
		UserDetailPage.enterCountry(driver, country);
		//entering the city
		UserDetailPage.enterCity(driver, city);
		// entering the credit card number
		UserDetailPage.enterCreditCard(driver, creditCard);
		//entering the expiry month of the credit card
		UserDetailPage.enterMonth(driver, month);
		// entering the expiry year of the credit card
		UserDetailPage.enterYear(driver, year);
		//click on close
		UserDetailPage.clickOnClose(driver);
	}

	@Then("It should go back to the cartpage and assert for {string}")
	public void it_should_go_back_to_the_cartpage_and_assert_for(String expectedTextInHomeIcon) {
		// getting the text and storing it in astring variable
		String actualTextInHomeIcon1 = driver.findElement(By.partialLinkText("PRODUCT STORE")).getText();
		//comparing the expected with actual
		Assert.assertEquals(actualTextInHomeIcon1, expectedTextInHomeIcon);
		//quit the driver
		driver.quit();
	}

	//Scenario: Valid signUp
	
	@When("I enter username as {string} and Password as {string}")
	public void i_enter_username_as_and_Password_as(String userName, String password) {
		//click on sign up in the home page
		signUpPage.clickOnSignUp(driver);
		// entering a new username
		signUpPage.enterUserName(driver, userName);
		//entering a new password
		signUpPage.enterPassword(driver, password);
	}

	@Then("I should click on signUp")
	public void i_should_click_on_signUp() {
		// click on signup in the pop up
		signUpPage.againClickOnSignUp(driver);
		//providing some explicit wait of 30 seconds for the alert message
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		//getting the text and storing it in a string variable
		String signUpSuccessfullyaActualText = driver.switchTo().alert().getText();
		//comparing the expected with actual
		Assert.assertEquals(signUpSuccessfullyaActualText, "Sign up successful.");
		driver.switchTo().alert().accept();
		driver.quit();
	}
	//Scenario: Already exsisted user for SignUp
	
	@When("I enter the already used username as {string} and password as {string}")
	public void i_enter_the_already_used_username_as_and_password_as(String userName, String password) throws InterruptedException {
		//click on the signup in the home page
		signUpPage.clickOnSignUp(driver);
		Thread.sleep(1000);
		// entering the already existed username
		signUpPage.enterUserName(driver, userName);
		// entering the password of already existed username
		signUpPage.enterPassword(driver, password);
	}

	@Then("I should click on signup and I should get popup message as {string}")
	public void i_should_click_on_signup_and_I_should_get_popup_message_as(String signUpSuccessfullyExpectedText) {
		//click on signup in the pop up
		signUpPage.againClickOnSignUp(driver);
		//providing some explicit wait of 30 seconds for alert message
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		//getting the text and storing it in a string variable
		String signUpSuccessfullyaActualText = driver.switchTo().alert().getText();
		//comparing the expected with the actual
		Assert.assertEquals(signUpSuccessfullyaActualText, signUpSuccessfullyExpectedText);
		driver.switchTo().alert().accept();
		//quit the driver
		driver.quit();
	}

	@When("I will not enter the username {string} and i will not enter the password {string}")
	public void i_will_not_enter_the_username_and_i_will_not_enter_the_password(String userName, String password) throws InterruptedException {
		signUpPage.clickOnSignUp(driver);
		Thread.sleep(1000);
		signUpPage.enterUserName(driver, userName);
		signUpPage.enterPassword(driver, password);
	}

	@Then("I should click on signup and I should get the popup message as {string}")
	public void i_should_click_on_signup_and_I_should_get_the_popup_message_as(String signUpSuccessfullyExpectedText) {
		signUpPage.againClickOnSignUp(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String signUpSuccessfullyaActualText = driver.switchTo().alert().getText();
		Assert.assertEquals(signUpSuccessfullyaActualText, signUpSuccessfullyExpectedText);
		driver.switchTo().alert().accept();
		driver.quit();
	}
	
	//Scenario: checking categories for Phones 
	
	@When("I click on mobile phones it will show only mobile phones")
	public void i_click_on_mobile_phones_it_will_show_only_mobile_phones() {
		
		//driver.findElement(By.linkText("Phones")).click();
		//click on phones in the home page
		CategoryPage.clickonphone(driver);
	}

	@Then("I search for mobile phone visibility for assertion")
	public void i_search_for_mobile_phone_visibility_for_assertion() {
		//getting the text and storing it in a string variable 
		String actualText = driver.findElement(By.xpath("//img[@src='imgs/galaxy_s6.jpg']/ancestor::a")).getText();
		// comparing  expected with actual
		Assert.assertEquals(actualText, "");
		// quit the driver
		driver.quit();

	}
	
	//Scenario: checking categories for Laptops
	@When("I click on laptops it will show only Laptops")
	public void i_click_on_laptops_it_will_show_only_Laptops() {
		//driver.findElement(By.linkText("Laptops")).click();
		//click on laptop category in the home page
		CategoryPage.clickonlaptop(driver);
	}

	@Then("I search for laptops visibility for assertion")
	public void i_search_for_laptops_visibility_for_assertion() {
		// getting the etxt and storing it in a string variable
		String actualText = driver.findElement(By.xpath("//img[@src='imgs/sony_vaio_5.jpg']/ancestor::a")).getText();
		// comparing the expected with actual
		Assert.assertEquals(actualText, "");
		//quit the driver
		driver.quit();
	}
	//Scenario: checking categories for Monitors 
	
	@When("I click on monitors it will show only monitors")
	public void i_click_on_monitors_it_will_show_only_monitors() {
		//driver.findElement(By.linkText("Monitors")).click();
		CategoryPage.clickonmonitor(driver);
	}

	@Then("I search for monitors visibility for assertion")
	public void i_search_for_monitors_visibility_for_assertion() {
		// getting the text and storing it ina string variable
		String actualText = driver.findElement(By.xpath("//img[@src='imgs/asusm.jpg']/ancestor::a")).getText();
		// comparing the expected with the actual
		Assert.assertEquals(actualText, "");
		//quit the driver
		driver.quit();
	}

}
