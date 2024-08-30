package com.omkar.travel_and.tour_website.Backend.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omkar.travel_and.tour_website.Backend.model.Admin;

@Repository
@Qualifier("adminRepo")
public interface AdminRepository extends JpaRepository<Admin, Long>{
Admin findByEmailAndPassword(String email,String password);
}
