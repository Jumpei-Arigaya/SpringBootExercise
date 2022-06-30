package jp.winschool.spring.exercise04;

import javax.validation.constraints.NotBlank;

public class BookForm {
	
	@NotBlank(message = "書名を入力してください")
	private String title;
	
	@NotBlank(message = "著者を入力してください")
	private String author;
	
	@NotBlank(message = "出版社を入力してください")
	private String publisher;

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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
