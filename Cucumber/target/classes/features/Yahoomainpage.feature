Feature: check functionality of Yahoo Inbox
This checks all the features and functionality of Yahoo Inbox

Scenario:
Given I am logged into my Yahoo account
And I verify my name is displayed
When I hover the mouse over this icon
Then my Username and email address is displayed
And Account info link is enabled
When I click on this link
Then My Personal Info is displayed
And This is not working