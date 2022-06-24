Feature: Login into the application
  @testLogin
  Scenario: Successful login
    Given Pepito has an active account
    When He send their valid credentials
    Then He should have access to manage his account