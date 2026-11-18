
package com.autodealer.auto_dealer.repository;

import com.autodealer.auto_dealer.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
