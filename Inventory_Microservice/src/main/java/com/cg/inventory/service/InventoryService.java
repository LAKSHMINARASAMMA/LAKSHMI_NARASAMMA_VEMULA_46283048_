package com.cg.inventory.service;

import java.util.List;

import com.cg.inventory.exception.InventoryNotFoundException;
import com.cg.inventory.model.InventoryDetails;


public interface InventoryService {
	
	public InventoryDetails createInventoryDetails(InventoryDetails inventoryDetails);
	public InventoryDetails updateInventoryDetails(InventoryDetails inventoryDetails) throws InventoryNotFoundException;
	public List < InventoryDetails > getAllInventoryDetails();
	public InventoryDetails getInventoryDetailsById(long iId);
	public void deleteInventoryDetails(long iId);

}
