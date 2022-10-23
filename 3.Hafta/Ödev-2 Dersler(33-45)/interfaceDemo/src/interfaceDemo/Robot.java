package interfaceDemo;

public class Robot implements IWorkable,IMaintainable{

	@Override
	public void work() {
		System.out.println("Robot işe başladı....");
		
	}

	@Override
	public void maintainable() {
		System.out.println("Robot bakımı yapıldı...");
		
	}

}
