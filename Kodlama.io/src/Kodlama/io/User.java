package Kodlama.io;

public class User {
	private int id;
	private String firstName;
	private String surName;
	private String phoneNumber;
	private String email;
	private String nationalIdentity;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String surName,
			String phoneNumber, String email, String nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.nationalIdentity = nationalIdentity;	
	}

	public int getId() {
		return id;
	}	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	

}
