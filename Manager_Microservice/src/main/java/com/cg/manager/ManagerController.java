package com.cg.manager;
import java.util.Arrays;
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
import org.springframework.web.client.RestTemplate;

import com.cg.manager.model.InventoryDetails;
import com.cg.manager.model.RoomDetails;
import com.cg.manager.model.StaffDetails;




@RestController
@RequestMapping("/Manager")
public class ManagerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/getAllStaffDetails")
	public ResponseEntity <List  <StaffDetails >> getAllStaffDetails(){
		StaffDetails[] staffs= restTemplate.getForObject("http://localhost:8090/Staff/staff", StaffDetails[].class);
		List<StaffDetails> staflist=Arrays.asList(staffs);
		 return ResponseEntity.ok().body(staflist);
	}
	
	 @PostMapping("/createStaffDetails")
	  public ResponseEntity<StaffDetails> createStaffDetails(@RequestBody StaffDetails staffdetails) {
		 StaffDetails staff= restTemplate.postForObject("http://localhost:8090/Staff/StaffDetails",staffdetails, StaffDetails.class);
		 return ResponseEntity.ok().body(staff);
	    }
    

    @DeleteMapping("/deleteStaffDetails")
    public  void deleteStaffDetails(@PathVariable long staffId) {
    	restTemplate.delete("http://localhost:8090/Staff/staff/"+staffId);
        
    }
    
    
    @GetMapping("/getAllRoomDetails")
	public ResponseEntity <List  < RoomDetails >> getAllRoomDetails(){
    	RoomDetails[] rooms= restTemplate.getForObject("http://localhost:8091/Room/room", RoomDetails[].class);
		List<RoomDetails> roomlist=Arrays.asList(rooms);
		 return ResponseEntity.ok().body(roomlist);
	}
	
	 @PostMapping("/createRoomDetails")
	   public ResponseEntity<RoomDetails> createRoomDetails1(@RequestBody RoomDetails roomDetails) {
		 RoomDetails room = restTemplate.postForObject("http://localhost:8090/Rooom/RoomDetails",roomDetails, RoomDetails.class);
		 return ResponseEntity.ok().body(room);
	}
	 

	 
	 @GetMapping("/getAllInventoryDetails")
	public ResponseEntity <List  < InventoryDetails >> getAllInventoryDetails(){
		InventoryDetails[] inventory = restTemplate.getForObject("http://localhost:8093/Inventory/iventory", InventoryDetails[].class);
		List<InventoryDetails> inventorylist=Arrays.asList(inventory);
		return ResponseEntity.ok().body(inventorylist);
	}
		
		 @PostMapping("/createInventoryDetails")
		 public ResponseEntity<InventoryDetails> createInventoryDetails(@RequestBody InventoryDetails inventoryDetails) {
			 InventoryDetails inventory= restTemplate.postForObject("http://localhost:8093/Inventory/inventoryDetails",inventoryDetails, InventoryDetails.class);
			 return ResponseEntity.ok().body(inventory);
		}

		    @DeleteMapping("/deleteInventoryDetails")
		    public  void deleteInventoryDetails(@PathVariable long inventoryId) {
		    	restTemplate.delete("http://localhost:8093/Inventory/iventory"+inventoryId);
		        
		    }
		 


    
}

