#----------------------------------
# Empty Cucumber .feature file
#----------------------------------
   Feature:  Indeed Search Test Feature
Scenario: Indeed Search Scenario
Given user is already on Home Page
When title of Home Page is Indeed
Then user enters data jobTitle and city
Then user clicks on FindJobs button
Then user is on SearchRsults Page
Then user close the browser   

   
