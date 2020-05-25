package com.techlab.library;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {

	private String libName;
	private String libAddress;
	private List<Student> bookList = new ArrayList<Student>();

	public Library(String libName, String libAddress) {
		this.libName = libName;
		this.libAddress = libAddress;
	}

	public String getLibName() {
		return libName;
	}

	public String getLibAddress() {
		return libAddress;
	}

	public void addBook(Student book) {
		bookList.add(book);
	}

	public List<Student> getBookList() {
		return bookList;
	}

	public void removeBook(String bookName) {

		for (Iterator iterator = bookList.iterator(); iterator.hasNext();) {
			Student books = (Student) iterator.next();
			if (books.getName().equalsIgnoreCase(bookName))
				iterator.remove();

		}
	}

	public void searchByAuthor(String authorName) {

		List<Student> bookByAuthor = new ArrayList<Student>();
		for (Iterator iterator = bookList.iterator(); iterator.hasNext();) {
			Student book = (Student) iterator.next();
			if (book.getAuthor().equalsIgnoreCase(authorName))
				bookByAuthor.add(book);
		}

		if (!bookByAuthor.isEmpty()) {
			System.out.println("List of book you are searching for :");
			System.out.println(bookByAuthor);
		}
		else {
			System.err.println("Sorry..!\nWe dont have book of "+authorName);
		}
	}

}
