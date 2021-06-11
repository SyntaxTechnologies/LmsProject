#author: asel@abccompany.com
Feature: Login

  Scenario: Teacher user login
    Given user navigated to lms application
    When user enters valid username and password
    And user clicks on login in button
    Then user is successfully logged in

  Scenario: Logo and login text validation
    Given user navigated to lms application 
    Then logo and login text is displayed