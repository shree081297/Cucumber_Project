@Simplilearn
Feature: This feature will validate the Login Scenario

  Scenario: Validate te Login Failure Scenario
    Given I have launched the appliaction
    And I clicks on Login link
    When I enter the user name
    And I enter the password
    And I click on Login button
    Then I should get the error message "The email or password you have entered is invalid."

  @Ignore
  Scenario: Validate te Login Failure Scenario with parameters
    Given I have launched the appliaction
    And I clicks on Login link
    When I enter the user name as "abc@gmail.com"
    And I enter the password as "Abcd@123"
    And I click on Login button
    Then I should get the error message "The email or password you have entered is invalid."

  @U_100 @regression
  Scenario Outline: Validate te Login Failure Scenario with parameters
    Given I have launched the appliaction
    And I clicks on Login link
    When I enter the user name as "<Username>"
    And I enter the password as "<Password>"
    And I click on Login button
    Then I should get the error message "<ErrorMess>"

    Examples: 
      | Username      | Password | ErrorMess                                          |
      | abc@gmail.com | Abcd@123 | The email or password you have entered is invalid. |
      | sss@gmail.com | Abcd@123 | The email or password you have entered is invalid. |

  @U_101 @regression
  Scenario: Validate different functionalities in Login page
    Given I have launched the appliaction
    And I clicks on Login link
    Then I see the login options in Login page
      | Google   |
      | Facebook |
      | Linkedin |
      | Apple    |
