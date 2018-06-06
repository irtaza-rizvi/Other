package bookStoreTDD.Exercise4;

import java.util.HashSet;

public class Checkout {

	public double calculatePrice(Basket basket) {
		if (basket.getBooksInBasket().isEmpty()) {
			return 0.0;
		} else {
			double total = 0.0;
			int discount = 0;
			HashSet<String> booksSet = new HashSet<String>();
			HashSet<String> duplicateSet = new HashSet<String>();
			boolean unique = true;

			// if 2 books are same add special 50% discount on those 2
			//NOTE: confirm if should be appled before of after total and other discounts
			for (Book b : basket.getBooksInBasket()) {
				// total = total + b.getPrice();

				if (booksSet.add(b.getName()) == false) {
					unique = false;
					
					if (duplicateSet.add(b.getName()) == true) {
						// your duplicate element
						// total = total -b.getPrice();
					} else {
						total = total + b.getPrice();
					}
				} else {
					total = total + b.getPrice();
					
				}

			}

			// for each 3 books add 1% discount
			if (basket.getBooksInBasket().size() >= 3) {
				discount = basket.getBooksInBasket().size() / 3;
			}

			// if more than 10 books add 10% discount
			if (basket.getBooksInBasket().size() >= 10) {
				discount += 10;
			}

			// if 5 or more books and every book different add 5% discount
			if (basket.getBooksInBasket().size() >= 5 && unique) {
				discount += 5;
			}

			total -= (discount / 100.0) * total;

			return total;
		}

	}
}
