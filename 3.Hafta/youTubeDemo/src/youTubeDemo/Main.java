package youTubeDemo;
// https://www.youtube.com/watch?v=H3QOQRh8cgk&list=PLqG356ExoxZWfcrBP53Njxir4a-OgqRki

public class Main {

	public static void main(String[] args) {
		/*
		// Değişkenler değer tiplidir.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println("Sayı1 : " + sayi1); // Cevap 20 'dir Çünkü Değişkenler değer tiplidir.

		// Diziler referans tiplidir.

		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 10, 20, 30 };
		sayilar1 = sayilar2;
		sayilar2[0] = 1000;

		System.out.println("Sayılar1 [0] =" + sayilar1[0]);
		// Cevap 1000 'dir Çünkü Diziler referans tiplidir.
 		
 		*/
		
		/*
		CreditManager creditManager = new CreditManager();
		creditManager.Calculate();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "Ankara";
		
		CustomerManager customerManager = new CustomerManager(customer); // Örneğini (Instance) oluşturmak. Instance creation
		customerManager.Save();
		customerManager.Delete();
		
		Company company = new Company();
		company.taxNumber = "100000";
		company.companyName = "Arçelik";
		company.city = "Ankara";
		company.id = 100;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
				
		Person person = new Person();
		person.firstName = "Engin";
		person.lastName = "Demiroğ";
		person.nationalIdentity = "12345678901";
		
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		*/
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
		
//		CustomerManager customerManager2 = new CustomerManager(new Customer(), new MilitaryCreditManager());
//		customerManager2.GiveCredit();
//		
//		CustomerManager customerManager3 = new CustomerManager(new Customer(), new CarCreditManager());
//		customerManager3.GiveCredit();
	}

}
