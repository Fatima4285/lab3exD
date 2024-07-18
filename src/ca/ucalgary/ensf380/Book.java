package ca.ucalgary.ensf380;

abstract class Book {
	
	private String isbn;
	private int publicationYear;
	private int pages;
	
	//constructors
	public Book() {
		
	}
	
	public Book(String isbn, int pages) {
		this.setIsbn(isbn);
		this.setPages(pages);
	}
	
	//getters
	public String getIsbn() {
		return this.isbn;
	}
	
	public int getPublicationYear() {
		return this.publicationYear;
	}
	
	public int getPages() {
		return this.pages;
	}
	
	//setters
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void setPublicationYear(int year) {
		this.publicationYear = year;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
}
