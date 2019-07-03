Feature: TimerValue

Scenario: Navigate to the Eggtimer URL
Given User has the URl for the egg timer website
When user enters the URL and search
Then user should be navigated to the egg timer website

Scenario: Navigate to the counter page after clicking on go button
Given User is landed into the page
When user enters the time in the start a timer field
Then page should navigate to the time counter


Scenario: Check the timer count is started from the period specified in the home page
Given User navigated to the counter page
When counter started 
Then check if the counter period is started from the period mentioned in the home page

Scenario: Check the countdown is in sync with the seconds
Given User navigated to the counter page
When counter started
Then check if the time lapse is matching witht the seconds timer


