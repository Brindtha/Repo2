#@AMAZON

Feature: To test the amazon page

Scenario: To test the login functionality

Given the user launches the amazon URL
When the user enters username "7395962366"
And the user enters password "password@123"
And the user clicks signIn button
Then the user verifies titile & url of the page.