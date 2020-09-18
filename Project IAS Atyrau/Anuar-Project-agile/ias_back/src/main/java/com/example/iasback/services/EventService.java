package com.example.iasback.services;

import com.example.iasback.models.Event;
import com.example.iasback.repository.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    EventMapper eventMapper;


    public List<Event> getEvents() {
        return eventMapper.getEvents();
    }

    public Event addEvent(Event event) {
        return eventMapper.createEvent(event);
    }

    public Event editEvent(Event event) {
        return eventMapper.editEvent(event);
    }
}
