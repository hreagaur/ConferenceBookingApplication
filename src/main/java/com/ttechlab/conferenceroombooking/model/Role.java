package com.ttechlab.conferenceroombooking.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="roleId")
	private long roleId;
	
	@Column(name="roleName")
	private String role;

}
