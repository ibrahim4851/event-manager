package com.example.ibrahim.eventmanager.controller;

import com.example.ibrahim.eventmanager.entity.Event;
import com.example.ibrahim.eventmanager.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/allevents")
    public List<Event> getAll(){
        return eventService.findAll();
    }

    @PutMapping("/editevent")
    public Event editEvent(Event event){
        Event editedEvent = eventService.customizeEvent(event);
        return editedEvent;
    }

}
