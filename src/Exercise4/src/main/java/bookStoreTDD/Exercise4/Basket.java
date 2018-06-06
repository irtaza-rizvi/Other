package bookStoreTDD.Exercise4;

import java.util.ArrayList;

public class Basket {
	ArrayList<Book> books = new ArrayList<Book>();

	public ArrayList<Book> getBooksInBasket() {
		return this.books;
	}

	public void addBook(Book book) {
		this.books.add(book);
	}
}
