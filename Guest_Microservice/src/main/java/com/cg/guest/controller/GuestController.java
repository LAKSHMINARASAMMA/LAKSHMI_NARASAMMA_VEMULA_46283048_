package com.cg.guest.controller;

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

import com.cg.guest.model.GuestDetails;
import com.cg.guest.service.GuestService;


@RestController
@RequestMapping("/Guest")
public class GuestController {
	
	@Autowired
	GuestService guestService;

    @GetMapping("/guest")
    public ResponseEntity < List < GuestDetails >> getAllGuestDetailst() {
        return ResponseEntity.ok().body(guestService.getAllGuestDetails());
    }

    @GetMapping("/guest/{guestId}")
    public ResponseEntity < GuestDetails > getGuestDetailsById(@PathVariable long guestId) {
        return ResponseEntity.ok().body(guestService.getGuestDetailstById(guestId));
    }

    @PostMapping("/guest")
    public ResponseEntity < GuestDetails > createGuestDetails(@RequestBody GuestDetails guestDetails) {
        return ResponseEntity.ok().body(this.guestService.createGuestDetails(guestDetails));
    }

    @PutMapping("/guest/{guestId}")
    public ResponseEntity < GuestDetails > updateGuestDetails(@PathVariable long guestId, @RequestBody GuestDetails guestDetails) {
    	guestDetails.setGuestId(guestId);
        return ResponseEntity.ok().body(this.guestService.updateGuestDetails(guestDetails));
    }

    @DeleteMapping("/guest/{guestId}")
    public HttpStatus deleteGuestDetails(@PathVariable long guestId) {
        this.guestService.deleteGuestDetails(guestId);
        return HttpStatus.OK;
    }
	
}
