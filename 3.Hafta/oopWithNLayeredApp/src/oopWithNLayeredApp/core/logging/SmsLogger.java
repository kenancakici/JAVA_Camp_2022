package oopWithNLayeredApp.core.logging;

public class SmsLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("SMS'e loglandı " + data);
		
	}

}
