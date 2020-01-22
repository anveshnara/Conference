package com.conference;

import com.conference.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SpeakerService speakerService = appContext.getBean("speakerService",SpeakerService.class);
        System.out.println("Speaker First Name "+speakerService.findAll().get(0).getFirstName());
    }
}
