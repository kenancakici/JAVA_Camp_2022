package youTubeDemo;

public class TeacherCreditManager implements  ICreditManager{

	@Override
	public void Calculate() {
		System.out.println("Öğretmen Kredisi Hesaplandı.");
		
	}

	@Override
	public void Save() {
		System.out.println("Kaydedildi...");
		
	}

}
