package com.example.MangerMicroservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Document(collection = "InventoryReports")
public class InventoryReports {

    @Transient
    public static final  String SEQUENCE_NAME="user_sequence";


    @Id

    private int id;
//    @NotNull
    private Long totalincome;
//    @NotNull
    private Long maintainanceCost;
//    @NotNull
    private Long employeesalary;
//    @NotNull
    private Long totalProfit;
    
    
	public InventoryReports() {
		super();
		// TODO Auto-generated constructor stub
	}


	public InventoryReports(int id, @NotNull Long totalincome, @NotNull Long maintainanceCost,
			@NotNull Long employeesalary, @NotNull Long totalProfit) {
		super();
		this.id = id;
		this.totalincome = totalincome;
		this.maintainanceCost = maintainanceCost;
		this.employeesalary = employeesalary;
		this.totalProfit = totalProfit;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Long getTotalincome() {
		return totalincome;
	}


	public void setTotalincome(Long totalincome) {
		this.totalincome = totalincome;
	}


	public Long getMaintainanceCost() {
		return maintainanceCost;
	}


	public void setMaintainanceCost(Long maintainanceCost) {
		this.maintainanceCost = maintainanceCost;
	}


	public Long getEmployeesalary() {
		return employeesalary;
	}


	public void setEmployeesalary(Long employeesalary) {
		this.employeesalary = employeesalary;
	}


	public Long getTotalProfit() {
		return totalProfit;
	}


	public void setTotalProfit(Long totalProfit) {
		this.totalProfit = totalProfit;
	}


	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}
    
    

}
