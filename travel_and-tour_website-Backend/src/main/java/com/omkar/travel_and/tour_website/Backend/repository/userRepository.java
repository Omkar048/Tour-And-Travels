package com.omkar.travel_and.tour_website.Backend.repository;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omkar.travel_and.tour_website.Backend.model.User;

@Repository
@Qualifier("userRepo")
public interface userRepository  extends JpaRepository<User, Long>{
	User findByEmailIdAndPassword(String emailId,String password);

}
