package com.cg.manager.model;

public class ManagerDetails {
	
	private String managerId;
	private String managerName;
	private String managerEmail;
	private String managerPassword;
	
	
	public ManagerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ManagerDetails(String managerId, String managerName, String managerEmail, String managerPassword) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.managerEmail = managerEmail;
		this.managerPassword = managerPassword;
	}


	public String getManagerId() {
		return managerId;
	}


	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}


	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public String getManagerEmail() {
		return managerEmail;
	}


	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}


	public String getManagerPassword() {
		return managerPassword;
	}


	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}


	@Override
	public String toString() {
		return "ManagerDetails [managerId=" + managerId + ", managerName=" + managerName + ", managerEmail="
				+ managerEmail + ", managerPassword=" + managerPassword + "]";
	}


	
	
}
