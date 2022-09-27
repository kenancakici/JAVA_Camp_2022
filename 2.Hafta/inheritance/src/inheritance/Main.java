package inheritance;

public class Main {

	// ========================================
	// Java Dersi 36 : Inheritance Yapısını Anlamak
	// KAYNAK : https://www.youtube.com/watch?v=SYLUS_xInVA&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=37
	// ========================================
	public static void main(String[] args) {

		Customer customer = new Customer();
		Employee employee = new Employee();
		
		
		// customer ve employee içerisindeki ortak özellikler Kalıtım yoluyla "Person" class'ından geldi.
		customer.id = 1;
		customer.firstName = "Engin";
		
		employee.id = 2;
		employee.firstName = "Ahmet";
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.Add();
		employeeManager.BestEmployee();
		
		
		
		
	}

}
