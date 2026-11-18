
package com.autodealer.auto_dealer.controller;

import com.autodealer.auto_dealer.entity.ServiceBooking;
import com.autodealer.auto_dealer.service.ServiceBookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class ServiceBookingController {

    private final ServiceBookingService bookingService;

    public ServiceBookingController(
            ServiceBookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public ServiceBooking createBooking(
            @RequestBody ServiceBooking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping
    public List<ServiceBooking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public ServiceBooking getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return "Booking deleted successfully!";
    }
}
