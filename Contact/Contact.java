package Contact;

public class Contact {
	private String name;
	private String address;
	private String phone;
	private String email;
	
	public Contact(String n, String a, String p, String e) {
		name = n;
		address = a;
		phone = p;
		email = e;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String newPhone) {
		phone = newPhone;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String newEmail) {
		name = newEmail;
	}
	
	public String toString() {
		return "Name: " + this.name + "\nAddress: " +
	this.address + "\nPhone: " + this.phone + 
	"\nEmail: " + this.email;
	}
}
