package com.cg.manager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ReservationDB")


public class ReservationDetails {
	
	@Id
	private long reservationId;
	private int numberOfMembers;
	private String checkin;
	private String checkout;
	
	
	public ReservationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public ReservationDetails(long reservationId, int numberOfMembers, String checkin, String checkout) {
		super();
		this.reservationId = reservationId;
		this.numberOfMembers = numberOfMembers;
		this.checkin = checkin;
		this.checkout = checkout;
	}


	public long getReservationId() {
		return reservationId;
	}


	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}


	public int getNumberOfMembers() {
		return numberOfMembers;
	}


	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}


	public String getCheckin() {
		return checkin;
	}


	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}


	public String getCheckout() {
		return checkout;
	}


	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}




	@Override
	public String toString() {
		return "ReservationDetails [reservationId=" + reservationId + ", numberOfMembers=" + numberOfMembers
				+ ", checkin=" + checkin + ", checkout=" + checkout + "]";
	}
	
	
	
}
