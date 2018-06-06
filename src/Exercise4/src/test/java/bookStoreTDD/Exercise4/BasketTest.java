package bookStoreTDD.Exercise4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BasketTest {

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded() {
		Basket bas = new Basket();
		assertEquals(0, bas.getBooksInBasket().size());
	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		Basket bas = new Basket();
		Book boo = new Book("Book1", 500);
		bas.addBook(boo);
		assertEquals(1, bas.getBooksInBasket().size());
	}

	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithTwoBooks() {
		Basket bas = new Basket();
		Book boo1 = new Book("Book1", 500);
		Book boo2 = new Book("Book2", 500);
		bas.addBook(boo1);
		bas.addBook(boo2);
		assertEquals(2, bas.getBooksInBasket().size());
	}

}
