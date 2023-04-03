package com.cg.room.service;

import java.util.List;

import com.cg.room.exception.RoomNotFoundException;
import com.cg.room.model.RoomDetails;

public interface RoomService {
	public RoomDetails createRoomDetails(RoomDetails roomdetails);
	public RoomDetails updateRoomDetails(RoomDetails roomdetails) throws RoomNotFoundException;
	public List < RoomDetails > getAllRoomDetails();
	public RoomDetails getRoomDetailsById(long roomId);
	public void deleteRoomDetails(long roomId);
}
