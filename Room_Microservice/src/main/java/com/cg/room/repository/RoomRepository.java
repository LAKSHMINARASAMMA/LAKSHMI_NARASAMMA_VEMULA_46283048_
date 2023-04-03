package com.cg.room.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.room.model.RoomDetails;

public interface RoomRepository extends MongoRepository< RoomDetails, Long >{

}
