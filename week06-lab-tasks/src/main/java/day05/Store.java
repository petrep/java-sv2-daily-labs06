package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {

	private List<Product> products = new ArrayList<>();

	public void addProduct(Product p) {
		products.add(p);
	}

	public List<ProductWithPiece> numberOfProductsByType() {
		List<ProductWithPiece> result = new ArrayList<>();

		for (Product actual : products) {
			ProductWithPiece productWithPiece = containsProduct(actual, result);
			if (productWithPiece != null) {
//				System.out.println(actual.getName());
				productWithPiece.incrementCount();
			} else {
//				System.out.println(actual.getName());
				result.add(new ProductWithPiece(actual.getType()));
//				System.out.println(result.get(0).getType());
			}
//			System.out.println(result.size());
		}

		return result;
	}

	private ProductWithPiece containsProduct(Product actual, List<ProductWithPiece> productsPieceList) {
		for (ProductWithPiece pwp : productsPieceList) {
			if (actual.getType()==pwp.getType()) {
				return pwp;
			}
		}
		return null;
	}
}
