Feature: Application login


  Scenario: Home Page default login
    Given user is on landing page
    When user login with username "active" and password "12345"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home Page default login
    Given user is on landing page
    When user login with username "InActive" and password "12345"
    Then Home page is populated
    And Cards are not displayed
