package com.omkar.travel_and.tour_website.Backend.services;

import java.util.List;

import com.omkar.travel_and.tour_website.Backend.model.User;


public interface userservices {
User insert(User u);
void delete(long uid);
User update(long uid,User u);
User search(long uid);
List<User>getAll();
User login(String em,String pas);
}
