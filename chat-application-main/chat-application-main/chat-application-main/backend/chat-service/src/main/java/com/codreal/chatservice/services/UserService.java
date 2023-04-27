package com.codreal.chatservice.services;

import com.codreal.chatservice.exceptions.UserAlreadyExistException;
import com.codreal.chatservice.exceptions.UserNotFoundException;
import com.codreal.chatservice.model.User;

import java.util.List;

public interface UserService {
    List<User> getall() throws UserNotFoundException;
}

interface UserService1 {
    User addUser(User user) throws UserAlreadyExistException;
}

interface UserService2 {
    User getUserByUserName(String username)  throws UserNotFoundException;
}
