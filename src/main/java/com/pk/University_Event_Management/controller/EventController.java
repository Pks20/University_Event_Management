package com.pk.University_Event_Management.controller;


import com.pk.University_Event_Management.model.Event;
import com.pk.University_Event_Management.service.EventService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @Autowired
    EventService eventService;
    @GetMapping("event")
    public Iterable<Event> getAllEvent(){
        return eventService.getAllEvent();
    }

    @PostMapping("event")
    public String addEvent(@RequestBody Event e){
        return eventService.addEvent(e);}
}
