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

import com.omkar.travel_and.tour_website.Backend.model.User;
import com.omkar.travel_and.tour_website.Backend.services.userservices;

@RestController
@RequestMapping("/tour/")
@CrossOrigin(origins ="http://localhost:4200" )
public class usercontroller {
@Autowired
userservices use;

@GetMapping("/user")

	public List<User>getAll()
	{
		return use.getAll();
	}
	
	@PostMapping("/user")
public User insert(@RequestBody User u)
{
		return use.insert(u);
}
	@DeleteMapping("/user")
	public void delete(@PathVariable("id")long id)
	{
		use.delete(id);
	}
	@PutMapping("/user/{id}")
	public User update(@PathVariable ("id")long id,@RequestBody User u)
	{
		return use.update(id, u);
	}
	@GetMapping("/user/{id}")
	public User search(@PathVariable("id")long id)
    {
	return use.search(id);
    }
	
	@GetMapping("/user/{emailId}/{password}")
	public User login(@PathVariable("emailId")String emailId,@PathVariable("password")String password)
	{
		return use.login(emailId, password);
	}
	
	
}




