package com.project.teamplayer.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.teamplayer.entity.Team;
import com.project.teamplayer.repository.TeamRepository;
import com.project.teamplayer.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository teamRepository;
	
//	
//	public Team savTeam(Team team) {
//		List<Player> playerList = new ArrayList<>();
//		
//		
//		Player player1 = new Player();
//		player1.setName("Suhas");
//		
//		Player player2 = new Player();
//		player2.setName("Sandesh");
//		
//		Player player3 = new Player();
//		player3.setName("Omkar");
//		
//		
//		playerList.add(player1);
//		playerList.add(player2);
//		playerList.add(player3);
//		
//		player1.setTeam(team);
//		player2.setTeam(team);
//		player3.setTeam(team);
//		
//		team.setPlayerList(playerList);
//		team = teamRepository.save(team);
//		
//		return team;
//		
//	}
//	
	public Team findByTeamId(int teamId) {
		Team team = teamRepository.findByTeamId(teamId);
		return team;
	}

	@Override
	public Team saveTeam(Team team) {
		
		return teamRepository.save(team);
	}

	public Team fetchTeambyTeamname(String tempTeamname) {
		
		return teamRepository.findByTeamname(tempTeamname);
	}

	public List<Team> getTeam(){
		return teamRepository.findAll();
	}
	

	
}
