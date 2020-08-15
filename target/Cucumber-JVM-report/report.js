$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GeneralStore.feature");
formatter.feature({
  "line": 2,
  "name": "Verifying Details for General Store",
  "description": "",
  "id": "verifying-details-for-general-store",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Enter complete details for General Store",
  "description": "",
  "id": "verifying-details-for-general-store;enter-complete-details-for-general-store",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User opens General Store",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Selects India from Country dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters name \"\u003cEnterName\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on Lets shop button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "verifying-details-for-general-store;enter-complete-details-for-general-store;",
  "rows": [
    {
      "cells": [
        "EnterName"
      ],
      "line": 11,
      "id": "verifying-details-for-general-store;enter-complete-details-for-general-store;;1"
    },
    {
      "cells": [
        "Amit Chatterjee"
      ],
      "line": 12,
      "id": "verifying-details-for-general-store;enter-complete-details-for-general-store;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Enter complete details for General Store",
  "description": "",
  "id": "verifying-details-for-general-store;enter-complete-details-for-general-store;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User opens General Store",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Selects India from Country dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enters name \"Amit Chatterjee\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on Lets shop button",
  "keyword": "Then "
});
formatter.match({
  "location": "GeneralStoreTest.user_opens_General_Store()"
});
formatter.result({
  "duration": 36700732900,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStoreTest.user_Selects_India_from_Country_dropdown()"
});
formatter.result({
  "duration": 30411607700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Amit Chatterjee",
      "offset": 18
    }
  ],
  "location": "GeneralStoreTest.user_enters_name(String)"
});
formatter.result({
  "duration": 669541300,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStoreTest.user_click_on_Lets_shop_button()"
});
formatter.result({
  "duration": 2235534800,
  "status": "passed"
});
});