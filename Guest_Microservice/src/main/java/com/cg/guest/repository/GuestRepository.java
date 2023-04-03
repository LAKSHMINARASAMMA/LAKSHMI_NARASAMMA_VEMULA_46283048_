package com.cg.guest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.guest.model.GuestDetails;

public interface GuestRepository extends MongoRepository < GuestDetails, Long >{

}
