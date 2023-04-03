package com.cg.manager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="StaffDB")
public class StaffDetails {
	@Id
	private Long staffId;
	private String staffName;
	private String staffDept;
	private String staffAddress;
	private Long staffPhNo;
	private String staffEmail;
	
	
	public StaffDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StaffDetails(Long staffId, String staffName, String staffDept, String staffAddress, Long staffPhNo,
			String staffEmail) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.staffAddress = staffAddress;
		this.staffPhNo = staffPhNo;
		this.staffEmail = staffEmail;
	}
	
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public Long getStaffId() {
		return staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffDept() {
		return staffDept;
	}
	public void setStaffDept(String staffDept) {
		this.staffDept = staffDept;
	}
	public String getStaffAddress() {
		return staffAddress;
	}
	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}
	public Long getStaffPhNo() {
		return staffPhNo;
	}
	public void setStaffPhNo(Long staffPhNo) {
		this.staffPhNo = staffPhNo;
	}
	public String getStaffEmail() {
		return staffEmail;
	}
	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	@Override
	public String toString() {
		return "StaffDetails [staffId=" + staffId + ", staffName=" + staffName + ", staffDept=" + staffDept
				+ ", staffAddress=" + staffAddress + ", staffPhNo=" + staffPhNo + ", staffEmail=" + staffEmail + "]";
	}

	

	

}
