Feature: GoogleHomePage
This feature verifies the functionality on Google Home Page
Scenario: check the main elements on google home page are displayed

Given I launch Chrome browser
When I open Google home page
Then I verify the page displays search text box
And the page displays Google search button
And the page displays I am feeling lucky button


