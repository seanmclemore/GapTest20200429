$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/CreateUser.feature");
formatter.feature({
  "line": 1,
  "name": "Creating a new employee",
  "description": "",
  "id": "creating-a-new-employee",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Delete user User Name: novak and validate user has been deleted",
  "description": "",
  "id": "creating-a-new-employee;delete-user-user-name:-novak-and-validate-user-has-been-deleted",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Verify the user info in the home page table \u003cfirstName\u003e and \u003cuserName\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Removing user from home page table \u003cuserName\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Verify the user info is not in the home page table \u003cfirstName\u003e and \u003cuserName\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "creating-a-new-employee;delete-user-user-name:-novak-and-validate-user-has-been-deleted;",
  "rows": [
    {
      "cells": [
        "firstName",
        "userName"
      ],
      "line": 19,
      "id": "creating-a-new-employee;delete-user-user-name:-novak-and-validate-user-has-been-deleted;;1"
    },
    {
      "cells": [
        "Mark",
        "Novak"
      ],
      "line": 20,
      "id": "creating-a-new-employee;delete-user-user-name:-novak-and-validate-user-has-been-deleted;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6030678295,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Delete user User Name: novak and validate user has been deleted",
  "description": "",
  "id": "creating-a-new-employee;delete-user-user-name:-novak-and-validate-user-has-been-deleted;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Verify the user info in the home page table Mark and Novak",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Removing user from home page table Novak",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Verify the user info is not in the home page table Mark and Novak",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Mark",
      "offset": 44
    },
    {
      "val": "Novak",
      "offset": 53
    }
  ],
  "location": "CreateUserSteps.verifyEmployeeInfoInTable(String,String)"
});
formatter.result({
  "duration": 178519896,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Novak",
      "offset": 35
    }
  ],
  "location": "CreateUserSteps.RemoveInfoInTable(String)"
});
formatter.result({
  "duration": 293942242,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mark",
      "offset": 51
    },
    {
      "val": "Novak",
      "offset": 60
    }
  ],
  "location": "CreateUserSteps.verifyEmployeeInfoNoAvailableInTable(String,String)"
});
formatter.result({
  "duration": 30046673456,
  "status": "passed"
});
formatter.after({
  "duration": 129256638,
  "status": "passed"
});
});