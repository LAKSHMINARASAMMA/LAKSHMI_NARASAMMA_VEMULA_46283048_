package com.cg.reservation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.reservation.exception.ReservationNotFoundException;
import com.cg.reservation.model.ReservationDetails;
import com.cg.reservation.repository.ReservationRepository;
@Service
public class ReservationServiceImpl implements ReservationService{
	
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public ReservationDetails createReservationDetails(ReservationDetails reservationDetails) {
		// TODO Auto-generated method stub
		return reservationRepository.save(reservationDetails);
	}

	@Override
	public ReservationDetails updateReservationDetails(ReservationDetails reservationDetails)
			throws ReservationNotFoundException {
		// TODO Auto-generated method stub

		Optional < ReservationDetails > reservationDb = this.reservationRepository.findById(reservationDetails.getReservationId());//hits MongoDB

        if(reservationDb.isPresent()) {
        	ReservationDetails reservationDetailsUpdate = reservationDb.get();
        	reservationDetailsUpdate.setReservationId(reservationDetails.getReservationId());
        	reservationDetailsUpdate.setNumberOfMembers(reservationDetails.getNumberOfMembers());
        	reservationDetailsUpdate.setCheckin(reservationDetails.getCheckin());
        	reservationDetailsUpdate.setCheckout(reservationDetails.getCheckout());
            return reservationDetailsUpdate;
            
        } else {
            throw new ReservationNotFoundException("Record not found with id : " + reservationDetails.getReservationId());
        }
		
	}

	@Override
	public List<ReservationDetails> getAllReservationDetails() {
		// TODO Auto-generated method stub
		return this.reservationRepository.findAll();
	}

	@Override
	public ReservationDetails getReservationDetailsById(long reserId) {
		// TODO Auto-generated method stub
		Optional < ReservationDetails > reservationDb = this.reservationRepository.findById(reserId);//hits MongoDB

        if (reservationDb.isPresent()) {
            return reservationDb.get();
        } else {
            throw new ReservationNotFoundException("Record not found with id : " + reserId);
        }
	}

	@Override
	public void deleteReservationDetails(long reserId) {
		// TODO Auto-generated method stub
		Optional < ReservationDetails > reservationDb = this.reservationRepository.findById(reserId);//hits MongoDB

        if (reservationDb.isPresent()) {
            this.reservationRepository.delete(reservationDb.get());//hits MongoDB
        } else {
            throw new ReservationNotFoundException("Record not found with id : " + reserId);
        }
	}

}
