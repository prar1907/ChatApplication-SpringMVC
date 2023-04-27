package com.chatapp.chatservice.services;

import com.chatapp.chatservice.exceptions.ChatAlreadyExistException;
import com.chatapp.chatservice.exceptions.ChatNotFoundException;
import com.chatapp.chatservice.exceptions.NoChatExistsInTheRepository;
import com.chatapp.chatservice.model.Chat;
import com.chatapp.chatservice.model.Message;

import java.util.HashSet;
import java.util.List;

public interface ChatService {

    public Chat addChat(Chat chat) throws ChatAlreadyExistException;

}

interface ChatService1 {

    List<Chat> findallchats() throws NoChatExistsInTheRepository;

}

interface ChatService2 {

    Chat getById(int id)  throws ChatNotFoundException;

}

interface ChatService3 {

    HashSet<Chat> getChatByFirstUserName(String username)  throws ChatNotFoundException;
}

interface ChatService4 {

    HashSet<Chat> getChatBySecondUserName(String username)  throws ChatNotFoundException;
}

interface ChatService5 {

    HashSet<Chat> getChatByFirstUserNameOrSecondUserName(String username)  throws ChatNotFoundException;
}

interface ChatService6 {

    HashSet<Chat> getChatByFirstUserNameAndSecondUserName(String firstUserName, String secondUserName)  throws ChatNotFoundException;

}

interface ChatService7 {

    Chat addMessage(Message add, int chatId)  throws ChatNotFoundException;
}
