Feature: Order Food from Swiggy

Scenario: A user should be able to order food from swiggy
Given a user is on Swiggy.com
When he enters ‘Bangalore, Karnatka, India’ in the search box
And clicks on find food
And clicks on the first restaurant on the next page
And clicks ‘Add’ on the first item of the restaurant page
And clicks ‘Checkout’ button
Then he must see the message-'SECURE CHECKOUT'. 

