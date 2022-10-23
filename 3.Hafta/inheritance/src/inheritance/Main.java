package inheritance;

// Java Dersi 36 : Inheritance Yapısını Anlamak
// https://www.youtube.com/watch?v=SYLUS_xInVA&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=37

public class Main {

	public static void main(String[] args) {
		/*
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.email = "test@gmail.com";
		employee.salary = 1500;
		*/
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
		employeeManager.add(); // extend ile Person classtan geldi
		employeeManager.list();// extend ile Person classtan geldi
		
		employeeManager.bestEmployee(); 
		
		customerManager.add(); // extend ile Person classtan geldi
		customerManager.list(); // extend ile Person classtan geldi
		
		

	}

}
