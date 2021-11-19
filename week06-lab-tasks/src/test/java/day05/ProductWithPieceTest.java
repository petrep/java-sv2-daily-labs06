package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductWithPieceTest {

	@Test
	void initializationTest() {
		ProductWithPiece productWithPiece = new ProductWithPiece(Type.MEAT);
		assertEquals(1, productWithPiece.getCount());
	}

	@Test
	void incrementCountTest() {
		ProductWithPiece productWithPiece = new ProductWithPiece(Type.MEAT);
		productWithPiece.incrementCount();
		assertEquals(productWithPiece.getCount(), 2);
		assertEquals(Type.MEAT, productWithPiece.getType());
	}
}
