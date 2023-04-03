package com.cg.guest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.guest.exception.GuestDetailsNotFoundException;
import com.cg.guest.model.GuestDetails;
import com.cg.guest.repository.GuestRepository;
@Service
public class GuestServiceImpl implements GuestService{
	
	@Autowired
	GuestRepository guestRepository;

	@Override
	public GuestDetails createGuestDetails(GuestDetails guestDetails) {
		// TODO Auto-generated method stub
		return guestRepository.save(guestDetails);
	}

	@Override
	public GuestDetails updateGuestDetails(GuestDetails guestDetails) throws GuestDetailsNotFoundException {
		// TODO Auto-generated method stub
		Optional < GuestDetails > guestDb = this.guestRepository.findById(guestDetails.getGuestId());//hits MongoDB

        if(guestDb.isPresent()) {
        	
		GuestDetails guestDetailsUpdate = guestDb.get();
		guestDetailsUpdate.setGuestId(guestDetails.getGuestId());
		guestDetailsUpdate.setGuestName(guestDetails.getGuestName());
		guestDetailsUpdate.setGuestAddress(guestDetails.getGuestAddress());
		guestDetailsUpdate.setGuestEmail(guestDetails.getGuestEmail());
		guestDetailsUpdate.setGuestPhoneNumber(guestDetails.getGuestPhoneNumber());
		guestRepository.save(guestDetailsUpdate);//hits MongoDB
        return guestDetailsUpdate;
        
        }else {
            throw new GuestDetailsNotFoundException("Record not found with id : " + guestDetails.getGuestId());
        }
	}

	@Override
	public List<GuestDetails> getAllGuestDetails() {
		// TODO Auto-generated method stub
		return this.guestRepository.findAll();
	}

	@Override
	public GuestDetails getGuestDetailstById(long gId) {
		// TODO Auto-generated method stub
		Optional < GuestDetails > guesttDb = this.guestRepository.findById(gId);//hits MongoDB

        if (guesttDb.isPresent()) {
            return guesttDb.get();
        } else {
            throw new GuestDetailsNotFoundException("Record not found with id : " + gId);
        }
	}

	@Override
	public void deleteGuestDetails(long gId) {
		// TODO Auto-generated method stub
		Optional < GuestDetails > guesttDb = this.guestRepository.findById(gId);//hits MongoDB

        if (guesttDb.isPresent()) {
            this.guestRepository.delete(guesttDb.get());//hits MongoDB
        } else {
            throw new GuestDetailsNotFoundException("Record not found with id : " + gId);
        }
	}

	

	
	
	
}
