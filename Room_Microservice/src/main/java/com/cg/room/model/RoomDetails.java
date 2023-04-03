package com.cg.room.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="RoomDb")
public class RoomDetails {
	@Id
	private long roomnumber;
	private String roomDesc;
	private int roomRent;
	private String roomType;
	private String roomSharing;
	private boolean roomAvailable;
	
	
	public RoomDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public RoomDetails(long roomnumber, String roomDesc, int roomRent, String roomType, String roomSharing,
			boolean roomAvailable) {
		super();
		this.roomnumber = roomnumber;
		this.roomDesc = roomDesc;
		this.roomRent = roomRent;
		this.roomType = roomType;
		this.roomSharing = roomSharing;
		this.roomAvailable = roomAvailable;
	}


	public long getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(long roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getRoomDesc() {
		return roomDesc;
	}
	public void setRoomDesc(String roomDesc) {
		this.roomDesc = roomDesc;
	}
	public int getRoomRent() {
		return roomRent;
	}
	public void setRoomRent(int roomRent) {
		this.roomRent = roomRent;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getRoomSharing() {
		return roomSharing;
	}
	public void setRoomSharing(String roomSharing) {
		this.roomSharing = roomSharing;
	}
	public boolean isRoomAvailable() {
		return roomAvailable;
	}
	public void setRoomAvailable(boolean roomAvailable) {
		this.roomAvailable = roomAvailable;
	}


	@Override
	public String toString() {
		return "RoomDetails [roomnumber=" + roomnumber + ", roomDesc=" + roomDesc + ", roomRent=" + roomRent
				+ ", roomType=" + roomType + ", roomSharing=" + roomSharing + ", roomAvailable=" + roomAvailable + "]";
	}


	
	
	
	
}
