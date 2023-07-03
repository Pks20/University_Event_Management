package com.pk.University_Event_Management.service;

import com.pk.University_Event_Management.model.Event;
import com.pk.University_Event_Management.model.Student;
import com.pk.University_Event_Management.repository.IEventRepo;

import org.springframework.stereotype.Service;

@Service
public class EventService {
    IEventRepo eventRepo;

    public Iterable<Event> getAllEvent() {
        return eventRepo.findAll();
    }

    public String addEvent(Event e) {
        eventRepo.save(e);
        return "added";
    }
}
