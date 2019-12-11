Feature: Performing a login

@Test1
  Scenario: Verify user logged in
    Given I logged in with an "gap-automation-test@mailinator.com" and "12345678"
    When I see the home page
    Then User info is displayed

