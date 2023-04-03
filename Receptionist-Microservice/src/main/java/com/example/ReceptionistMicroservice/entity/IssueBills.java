package com.example.ReceptionistMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "IssueBills")
public class IssueBills {
    @Transient
    public static final  String SEQUENCE_NAME="user_sequence";
    @Id
    private int billNo;

    private int roomNo;

    private int price;

    private int taxes;

    private  String date;

    private int service;

    private int total;
    
    

	public IssueBills() {
		super();
		// TODO Auto-generated constructor stub
	}



	public IssueBills(int billNo, int roomNo, int price, int taxes, String date, int service, int total) {
		super();
		this.billNo = billNo;
		this.roomNo = roomNo;
		this.price = price;
		this.taxes = taxes;
		this.date = date;
		this.service = service;
		this.total = total;
	}



	public int getBillNo() {
		return billNo;
	}



	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}



	public int getRoomNo() {
		return roomNo;
	}



	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getTaxes() {
		return taxes;
	}



	public void setTaxes(int taxes) {
		this.taxes = taxes;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public int getService() {
		return service;
	}



	public void setService(int service) {
		this.service = service;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
    
	
	
    
}
