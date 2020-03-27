$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/feature/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "\tIn order to buy the product in webpage\n As a customer\n I want to get access to the portal",
  "keyword": "Feature"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Valid Credential using excel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter login details from Excel \"src/test/resources/excel/Productstore.xlsx\" with SheetName \"LoginValidCredential\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_login_details_from_Excel_with_SheetName(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should access to the portal with title as \u0027Log out\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_access_to_the_portal_with_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Credential Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter username as \u0027kavyakalathuru1998@gmail.com\u0027 and I enter password as \u0027kavyakalathuru\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_username_as_and_I_enter_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Should access to the portal with title as \u0027Log out\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_Should_access_to_the_portal_with_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Valid Credential Test",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter username as \u0027\u003cusername\u003e\u0027 and I enter password as \u0027\u003cpassword\u003e\u0027",
  "keyword": "When "
});
formatter.step({
  "name": "I Should access to the portal with title as \u0027Log out\u0027",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "veerahemagovada@gmail.com",
        "veerahema"
      ]
    },
    {
      "cells": [
        "oohasri234@gmail.com",
        "9493824001"
      ]
    }
  ]
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Credential Test",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter username as \u0027veerahemagovada@gmail.com\u0027 and I enter password as \u0027veerahema\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_username_as_and_I_enter_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Should access to the portal with title as \u0027Log out\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_Should_access_to_the_portal_with_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid Credential Test",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter username as \u0027oohasri234@gmail.com\u0027 and I enter password as \u00279493824001\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_username_as_and_I_enter_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Should access to the portal with title as \u0027Log out\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_Should_access_to_the_portal_with_title_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Invalid Password Credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter valid username as \u0027kavyakalathuru1998@gmail.com\u0027 and password as \u0027kavyakalathuru1\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_valid_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get error popup message as \u0027Wrong password.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_get_error_popup_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Empty userName",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I  will not enter valid username as \u0027\u0027 and i will enter valid password as \u0027kavyakalathuru\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_will_not_enter_valid_username_as_and_i_will_enter_valid_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get  popup message as \u0027Please fill out Username and Password.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_get_popup_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Empty password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter valid username as \u0027kavyakalathuru1998@gmail.com\u0027 and i will not enter password  \u0027\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_valid_username_as_and_i_will_not_enter_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get error popup message for empty password as \u0027Please fill out Username and Password.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_get_error_popup_message_for_empty_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "valid filling contact",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter valid recepeintEmail as \u0027kavyakalathuru1998@gmail.com\u0027 and recepientName as \u0027kavyakalathuru\u0027 and message as \u0027want to buy a mobile\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_valid_recepeintEmail_as_and_recepientName_as_and_message_as(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get complete contact filling popup message as \u0027Thanks for the message!!\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_get_complete_contact_filling_popup_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Contact Blank fill",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I will not enter valid recepientEmail as \u0027\u0027 and recepientName as \u0027\u0027 and message as \u0027\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_will_not_enter_valid_recepientEmail_as_and_recepientName_as_and_message_as(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get popup message without filling details as \u0027Thanks for the message!!\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_get_popup_message_without_filling_details_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "selecting a product in the home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on the product in home page and click on add to cart",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_click_on_the_product_in_home_page_and_click_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a popup message as \u0027Product added\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_get_a_popup_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Deleting a product from the cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on delete",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_click_on_delete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The product should be deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.the_product_should_be_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Placing order",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on place order",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_click_on_place_order()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "it should display form for filling details",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.it_should_display_form_for_filling_details()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filling all details for purchase",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter my name as \u0027ooha\u0027 and country as \u0027India\u0027 and city as \u0027Nellore\u0027 and credit card as \u0027605385697632\u0027 and month as \u0027nov\u0027 and year as \u00272022\u0027 and click on purchase order",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_my_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display purchase details popup message as \u0027Thank you for your purchase!\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.it_should_display_purchase_details_popup_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Blank name or Credit card",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the name as \u0027\u0027 and country as \u0027India\u0027 and city as \u0027Nellore\u0027 and credit card as \u0027\u0027 and month as \u0027nov\u0027 and year as \u00272022\u0027 and click on purchase order",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_the_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should display a popup message as \u0027Please fill out Name and Creditcard.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.it_should_display_a_popup_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filling all the details and click on close",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the name in purchase detail  as \u0027kavya\u0027 and country as \u0027India\u0027 and city as \u0027Nellore\u0027 and credit card as \u0027605385697632\u0027 and month as \u0027nov\u0027 and year as \u00272022\u0027 and click on purchase order and click on close",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_the_name_in_purchase_detail_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_close(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check for home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.check_for_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filling all the userdetails and click on close button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the useer name as \u0027kavya\u0027 and country as \u0027India\u0027 and city as \u0027chirala\u0027 and credit card as \u0027605385697632\u0027 and month as \u0027nov\u0027 and year as \u00272022\u0027 and click on purchase order and click on close",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_the_useer_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_close(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should go back to the cartpage and assert for \u0027PRODUCT STORE\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.it_should_go_back_to_the_cartpage_and_assert_for(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Valid signUp",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter username as \u0027sureshraina@gmail.com\u0027 and Password as \u0027suresham\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_username_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should click on signUp",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_click_on_signUp()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Already exsisted user for SignUp",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter the already used username as \u0027kavyakalathuru12@gmail.com\u0027 and password as \u0027kavyakalathuru\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_enter_the_already_used_username_as_and_password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should click on signup and I should get popup message as \u0027This user already exist.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_click_on_signup_and_I_should_get_popup_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Empty username and password for signup",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I will not enter the username \u0027\u0027 and i will not enter the password \u0027\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_will_not_enter_the_username_and_i_will_not_enter_the_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should click on signup and I should get the popup message as \u0027Please fill out Username and Password.\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_should_click_on_signup_and_I_should_get_the_popup_message_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "checking categories for Phones",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on mobile phones it will show only mobile phones",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_click_on_mobile_phones_it_will_show_only_mobile_phones()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for mobile phone visibility for assertion",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_search_for_mobile_phone_visibility_for_assertion()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "checking categories for Laptops",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on laptops it will show only Laptops",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_click_on_laptops_it_will_show_only_Laptops()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for laptops visibility for assertion",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_search_for_laptops_visibility_for_assertion()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Below are the common steps for the scenarios",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I have browser with productstore page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_have_browser_with_productstore_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "checking categories for Monitors",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I click on monitors it will show only monitors",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_click_on_monitors_it_will_show_only_monitors()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for monitors visibility for assertion",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.stepdefinition.StepDefinition.i_search_for_monitors_visibility_for_assertion()"
});
formatter.result({
  "status": "passed"
});
});