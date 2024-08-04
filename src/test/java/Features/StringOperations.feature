Feature: This feature is used to perform String Operations

  Scenario: To compare the values of two Strings
    Given The first name is "Srikanth"
    And The second name is "Srikanth"
    When I compare two strings
    Then The result is "true"

  Scenario Outline: To compare the values of multiple Strings
    Given The first name is "<str1>"
    And The second name is "<str2>"
    When I compare two strings
    Then The result is "<result>"

    Examples: 
      | str1   | str2   | result |
      | shree  | shree  | true   |
      | cherry | shree  | false  |
      | Bittu  | cherry | false  |
