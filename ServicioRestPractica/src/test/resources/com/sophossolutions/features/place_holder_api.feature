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

  Background: 
    Given Dado que "geral" establece la base url "PlaceHolder Url" del servicio.
    When consulta el endpoint "PlaceHolder Endpoint" por medio de una peticion post.
      | userId |                      1 |
      | id     |                     25 |
      | title  | practica api           |
      | body   | aprendiendo get y post |
    Then validar el statuscode sea 201 y que el esquema "PlaceHolderSquema" sea correcto.

  @tag1
  Scenario: Title of your scenario
    Given Dado que "geral" establece la base url "PlaceHolder Url" del servicio.
    When se consulta el endpoint "PlaceHolder Endpoint" con el id "25"
    Then validar el status 200 y que contenga
      | userId |                      1 |
      | id     |                     25 |
      | title  | practica api           |
      | body   | aprendiendo get y post |
