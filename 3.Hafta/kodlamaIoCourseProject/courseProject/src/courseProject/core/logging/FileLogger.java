package courseProject.core.logging;

public class FileLogger implements Logger{

	@Override
	public void log(String data) {
		
		System.out.println("\tDosyaya loglandı \t: " + data);
	}

}
