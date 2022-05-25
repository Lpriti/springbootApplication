package com.project.teamplayer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.teamplayer.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {

	public Team findByTeamId(int teamId);

	public Team findByTeamname(String tempTeamname);
	
}
