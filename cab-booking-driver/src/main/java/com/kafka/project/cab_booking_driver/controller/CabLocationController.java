package com.kafka.project.cab_booking_driver.controller;

import com.kafka.project.cab_booking_driver.services.CabLocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    private final CabLocationService locationService;


    public CabLocationController(CabLocationService locationService) {
        this.locationService = locationService;
    }


    // Business logic
    @PutMapping
    public ResponseEntity<Map<String, String>> updateLocation() throws InterruptedException {
        int range = 100;
        while (range > 0){
            locationService.updateLocation(Math.random()+" , "+Math.random());
            Thread.sleep(1000);
            range--;
        }
        return new ResponseEntity<>(Map.of("message","LocationUpdated"),HttpStatus.OK);
    }
}
