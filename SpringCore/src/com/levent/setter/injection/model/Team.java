package com.levent.setter.injection.model;

/*
 * Football Team Model
 * */
public class Team {

	private String name;
	private String nickName;
	private String shirtColor;
	private int championshipsWon;
	private Player player;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getShirtColor() {
		return shirtColor;
	}
	public void setShirtColor(String shirtColor) {
		this.shirtColor = shirtColor;
	}
	public int getChampionshipsWon() {
		return championshipsWon;
	}
	public void setChampionshipsWon(int championshipsWon) {
		this.championshipsWon = championshipsWon;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	@Override
	public String toString() {
		return "Team [name=" + name + ", nickName=" + nickName + ", shirtColor=" + shirtColor + ", championshipsWon="
				+ championshipsWon + ", player=" + player + "]";
	}
}
