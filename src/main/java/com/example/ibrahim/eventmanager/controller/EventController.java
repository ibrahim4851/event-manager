package com.example.ibrahim.eventmanager.controller;

import com.example.ibrahim.eventmanager.entity.Event;
import com.example.ibrahim.eventmanager.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/getall")
    public List<Event> getAll(){
        return eventService.findAll();
    }

    @PutMapping("/edit")
    public Event editEvent(@RequestBody Event event){
        Event editedEvent = eventService.customizeEvent(event);
        return editedEvent;
    }

    @PostMapping("/create")
    public Event createEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEvent(@PathVariable(value = "id") Long id){
        eventService.deleteEvent(id);
    }

}
