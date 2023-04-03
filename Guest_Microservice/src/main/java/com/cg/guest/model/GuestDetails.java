package com.cg.guest.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="GuestDb")
public class GuestDetails {
	
	private long guestId;
	private String guestName;
	private String guestAddress;
	private String guestEmail;
	private long guestPhoneNumber;
	
	
	public GuestDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public GuestDetails(Long guestId, String guestName, String guestAddress, String guestEmail, long guestPhoneNumber) {
		super();
		this.guestId = guestId;
		this.guestName = guestName;
		this.guestAddress = guestAddress;
		this.guestEmail = guestEmail;
		this.guestPhoneNumber = guestPhoneNumber;
	}


	public Long getGuestId() {
		return guestId;
	}


	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}


	public String getGuestName() {
		return guestName;
	}


	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}


	public String getGuestAddress() {
		return guestAddress;
	}


	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}


	public String getGuestEmail() {
		return guestEmail;
	}


	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}


	public long getGuestPhoneNumber() {
		return guestPhoneNumber;
	}


	public void setGuestPhoneNumber(long guestPhoneNumber) {
		this.guestPhoneNumber = guestPhoneNumber;
	}


	@Override
	public String toString() {
		return "GuestDetails [guestId=" + guestId + ", guestName=" + guestName + ", guestAddress=" + guestAddress
				+ ", guestEmail=" + guestEmail + ", guestPhoneNumber=" + guestPhoneNumber + "]";
	}

	
	
	
	
	
}
