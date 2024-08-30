package com.omkar.travel_and.tour_website.Backend.services;

import java.util.List;

import com.omkar.travel_and.tour_website.Backend.model.Booking;

public interface BookingService {
	Booking insert(Booking bo);
	void delete(long bid);
	Booking update(long bid,Booking bo);
	Booking search(long bid);
	List<Booking> getAll();
}
