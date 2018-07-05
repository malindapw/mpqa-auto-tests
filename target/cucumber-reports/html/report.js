$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/akqa/test/workflows/BunningsWishList.feature");
formatter.feature({
  "line": 2,
  "name": "Bunnings Wish List",
  "description": "As a User\nI want to search an item\nso that I select an item to view the details and can add to the wish list",
  "id": "bunnings-wish-list",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sanity"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "User can search an item",
  "description": "",
  "id": "bunnings-wish-list;user-can-search-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I open \"https://www.bunnings.co.nz/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search an item \u0027paint\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I can see the results",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.bunnings.co.nz/",
      "offset": 8
    }
  ],
  "location": "WishListStepDefs.I_open(String)"
});
formatter.result({
  "duration": 9561253063,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "paint",
      "offset": 18
    }
  ],
  "location": "WishListStepDefs.i_search_an_item_paint(String)"
});
formatter.result({
  "duration": 37781469397,
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 0, Size: 0\n\tat java.util.ArrayList.rangeCheck(ArrayList.java:653)\n\tat java.util.ArrayList.get(ArrayList.java:429)\n\tat com.akqa.test.pageobjects.Homepage.searchAnItem(Homepage.java:38)\n\tat com.akqa.test.stepdefs.WishListStepDefs.i_search_an_item_paint(WishListStepDefs.java:43)\n\tat ✽.When I search an item \u0027paint\u0027(com/akqa/test/workflows/BunningsWishList.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "WishListStepDefs.i_can_see_the_results()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 94320127,
  "status": "passed"
});
});