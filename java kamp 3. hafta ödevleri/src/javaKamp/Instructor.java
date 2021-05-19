package javaKamp;

public class Instructor extends User {
	private String branch;
	private String phoneNumber;
	private String email;
	
	public Instructor(int id,String name,String lastName,int age,String branch,String phoneNumber,String email) {
		super(id, name, lastName, age);
		this.branch=branch;
		this.phoneNumber=phoneNumber;
		this.email=email;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
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
	
	
}
