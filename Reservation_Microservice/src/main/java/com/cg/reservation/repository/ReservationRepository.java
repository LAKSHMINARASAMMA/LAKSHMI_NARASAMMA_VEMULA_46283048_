package com.cg.reservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.reservation.model.ReservationDetails;

public interface ReservationRepository extends MongoRepository<ReservationDetails , Long>{

	

}
