package bookStoreTDD.Exercise4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckoutTest {

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		assertEquals(0.0, ckt.calculatePrice(bas), 1E-10);
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		Book boo = new Book("Book1", 500);
		bas.addBook(boo);
		assertEquals(500.0, ckt.calculatePrice(bas), 1E-10);
	}

	@Test
	public void test_3() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		Book boo1 = new Book("Book1", 500);
		Book boo2 = new Book("Book2", 500);
		bas.addBook(boo1);
		bas.addBook(boo2);
		assertEquals(1000.0, ckt.calculatePrice(bas), 1E-10);
	}

	@Test
	public void test_4() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		Book boo1 = new Book("Book1", 25.99);
		Book boo2 = new Book("Book2", 25.99);
		Book boo3 = new Book("Book3", 25.99);
		bas.addBook(boo1);
		bas.addBook(boo2);
		bas.addBook(boo3);
		assertEquals(77.1903, ckt.calculatePrice(bas), 1E-10);
	}

	@Test
	public void test_5() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		Book boo1 = new Book("Book1", 25.99);
		Book boo2 = new Book("Book2", 25.99);
		Book boo3 = new Book("Book3", 25.99);
		Book boo4 = new Book("Book4", 25.99);
		Book boo5 = new Book("Book5", 25.99);
		Book boo6 = new Book("Book6", 25.99);
		Book boo7 = new Book("Book7", 25.99);
		bas.addBook(boo1);
		bas.addBook(boo2);
		bas.addBook(boo3);
		bas.addBook(boo4);
		bas.addBook(boo5);
		bas.addBook(boo6);
		bas.addBook(boo7);
		assertEquals(169.1949, ckt.calculatePrice(bas), 1E-10);
	}

	@Test
	public void test_6() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		Book boo1 = new Book("Book1", 25.99);
		Book boo2 = new Book("Book2", 25.99);
		Book boo3 = new Book("Book3", 25.99);
		Book boo4 = new Book("Book4", 25.99);
		Book boo5 = new Book("Book5", 25.99);
		Book boo6 = new Book("Book6", 25.99);
		Book boo7 = new Book("Book7", 25.99);
		Book boo8 = new Book("Book8", 25.99);
		Book boo9 = new Book("Book9", 25.99);
		Book boo10 = new Book("Book10", 25.99);
		bas.addBook(boo1);
		bas.addBook(boo2);
		bas.addBook(boo3);
		bas.addBook(boo4);
		bas.addBook(boo5);
		bas.addBook(boo6);
		bas.addBook(boo7);
		bas.addBook(boo8);
		bas.addBook(boo9);
		bas.addBook(boo10);
		assertEquals(213.118, ckt.calculatePrice(bas), 1E-10);
	}
	
	@Test
	public void test_7() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		Book boo1 = new Book("Book1", 25.99);
		Book boo2 = new Book("Book2", 25.99);
		Book boo3 = new Book("Book3", 25.99);
		Book boo4 = new Book("Book4", 25.99);
		Book boo5 = new Book("Book5", 25.99);
		Book boo6 = new Book("Book6", 25.99);
		Book boo7 = new Book("Book7", 25.99);
		Book boo8 = new Book("Book8", 25.99);
		Book boo9 = new Book("Book9", 25.99);
		Book boo10 = new Book("Book10", 25.99);
		Book boo11 = new Book("Book11", 25.99);
		Book boo12 = new Book("Book12", 25.99);
		Book boo13 = new Book("Book13", 25.99);
		Book boo14 = new Book("Book14", 25.99);
		Book boo15 = new Book("Book15", 25.99);
		Book boo16 = new Book("Book16", 25.99);
		Book boo17 = new Book("Book17", 25.99);
		Book boo18 = new Book("Book18", 25.99);
		Book boo19 = new Book("Book19", 25.99);
		Book boo20 = new Book("Book20", 25.99);
		Book boo21 = new Book("Book21", 25.99);
		bas.addBook(boo1);
		bas.addBook(boo2);
		bas.addBook(boo3);
		bas.addBook(boo4);
		bas.addBook(boo5);
		bas.addBook(boo6);
		bas.addBook(boo7);
		bas.addBook(boo8);
		bas.addBook(boo9);
		bas.addBook(boo10);
		bas.addBook(boo11);
		bas.addBook(boo12);
		bas.addBook(boo13);
		bas.addBook(boo14);
		bas.addBook(boo15);
		bas.addBook(boo16);
		bas.addBook(boo17);
		bas.addBook(boo18);
		bas.addBook(boo19);
		bas.addBook(boo20);
		bas.addBook(boo21);
		assertEquals(425.7162, ckt.calculatePrice(bas), 1E-10);
	}
	
	@Test
	public void test_8() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		Book boo1 = new Book("Book1", 25.99);
		Book boo2 = new Book("Book2", 25.99);
		Book boo3 = new Book("Book3", 25.99);
		Book boo4 = new Book("Book4", 25.99);
		Book boo5 = new Book("Book5", 25.99);
		Book boo6 = new Book("Book6", 25.99);
		Book boo7 = new Book("Book7", 25.99);
		Book boo8 = new Book("Book8", 25.99);
		Book boo9 = new Book("Book9", 25.99);
		Book boo10 = new Book("Book10", 25.99);
		Book boo11 = new Book("Book10", 25.99); //duplicate
		Book boo12 = new Book("Book12", 25.99);
		Book boo13 = new Book("Book13", 25.99);
		Book boo14 = new Book("Book14", 25.99);
		Book boo15 = new Book("Book15", 25.99);
		Book boo16 = new Book("Book16", 25.99);
		Book boo17 = new Book("Book17", 25.99);
		Book boo18 = new Book("Book18", 25.99);
		Book boo19 = new Book("Book19", 25.99);
		Book boo20 = new Book("Book20", 25.99);
		Book boo21 = new Book("Book21", 25.99);
		bas.addBook(boo1);
		bas.addBook(boo2);
		bas.addBook(boo3);
		bas.addBook(boo4);
		bas.addBook(boo5);
		bas.addBook(boo6);
		bas.addBook(boo7);
		bas.addBook(boo8);
		bas.addBook(boo9);
		bas.addBook(boo10);
		bas.addBook(boo11);
		bas.addBook(boo12);
		bas.addBook(boo13);
		bas.addBook(boo14);
		bas.addBook(boo15);
		bas.addBook(boo16);
		bas.addBook(boo17);
		bas.addBook(boo18);
		bas.addBook(boo19);
		bas.addBook(boo20);
		bas.addBook(boo21);
		assertEquals(431.434, ckt.calculatePrice(bas), 1E-10);
	}
	
	@Test
	public void test_9() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		Book boo1 = new Book("Book1", 25.99);
		Book boo2 = new Book("Book2", 25.99);
		Book boo3 = new Book("Book3", 25.99);
		Book boo4 = new Book("Book4", 25.99);
		Book boo5 = new Book("Book5", 25.99);
		Book boo6 = new Book("Book6", 25.99);
		Book boo7 = new Book("Book7", 25.99);
		Book boo8 = new Book("Book8", 25.99);
		Book boo9 = new Book("Book9", 25.99);
		Book boo10 = new Book("Book10", 25.99);
		Book boo11 = new Book("Book10", 25.99); //duplicate
		Book boo12 = new Book("Book10", 25.99); //duplicate
		Book boo13 = new Book("Book13", 25.99);
		Book boo14 = new Book("Book14", 25.99);
		Book boo15 = new Book("Book15", 25.99);
		Book boo16 = new Book("Book16", 25.99);
		Book boo17 = new Book("Book17", 25.99);
		Book boo18 = new Book("Book18", 25.99);
		Book boo19 = new Book("Book19", 25.99);
		Book boo20 = new Book("Book20", 25.99);
		Book boo21 = new Book("Book21", 25.99);
		bas.addBook(boo1);
		bas.addBook(boo2);
		bas.addBook(boo3);
		bas.addBook(boo4);
		bas.addBook(boo5);
		bas.addBook(boo6);
		bas.addBook(boo7);
		bas.addBook(boo8);
		bas.addBook(boo9);
		bas.addBook(boo10);
		bas.addBook(boo11);
		bas.addBook(boo12);
		bas.addBook(boo13);
		bas.addBook(boo14);
		bas.addBook(boo15);
		bas.addBook(boo16);
		bas.addBook(boo17);
		bas.addBook(boo18);
		bas.addBook(boo19);
		bas.addBook(boo20);
		bas.addBook(boo21);
		assertEquals(431.434, ckt.calculatePrice(bas), 1E-10);
	}
	
	@Test
	public void test_10() {
		Basket bas = new Basket();
		Checkout ckt = new Checkout();
		Book boo1 = new Book("Book1", 25.99);
		Book boo2 = new Book("Book2", 25.99);
		Book boo3 = new Book("Book3", 25.99);
		Book boo4 = new Book("Book4", 25.99);
		Book boo5 = new Book("Book5", 25.99);
		Book boo6 = new Book("Book6", 25.99);
		Book boo7 = new Book("Book7", 25.99);
		Book boo8 = new Book("Book8", 25.99);
		Book boo9 = new Book("Book9", 25.99);
		Book boo10 = new Book("Book10", 25.99);
		Book boo11 = new Book("Book10", 25.99); //duplicate
		Book boo12 = new Book("Book13", 25.99); //duplicate
		Book boo13 = new Book("Book13", 25.99);
		Book boo14 = new Book("Book14", 25.99);
		Book boo15 = new Book("Book15", 25.99);
		Book boo16 = new Book("Book16", 25.99);
		Book boo17 = new Book("Book17", 25.99);
		Book boo18 = new Book("Book18", 25.99);
		Book boo19 = new Book("Book19", 25.99);
		Book boo20 = new Book("Book20", 25.99);
		Book boo21 = new Book("Book21", 25.99);
		bas.addBook(boo1);
		bas.addBook(boo2);
		bas.addBook(boo3);
		bas.addBook(boo4);
		bas.addBook(boo5);
		bas.addBook(boo6);
		bas.addBook(boo7);
		bas.addBook(boo8);
		bas.addBook(boo9);
		bas.addBook(boo10);
		bas.addBook(boo11);
		bas.addBook(boo12);
		bas.addBook(boo13);
		bas.addBook(boo14);
		bas.addBook(boo15);
		bas.addBook(boo16);
		bas.addBook(boo17);
		bas.addBook(boo18);
		bas.addBook(boo19);
		bas.addBook(boo20);
		bas.addBook(boo21);
		assertEquals(409.8623, ckt.calculatePrice(bas), 1E-10);
	}
}
