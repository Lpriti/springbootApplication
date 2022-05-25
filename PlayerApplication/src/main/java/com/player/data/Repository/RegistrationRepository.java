package com.player.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.player.data.Model.User;

@Repository
public interface RegistrationRepository extends JpaRepository<User, Integer> {
	
	public User findByUsername(String username);
	public User findByUsernameAndPassword(String username,String password);

}
