@sanity
Feature: Bunnings Wish List
  As a User
  I want to search an item
  so that I select an item to view the details and can add to the wish list 

  Scenario: User can search an item
  Given I open "https://www.bunnings.co.nz/"
   When I search an item 'paint'
   Then I can see the results
