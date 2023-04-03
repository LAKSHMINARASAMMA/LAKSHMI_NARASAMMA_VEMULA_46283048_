package com.example.OwnerMicroservices.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Document(collection = "SetRates")
public class SetRates {

    @Transient
    public static final  String SEQUENCE_NAME="user_sequence";

    @Id
    private int id;

    @NotNull
    @Min(1)
    private  int guest;
    @NotNull
    @Min(1)
    private int days;
    @NotNull
    @Min(1)
    private int nightPrice;
    @NotNull
    private int extension;
    
	public SetRates(int id, @NotNull @Min(1) int guest, @NotNull @Min(1) int days, @NotNull @Min(1) int nightPrice,
			@NotNull int extension) {
		super();
		this.id = id;
		this.guest = guest;
		this.days = days;
		this.nightPrice = nightPrice;
		this.extension = extension;
	}

	public SetRates() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGuest() {
		return guest;
	}

	public void setGuest(int guest) {
		this.guest = guest;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getNightPrice() {
		return nightPrice;
	}

	public void setNightPrice(int nightPrice) {
		this.nightPrice = nightPrice;
	}

	public int getExtension() {
		return extension;
	}

	public void setExtension(int extension) {
		this.extension = extension;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
    
    

}
