$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BookingHotel.feature");
formatter.feature({
  "line": 2,
  "name": "BookingHotel",
  "description": "User want to Booking Hotel Room",
  "id": "bookinghotel",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BookingHotel"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Booking Hotel with Valid Data",
  "description": "",
  "id": "bookinghotel;booking-hotel-with-valid-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User already login with \"\u003cemail\u003e\" as an email and \"\u003cpassword\u003e\" as an password",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User open home menu on the Hotel Dominic Parks Website",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User select \"\u003chotel_location\u003e\", hotel name, \"\u003ccheckin\u003e\" as date check in, \"\u003ccheckout\u003e\" as date check out",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should be navigated to the hotel room list",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User choose one of the hotel room on the list",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User proceed to checkout the hotel room",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be navigated to the hotel room \u0026 price summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User choose to proceed on the room \u0026 price summary page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User should be navigated to the guest information page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User choose to proceed on the guest information page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User should be navigated to the payment information page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User choose the payment resource",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User should be navigated to order summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User confirm the order",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User should be navigated to the oder confirmation page",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "bookinghotel;booking-hotel-with-valid-data;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "hotel_location",
        "checkin",
        "checkout"
      ],
      "line": 26,
      "id": "bookinghotel;booking-hotel-with-valid-data;;1"
    },
    {
      "cells": [
        "sopigp@gmail.com",
        "12345",
        "jakarta",
        "10-10-2021",
        "11-10-2021",
        ""
      ],
      "line": 27,
      "id": "bookinghotel;booking-hotel-with-valid-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8268702500,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Booking Hotel with Valid Data",
  "description": "",
  "id": "bookinghotel;booking-hotel-with-valid-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@PositiveCase"
    },
    {
      "line": 1,
      "name": "@BookingHotel"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User already login with \"sopigp@gmail.com\" as an email and \"12345\" as an password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User open home menu on the Hotel Dominic Parks Website",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User select \"jakarta\", hotel name, \"10-10-2021\" as date check in, \"11-10-2021\" as date check out",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should be navigated to the hotel room list",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User choose one of the hotel room on the list",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User proceed to checkout the hotel room",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User should be navigated to the hotel room \u0026 price summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User choose to proceed on the room \u0026 price summary page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User should be navigated to the guest information page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User choose to proceed on the guest information page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User should be navigated to the payment information page",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User choose the payment resource",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User should be navigated to order summary page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User confirm the order",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User should be navigated to the oder confirmation page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "sopigp@gmail.com",
      "offset": 25
    },
    {
      "val": "12345",
      "offset": 60
    }
  ],
  "location": "BookingHotelSteps.setLogin(String,String)"
});
formatter.result({
  "duration": 2478057700,
  "status": "passed"
});
formatter.match({
  "location": "BookingHotelSteps.openHomeMenu()"
});
formatter.result({
  "duration": 22102361700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jakarta",
      "offset": 13
    },
    {
      "val": "10-10-2021",
      "offset": 36
    },
    {
      "val": "11-10-2021",
      "offset": 67
    }
  ],
  "location": "BookingHotelSteps.searchHotelbykey(String,String,String)"
});
formatter.result({
  "duration": 1010639600,
  "status": "passed"
});
formatter.match({
  "location": "BookingHotelSteps.searchResult()"
});
formatter.result({
  "duration": 146420200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//span[.\u003d\u0027Guest Rating\u0027]\"}\n  (Session info: chrome\u003d93.0.4577.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-LUVALEJ3\u0027, ip: \u0027192.168.109.81\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\asus\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:58684}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9fd19ee1c24d700c394af90b5225d164\n*** Element info: {Using\u003dxpath, value\u003d//span[.\u003d\u0027Guest Rating\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.isDisplayed(Unknown Source)\r\n\tat page_object.SearchedResultsPage.isDisplayed(SearchedResultsPage.java:53)\r\n\tat step_definition.BookingHotelSteps.searchResult(BookingHotelSteps.java:114)\r\n\tat ???.Then User should be navigated to the hotel room list(features/BookingHotel.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BookingHotelSteps.chooseHotelList()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.proceedHotelList()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.roomsPriceSummary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.proceedRoomsPriceSummary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.guestInformation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.proceedGuestInformation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.paymentInformation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.proceedPayInformation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.orderSummary()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.confirmOrder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookingHotelSteps.orderDetails()"
});
formatter.result({
  "status": "skipped"
});
});