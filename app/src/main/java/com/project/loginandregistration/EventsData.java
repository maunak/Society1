package com.project.loginandregistration;

public class EventsData {

    private String eventName, eventDate, eventTime,eventDetails;

    public EventsData() {
        // empty constructor
        // required for Firebase.
    }

    public EventsData(String eventName, String eventDate, String eventTime, String eventDetails) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventDetails = eventDetails;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public void setEventDetails(String eventDetails) {
        this.eventDetails = eventDetails;
    }

    public String getEventTime() {
        return eventTime;
    }

    public String getEventDetails() {
        return eventDetails;
    }
}
