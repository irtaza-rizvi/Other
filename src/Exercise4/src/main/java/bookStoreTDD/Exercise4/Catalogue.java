package bookStoreTDD.Exercise4;

import interfaces.ReadItemCommand;
import interfaces.WriteItemCommand;

import java.util.ArrayList;

public class Catalogue {
	ReadItemCommand rc;
	WriteItemCommand wc;

	public Catalogue() {
		// TODO Auto-generated constructor stub
	}

	public Catalogue(ReadItemCommand readItemCommandObject) {
		this.rc = readItemCommandObject;

	}

	public Catalogue(ReadItemCommand readItemCommandObject, WriteItemCommand writeItemCommandObject) {
		this.rc = readItemCommandObject;
		this.wc = writeItemCommandObject;
	}

	public ArrayList<Book> getAllBooks() {
		if (rc == null) {
			return new ArrayList<Book>();
		} else {
			return rc.readAll();
		}
	}

	public void addBook(Book book) {
		wc.insertItem(book);
	}

}
