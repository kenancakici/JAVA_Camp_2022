package switchDemo;

public class Main {

	// ======================================
	// Switch Bloklarıyla Çalışmak
	// ======================================
	
	public static void main(String[] args) {
		
		char grade = 'B';
		
		switch (grade) {
		case 'A': 
			System.out.println("Mükemmel :  Geçtiniz");
			break;
		case 'B': 
		case 'C': 
			System.out.println("İyi :  Geçtiniz");
			break;
		case 'D': 
			System.out.println("Fena değil :  Geçtiniz");
			break;
		case 'F': 
			System.out.println("Maalesef Geçtiniz");
			break;
		default:
			System.out.println("Lütfen geçerli bir not giriniz!");
		}
	}

}
