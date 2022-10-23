package interfaces;


// CustomerManager'in constrctor'ında ben birtane ICustomerDal istiyorum. 
// Bunlar Oracle, MsSql, MySql olabilir

public class CustomerManager {

	private ICustomerDal customerDal; // Dışarıdan erişimi engelledik

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// İş Kodları (kontroller, şartlar vb..) burada yazılır.
		this.customerDal.add();
	}

}
