package polymorphismDemo;

public class CustomerManager {

	BaseLogger logger = new BaseLogger();
	
	// Constructor oluşturuyoruz.
	// Buradaki baseLogger, DatabaseLogger,EmailLogger, FileLogger ve ConsoleLogger ın REFERANSINI TUTUYOR
	public CustomerManager(BaseLogger baseLogger) {
		this.logger = baseLogger;
	}
	
	public void add() {
		System.out.println("Müşteri Eklendi.");
		logger.log("Log mesajı...");
	}

}
