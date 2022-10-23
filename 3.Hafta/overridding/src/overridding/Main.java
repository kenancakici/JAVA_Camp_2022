package overridding;

// Java Dersi 39 : Overriding Altyapısıyla Çalışmak
// https://www.youtube.com/watch?v=P4j2oh84ht4&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=40
public class Main {

	public static void main(String[] args) {

//		OgretmenKrediManager krediManager = new OgretmenKrediManager();
//		System.out.println(krediManager.hesapla(100));

		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediManager(),
				new TarimKrediManager(), new OgrenciKrtediManager() };

		for (BaseKrediManager manager : krediManagers) {
			System.out.println(manager.hesapla(1000));
		}
	}

}
