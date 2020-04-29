Feature: Creating a new employee

  @Test1
  Scenario Outline: Add a user and validate the user has been added to the table
    Given I go to create employee link
    When I fill employee form typing <firstName>, <lastName>, <userName>, <role> and <cellPhone>
    Then Verify the user info in the home page table <firstName> and <userName>
    Examples:
      |firstName|lastName|userName|role |cellPhone|
      |James    |Smith   |mcl     |Admin|123456   |


  @Test2
  Scenario Outline: Delete user User Name: novak and validate user has been deleted
    Given Verify the user info in the home page table <firstName> and <userName>
    When  Removing user from home page table <userName>
    Then Verify the user info is not in the home page table <firstName> and <userName>
    Examples:
      |firstName|userName|
      |Mark     |Novak   |