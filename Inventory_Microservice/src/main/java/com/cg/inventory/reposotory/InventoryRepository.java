package com.cg.inventory.reposotory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.inventory.model.InventoryDetails;


public interface InventoryRepository  extends MongoRepository< InventoryDetails, Long >{

}
