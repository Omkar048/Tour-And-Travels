package com.omkar.travel_and.tour_website.Backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.omkar.travel_and.tour_website.Backend.model.Admin;
import com.omkar.travel_and.tour_website.Backend.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
@Autowired
@Qualifier("adminRepo")
AdminRepository adminRepo;

@Override
public Admin insert(Admin a) {
	// TODO Auto-generated method stub
	 return adminRepo.save(a);
}

@Override
public void delete(long aid) {
	// TODO Auto-generated method stub
	adminRepo.deleteById(aid);
}

@Override
public Admin update(long aid, Admin a) {
	// TODO Auto-generated method stub
	Optional<Admin> tour=adminRepo.findById(aid);
	if(tour.isPresent())
	{
		Admin ad=tour.get();
		ad.setName(a.getName());
		ad.setAddress(a.getAddress());
		ad.setGender(a.getGender());
		ad.setEmail(a.getEmail());
		ad.setPassword(a.getPassword());
		return adminRepo.save(ad);
		}
	return null;
}

@Override
public Admin search(long aid) {
	// TODO Auto-generated method stub
	Optional<Admin> tour=adminRepo.findById(aid);
	if(tour.isPresent())
	{
		Admin ad=tour.get();
		
		return ad;
	}
	return null;
}

@Override
public List<Admin> getAll() {
	// TODO Auto-generated method stub
	return adminRepo.findAll();

}

@Override
public Admin login(String email, String password) {
	// TODO Auto-generated method stub
	return adminRepo.findByEmailAndPassword(email, password);
}
}
