package com.bl.demo.service;
import com.bl.demo.model.Greeting;
import com.bl.demo.model.User;

public interface GreetingServiceInterface {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
