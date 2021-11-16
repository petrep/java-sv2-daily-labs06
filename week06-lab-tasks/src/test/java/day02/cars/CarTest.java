package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
	Car car = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);

	@Test
	void createCarTest() {
		Car car = new Car("Toyota", 1.2, Color.BLACK, 2_300_000);

		assertEquals("Toyota", car.getBrand());
		assertEquals(1.2, car.getEngineSize());
		assertEquals(2300000, car.getPrice());
	}

}
