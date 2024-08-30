package com.omkar.travel_and.tour_website.Backend.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.omkar.travel_and.tour_website.Backend.model.User;
import com.omkar.travel_and.tour_website.Backend.repository.userRepository;

@Service
public class userservicesImpl implements userservices{
	@Autowired
	@Qualifier("userRepo")
	userRepository userRepo;

	@Override
	public User insert(User u) {
		// TODO Auto-generated method stub
		return userRepo.save(u);
	}

	@Override
	public void delete(long Uid) {
		// TODO Auto-generated method stub
		userRepo.deleteById(Uid);
	}

	@Override
	public User update(long Uid, User u) {
		// TODO Auto-generated method stub
		Optional<User> opt=userRepo.findById(Uid);
		if(opt.isPresent())
		{
			User us=opt.get();
			us.setName(u.getName());
			us.setAddreess(u.getAddreess());
			us.setAge(u.getAge());
			us.setEmailId(u.getEmailId());
			us.setGender(u.getGender());
			us.setMobileNO(u.getMobileNO());
			us.setPassword(u.getPassword());
		return userRepo.save(us);
			
		}
		return null;
	}

	@Override
	public User search(long Uid) {
		Optional<User> opt=userRepo.findById(Uid);
		if(opt.isPresent())
		{
			User us=opt.get();
			return us;
		}
		return null;
	}

	@Override
	public List<User>getAll() {
		
		return userRepo.findAll();
	}

	@Override
	public User login(String em, String pas) {
		
		return userRepo.findByEmailIdAndPassword(em,pas);
	}

	
}
