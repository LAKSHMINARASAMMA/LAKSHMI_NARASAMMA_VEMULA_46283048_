package com.cg.room.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.room.exception.RoomNotFoundException;
import com.cg.room.model.RoomDetails;
import com.cg.room.repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	
	RoomRepository roomRepository;

	@Override
	public RoomDetails createRoomDetails(RoomDetails roomdetails) {
		// TODO Auto-generated method stub
		return roomRepository.save(roomdetails);
	}

	@Override
	public RoomDetails updateRoomDetails(RoomDetails roomdetails) throws RoomNotFoundException {
		// TODO Auto-generated method stub
		Optional < RoomDetails > roomDb = this.roomRepository.findById(roomdetails.getRoomnumber());//hits MongoDB

        if(roomDb.isPresent()) {
        	RoomDetails roomdetailsUpdate = roomDb.get();
        	roomdetailsUpdate.setRoomnumber(roomdetails.getRoomnumber());
        	roomdetailsUpdate.setRoomDesc(roomdetails.getRoomDesc());
        	roomdetailsUpdate.setRoomRent(roomdetails.getRoomRent());
        	roomdetailsUpdate.setRoomType(roomdetails.getRoomType());
        	roomdetailsUpdate.setRoomSharing(roomdetails.getRoomSharing());
        	roomdetailsUpdate.setRoomAvailable(roomdetails.isRoomAvailable());
        	roomRepository.save(roomdetailsUpdate);//hits MongoDB
            return roomdetailsUpdate;
            
        } else {
            throw new RoomNotFoundException("Record not found with id : " + roomdetails.getRoomnumber());
        }

	}

	@Override
	public List<RoomDetails> getAllRoomDetails() {
		// TODO Auto-generated method stub
		return this.roomRepository.findAll();
	}

	@Override
	public RoomDetails getRoomDetailsById(long roomId) {
		// TODO Auto-generated method stub
		Optional < RoomDetails > roomDb = this.roomRepository.findById(roomId);//hits MongoDB

        if (roomDb.isPresent()) {
            return roomDb.get();
        } else {
            throw new RoomNotFoundException("Record not found with id : " + roomId);
        }
	}
	@Override
	public void deleteRoomDetails(long roomId) {
		// TODO Auto-generated method stub

		Optional < RoomDetails > roomDb = this.roomRepository.findById(roomId);//hits MongoDB

        if (roomDb.isPresent()) {
            this.roomRepository.delete(roomDb.get());//hits MongoDB
        } else {
            throw new RoomNotFoundException("Record not found with id : " + roomId);
        }
	}

	
	

}
