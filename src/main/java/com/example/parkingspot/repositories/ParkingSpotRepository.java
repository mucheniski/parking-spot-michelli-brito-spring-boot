package com.api.parkingcontrol.repositories;

import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
}
