package sayiBulma;

public class Main {

	// ======================================
	// Mini Proje 5 - Sayı Bulma
	// ======================================
	
	// 
	
	public static void main(String[] args) {
		
			int[] sayilar = new int[]{1,2,5,7,9,0};
			int aranacak = 15;
			boolean varMi = false;
			
			for (int sayi : sayilar) {
				if(sayi == aranacak) {
					varMi = true;
					break; // döngüyü bitir					
				}
			}
			if(varMi) {
				System.out.println("Sayı mevcuttur..");
			}else {
				System.out.println("Sayı mevcut değildir.");
			}
	}

}
