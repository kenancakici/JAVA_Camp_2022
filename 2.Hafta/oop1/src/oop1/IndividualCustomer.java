package oop1;
//inheritance (Kalıtım) : 

// IndividualCustomer bir müşteridir.
//Cusomer Sınıfından ortak özellikleri extend ile alıyoruz.
//Yani kalıtım inheritance) yoluyla alıyoruz.

public class IndividualCustomer extends Customer {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
