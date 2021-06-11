#author: asel@abccompany.com
@login
Feature: Login

  @smoke @sprint1
  Scenario: Teacher user login
    When user enters valid username and password
    And user clicks on login in button
    Then user is successfully logged in

  @regression
  Scenario: Logo and login text validation
    Then logo and login text "Dear user, log in to access the admin area!" is displayed

  #Scenario Outline: Multiple users login
    #When user enters valid "<username>" and "<password>"
    #And user clicks on login in button
    #Then user is successfully logged in
#
    #Examples: 
      #| username                | password |
      #| demo_student1@gmail.com | 12341234 |
      #| user_demo1@gmail.com    | 12341234 |
