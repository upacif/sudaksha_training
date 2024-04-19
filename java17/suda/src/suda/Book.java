package suda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private double price;
	
	
	public Book(int bookId, String title, String author, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		List<Book> books=new ArrayList<Book>();
		books.add(new Book(1, "Java", "James gosling", 10000));
		books.add(new Book(2, "Spring", "Rod Johnson", 2000));
		books.add(new Book(3, "NodeJs", "Ryan Dahl", 6000));
		
		Map<Integer, Book> bookMap = books.stream()
                .collect(Collectors.toMap(Book::getBookId, book->book));
		
		System.out.println(bookMap);
	}
	

}
