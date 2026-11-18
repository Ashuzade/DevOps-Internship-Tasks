
package com.autodealer.auto_dealer.repository;

import com.autodealer.auto_dealer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

