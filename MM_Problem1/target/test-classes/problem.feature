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
Feature: To check textbox values and total balance 
  System should display textbox values clearly and it should not exceed the total balance

  @tag1
  Scenario: To check if total values in the textbox is greater than total balance
    Given Populate input in all textbox from value1 to value5
    And Add all the values
    When Sum of all values is greater than total balance
    Then System should pop exceeding error message

  @tag2
  Scenario: To check if total values in the textbox is equal or less than total balance
    Given Populate input in all textbox from value1 to value5
    And Add all the values
    When Sum of all values is equal or less than total balance
    Then System should not pop any error message
    
  @tag3
  Scenario: To check if values in the textbox is visible clearly
    Given Populate input in all textbox from value1 to value5
    And Validate visibility of the values
    When Values are not visible
    Then System should pop visibility error message

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
