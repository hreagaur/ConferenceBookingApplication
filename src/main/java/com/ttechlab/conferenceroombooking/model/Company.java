package com.ttechlab.conferenceroombooking.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Company")
public class Company 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="companyId")
	private Long companyId;
	@Column(name="companyName")
	private String companyName;
	@Column(name="email",unique=true)
	private String email;
	@Column(name="phoneNumber")
	private Long phoneNumber;
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
