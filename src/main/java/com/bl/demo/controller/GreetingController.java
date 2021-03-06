package com.bl.demo.controller;
import com.bl.demo.model.Greeting;
import com.bl.demo.service.GreetingServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @Autowired
    private GreetingServiceImplementation greetingAppService;

    @GetMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity sayWelcome() {
        return new ResponseEntity("Welcome to Greeting App", HttpStatus.OK);
    }

    @GetMapping(value = "/greeting/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity greetingMessage() {
        return new ResponseEntity(greetingAppService.greetingMessage(), HttpStatus.OK);
    }

    @GetMapping(value = "/greeting/message/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity greetingMessageWithName(@PathVariable("name") String name) {
        return new ResponseEntity(greetingAppService.greetingMessage(name), HttpStatus.OK);
    }

    @GetMapping(value = "/greeting/message/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity greetingMessageWithName(@PathVariable("id") int id) {
        return new ResponseEntity(greetingAppService.findGreetingMessage(id), HttpStatus.OK);
    }

    @GetMapping(value = "/greeting/message/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity listAllGreetingMessages() {
        return new ResponseEntity(greetingAppService.listAllGreetingMessage(), HttpStatus.OK);
    }

    @DeleteMapping(value = "/greeting/message/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteGreetingMessage(@PathVariable("id") int id) {
        greetingAppService.deleteGreetingMessage(id);
    }
}