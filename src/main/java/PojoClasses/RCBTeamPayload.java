package PojoClasses;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RCBTeamPayload {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
	
	}
	
	
	public static String 	RCBTeamPload() throws JsonProcessingException
	{
        RCBTeam team =new RCBTeam();
		
		team.setName("Royal Challengers Bangalore");
		team.setLocation("Bangalore");
		
	player play =new player();
	
	
	play.setCountry("South Africa");
	play.setName("Faf Du Plessis");
	play.setPriceincrores("7");
	play.setRole("Batsman");


	player play1 =new player();
	
	play1.setCountry("India");
	play1.setName("Virat Kohli");
	play1.setPriceincrores("15");
	play1.setRole("Batsman");
	
	
	
	player play2 =new player();
	
	play2.setCountry("Australia");
	play2.setName("Glenn Maxwell");
	play2.setPriceincrores("11");
	play2.setRole("Batsman");
	
	
	player play3 =new player();
	
	play3.setCountry("India");
	play3.setName("Mohammad Siraj");
	play3.setPriceincrores("7");
	play3.setRole("Bowler");
	
	
	player play4 =new player();
	
	play4.setCountry("India");
	play4.setName("Harshal Patel");
	play4.setPriceincrores("10.75");
	play4.setRole("Bowler");
	
	
	player play5 =new player();
	
	play5.setCountry("Srilanka");
	play5.setName("Wanindu Hasaranga");
	play5.setPriceincrores("10.75");
	play5.setRole("Bowler");
	
	
	player play6 =new player();
	
	play6.setCountry("India");
	play6.setName("Dinesh Karthik");
	play6.setPriceincrores("5.5");
	play6.setRole("Wicket-keeper"); 
	
	
	player play7 =new player();
	
	play7.setCountry("India");
	play7.setName("Shahbaz Ahmed");
	play7.setPriceincrores("2.4");
	play7.setRole("All-Rounder");
	
	
	player play8 =new player();
	
	play8.setCountry("India");
	play8.setName("Rajat Patidar");
	play8.setPriceincrores("0.20");
	play8.setRole("Batsman");
	
	
	player play9 =new player();
	
	play9.setCountry("Australia");
	play9.setName("Josh Hazlewood");
	play9.setPriceincrores("7.75");
	play9.setRole("Bowler");
	
	
	player play10 =new player();
	
	play10.setCountry("India");
	play10.setName("Mahipal Lomro");
	play10.setPriceincrores("7.75");
	play10.setRole("Bowler");
	
	
	ArrayList<player> Players =new ArrayList<player>();
	
	
	Players.add(play);
	Players.add(play1);
	Players.add(play2);
	Players.add(play3);
	Players.add(play4);
	Players.add(play5);
	Players.add(play6);
	Players.add(play7);
	Players.add(play8);
	Players.add(play9);
	Players.add(play10);
	
	team.setPlayer(Players);
	
	ObjectMapper objectMapper =new ObjectMapper();
	String Team =objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(team);
	
	
	return Team;
	}


	
	
	
	
	
	
}
