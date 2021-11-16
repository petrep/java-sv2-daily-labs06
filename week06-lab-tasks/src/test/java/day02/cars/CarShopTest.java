package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarShopTest {
	Car car1;
	Car car2;
	Car car3;
	Car car4;
	CarShop carShop;

	@BeforeEach
	void setUp() {
		car1 = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);
		car2 = new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000);
		car3 = new Car("Suzuki", 1.4, Color.RED, 1_500_000);
		car4 = new Car("Toyota", 1.4, Color.GREY, 2_700_000);
		carShop = new CarShop("Best Car", 10_000_000);
	}

	@Test
	void decreasePriceTest() {
		car1 = new Car("Toyota", 1.2, Color.BLACK, 120);

		car1.decreasePrice(10);

		assertEquals(108, car1.getPrice());
	}

	@Test
	void checkPart1() {
		assertTrue(carShop.addCar(car1));
		assertEquals(1, carShop.getCarsForSell().size());
		assertFalse(carShop.addCar(car2));
		assertEquals(1, carShop.getCarsForSell().size());
		car1.decreasePrice(10);
		assertEquals(2070000, carShop.getCarsForSell().get(0).getPrice());
	}

	@Test
	void checkPart2() {
		carShop.addCar(car1);
		car1.decreasePrice(10);
		carShop.addCar(car2);
		carShop.addCar(car3);
		carShop.addCar(car4);
		assertEquals(6270000, carShop.sumCarPrice());
		assertEquals(1, carShop.numberOfCarsCheaperThan(2_000_000));
		assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000));
		assertEquals(2, carShop.carsWithBrand("Toyota").size());
		assertEquals(0, carShop.carsWithBrand("BMW").size());
	}
}
