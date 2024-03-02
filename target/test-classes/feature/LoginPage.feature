
Feature: Login Page Execution



@tag1 

Scenario: Valid Username and Password
Given Login to Application
When Enter the username "MohanapriyaRavikumar"
And Enter the password "Harsha@2023"
And Enter the login button
#Then Validate the Home Page
Then Validate the Error Message"Invalid Login details or Your Password might have expired."

@tag2
Scenario: InValid Username and Password
Given Login to Application
When Enter the username "Priya"
And Enter the password "Priya@123"
And Enter the login button
Then Validate the Home Page

@tag3
Scenario: Valid Username and InPassword

Given Login to Application
When Enter the username "Mona"
And Enter the password "PriyaMona@123"
And Enter the login button
Then Validate the Home Page


