$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateEmployee.feature");
formatter.feature({
  "line": 1,
  "name": "Creating a new employee",
  "description": "",
  "id": "creating-a-new-employee",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Verify user logged in",
  "description": "",
  "id": "creating-a-new-employee;verify-user-logged-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I logged in with an \"gap-automation-test@mailinator.com\" and \"12345678\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to create employee link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I fill employee form typing \u003cfirstName\u003e, \u003clastName\u003e, \u003cemail\u003e, \u003cemployeeId\u003e and \u003cemployeeLeaderName\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "creating-a-new-employee;verify-user-logged-in;",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "employeeLeaderName"
      ],
      "line": 10,
      "id": "creating-a-new-employee;verify-user-logged-in;;1"
    },
    {
      "cells": [
        "a",
        "b",
        "c",
        "d"
      ],
      "line": 11,
      "id": "creating-a-new-employee;verify-user-logged-in;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5026036714,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify user logged in",
  "description": "",
  "id": "creating-a-new-employee;verify-user-logged-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I logged in with an \"gap-automation-test@mailinator.com\" and \"12345678\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I go to create employee link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I fill employee form typing a, b, c, \u003cemployeeId\u003e and d",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "gap-automation-test@mailinator.com",
      "offset": 21
    },
    {
      "val": "12345678",
      "offset": 62
    }
  ],
  "location": "LoginSteps.i_log_in_with_a_default_user(String,String)"
});
formatter.result({
  "duration": 1925918581,
  "status": "passed"
});
formatter.match({
  "location": "CreateEmployeeSteps.i_shall_be_on_the_Flight_Finder_page()"
});
formatter.result({
  "duration": 361834127,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 102692135,
  "status": "passed"
});
});