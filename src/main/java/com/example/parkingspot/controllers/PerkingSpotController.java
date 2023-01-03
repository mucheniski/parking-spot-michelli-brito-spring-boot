package com.example.parkingspot.controllers;

import com.example.parkingspot.dtos.ParkingSpotDTO;
import com.example.parkingspot.models.ParkingSpotModel;
import com.example.parkingspot.services.ParkingSpotService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class PerkingSpotController {

    @Autowired
    private ParkingSpotService parkingSpotService;


    @PostMapping("/create")
    public ResponseEntity<Object> createParkingSpot(@RequestBody @Valid ParkingSpotDTO parkingSpotDTO) {
        var parkingSpotModel = new ParkingSpotModel();
        BeanUtils.copyProperties(parkingSpotDTO, parkingSpotModel);
        parkingSpotModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.save(parkingSpotModel));
    }


}
