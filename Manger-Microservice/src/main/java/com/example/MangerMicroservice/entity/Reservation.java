package com.example.MangerMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Reservation {
    @Id
    private int id;
//    @NotNull
//    @Min(0)
    private int roomNo;
//    @NotNull
//    @Min(0)
    private int children;
//    @NotNull
//    @Min(1)
    private int adults;
//    @NotNull
//    @Size(min = 1, message = " Room should have atleast 1 Number")
    private String checkindate;
//    @NotNull
    private String checkoutdate;
    
    
    
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(int id, @NotNull @Min(0) int roomNo, @NotNull @Min(0) int children, @NotNull @Min(1) int adults,
			@NotNull @Size(min = 1, message = " Room should have atleast 1 Number") String checkindate,
			@NotNull String checkoutdate) {
		super();
		this.id = id;
		this.roomNo = roomNo;
		this.children = children;
		this.adults = adults;
		this.checkindate = checkindate;
		this.checkoutdate = checkoutdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public String getCheckindate() {
		return checkindate;
	}
	public void setCheckindate(String checkindate) {
		this.checkindate = checkindate;
	}
	public String getCheckoutdate() {
		return checkoutdate;
	}
	public void setCheckoutdate(String checkoutdate) {
		this.checkoutdate = checkoutdate;
	}
    
    
    
}