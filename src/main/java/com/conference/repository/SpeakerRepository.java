package com.conference.repository;

import com.conference.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    public List<Speaker> findAll();
}
