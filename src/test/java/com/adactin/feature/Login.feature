Feature: Login Functionality

@hi
Scenario Outline: User Wants to Login into the Web Application
Given User Launching the Hotel Booking Application
When  User entering the valid "<Username>" and "<Password>"
And   User Clicking the Login button
Then  User validate the Username and Password then navigates to the Homepage

Examples:
|Username|Password|
|sudharsun94|T2|
|YYY|222|
|ZZZ|333|

@hello 
Scenario: User Wants to Login into the Web Application
Given User Launching the Hotel Booking Application
When  User entering the valid Username and Password
|AAA|111|
|sudharsun94|T23E65|
And   User Clicking the Login button
Then  User validate the Username and Password then navigates to the Homepage

Scenario: User Going to fill the details in Hotel Site
When  User selecting the Hotel Location
When  User selecting the Hotel 
And   User selecting the selecting the Room Type
And   User selecting the Number of Rooms
And   User selecting the Check-in Date
And   User selecting the Check-out Date
And   User selecting the Adults per Room
And   User selecting the Children per Room
And   User clicking the search button
Then  User Validating the information of room details

Scenario: User Going to Confirm the Details
When      User goinng to select on the radio button
And       User going to click on the continue button
Then      User Validating the information of the confirming details

Scenario: User going to give the Personal Details to Confirm the Booking
When     User going to entering the First Name
When      User going to entering the Last Name
And       User going to entering the Billing Address
And       User going to entering the Credit Card Number
And       User going to select the Credit Card types
And       User going to select the Expiry Month
And       User going to select the Expiry Year
And       User going to entering the CVV Number
And       User going to Click the Book Now button
Then      User Validating the information of the Booking details

Scenario: User Wants to logout of the application
When      User logouts the Site
Then      User Validating the Logout Functionality






