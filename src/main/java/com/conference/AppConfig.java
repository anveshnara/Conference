package com.conference;

import com.conference.repository.SpeakerRepository;
import com.conference.repository.SpeakerRepositoryImpl;
import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.conference"})
public class AppConfig {

//       @Bean(name="speakerService")
//       public SpeakerService getSpeakerService(){
//          return new SpeakerServiceImpl(getSpeakerRepository());
//        }
//
//        @Bean(name="speakerRepository")
//        public SpeakerRepository getSpeakerRepository(){
//            return new SpeakerRepositoryImpl();
//        }

}
