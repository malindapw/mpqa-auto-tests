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
formatter.step({
  "line": 11,
  "name": "I can add \"Dulux 1L Ceiling White Paint\" in to my wish list",
  "keyword": "And "
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
  "duration": 9834195694,
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
  "duration": 2460843678,
  "status": "passed"
});
formatter.match({
  "location": "WishListStepDefs.i_can_see_the_results()"
});
formatter.result({
  "duration": 152541309,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dulux 1L Ceiling White Paint",
      "offset": 11
    }
  ],
  "location": "WishListStepDefs.i_can_add_in_to_my_wish_list(String)"
});
formatter.result({
  "duration": 3346156256,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat com.akqa.test.stepdefs.WishListStepDefs.i_can_add_in_to_my_wish_list(WishListStepDefs.java:65)\n\tat ✽.And I can add \"Dulux 1L Ceiling White Paint\" in to my wish list(com/akqa/test/workflows/BunningsWishList.feature:11)\n",
  "status": "failed"
});
formatter.after({
  "duration": 94627857,
  "status": "passed"
});
});