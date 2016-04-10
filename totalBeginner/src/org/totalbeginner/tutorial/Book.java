package org.totalbeginner.tutorial;

public class Book {
	public String title;
	public String author;

	
	
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	public Book(String string) {
		this.title = string;
		this.author = "unknown author";

	}


}

