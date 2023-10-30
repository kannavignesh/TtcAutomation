Feature: Application Login test
  Background: User is in the Luma landing page
    Given The user navigates to "Luma Home Page"
@Regression
  Scenario: Login with a valid credentials
    Given the user click sign In button
    And the user enters valid credentials username "kannavigneshece@gmail.com" and password "Catchme_098"
    When click signIn button
    Then The user should login sucessfully.
  @SmokeTest @Regression
  Scenario Outline: Login with invalid Credentials
    Given the user click sign In button
    And the user enters invalid credentials "<username>" and "<password>"
    When click signIn button
    Then The user should not login and see login error message.
    Examples:
      | username                 | password |
      | vrick@gmail.com          | pas      |
      | jackthejaint@outlook.com | regDom   |
@SmokeTest @Regression
 Scenario: Create user profile
   Given the user click Create an Account option
   And the user enter details to create user form
     | Sam             |
     | Joel            |
     | samjo@gmail.com |
     | Catchme_098     |
     | Catchme_098     |
   When the user click create account button
   Then the user profile should be created
