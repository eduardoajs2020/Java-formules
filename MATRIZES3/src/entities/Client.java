package entities;

import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date birthDate;
	
	public Client() {
		
	}

	public Client(String name, String email, Date birthDate) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Client [" + (name != null ? "name=" + name + ", " : "") + (email != null ? "email=" + email + ", " : "")
				+ (birthDate != null ? "birthDate=" + birthDate + ", " : "")
				+ (getName() != null ? "getName()=" + getName() + ", " : "")
				+ (getEmail() != null ? "getEmail()=" + getEmail() + ", " : "")
				+ (getBirthDate() != null ? "getBirthDate()=" + getBirthDate() + ", " : "")
				+ (getClass() != null ? "getClass()=" + getClass() + ", " : "") + "hashCode()=" + hashCode() + ", "
				+ (super.toString() != null ? "toString()=" + super.toString() : "") + "]";
	}
	

}
