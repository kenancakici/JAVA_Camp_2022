package courseProject.entities;

public class Course extends BaseEntity{
	private double price;	
	
	public Course() {
	
	}

	public Course(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
