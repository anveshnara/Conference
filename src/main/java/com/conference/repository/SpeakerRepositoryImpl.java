package com.conference.repository;

import com.conference.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        Speaker speaker = new Speaker();
        List<Speaker> speakers = new ArrayList<Speaker>();
        speaker.setFirstName("demoFirstName");
        speaker.setLastName("demoLastName");
        speaker.setDescription("demo");
        speakers.add(speaker);
        return speakers;
    }
}
