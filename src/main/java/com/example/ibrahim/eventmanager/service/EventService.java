package com.example.ibrahim.eventmanager.service;

import com.example.ibrahim.eventmanager.entity.Event;
import com.example.ibrahim.eventmanager.repo.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public List<Event> findAll(){
        return eventRepository.findAll();
    }
    

}
