Feature: RCBTeamPlayersValidations

Scenario: Validate total number of foreign players
	Given user Read the RCB Team Player information
	When user verify  foreignplayers and  WicketKeeper
	Then user validate the player profile to contain "4" foreignplayers and atleast  "1" wicketkeeper
	

	
