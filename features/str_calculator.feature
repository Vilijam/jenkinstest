Feature: String Calculator

  Scenario: Successful evaluation of a simple Str expression
    Given the Str Calculator is initialized
    When i add the numbers "2,3"
    Then the result2 should be 5

