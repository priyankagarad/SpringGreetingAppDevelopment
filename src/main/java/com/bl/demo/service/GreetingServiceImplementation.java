package com.bl.demo.service;
import com.bl.demo.model.Greeting;
import com.bl.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImplementation implements GreetingServiceInterface {
    @Autowired
    public GreetingRepository greetingRepository;

    public String greetingMessage() {
        return "Hello World";
    }

    public String greetingMessage(String name) {
        String message = "Hello " + name;
        Greeting greeting = new Greeting((int) (greetingRepository.count() + 1), name, message);
        greetingRepository.save(greeting);
        return message;
    }

    public List<Greeting> listAllGreetingMessage() {
        return greetingRepository.findAll();
    }
}

