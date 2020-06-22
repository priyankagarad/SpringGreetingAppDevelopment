package com.bl.demo.service;
import com.bl.demo.model.Greeting;
import com.bl.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Greeting> findGreetingMessage(int id) {
        return greetingRepository.findById((long) id);
    }

    public List<Greeting> listAllGreetingMessage() {
        return greetingRepository.findAll();
    }

    public void deleteGreetingMessage(int id) {
        greetingRepository.deleteById((long) id);
    }
}

