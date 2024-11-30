package com.inheritance;
class Book{
	String title;
	String author;
	int year;
	public Book(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("The Title of the book is "+this.title);
		System.out.println("The Author of the book is "+this.author);
		System.out.println("The publishing year is "+this.year);
	}
}
class FictionBook extends Book{
	String genre;

	public FictionBook(String title, String author, int year, String genre) {
		super(title, author, year);
		this.genre = genre;
	}
	public void read() {
		System.out.println("Enjoy reading this "+this.genre+" book");
	}
	
}
public class NonFictionBook extends Book{
	String topic;

	public NonFictionBook(String title, String author, int year, String topic) {
		super(title, author, year);
		this.topic = topic;
	}
	public void study() {
		System.out.println("Use this "+this.topic+" book for studying");
	}
	public static void main(String[] args) {
		FictionBook fic=new FictionBook("Harry Potter", "J.K Rowling", 1997, "Character");
		fic.displayInfo();
		fic.read();
		NonFictionBook nfic=new NonFictionBook("The Dairy of a Young Girl", "Anne Frank", 1947, "History");
		nfic.study();
	}

}
