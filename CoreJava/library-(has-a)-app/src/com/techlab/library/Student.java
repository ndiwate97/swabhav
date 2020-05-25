package com.techlab.library;

public class Student {

	private int bookId;
	private String name;
	private String author;
	private String bookType;
	private int noOfCopies;

	public Student(int bookId, String name, String author, String bookType, int noOfCopies) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.bookType = bookType;
		this.noOfCopies = noOfCopies;
	}

	public int getBookId() {
		return bookId;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getBookType() {
		return bookType;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	@Override
	public String toString() {
		return "\nBook Id = " + bookId + ", Name = " + name + ", Author = " + author + ", Book Type = " + bookType
				+ ", No Of Copies Available = " + noOfCopies ;
	}

}
