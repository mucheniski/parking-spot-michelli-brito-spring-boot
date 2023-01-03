package com.example.parkingspot.services;

import com.example.parkingspot.models.ParkingSpotModel;
import com.example.parkingspot.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    @Autowired
    ParkingSpotRepository parkingSpotRepository;

    public Object save(ParkingSpotModel parkingSpotModel) {
    }
}
