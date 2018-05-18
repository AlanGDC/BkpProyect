Feature: User search for Star Wars Movie wikipedia in spanish
In Order to read the story in spanish
As an Internet User
I Want To search StarWars movie in Wikipeda


Scenario: User search Star Wars Movie Successfully 
		Given User located in wikipedia Page
		When 	Search Star Wars Movie
		And 	Chose Spanish Language
		Then 	Star Wars Movie is shown in Spanish language