package youTubeDemo;

public class MilitaryCreditManager implements ICreditManager  {

	@Override
	public void Calculate() {
		System.out.println("Asker Kredisi Hesaplandı.");
		
	}

	@Override
	public void Save() {
		System.out.println("Kaydedildi...");
		
	}

}
