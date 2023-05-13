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
Feature: यह हमारी पहली विशेषता है

  @tag1
  Scenario: यह हमारा पहला परिक्षण है
    Given ब्राउज़र खुला
    When User enter app url
    Then Application should launch
  @tag2
    Scenario: verify that popular product list must be sublist of other brands
    Given user click on comparenow button
    When User click on select car icon
    Then Check your all product under popular brands present in other brands
    
   
    
    #And check more outcomes
    #And some other precondition
    #And some other action
    #And yet another action

  #@tag2
 # Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
   # When I check for the <value> in step
   # Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
    #  | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
