package com.omkar.travel_and.tour_website.Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omkar.travel_and.tour_website.Backend.model.Booking;
import com.omkar.travel_and.tour_website.Backend.services.BookingService;

@RestController
@RequestMapping("/tour/")
@CrossOrigin(origins ="http://localhost:4200" )
public class BookingController {
	@Autowired
    BookingService bs;
	
	@GetMapping("/booking")
	public List<Booking> getAll()
	{
		return bs.getAll();
	}
	@PostMapping("/booking")
	public Booking insert(@RequestBody Booking bo)
	{
		return bs.insert(bo);
	}
	@DeleteMapping("/booking/{id}")
	public void delete(@PathVariable("id")long id)
	{
		bs.delete(id);
	}
	@PutMapping("/booking/{id}")
	public Booking update(@PathVariable("id")long id,@RequestBody Booking bo)
	{
		return bs.update(id, bo);
	}
	@GetMapping("/booking/{id}")
	public Booking search(@PathVariable("id")long id)
	{
		return bs.search(id);
	}
}
