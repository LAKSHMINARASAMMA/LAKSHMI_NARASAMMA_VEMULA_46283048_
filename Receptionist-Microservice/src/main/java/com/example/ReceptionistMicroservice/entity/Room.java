package com.example.ReceptionistMicroservice.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "Room")
public class Room {
    @Transient
    public static final  String SEQUENCE_NAME="user_sequence";

    @Id
    private int id;
    @NotNull

    private int roomNo;
    @NotNull
    @Size(min = 1, message = " Room should have atleast 1 Number")
    private String roomType;
    @NotNull
    private String isOccupied;
    @NotNull
    @Min(1)
    private int roomCost;
    private String checkIn;
    private String checkOut;
    
    
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Room(int id, @NotNull int roomNo,
			@NotNull @Size(min = 1, message = " Room should have atleast 1 Number") String roomType,
			@NotNull String isOccupied, @NotNull @Min(1) int roomCost, String checkIn, String checkOut) {
		super();
		this.id = id;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.isOccupied = isOccupied;
		this.roomCost = roomCost;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
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


	public String getRoomType() {
		return roomType;
	}


	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}


	public String getIsOccupied() {
		return isOccupied;
	}


	public void setIsOccupied(String isOccupied) {
		this.isOccupied = isOccupied;
	}


	public int getRoomCost() {
		return roomCost;
	}


	public void setRoomCost(int roomCost) {
		this.roomCost = roomCost;
	}


	public String getCheckIn() {
		return checkIn;
	}


	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}


	public String getCheckOut() {
		return checkOut;
	}


	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}


	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
    
    

}