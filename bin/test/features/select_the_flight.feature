#Author: your.email@your.domain.com

@tag
Feature: Flight reserve
As a web user
She wants to reserve a flight
To do test using the programming Cucumber and Gherkin.

  @tag1
  Scenario: Successful search for a flight from the main Despegar website
    Given that Jessica wants to look for a one way flight 
    When She insert the data of the flight
    |originCity|destinationCity|departure date|return date|
    |Medellin  |		Bogota  	 |			10      |			15    |
    And She fill in her information
    Then She should see comprar on screen
    


