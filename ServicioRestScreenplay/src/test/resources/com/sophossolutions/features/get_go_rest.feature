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
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given Dado que "geral" establece la base url "Go Rest" del servicio
    When Consulta el endpoint "Go Endpoint" y el id "85968"
    Then Validar que el status sea 200 y que la respuesta contenga toda la informacion del usuario
      | id     |                      85968 |
      | name   | Charuchandra Naik          |
      | email  | naik_charuchandra@dare.org |
      | gender | female                     |
      | status | inactive                   |
