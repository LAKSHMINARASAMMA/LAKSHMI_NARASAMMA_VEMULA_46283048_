package CollectionsTest;

public class Contact {
	String name, email, gender;
	long phno;
	public Contact(long phno,String name, String email, String gender) {
		this.phno=phno;
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public Long getPhno() {
		return phno;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getGender() {
		return gender;
	}
}
