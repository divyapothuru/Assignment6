package lab6;

import java.util.List;

public class Program3 {
public static void main(String[] args) {
		
		Book book = new Book(1, "head first java", "bale");
		Book book1 = new Book(2, "c", "bala");
		Book book2 = new Book(3, "let's us c", "Yaswanth");
		
		
		BookCollection bookCol = new BookCollection();
		bookCol.bookList.add(book);
		bookCol.bookList.add(book1);
		bookCol.bookList.add(book2);
		System.out.println("Before sorting");
		printBooks(bookCol.bookList);
		//check whether book is there or not
		Book bookUpdate = new Book("bala", "george");
		bookCol.hasBook(bookUpdate);
		//sort
		System.out.println("after sorting by book title");
		bookCol.sortByBookName();
    	System.out.println("after sorting by author ");
		bookCol.sortByAuthor();
	}
	
	private static void printBooks(List<Book> bookList) {
		//print the book
		for(Book book: bookList) {
			System.out.println(book);
		}
	}

}
