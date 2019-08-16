Feature: Create a task from activity stream
  As a user I should be able to create a task from activity stream

  Scenario: User logging in
    Given user is on the login page
    When user logs in using "helpdesk51@cybertekschool.com" and "UserUser"


  Scenario: User creates new task on stream page
    Given user on the home page
    Then user creates new task by clicking on "tasks" on activity stream page
    Then user can upload a file and image or link or add checklist regarding to new task
    And user should be able to set up a deadline for new task
    And user logs out