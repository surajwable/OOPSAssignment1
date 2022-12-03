package com.demo.beans;

import java.util.Arrays;

public class Team {
	
	private int teamid;
	private String tname;
	private Coach c;
	private Player[]plist;
	private Player p;
	
	public Team() {
		super();
	}
	
	public Team(int tid,String tname,Coach c,Player p,Player[]plist) {
		this.teamid=tid;
		this.tname=tname;
		this.c=c;
		this.p=p;
		this.plist=plist;
		
	}

	@Override
	public String toString() {
		return "Team [teamid=" + teamid + ", tname=" + tname + ", c=" + c + ", plist=" + Arrays.toString(plist) + ", p="
				+ p + "]";
	}

	public int getTeamid() {
		return teamid;
	}

	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Coach getC() {
		return c;
	}

	public void setC(Coach c) {
		this.c = c;
	}

	public Player[] getPlist() {
		return plist;
	}

	public void setPlist(Player[] plist) {
		this.plist = plist;
	}

	public Player getP() {
		return p;
	}

	public void setP(Player p) {
		this.p = p;
	}
	

}
