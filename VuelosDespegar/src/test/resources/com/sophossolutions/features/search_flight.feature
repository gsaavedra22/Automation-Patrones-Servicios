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
Feature: flight search
  I want to find any flight

  @tag1
  Scenario: find flight
    Given i must be in the page "URLdespegar"
    When enter flight data
      | origen  | Bogotá, Bogotá D.C., Colombia          |
      | destino | Cartagena de Indias, Bolívar, Colombia |
      | ida     | dia: 25,mes: 3, anho:2023              |
      | vuelta  | dia: 15,mes: 4, anho:2023              |
      | adultos |                                      2 |
      | menores |                                      1 |
      | clase   | Económica                              |
    Then I validate the outcomes
