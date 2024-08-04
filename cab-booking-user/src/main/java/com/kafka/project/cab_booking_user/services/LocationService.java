package com.kafka.project.cab_booking_user.services;

import org.apache.kafka.clients.admin.OffsetSpec;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "user-group", properties = {"auto.offset.reset=earliest"})
    public void cabLocation(String location){
        System.out.println(location);
    }
}
