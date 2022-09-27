package recapDemo2;

public class Main {

	//=====================================
	// ReCap Demo 2 - Dizilerle Çalışmak
	//=====================================
	public static void main(String[] args) {

		// double[] myList = new double[4];
		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
		double total = 0 ;
		double max = myList[0];
		
		for (double d : myList) {
			if (max<d) {
				max = d;
			}
			total += d;
			System.out.println(d);
		}
		System.out.println("Toplam : " + total);
		System.out.println("En Büyük : " + max);
	}

} 
