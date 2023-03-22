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
Feature: get response from service
  I want to consume the service

  @tag1
  Scenario: obtain response from abilitys
    Given Since "geraldine" sets the "Go Pokemon" base url of the service
    When check the endpoint "EndPointPokemon" with the name "hardy"
    Then validate that the status is 200 and that the response contains and the "Squema"
      | count      |                                                   25 |
      | results[0] | [name:hardy, url:https://pokeapi.co/api/v2/nature/1/] |
