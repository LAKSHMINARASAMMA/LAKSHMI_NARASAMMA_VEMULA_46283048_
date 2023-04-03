package com.example.ReceptionistMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.*;

@Data
@Document(collection = "Guest")
public class Guest {
    @Transient
    public static final  String SEQUENCE_NAME="user_sequence";

    @Id
    private int id;
    @NotNull
    @Size(min = 2, message = " Name should have atleast 2 characters")
    private String name;
    @NotNull
    @Min(1)
    private int roomNo;
    @NotNull
    @Min(9)
    private Long phoneNo;
    @Email
    @NotBlank
    private String email;
    @NotNull
    private String gender;
    @NotNull
    @Size(min = 2, message = " Name should have atleast 2 characters")
    private String address;
    
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Guest(int id, @NotNull @Size(min = 2, message = " Name should have atleast 2 characters") String name,
			@NotNull @Min(1) int roomNo, @NotNull @Min(9) Long phoneNo, @Email @NotBlank String email,
			@NotNull String gender,
			@NotNull @Size(min = 2, message = " Name should have atleast 2 characters") String address) {
		super();
		this.id = id;
		this.name = name;
		this.roomNo = roomNo;
		this.phoneNo = phoneNo;
		this.email = email;
		this.gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
    
    

}
