package StepDefinitions;


import TeamSelectionValidation.RCBTeam.RCBTeam;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RCBTeamValidations extends RCBTeam {

	
	RCBTeam RCB =new RCBTeam();
	public static void main(String[] args) {
	

	}

	@Given("^user Read the RCB Team Player information$")
	public void user_Read_the_RCB_Team_Player_information() throws Throwable {
	    
		
		RCB.defMethod();
		
	    
	}

	
	@When("^user verify  foreignplayers and  WicketKeeper$")
	public void user_verify_foreignplayers_and_WicketKeeper() throws Throwable {
	    RCB.VerifyNoOfForeignPlayersandWicketKeeprs();
	}

	
	@Then("^user validate the player profile to contain \"([^\"]*)\" foreignplayers and atleast  \"([^\"]*)\" wicketkeeper$")
	public void user_validate_the_player_profile_to_contain_foreignplayers_and_atleast_wicketkeeper(String totalforeignplayers, String countofwicketkeepers) throws Throwable {
	    
	    RCB.ValidateNoOfForeignPlayersandWicketKeeprs(Integer.parseInt(totalforeignplayers), Integer.parseInt(countofwicketkeepers));
	}
	
}
