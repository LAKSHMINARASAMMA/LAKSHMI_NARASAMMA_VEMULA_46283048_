package com.cg.inventory.controller;

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

import com.cg.inventory.model.InventoryDetails;
import com.cg.inventory.service.InventoryService;

@RestController
@RequestMapping("/Inventory")
public class InventoryController {
	
	
	@Autowired
	InventoryService inventoryService;
	
	@GetMapping("/inventory")
    public ResponseEntity < List < InventoryDetails >> getAllInventoryDetails() {
        return ResponseEntity.ok().body(inventoryService.getAllInventoryDetails());
    }

    @GetMapping("/inventory/{inventoryid}")
    public ResponseEntity < InventoryDetails > getInventoryDetailsById(@PathVariable long inventoryid) {
        return ResponseEntity.ok().body(inventoryService.getInventoryDetailsById(inventoryid));
    }

    @PostMapping("/inventoryDetails")
    public ResponseEntity < InventoryDetails > createInventoryDetails(@RequestBody InventoryDetails inventoryDetails) {
        return ResponseEntity.ok().body(this.inventoryService.createInventoryDetails(inventoryDetails));
    }

    @PutMapping("/inventory/{inventoryid}")
    public ResponseEntity < InventoryDetails > updateInventoryDetails(@PathVariable long inventoryid, @RequestBody InventoryDetails inventoryDetails) {
    	inventoryDetails.setInventoryid(inventoryid);
        return ResponseEntity.ok().body(this.inventoryService.updateInventoryDetails(inventoryDetails));
    }

    @DeleteMapping("/inventory/{inventoryid}")
    public HttpStatus deleteInventoryDetails(@PathVariable long Inventoryid) {
        this.inventoryService.deleteInventoryDetails(Inventoryid);
        return HttpStatus.OK;
    }

}
