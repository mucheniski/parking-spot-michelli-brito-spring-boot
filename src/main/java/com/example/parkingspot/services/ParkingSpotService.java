package com.api.parkingcontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    @Autowired
    ParkingSpotRepository parkingSpotRepository;

}
