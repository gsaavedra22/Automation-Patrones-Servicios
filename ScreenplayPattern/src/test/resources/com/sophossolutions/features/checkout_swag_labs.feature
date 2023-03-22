#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: enter in the checkout page swag labs
  I want to interact with the checkout module
  
    Background: 
    Given I must be in the page swag labs "Swag Labs"
    When I send credentials "standard_user" "secret_sauce"
    Then I validate the successful login text "PRODUCTS"

  @tag1
  Scenario: enter the checkout
    Given i must be login in the swag labs 
    When I send information for the purchase
      | First Name      | geral    |
      | Last Name       | saavedra |
      | Zip/Postal Code |   151022 |
    And show information in console
    Then I validate the message "Validation Checkout"
