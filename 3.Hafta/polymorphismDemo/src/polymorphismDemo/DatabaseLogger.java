package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Log to Database : " + message);
	}
}
