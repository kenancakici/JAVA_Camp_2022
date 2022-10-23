package overridding;

public class OgrenciKrtediManager extends BaseKrediManager{
	// BaseKredimanager'daki hesapla metodunu override ediyoruz. Yani Eziyoruz.
	// öğrenciye has hesaplama yapıyoruz.
	
	@Override 
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
