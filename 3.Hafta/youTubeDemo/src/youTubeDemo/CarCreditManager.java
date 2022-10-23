package youTubeDemo;

public class CarCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("Araba Kredisi Hesaplandı.");
		
	}

	@Override
	public void Save() {
		System.out.println("Kaydedildi...");
		
	}

}
