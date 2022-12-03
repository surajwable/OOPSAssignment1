package com.demo.service;

import com.demo.beans.Player;
import com.demo.beans.Team;

public interface TeamService {
	void createNewTeam();

	Team[] displayallteams();

	Player[] findSpecialityAllTeams(String spe);

	Player[] getBySpeciality(String tname, String spe);

	Team getByCaptain(String pname);

	Team getByCoach(String coach);

}
