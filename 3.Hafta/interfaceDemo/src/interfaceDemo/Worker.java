package interfaceDemo;

// Bizim çalışanımız ve ona ait iş kuralları
public class Worker implements IWorkable,IEatable,IPayable{

	@Override
	public void work() {
		
		System.out.println("Personel işe başladı....");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

}
