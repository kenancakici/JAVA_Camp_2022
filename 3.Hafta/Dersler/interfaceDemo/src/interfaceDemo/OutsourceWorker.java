package interfaceDemo;

// Outsource çalışan ve ona ait iş kuralları

public class OutsourceWorker implements IWorkable {

	@Override
	public void work() {
		System.out.println("Outsource Firma elemanı işe başladı.");
		
	}

}
