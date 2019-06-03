Feature: DataDriven tests
This feature will test different data driven scenarios in cucumber

Scenario: Perform search operation on Google Homepage
Given I launch Chrome Browser
And navigate to Google Home Page
When I search for "Weather Tomorrow"
