package com.techlab.library.test;

import com.techlab.library.*;

public class LibraryTest {

	public static void main(String[] args) {
		
		Library lib = new Library("New Library", "Mumbai");
		setUpLibrary(lib);
		
		printLibraryinfo(lib);
		
		lib.removeBook("CAMINO WINDS");		
		printLibraryinfo(lib);
		
		lib.searchByAuthor("J.K. Rowling");
	
	}

	private static void printLibraryinfo(Library lib) {
		System.out.println(lib.getLibName()+"\n"+lib.getLibAddress());
		System.out.println(lib.getBookList()+"\n");
	}

	private static void setUpLibrary(Library lib) {

		lib.addBook(new Student(101, "CAMINO WINDS", "John Grisham", "Thriller", 50));

		lib.addBook(new Student(102, "IF IT BLEEDS", "Stephen King", "Fiction", 40));

		lib.addBook(new Student(103, "WALK THE WIRE", "David Baldacci", "Thriller", 60));

		lib.addBook(new Student(104, "HARRY POTTER part 1", "J.K. Rowling", "Children Series", 100));
		
		lib.addBook(new Student(105, "HARRY POTTER part 2", "J.K. Rowling", "Children Series", 100));
	}
}
