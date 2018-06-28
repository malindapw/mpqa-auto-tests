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
  "line": 9,
  "name": "User can search an item",
  "description": "",
  "id": "bunnings-wish-list;user-can-search-an-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I open \"https://www.seek.co.nz/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I search an item \u0027paint\u0027",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.seek.co.nz/",
      "offset": 8
    }
  ],
  "location": "WishListStepDefs.I_open(String)"
});
formatter.result({
  "duration": 6026233265,
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
  "duration": 19037646172,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//A[@href\u003d\u0027/\u0027])[1]\"}\n  (Session info: chrome\u003d67.0.3396.99)\n  (Driver info: chromedriver\u003d2.40.565386 (45a059dc425e08165f9a10324bd1380cc13ca363),platform\u003dMac OS X 10.13.5 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.2\u0027, revision: \u002710229a9\u0027, time: \u00272017-08-21T17:29:55.15Z\u0027\nSystem info: host: \u0027malindaw\u0027, ip: \u00272406:5a00:ce9:c200:153a:5bac:6098:a656\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.5\u0027, java.version: \u00271.8.0_102\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565386 (45a059dc425e08165f9a10324bd1380cc13ca363), userDataDir\u003d/var/folders/d7/lz0xgf4906q45flbyc4hnycxmygw3n/T/.org.chromium.Chromium.5paGvC}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d67.0.3396.99, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: ac68c7b7cb22e4064d1c7f257729fe2d\n*** Element info: {Using\u003dxpath, value\u003d(//A[@href\u003d\u0027/\u0027])[1]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\n\tat com.akqa.test.pageobjects.Homepage.searchAnItem(Homepage.java:30)\n\tat com.akqa.test.stepdefs.WishListStepDefs.i_search_an_item_paint(WishListStepDefs.java:32)\n\tat ✽.When I search an item \u0027paint\u0027(com/akqa/test/workflows/BunningsWishList.feature:11)\n",
  "status": "failed"
});
formatter.after({
  "duration": 663847106,
  "status": "passed"
});
});