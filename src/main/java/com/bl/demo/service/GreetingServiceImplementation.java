package com.bl.demo.service;
import com.bl.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImplementation implements GreetingServiceInterface {
    @Autowired
    public GreetingRepository greetingRepository;

    public String greetingMessage() {
        return "Hello World";
    }
}

