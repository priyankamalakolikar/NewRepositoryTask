package com.Collection;

public class Player20 {
int playerid;
String Name;
String Country;
String team;
public Player20(int playerid, String name, String country, String team) {
	super();
	this.playerid = playerid;
	Name = name;
	Country = country;
	this.team = team;
}
@Override
public String toString() {
	return "Player20 [playerid=" + playerid + ", Name=" + Name + ", Country=" + Country + ", team=" + team + "]";
}

}
