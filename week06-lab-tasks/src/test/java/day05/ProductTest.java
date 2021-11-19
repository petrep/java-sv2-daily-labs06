package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
	@Test
	void create() {

		Product product = new Product("Croissant", Type.BAKERY, 22);

		assertEquals("Croissant",product.getName());
		assertEquals(22 ,product.getPrice());
		assertEquals(Type.BAKERY,product.getType());
	}
}
