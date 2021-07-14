package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class MessageService {

    public String message;

    public MessageService(String message){
        this.message = message;
    }
    public String upperCase(){
        return this.message.toUpperCase();
    }

    public String lowerCase(){
        return this.message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("MessageService class bean created");
    }
}
