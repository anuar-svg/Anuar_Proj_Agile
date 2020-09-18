package com.example.iasback.controllers;

import com.example.iasback.models.Event;
import com.example.iasback.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/event")
public class EventController {


    @Autowired
    EventService eventService;

    @GetMapping("/events")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<Event> getEvents () {
        return eventService.getEvents();
    }


    @PostMapping("/add_event")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Event createEvent( @RequestBody Event event) {
        return eventService.addEvent(event);
    }


    @PostMapping("/edit_event")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public Event editEvent(@RequestBody Event event) {
        return eventService.editEvent(event);
    }

}
