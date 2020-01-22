package com.conference.model;

import java.util.List;

public class Event {
    private String location;
    private List<Attendees> noOfPeopleAttending;
    private List<Speaker> speakers;
    private String agenda;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Attendees> getNoOfPeopleAttending() {
        return noOfPeopleAttending;
    }

    public void setNoOfPeopleAttending(List<Attendees> noOfPeopleAttending) {
        this.noOfPeopleAttending = noOfPeopleAttending;
    }

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }
}
