package day02.cars;

public class Car {
	private String brand;
	private double engineSize;
	private Color color;
	private int price;

	public Car(String brand, double engineSize, Color color, int price) {
		this.brand = brand;
		this.engineSize = engineSize;
		this.color = color;
		this.price = price;
	}

	public void decreasePrice(int percent) {
		double loweredPrice = price * (percent / 100.0);
		price -= (int) loweredPrice;
	}

	public String getBrand() {
		return brand;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public int getPrice() {
		return price;
	}
}
