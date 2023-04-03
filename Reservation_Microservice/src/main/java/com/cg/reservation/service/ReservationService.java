package com.cg.reservation.service;

import java.util.List;

import com.cg.reservation.exception.ReservationNotFoundException;
import com.cg.reservation.model.ReservationDetails;



public interface ReservationService {

	public ReservationDetails createReservationDetails(ReservationDetails inventoryDetails);
	public ReservationDetails updateReservationDetails(ReservationDetails inventoryDetails) throws ReservationNotFoundException;
	public List < ReservationDetails > getAllReservationDetails();
	public ReservationDetails getReservationDetailsById(long reserId);
	public void deleteReservationDetails(long reserId);


}
