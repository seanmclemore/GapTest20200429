Feature: Creating a new employee

  @Test2
  Scenario Outline: Verify user logged in
    Given I logged in with an "gap-automation-test@mailinator.com" and "12345678"
    When I go to create employee link
    Then I fill employee form typing <firstName>, <lastName>, <email>, <employeeId> and <employeeLeaderName> <employeeLeaderName> <startMonth> <startDay> <StartYear>
    Then Verify employee was successfully created and navigate to employee list
    And Verify the employee info in the home page table <firstName>, <lastName>, <email>, <employeeId> and <employeeLeaderName> <startMonth> <startDay> <StartYear>
    Examples:
      |firstName|lastName| email |employeeId|employeeLeaderName|startMonth|startDay|StartYear|
      |James    |Smith   |c@c.com|1234567890|Carlos            |January   |21      |2014     |

