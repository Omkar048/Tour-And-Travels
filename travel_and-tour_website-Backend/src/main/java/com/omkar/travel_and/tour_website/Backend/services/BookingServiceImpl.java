package com.omkar.travel_and.tour_website.Backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.omkar.travel_and.tour_website.Backend.model.Booking;
import com.omkar.travel_and.tour_website.Backend.repository.BookingRepository;


@Service
public class BookingServiceImpl implements BookingService {
@Autowired
@Qualifier ("boRepo")
BookingRepository boRepo;

@Override
public Booking insert(Booking bo) {
	// TODO Auto-generated method stub
	return boRepo.save(bo);
}

@Override
public void delete(long bid) {
	// TODO Auto-generated method stub
	boRepo.deleteById(bid);
}

@Override
public Booking update(long bid, Booking bo) {
	// TODO Auto-generated method stub
	Optional<Booking> opt=boRepo.findById(bid);
	if(opt.isPresent())
	{
		Booking boo=opt.get();
		
		boo.setDate(bo.getDate());
		boo.setHowmany(bo.getHowmany());
		boo.setNameanddetails(bo.getNameanddetails());
		boo.setWhereto(bo.getWhereto());
	return boRepo.save(boo);
	}
	return null;
}

@Override
public Booking search(long bid) {
	// TODO Auto-generated method stub
	Optional<Booking> opt=boRepo.findById(bid);
	if(opt.isPresent())
	{
		Booking boo=opt.get();
	return boRepo.save(boo);
	}
	return null;
}

@Override
public List<Booking> getAll() {
	
	return boRepo.findAll();
	
}

}