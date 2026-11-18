
package com.autodealer.auto_dealer.service;

import com.autodealer.auto_dealer.entity.ServiceBooking;
import com.autodealer.auto_dealer.repository.ServiceBookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBookingService {

    private final ServiceBookingRepository bookingRepository;

    public ServiceBookingService(
            ServiceBookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public ServiceBooking createBooking(ServiceBooking booking) {
        return bookingRepository.save(booking);
    }

    public List<ServiceBooking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public ServiceBooking getBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Booking not found: " + id));
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }
}
