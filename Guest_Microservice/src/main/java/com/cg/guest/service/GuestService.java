package com.cg.guest.service;

import java.util.List;

import com.cg.guest.exception.GuestDetailsNotFoundException;
import com.cg.guest.model.GuestDetails;
public interface GuestService {
	
	public GuestDetails createGuestDetails(GuestDetails guestDetails);
	public GuestDetails updateGuestDetails(GuestDetails guestDetails) throws GuestDetailsNotFoundException ;
	public List < GuestDetails > getAllGuestDetails();
	public GuestDetails getGuestDetailstById(long gId);
	public void deleteGuestDetails(long gId);
}
