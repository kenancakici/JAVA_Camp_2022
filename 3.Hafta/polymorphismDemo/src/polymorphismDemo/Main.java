package polymorphismDemo;
// Java Dersi 38 : Gerçek Hayatta Polimorfizm ile Çalışmak
// https://www.youtube.com/watch?v=DfEFbI6z2Is&list=PLqG356ExoxZUGwbqoJEKSMnaxVJe4Uvf8&index=39&t=891s

public class Main {

	public static void main(String[] args) {
		 
//		BaseLogger[] loggers = new BaseLogger[] {new EmailLogger(), new DatabaseLogger(),new FileLogger(), new ConsoleLogger()};
//		
//		for (BaseLogger baseLogger : loggers) {
//			baseLogger.log("Log mesajı...");
//		}

		// Bağımlılıktan kaçınmak için Polymorphism'e daha uygun kodlama aşağıdaki şekilde yazabiliriz.
		
		//CustomerManager manager = new CustomerManager(new DatabaseLogger());
		// CustomerManager manager = new CustomerManager(new EmailLogger());
		CustomerManager manager = new CustomerManager(new FileLogger());
		manager.add();
	}

}
