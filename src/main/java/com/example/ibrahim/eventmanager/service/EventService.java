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

    public Event addEvent(Event eventDto){
        Event event = new Event();
        event.setDescription(eventDto.getDescription());
        event.setStartDate(eventDto.getStartDate());
        event.setEndingDate(eventDto.getEndingDate());
        event.setParticipant(eventDto.getParticipant());
        event.setQuota(eventDto.getQuota());
        eventRepository.save(event);
        return event;
    }

    public void deleteEvent(Long id){
        eventRepository.deleteById(id);
    }

    public Event customizeEvent(Event eventDto){
        Event event = eventRepository.findEventById(eventDto.getId());
        event.setDescription(eventDto.getDescription());
        event.setStartDate(eventDto.getStartDate());
        event.setEndingDate(eventDto.getEndingDate());
        event.setParticipant(eventDto.getParticipant());
        event.setQuota(event.getQuota());
        eventRepository.save(event);
        return event;
    }

}
