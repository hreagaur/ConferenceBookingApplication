package com.ttechlab.conferenceroombooking.model;
//import com.ttechlab.conferenceroombooking.ConferenceroombookingApplication;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name = "email", unique=true )
	private String email;
	
	@Column(name="password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "companyId")
	private Company companyId;
	
	@ManyToOne
	@JoinColumn(name = "roleId")
	private Role roleId;
	
}
