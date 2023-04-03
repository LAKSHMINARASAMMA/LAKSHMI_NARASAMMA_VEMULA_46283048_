package com.example.ReceptionistMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Payment")
public class Payment {
    @Transient
    public static final  String SEQUENCE_NAME="user_sequence";


    @Id

    private int id;


    private int roomNo;

    private Long creditcard;

    private int total;


    private String paytime;
    
    


	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Payment(int id, int roomNo, Long creditcard, int total, String paytime) {
		super();
		this.id = id;
		this.roomNo = roomNo;
		this.creditcard = creditcard;
		this.total = total;
		this.paytime = paytime;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getRoomNo() {
		return roomNo;
	}




	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}




	public Long getCreditcard() {
		return creditcard;
	}




	public void setCreditcard(Long creditcard) {
		this.creditcard = creditcard;
	}




	public int getTotal() {
		return total;
	}




	public void setTotal(int total) {
		this.total = total;
	}




	public String getPaytime() {
		return paytime;
	}




	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}




	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
    
    


}
