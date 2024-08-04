@Calculator2
Feature: This feature is used to test the Calculator Functionality for multiple data

  Scenario Outline: This scenario is used to test addition of two numbers with different data
    Given There are two numbers <num1> and <num2>
    When Adding of two numbers
    Then The final output is <result>

    Examples: 
      | num1 | num2 | result |
      |    4 |    5 |      9 |
      |   10 |   20 |     30 |
      |   15 |   15 |     30 |
      |   30 |   30 |     60 |

  Scenario: This Scenario is used to add two or more values
    Given There are multiple values
      |  5 |
      |  7 |
      | 15 |
      | 25 |
      | 30 |
      | 20 |
    When Adding the given values
    Then The final output is 102

  Scenario: Validating the total amount of my purchase
    Given The items are added to my cart
      | chai powder    | 50 |
      | chicken masala | 60 |
      | Garam masala   | 30 |
    When I do the checkout
    Then The final bill is 140

  Scenario: Validating the total amount of my purchase with multiple qunatity
    Given The items are added to my cart with given quantity
      | chai powder    | 2 |  50 |
      | Chicken masala | 2 | 120 |
      | Garam masala   | 2 |  60 |
    When I do checkout for multiple quantity
    Then The final bill is 460
