package bookStoreTDD.Exercise4;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import interfaces.ReadItemCommand;
import interfaces.WriteItemCommand;

import java.util.ArrayList;

import org.junit.Test;


public class CatalogueTest {

	@Test
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
		Catalogue cat = new Catalogue();
		assertEquals(0, cat.getAllBooks().size());
	}

	@Test
	public void test_GetAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
		ReadItemCommand readItemCommandObject = mock(ReadItemCommand.class);
		Catalogue cat = new Catalogue(readItemCommandObject);
		cat.getAllBooks();
		verify(readItemCommandObject, times(1)).readAll();
	}

	@SuppressWarnings("unchecked")
	@Test
	public void test_GetAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
		ArrayList<Book> mockBookList = mock(ArrayList.class);
		ReadItemCommand readItemCommandObject = mock(ReadItemCommand.class);
		Catalogue cat = new Catalogue(readItemCommandObject);
		when(readItemCommandObject.readAll()).thenReturn(mockBookList);
		assertEquals(mockBookList, cat.getAllBooks());
	}
	
	@Test
	public void test_AddBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled(){
		Book mockBook = mock(Book.class);
		ReadItemCommand readItemCommandObject = mock(ReadItemCommand.class);
		WriteItemCommand writeItemCommandObject = mock(WriteItemCommand.class);
		Catalogue cat = new Catalogue(readItemCommandObject, writeItemCommandObject);
		cat.addBook(mockBook);
		verify(writeItemCommandObject, times(1)).insertItem(mockBook);
	}
	
	@Test
	public void test_AddBook_PassBookToInsertItemMethodOfWriteItemCommand_WhenCalled(){
		Book mockBook = mock(Book.class);
		ReadItemCommand readItemCommandObject = mock(ReadItemCommand.class);
		WriteItemCommand writeItemCommandObject = mock(WriteItemCommand.class);
		Catalogue cat = new Catalogue(readItemCommandObject, writeItemCommandObject);
		cat.addBook(mockBook);
		verify(writeItemCommandObject, times(1)).insertItem(mockBook);
	}



}
