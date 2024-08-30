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

import com.omkar.travel_and.tour_website.Backend.model.Admin;
import com.omkar.travel_and.tour_website.Backend.model.User;
import com.omkar.travel_and.tour_website.Backend.services.AdminService;
@RestController
@RequestMapping("/tour/")
@CrossOrigin(origins ="http://localhost:4200" )
public class admincontrollerr {
@Autowired
AdminService as;

@GetMapping("/admin")

public List<Admin>getAll()
{
	return as.getAll();
}

@PostMapping("/admin")
public Admin insert(@RequestBody Admin a)
{
	return as.insert(a);
}
@DeleteMapping("/admin")
public void delete(@PathVariable("id")long id)
{
	as.delete(id);
}
@PutMapping("/admin/{id}")
public Admin update(@PathVariable ("id")long id,@RequestBody Admin a)
{
	return as.update(id, a);
}
@GetMapping("/admin/{id}")
public Admin search(@PathVariable("id")long id)
{
return as.search(id);
}

@GetMapping("/admin/{email}/{password}")
public Admin login(@PathVariable ("email")String email,@PathVariable ("password") String password)
{
	return as.login(email, password);
}
}