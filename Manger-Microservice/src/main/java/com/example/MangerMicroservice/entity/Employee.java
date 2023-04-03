package com.example.MangerMicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Builder
@Document(collection = "Employee")
public class   Employee {
    @Transient
    public static final  String SEQUENCE_NAME="user_sequence";


    @Id

    private int id;
    @NotNull
    @Size(min = 2, message = " Name should have atleast 2 characters")
    private String empName;
    @NotNull
    private String empAddress;
    @NotNull
    private int salary;

    @NotNull
    @Size(min = 2, message = " Occuption should have atleast 2 characters")
    private String occupation;
    @Email
    @NotBlank
    private String email;
    
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, @NotNull @Size(min = 2, message = " Name should have atleast 2 characters") String empName,
			@NotNull String empAddress, @NotNull int salary,
			@NotNull @Size(min = 2, message = " Occuption should have atleast 2 characters") String occupation,
			@Email @NotBlank String email) {
		super();
		this.id = id;
		this.empName = empName;
		this.empAddress = empAddress;
		this.salary = salary;
		this.occupation = occupation;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	
	
    

}