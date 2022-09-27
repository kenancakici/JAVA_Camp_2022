package datatypes;
public class Main {

	public static void main(String[] args) {
		// ==============================
		// Data Types (Veri Tipleri). 		
		// ==============================
		
		// Primitive Types : ilkel veri tipleridir. (char, byte, short, int, long, float, double, boolean)
				
		//		Data Type	Size	Description
		//	------------------------------------
		//		byte		1 byte	Stores whole numbers from -128 to 127
		//		short		2 bytes	Stores whole numbers from -32,768 to 32,767
		//		int			4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		//		long		8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//		float		4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		//		double		8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
		//		boolean		1 bit	Stores true or false values
		//		char		2 bytes	Stores a single character/letter or ASCII values. 
		//
		// 		byte, short, integer, long tamsayı tutar.
		// 		float ve double ondalıklı sayı tutar.		
		
			int 	testInteger = 10; 
			byte 	testByte = 127;
			double 	testDouble = 12.5; 	
			char 	testChar = 'A'; 	// Tek karakter tutar. Tek tırnak içerisinde tutulur.
			long 	testLong = 9223372036854775807L; // Hata almamak için sonuna L yada l yazılır.
			float 	testFloat = 8.99f; // // Hata almamak için sonuna f yada F yazılır
			boolean dogruMu = true; // 

	}

}
