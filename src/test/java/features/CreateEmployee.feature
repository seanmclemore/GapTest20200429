Feature: Creating a new employee

  @Test2
  Scenario Outline: Verify user logged in
    Given I logged in with an "gap-automation-test@mailinator.com" and "12345678"
    When I go to create employee link
    Then I fill employee form typing <firstName>, <lastName>, <email>, <employeeId> and <employeeLeaderName>
    Then Verify employee was successfully created and navigate to employee list
    And Verify the employee info in the home page table <firstName>, <lastName>, <email>, <employeeId> and <employeeLeaderName>
    Examples:
      | firstName | lastName | email |employeeId| employeeLeaderName |
      |    a      |    b     |c@c.com|    12  |   e                |

