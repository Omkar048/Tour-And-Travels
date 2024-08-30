package com.omkar.travel_and.tour_website.Backend.services;

import java.util.List;

import com.omkar.travel_and.tour_website.Backend.model.Admin;
import com.omkar.travel_and.tour_website.Backend.model.User;


public interface AdminService {
	Admin insert(Admin a);
	void delete(long aid);
    Admin update(long aid,Admin a);
	Admin search(long aid);
	List<Admin>getAll();
	Admin login(String email,String password);
	}

