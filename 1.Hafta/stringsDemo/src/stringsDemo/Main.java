package stringsDemo;

public class Main {

	// =======================
	// Stringlerle Çalışmak 1
	// =======================

	public static void main(String[] args) {
		
		
		String mesaj = "Bugün hava çok güzel. ışğüçö IŞĞÜÇÖ";
		
		/*
		System.out.println("Mesaj : " + mesaj);
		System.out.println("Eleman Sayısı : " + mesaj.length());
		System.out.println("5.Eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!")); // Metin birleştirme
		System.out.println(mesaj.startsWith("B")); // Metin 'B' harfi ile başlıyor mu? true/false
		System.out.println(mesaj.endsWith("D")); // Metin "D" ile bitiyor mu?
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // Metnin ilk 5 karakterini bul ve karakterler adlı diziye 0. elemmandan itibaren aktar.
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("a")); // Belirtilen karaterin metin içerisinde kaçıncı eleman olduğunu bulur. Aramaya soldan başlanır
		System.out.println(mesaj.lastIndexOf("ü")); // Belirtilen karaterin metin içerisinde kaçıncı eleman olduğunu bulur. Aramaya sağdan başlanır
		*/
		
		// =======================
		// Stringlerle Çalışmak 2
		// =======================
				
		String yeniMesaj = mesaj.replace(" ","-"); // karakter değiştirme
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2)); // Bir metnin içinden parça alır, Örn: 2.karakterden itibaren kes ve geri kalan tümünü al.(gün hava çok güzel.)
		System.out.println(mesaj.substring(7,9)); // Örn: 7.karakterden itibaren 9.karektere kadar al. 9. karakter dahil değil. (av)
		System.out.println("------------------------------");
		
		for (String kelime : mesaj.split(" ")) { // Split: Bir metni bir karakter veya karakter dizisine göre ayırır. Burada boşluğa göre ayırıyor
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // metnin tüm harflerini küçük harfe çevirir. Türkçe karakterleri de sorunsuz çevirir.
		System.out.println(mesaj.toUpperCase()); // metnin tüm harflerini BÜYÜK harfe çevirir. Türkçe karakterleri de sorunsuz çevirir.
		System.out.println(mesaj.trim()); // metnin başındaki ve sonundaki boşlukları atar.
	}

}
