package classesWithAttributes;

public class Product {
	
	// Attribute & Field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String code;
	
	// Parametreli Constructor / yapıcı metod
	public Product(int id, String name, String description, double price, int stockAmount,String color) {
		
		System.out.println("Parametreli Yapıcı blok (Constructor) çalıştı...");
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.color = color;
	}
		
	 //Parametresiz Constructor / yapıcı metod
	
	public Product() {
		System.out.println("Parametresiz Yapıcı blok (Constructor) çalıştı...");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCode() {
		return this.name.substring(0,1) + this.id ; // substring : 0 dan itibaren 1 e kadar. alır. 1 dahil değil. Burada ilk karakter.
	}

	
	
}
