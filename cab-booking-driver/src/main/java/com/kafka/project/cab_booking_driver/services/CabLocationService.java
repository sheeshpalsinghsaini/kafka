package com.kafka.project.cab_booking_driver.services;

import com.kafka.project.cab_booking_driver.util.AppConstant;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public CabLocationService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public boolean updateLocation(String location){
        kafkaTemplate.send(AppConstant.CAB_LOCATION,location);
        return true;
    }
}
