package com.rajat.pulsedb.api;
import com.rajat.pulsedb.model.Event;
import java.util.List;

public class ReadEventsResponse {
    private List<Event> events;
    private boolean success;
    private String message;

    public ReadEventsResponse() {
    }

    public ReadEventsResponse(List<Event> events, boolean success, String message) {
        this.events = events;
        this.success = success;
        this.message = message;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
