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
Feature: Login into guru page
 yo como automatizador voy a probar el logueo de usuarios guru

  @tag1
  Scenario: Title of your scenario
    Given El usuario debe estar en la pagina de guru99
    When Ingresar credenciales y se autentica "mngr480448","pynevYp"   
    Then Validate text home "Manger Id : mngr480448"
   

 