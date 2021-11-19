package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {
	Store store = new Store();

	@BeforeEach
	void init() {
		store.addProduct(new Product("Milk", Type.DIARY, 0.7));
		store.addProduct(new Product("Butter", Type.DIARY, 2.3));
		store.addProduct(new Product("Orange", Type.FRUIT, 4.5));
		store.addProduct(new Product("Chicken", Type.MEAT, 9.4));
		store.addProduct(new Product("Pork", Type.MEAT, 3.9));
		store.addProduct(new Product("Frozenchicken", Type.FROZEN, 3.9));
	}

	@Test
	void testNumberOfProductsByType() {
		List<ProductWithPiece> result = store.numberOfProductsByType();

		// result shows how many different types of products we have:
		assertEquals(4, result.size());
		assertEquals(Type.DIARY, result.get(0).getType());
		assertEquals(2, result.get(0).getCount());

		// Test: többfajta termék van a listában, többfajta enummal. Lekérni a lista
		// méretét.   Ha üres a lista store-ban, akkor üres legyen a termékek visszatérési
		// értéke is. Ehhez először a beforeEach-et vagy ki kell takarítani, vagy új store kell.
		// Product és ProductWithP -t is le kell tesztelni. Csak az incrementcount tesztelés kell oda, amihez
		// két metódus kell: hogy 1-e alapból, és hogy ha hozzáadok akkor 2-e.
	}

	@Test
	void testNull() {
		Store anotherStore = null;

		assertNotNull(store);
		assertNull(anotherStore);
	}


// Erre egyelőre nem jöttem rá, hogy segédmetódus nélkül hogyan lehetne addProduct-ot tesztelni:
//	@Test
//	void addProductTest() {
//		Product product = new Product("csirke", Type.MEAT, 1200);
//		store.addProduct(product);
//		assertEquals(1, );
//	}
}
