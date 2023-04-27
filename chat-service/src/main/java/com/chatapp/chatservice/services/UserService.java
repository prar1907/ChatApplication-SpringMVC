package com.chatapp.chatservice.services;

import com.chatapp.chatservice.exceptions.UserAlreadyExistException;
import com.chatapp.chatservice.exceptions.UserNotFoundException;
import com.chatapp.chatservice.model.User;

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
