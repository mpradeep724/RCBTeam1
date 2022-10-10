package PojoClasses;

import java.util.ArrayList;



public class RCBTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}


	private String name;
	private String Location;
	private ArrayList<player> Player;
	public ArrayList<player> getPlayer() { 
		return Player;
	}

	public void setPlayer(ArrayList<player> player) {
		Player = player;
	}

}
