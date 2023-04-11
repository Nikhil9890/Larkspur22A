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
Feature: Infinity
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user click on comparenow button
    When User click on select car icon
    Then Check your all product under popular brands present in other brands

 
  Scenario Outline: Title of your scenario outline
    Given first step
    And I have <value1> and <value2>
    When I add them
    Then Addition must be even

    Examples: 
      | name  | value | 
      | value1 |     5 |
      | value2 |     7 |
