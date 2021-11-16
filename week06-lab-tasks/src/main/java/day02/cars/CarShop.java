package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
	private String dealershipName;
	private int maxPrice;
	private List<Car> cars = new ArrayList<>();

	public CarShop(String dealershipName, int maxPrice) {
		this.dealershipName = dealershipName;
		this.maxPrice = maxPrice;
	}

	public int sumCarPrice() {
		int sumCarPrice = 0;
		for (Car currentCar : cars) {
			sumCarPrice += currentCar.getPrice();
		}

		return sumCarPrice;
	}

	public int numberOfCarsCheaperThan(int price) {
		int cheapCarCount = 0;

		for (Car currentCar : cars) {
			if (currentCar.getPrice() <= price)
				cheapCarCount++;
		}

		return cheapCarCount;
	}

	public List<Car> carsWithBrand(String brand) {
		List<Car> carsWithBrand = new ArrayList<>();
		for (Car currentCar : cars) {
			if (currentCar.getBrand().equals(brand))
				carsWithBrand.add(currentCar);
		}

		return carsWithBrand;
	}

	public boolean addCar(Car car) {
		if (car.getPrice() <= maxPrice) {
			cars.add(car);
			return true;
		}
		return false;
	}

	public String getDealershipName() {
		return dealershipName;
	}

	public int getMaxPrice() {
		return maxPrice;
	}

	public List<Car> getCarsForSell() {
		return cars;
	}
}
