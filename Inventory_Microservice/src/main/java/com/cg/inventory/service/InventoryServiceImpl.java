package com.cg.inventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.inventory.exception.InventoryNotFoundException;
import com.cg.inventory.model.InventoryDetails;
import com.cg.inventory.reposotory.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	
	@Autowired
	InventoryRepository inventoryRepository;

	@Override
	public InventoryDetails createInventoryDetails(InventoryDetails inventoryDetails) {
		// TODO Auto-generated method stub
		return inventoryRepository.save(inventoryDetails);
	}

	@Override
	public InventoryDetails updateInventoryDetails(InventoryDetails inventoryDetails)
			throws InventoryNotFoundException {
		// TODO Auto-generated method stub

		Optional < InventoryDetails > inventoryDb = this.inventoryRepository.findById(inventoryDetails.getInventoryid());//hits MongoDB

        if(inventoryDb.isPresent()) {
        	InventoryDetails inventoryDetailsUpdate = inventoryDb.get();
        	inventoryDetailsUpdate.setInventoryid(inventoryDetails.getInventoryid());
        	inventoryDetailsUpdate.setInventoryname(inventoryDetails.getInventoryname());
        	
            return inventoryDetailsUpdate;
            
        } else {
            throw new InventoryNotFoundException("Record not found with id : " + inventoryDetails.getInventoryid());
        }
		
	}

	@Override
	public List<InventoryDetails> getAllInventoryDetails() {
		// TODO Auto-generated method stub
		return this.inventoryRepository.findAll();
	}

	@Override
	public InventoryDetails getInventoryDetailsById(long iId) {
		// TODO Auto-generated method stub
		Optional < InventoryDetails > inventoryDb = this.inventoryRepository.findById(iId);//hits MongoDB

        if (inventoryDb.isPresent()) {
            return inventoryDb.get();
        } else {
            throw new InventoryNotFoundException("Record not found with id : " + iId);
        }
	}

	@Override
	public void deleteInventoryDetails(long iId) {
		// TODO Auto-generated method stub
		Optional < InventoryDetails > inventoryDb = this.inventoryRepository.findById(iId);//hits MongoDB

        if (inventoryDb.isPresent()) {
            this.inventoryRepository.delete(inventoryDb.get());//hits MongoDB
        } else {
            throw new InventoryNotFoundException("Record not found with id : " + iId);
        }
	}
	

}
