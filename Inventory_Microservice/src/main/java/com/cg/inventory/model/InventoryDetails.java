package com.cg.inventory.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="InventoryDb")
public class InventoryDetails {
	@Id
	private long inventoryid;
	private String inventoryname;
	
	
	public InventoryDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public InventoryDetails(long inventoryid, String inventoryname) {
		super();
		this.inventoryid = inventoryid;
		this.inventoryname = inventoryname;
	}


	public long getInventoryid() {
		return inventoryid;
	}


	public void setInventoryid(long inventoryid) {
		this.inventoryid = inventoryid;
	}


	public String getInventoryname() {
		return inventoryname;
	}


	public void setInventoryname(String inventoryname) {
		this.inventoryname = inventoryname;
	}


	@Override
	public String toString() {
		return "InventoryDetails [inventoryid=" + inventoryid + ", inventoryname=" + inventoryname + "]";
	}
	
	
}
