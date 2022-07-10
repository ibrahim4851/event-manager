package com.example.ibrahim.eventmanager.controller;

import com.example.ibrahim.eventmanager.entity.Event;
import com.example.ibrahim.eventmanager.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/getall")
    public ResponseEntity<List<Event>> getAll(){
        return new ResponseEntity<>(eventService.findAll(), HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Event> editEvent(@RequestBody Event event){
        Event editedEvent = eventService.customizeEvent(event);
        return new ResponseEntity<>(editedEvent, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Event> createEvent(@RequestBody Event event){
        return new ResponseEntity<>(eventService.addEvent(event), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteEvent(@PathVariable(value = "id") Long id){
        eventService.deleteEvent(id);
        return new ResponseEntity("Event Successfully deleted", HttpStatus.OK);
    }

}
