Feature: Create a task from activity stream
  As a user I should be able to create a task from activity stream

  @login
  Scenario: User logging in
    Given user is on the login page
    When user logs in using "username" and "password"
    Then verify the user is on the "Activity Stream" page

@uploadFile
  Scenario: User creates new task on stream page
    Given user logs in using "username" and "password"
    When user creates new task by clicking on "tasks" on activity stream page
    And user can upload a file and image regarding to new task
    Then verify the upload file is posted
    #And user should be able to set up a deadline for new task
