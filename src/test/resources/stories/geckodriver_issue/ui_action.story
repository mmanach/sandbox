Meta:

Scenario: should click on react dropdown
Given I am on the react UI actions
When I click on the dropdown element with no aria-describedby
Then I should click on the item
When I click on the dropdown element with aria-describedby
Then I should click on the item

