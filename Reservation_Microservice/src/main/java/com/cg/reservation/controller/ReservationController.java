package com.cg.reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.reservation.model.ReservationDetails;
import com.cg.reservation.service.ReservationService;

@RestController
@RequestMapping("/Reservation")
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@GetMapping("/reservation")
    public ResponseEntity < List < ReservationDetails >> getAllReservationDetails() {
        return ResponseEntity.ok().body(reservationService.getAllReservationDetails());
    }

    @GetMapping("/reservation/{reservationid}")
    public ResponseEntity < ReservationDetails > getReservationDetailsById(@PathVariable long reservationid) {
        return ResponseEntity.ok().body(reservationService.getReservationDetailsById(reservationid));
    }

    @PostMapping("/reservationDetails")
    public ResponseEntity < ReservationDetails > createReservationDetails(@RequestBody ReservationDetails reservationDetails) {
        return ResponseEntity.ok().body(this.reservationService.createReservationDetails(reservationDetails));
    }

    @PutMapping("/reservation/{reservationid}")
    public ResponseEntity < ReservationDetails > updateReservationDetails(@PathVariable long reservationid, @RequestBody ReservationDetails reservationDetails) {
    	reservationDetails.setReservationId(reservationid);
        return ResponseEntity.ok().body(this.reservationService.updateReservationDetails(reservationDetails));
    }
    
    @DeleteMapping("/reservation/{reservationid}")
    public HttpStatus deleteReservationDetails(@PathVariable long reservationid) {
        this.reservationService.deleteReservationDetails(reservationid);
        return HttpStatus.OK;
    }

}
