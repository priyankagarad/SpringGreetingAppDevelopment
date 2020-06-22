package com.bl.demo.service;
import com.bl.demo.model.Greeting;
import java.util.List;
import java.util.Optional;

public interface GreetingServiceInterface {
    String greetingMessage();
    String greetingMessage(String name);
    Optional<Greeting> findGreetingMessage(int id);
    List<Greeting> listAllGreetingMessage();
    Optional<Greeting> updateGreetingMessage(Greeting greeting, int id);
    void deleteGreetingMessage(int id);

}
