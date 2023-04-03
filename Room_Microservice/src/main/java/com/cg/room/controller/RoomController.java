package com.cg.room.controller;

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

import com.cg.room.model.RoomDetails;
import com.cg.room.service.RoomService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/Room")
public class RoomController {
	
	@Autowired
	RoomService roomService;

	@GetMapping("/room")
    public ResponseEntity < List < RoomDetails >> getAllRoomDetails() {
        return ResponseEntity.ok().body(roomService.getAllRoomDetails());
    }

    @GetMapping("/room/{roomnumber}")
    public ResponseEntity < RoomDetails > getRoomDetailsById(@PathVariable long roomnumber) {
        return ResponseEntity.ok().body(roomService.getRoomDetailsById(roomnumber));
    }
   

    @PostMapping("/RoomDetails")
    public ResponseEntity < RoomDetails > createRoomDetails(@RequestBody RoomDetails roomdetails) {
        return ResponseEntity.ok().body(this.roomService.createRoomDetails(roomdetails));
    }

    @PutMapping("/room/{roomnumber}")
    public ResponseEntity < RoomDetails > updateRoomDetails(@PathVariable long roomnumber, @RequestBody RoomDetails roomdetails) {
    	roomdetails.setRoomnumber(roomnumber);
        return ResponseEntity.ok().body(this.roomService.updateRoomDetails(roomdetails));
    }

}
